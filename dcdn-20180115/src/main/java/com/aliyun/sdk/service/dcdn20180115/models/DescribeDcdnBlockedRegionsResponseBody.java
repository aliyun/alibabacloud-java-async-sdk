// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnBlockedRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnBlockedRegionsResponseBody</p>
 */
public class DescribeDcdnBlockedRegionsResponseBody extends TeaModel {
    @NameInMap("InfoList")
    private InfoList infoList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnBlockedRegionsResponseBody(Builder builder) {
        this.infoList = builder.infoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnBlockedRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return infoList
     */
    public InfoList getInfoList() {
        return this.infoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InfoList infoList; 
        private String requestId; 

        /**
         * The information about the country or region.
         */
        public Builder infoList(InfoList infoList) {
            this.infoList = infoList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnBlockedRegionsResponseBody build() {
            return new DescribeDcdnBlockedRegionsResponseBody(this);
        } 

    } 

    public static class InfoItem extends TeaModel {
        @NameInMap("Continent")
        private String continent;

        @NameInMap("CountriesAndRegions")
        private String countriesAndRegions;

        @NameInMap("CountriesAndRegionsName")
        private String countriesAndRegionsName;

        private InfoItem(Builder builder) {
            this.continent = builder.continent;
            this.countriesAndRegions = builder.countriesAndRegions;
            this.countriesAndRegionsName = builder.countriesAndRegionsName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InfoItem create() {
            return builder().build();
        }

        /**
         * @return continent
         */
        public String getContinent() {
            return this.continent;
        }

        /**
         * @return countriesAndRegions
         */
        public String getCountriesAndRegions() {
            return this.countriesAndRegions;
        }

        /**
         * @return countriesAndRegionsName
         */
        public String getCountriesAndRegionsName() {
            return this.countriesAndRegionsName;
        }

        public static final class Builder {
            private String continent; 
            private String countriesAndRegions; 
            private String countriesAndRegionsName; 

            /**
             * The larger region to which the country or region belongs.
             */
            public Builder continent(String continent) {
                this.continent = continent;
                return this;
            }

            /**
             * The abbreviation of the name of the country or region.
             */
            public Builder countriesAndRegions(String countriesAndRegions) {
                this.countriesAndRegions = countriesAndRegions;
                return this;
            }

            /**
             * The name of the country or region.
             */
            public Builder countriesAndRegionsName(String countriesAndRegionsName) {
                this.countriesAndRegionsName = countriesAndRegionsName;
                return this;
            }

            public InfoItem build() {
                return new InfoItem(this);
            } 

        } 

    }
    public static class InfoList extends TeaModel {
        @NameInMap("InfoItem")
        private java.util.List < InfoItem> infoItem;

        private InfoList(Builder builder) {
            this.infoItem = builder.infoItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InfoList create() {
            return builder().build();
        }

        /**
         * @return infoItem
         */
        public java.util.List < InfoItem> getInfoItem() {
            return this.infoItem;
        }

        public static final class Builder {
            private java.util.List < InfoItem> infoItem; 

            /**
             * InfoItem.
             */
            public Builder infoItem(java.util.List < InfoItem> infoItem) {
                this.infoItem = infoItem;
                return this;
            }

            public InfoList build() {
                return new InfoList(this);
            } 

        } 

    }
}
