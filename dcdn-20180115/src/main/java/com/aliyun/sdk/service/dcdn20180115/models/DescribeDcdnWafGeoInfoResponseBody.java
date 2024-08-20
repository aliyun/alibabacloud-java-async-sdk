// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafGeoInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafGeoInfoResponseBody</p>
 */
public class DescribeDcdnWafGeoInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.List < Content> content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnWafGeoInfoResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafGeoInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public java.util.List < Content> getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Content> content; 
        private String requestId; 

        /**
         * The type of information about the country or region.
         */
        public Builder content(java.util.List < Content> content) {
            this.content = content;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnWafGeoInfoResponseBody build() {
            return new DescribeDcdnWafGeoInfoResponseBody(this);
        } 

    } 

    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Regions(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The name of the country or region.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The code of the country or region.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
    public static class Continents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Regions")
        private java.util.List < Regions> regions;

        private Continents(Builder builder) {
            this.name = builder.name;
            this.regions = builder.regions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Continents create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regions
         */
        public java.util.List < Regions> getRegions() {
            return this.regions;
        }

        public static final class Builder {
            private String name; 
            private java.util.List < Regions> regions; 

            /**
             * The district to which the country or region belongs.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The region information.
             */
            public Builder regions(java.util.List < Regions> regions) {
                this.regions = regions;
                return this;
            }

            public Continents build() {
                return new Continents(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Continents")
        private java.util.List < Continents> continents;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Content(Builder builder) {
            this.continents = builder.continents;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return continents
         */
        public java.util.List < Continents> getContinents() {
            return this.continents;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < Continents> continents; 
            private String type; 

            /**
             * The information about the country or region.
             */
            public Builder continents(java.util.List < Continents> continents) {
                this.continents = continents;
                return this;
            }

            /**
             * The type of the region.
             * <p>
             * 
             * *   CN: China
             * *   Other: outside China
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
