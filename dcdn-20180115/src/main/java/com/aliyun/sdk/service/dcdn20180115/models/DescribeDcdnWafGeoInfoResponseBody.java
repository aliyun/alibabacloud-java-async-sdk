// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The type of information about the country or region.</p>
         */
        public Builder content(java.util.List < Content> content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>66A98669-CC6E-4F3E-80A6-3014697B11AE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnWafGeoInfoResponseBody build() {
            return new DescribeDcdnWafGeoInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnWafGeoInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafGeoInfoResponseBody</p>
     */
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
             * <p>The name of the country or region.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The code of the country or region.</p>
             * 
             * <strong>example:</strong>
             * <p>110000</p>
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
    /**
     * 
     * {@link DescribeDcdnWafGeoInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafGeoInfoResponseBody</p>
     */
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
             * <p>The district to which the country or region belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>China</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The region information.</p>
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
    /**
     * 
     * {@link DescribeDcdnWafGeoInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafGeoInfoResponseBody</p>
     */
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
             * <p>The information about the country or region.</p>
             */
            public Builder continents(java.util.List < Continents> continents) {
                this.continents = continents;
                return this;
            }

            /**
             * <p>The type of the region.</p>
             * <ul>
             * <li>CN: China</li>
             * <li>Other: outside China</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
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
