// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link DescribeUserSpnSummaryInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserSpnSummaryInfoResponseBody</p>
 */
public class DescribeUserSpnSummaryInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceFamilyList")
    private java.util.List<String> instanceFamilyList;

    @com.aliyun.core.annotation.NameInMap("RegionList")
    private java.util.List<RegionList> regionList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SpnCodeAndTypeList")
    private java.util.List<SpnCodeAndTypeList> spnCodeAndTypeList;

    private DescribeUserSpnSummaryInfoResponseBody(Builder builder) {
        this.instanceFamilyList = builder.instanceFamilyList;
        this.regionList = builder.regionList;
        this.requestId = builder.requestId;
        this.spnCodeAndTypeList = builder.spnCodeAndTypeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserSpnSummaryInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceFamilyList
     */
    public java.util.List<String> getInstanceFamilyList() {
        return this.instanceFamilyList;
    }

    /**
     * @return regionList
     */
    public java.util.List<RegionList> getRegionList() {
        return this.regionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spnCodeAndTypeList
     */
    public java.util.List<SpnCodeAndTypeList> getSpnCodeAndTypeList() {
        return this.spnCodeAndTypeList;
    }

    public static final class Builder {
        private java.util.List<String> instanceFamilyList; 
        private java.util.List<RegionList> regionList; 
        private String requestId; 
        private java.util.List<SpnCodeAndTypeList> spnCodeAndTypeList; 

        private Builder() {
        } 

        private Builder(DescribeUserSpnSummaryInfoResponseBody model) {
            this.instanceFamilyList = model.instanceFamilyList;
            this.regionList = model.regionList;
            this.requestId = model.requestId;
            this.spnCodeAndTypeList = model.spnCodeAndTypeList;
        } 

        /**
         * InstanceFamilyList.
         */
        public Builder instanceFamilyList(java.util.List<String> instanceFamilyList) {
            this.instanceFamilyList = instanceFamilyList;
            return this;
        }

        /**
         * RegionList.
         */
        public Builder regionList(java.util.List<RegionList> regionList) {
            this.regionList = regionList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SpnCodeAndTypeList.
         */
        public Builder spnCodeAndTypeList(java.util.List<SpnCodeAndTypeList> spnCodeAndTypeList) {
            this.spnCodeAndTypeList = spnCodeAndTypeList;
            return this;
        }

        public DescribeUserSpnSummaryInfoResponseBody build() {
            return new DescribeUserSpnSummaryInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserSpnSummaryInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserSpnSummaryInfoResponseBody</p>
     */
    public static class RegionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionCode")
        private String regionCode;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        private RegionList(Builder builder) {
            this.regionCode = builder.regionCode;
            this.regionName = builder.regionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionList create() {
            return builder().build();
        }

        /**
         * @return regionCode
         */
        public String getRegionCode() {
            return this.regionCode;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        public static final class Builder {
            private String regionCode; 
            private String regionName; 

            private Builder() {
            } 

            private Builder(RegionList model) {
                this.regionCode = model.regionCode;
                this.regionName = model.regionName;
            } 

            /**
             * RegionCode.
             */
            public Builder regionCode(String regionCode) {
                this.regionCode = regionCode;
                return this;
            }

            /**
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            public RegionList build() {
                return new RegionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserSpnSummaryInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserSpnSummaryInfoResponseBody</p>
     */
    public static class SpnCodeAndTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("SpnCommodityCode")
        private String spnCommodityCode;

        @com.aliyun.core.annotation.NameInMap("SpnType")
        private String spnType;

        @com.aliyun.core.annotation.NameInMap("SpnTypeName")
        private String spnTypeName;

        private SpnCodeAndTypeList(Builder builder) {
            this.productCode = builder.productCode;
            this.spnCommodityCode = builder.spnCommodityCode;
            this.spnType = builder.spnType;
            this.spnTypeName = builder.spnTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpnCodeAndTypeList create() {
            return builder().build();
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return spnCommodityCode
         */
        public String getSpnCommodityCode() {
            return this.spnCommodityCode;
        }

        /**
         * @return spnType
         */
        public String getSpnType() {
            return this.spnType;
        }

        /**
         * @return spnTypeName
         */
        public String getSpnTypeName() {
            return this.spnTypeName;
        }

        public static final class Builder {
            private String productCode; 
            private String spnCommodityCode; 
            private String spnType; 
            private String spnTypeName; 

            private Builder() {
            } 

            private Builder(SpnCodeAndTypeList model) {
                this.productCode = model.productCode;
                this.spnCommodityCode = model.spnCommodityCode;
                this.spnType = model.spnType;
                this.spnTypeName = model.spnTypeName;
            } 

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * SpnCommodityCode.
             */
            public Builder spnCommodityCode(String spnCommodityCode) {
                this.spnCommodityCode = spnCommodityCode;
                return this;
            }

            /**
             * SpnType.
             */
            public Builder spnType(String spnType) {
                this.spnType = spnType;
                return this;
            }

            /**
             * SpnTypeName.
             */
            public Builder spnTypeName(String spnTypeName) {
                this.spnTypeName = spnTypeName;
                return this;
            }

            public SpnCodeAndTypeList build() {
                return new SpnCodeAndTypeList(this);
            } 

        } 

    }
}
