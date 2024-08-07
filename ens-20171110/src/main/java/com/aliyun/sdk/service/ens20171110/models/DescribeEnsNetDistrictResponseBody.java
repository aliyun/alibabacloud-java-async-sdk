// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsNetDistrictResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsNetDistrictResponseBody</p>
 */
public class DescribeEnsNetDistrictResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("EnsNetDistricts")
    private EnsNetDistricts ensNetDistricts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEnsNetDistrictResponseBody(Builder builder) {
        this.code = builder.code;
        this.ensNetDistricts = builder.ensNetDistricts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsNetDistrictResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return ensNetDistricts
     */
    public EnsNetDistricts getEnsNetDistricts() {
        return this.ensNetDistricts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private EnsNetDistricts ensNetDistricts; 
        private String requestId; 

        /**
         * The returned service code. A value of 0 indicates that the operation was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the regions.
         */
        public Builder ensNetDistricts(EnsNetDistricts ensNetDistricts) {
            this.ensNetDistricts = ensNetDistricts;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEnsNetDistrictResponseBody build() {
            return new DescribeEnsNetDistrictResponseBody(this);
        } 

    } 

    public static class EnsNetDistrict extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionIdCount")
        private String ensRegionIdCount;

        @com.aliyun.core.annotation.NameInMap("NetDistrictCode")
        private String netDistrictCode;

        @com.aliyun.core.annotation.NameInMap("NetDistrictEnName")
        private String netDistrictEnName;

        @com.aliyun.core.annotation.NameInMap("NetDistrictFatherCode")
        private String netDistrictFatherCode;

        @com.aliyun.core.annotation.NameInMap("NetDistrictLevel")
        private String netDistrictLevel;

        @com.aliyun.core.annotation.NameInMap("NetDistrictName")
        private String netDistrictName;

        private EnsNetDistrict(Builder builder) {
            this.ensRegionIdCount = builder.ensRegionIdCount;
            this.netDistrictCode = builder.netDistrictCode;
            this.netDistrictEnName = builder.netDistrictEnName;
            this.netDistrictFatherCode = builder.netDistrictFatherCode;
            this.netDistrictLevel = builder.netDistrictLevel;
            this.netDistrictName = builder.netDistrictName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnsNetDistrict create() {
            return builder().build();
        }

        /**
         * @return ensRegionIdCount
         */
        public String getEnsRegionIdCount() {
            return this.ensRegionIdCount;
        }

        /**
         * @return netDistrictCode
         */
        public String getNetDistrictCode() {
            return this.netDistrictCode;
        }

        /**
         * @return netDistrictEnName
         */
        public String getNetDistrictEnName() {
            return this.netDistrictEnName;
        }

        /**
         * @return netDistrictFatherCode
         */
        public String getNetDistrictFatherCode() {
            return this.netDistrictFatherCode;
        }

        /**
         * @return netDistrictLevel
         */
        public String getNetDistrictLevel() {
            return this.netDistrictLevel;
        }

        /**
         * @return netDistrictName
         */
        public String getNetDistrictName() {
            return this.netDistrictName;
        }

        public static final class Builder {
            private String ensRegionIdCount; 
            private String netDistrictCode; 
            private String netDistrictEnName; 
            private String netDistrictFatherCode; 
            private String netDistrictLevel; 
            private String netDistrictName; 

            /**
             * The number of nodes in the region.
             */
            public Builder ensRegionIdCount(String ensRegionIdCount) {
                this.ensRegionIdCount = ensRegionIdCount;
                return this;
            }

            /**
             * The code of the region.
             */
            public Builder netDistrictCode(String netDistrictCode) {
                this.netDistrictCode = netDistrictCode;
                return this;
            }

            /**
             * The name of the region.
             */
            public Builder netDistrictEnName(String netDistrictEnName) {
                this.netDistrictEnName = netDistrictEnName;
                return this;
            }

            /**
             * The parent code of the region.
             */
            public Builder netDistrictFatherCode(String netDistrictFatherCode) {
                this.netDistrictFatherCode = netDistrictFatherCode;
                return this;
            }

            /**
             * The level of the region.
             * <p>
             * 
             * *   **Big**: area
             * *   **Middle**: province
             * *   **Small**: city
             */
            public Builder netDistrictLevel(String netDistrictLevel) {
                this.netDistrictLevel = netDistrictLevel;
                return this;
            }

            /**
             * The name of the region.
             */
            public Builder netDistrictName(String netDistrictName) {
                this.netDistrictName = netDistrictName;
                return this;
            }

            public EnsNetDistrict build() {
                return new EnsNetDistrict(this);
            } 

        } 

    }
    public static class EnsNetDistricts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsNetDistrict")
        private java.util.List < EnsNetDistrict> ensNetDistrict;

        private EnsNetDistricts(Builder builder) {
            this.ensNetDistrict = builder.ensNetDistrict;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnsNetDistricts create() {
            return builder().build();
        }

        /**
         * @return ensNetDistrict
         */
        public java.util.List < EnsNetDistrict> getEnsNetDistrict() {
            return this.ensNetDistrict;
        }

        public static final class Builder {
            private java.util.List < EnsNetDistrict> ensNetDistrict; 

            /**
             * EnsNetDistrict.
             */
            public Builder ensNetDistrict(java.util.List < EnsNetDistrict> ensNetDistrict) {
                this.ensNetDistrict = ensNetDistrict;
                return this;
            }

            public EnsNetDistricts build() {
                return new EnsNetDistricts(this);
            } 

        } 

    }
}
