// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountActivatedOrNewRegistrationDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>CountActivatedOrNewRegistrationDeviceResponseBody</p>
 */
public class CountActivatedOrNewRegistrationDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Statistics")
    private Statistics statistics;

    private CountActivatedOrNewRegistrationDeviceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statistics = builder.statistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountActivatedOrNewRegistrationDeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statistics
     */
    public Statistics getStatistics() {
        return this.statistics;
    }

    public static final class Builder {
        private String requestId; 
        private Statistics statistics; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Statistics.
         */
        public Builder statistics(Statistics statistics) {
            this.statistics = statistics;
            return this;
        }

        public CountActivatedOrNewRegistrationDeviceResponseBody build() {
            return new CountActivatedOrNewRegistrationDeviceResponseBody(this);
        } 

    } 

    public static class Series extends TeaModel {
        @NameInMap("Data")
        private java.util.List < String > data;

        @NameInMap("Name")
        private String name;

        private Series(Builder builder) {
            this.data = builder.data;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Series create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < String > getData() {
            return this.data;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < String > data; 
            private String name; 

            /**
             * Data.
             */
            public Builder data(java.util.List < String > data) {
                this.data = data;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
    public static class Statistics extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        @NameInMap("Series")
        private java.util.List < Series> series;

        private Statistics(Builder builder) {
            this.categories = builder.categories;
            this.series = builder.series;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        /**
         * @return series
         */
        public java.util.List < Series> getSeries() {
            return this.series;
        }

        public static final class Builder {
            private java.util.List < String > categories; 
            private java.util.List < Series> series; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            /**
             * Series.
             */
            public Builder series(java.util.List < Series> series) {
                this.series = series;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
}
