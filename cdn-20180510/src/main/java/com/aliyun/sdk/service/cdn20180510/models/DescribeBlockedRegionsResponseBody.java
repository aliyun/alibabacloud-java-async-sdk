// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeBlockedRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBlockedRegionsResponseBody</p>
 */
public class DescribeBlockedRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InfoList")
    private InfoList infoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBlockedRegionsResponseBody(Builder builder) {
        this.infoList = builder.infoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBlockedRegionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeBlockedRegionsResponseBody model) {
            this.infoList = model.infoList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information returned.</p>
         */
        public Builder infoList(InfoList infoList) {
            this.infoList = infoList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BFFCDFAD-DACC-484E-9BE6-0AF3B3A0DD23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBlockedRegionsResponseBody build() {
            return new DescribeBlockedRegionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBlockedRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBlockedRegionsResponseBody</p>
     */
    public static class InfoItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Continent")
        private String continent;

        @com.aliyun.core.annotation.NameInMap("CountriesAndRegions")
        private String countriesAndRegions;

        @com.aliyun.core.annotation.NameInMap("CountriesAndRegionsName")
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

            private Builder() {
            } 

            private Builder(InfoItem model) {
                this.continent = model.continent;
                this.countriesAndRegions = model.countriesAndRegions;
                this.countriesAndRegionsName = model.countriesAndRegionsName;
            } 

            /**
             * <p>The district to which the country or region belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia</p>
             */
            public Builder continent(String continent) {
                this.continent = continent;
                return this;
            }

            /**
             * <p>The abbreviation of the name of the country or region.</p>
             * 
             * <strong>example:</strong>
             * <p>AF</p>
             */
            public Builder countriesAndRegions(String countriesAndRegions) {
                this.countriesAndRegions = countriesAndRegions;
                return this;
            }

            /**
             * <p>The name of the country or region.</p>
             * 
             * <strong>example:</strong>
             * <p>Afghanistan</p>
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
    /**
     * 
     * {@link DescribeBlockedRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBlockedRegionsResponseBody</p>
     */
    public static class InfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InfoItem")
        private java.util.List<InfoItem> infoItem;

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
        public java.util.List<InfoItem> getInfoItem() {
            return this.infoItem;
        }

        public static final class Builder {
            private java.util.List<InfoItem> infoItem; 

            private Builder() {
            } 

            private Builder(InfoList model) {
                this.infoItem = model.infoItem;
            } 

            /**
             * InfoItem.
             */
            public Builder infoItem(java.util.List<InfoItem> infoItem) {
                this.infoItem = infoItem;
                return this;
            }

            public InfoList build() {
                return new InfoList(this);
            } 

        } 

    }
}
