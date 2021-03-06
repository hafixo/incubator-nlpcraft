/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nlpcraft.examples.misc.geo.cities;

import java.util.Objects;

/**
 * City data object.
 */
public class City {
    private final String name;
    private final String country;

    /**
     * Creates new city object.
     *
     * @param name City name.
     * @param country City country.
     */
    public City(String name, String country) {
        this.name = name;
        this.country = country;
    }

    /**
     * Gets city name.
     *
     * @return City name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets city country.
     *
     * @return City country.
     */
    public String getCountry() {
        return country;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        City city = (City) o;

        return (Objects.equals(name, city.name)) && (Objects.equals(country, city.country));
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;

        result = 31 * result + (country != null ? country.hashCode() : 0);

        return result;
    }
}
