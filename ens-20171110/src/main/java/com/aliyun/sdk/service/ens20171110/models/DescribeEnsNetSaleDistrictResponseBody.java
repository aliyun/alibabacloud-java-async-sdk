// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeEnsNetSaleDistrictResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsNetSaleDistrictResponseBody</p>
 */
public class DescribeEnsNetSaleDistrictResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("EnsNetDistricts")
    private EnsNetDistricts ensNetDistricts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEnsNetSaleDistrictResponseBody(Builder builder) {
        this.code = builder.code;
        this.ensNetDistricts = builder.ensNetDistricts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsNetSaleDistrictResponseBody create() {
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
         * <p>The returned service code. A value of 0 indicates that the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the ISPs in the area.</p>
         */
        public Builder ensNetDistricts(EnsNetDistricts ensNetDistricts) {
            this.ensNetDistricts = ensNetDistricts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1707B55C-A12F-43EF-BC66-14FFDB9253C3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEnsNetSaleDistrictResponseBody build() {
            return new DescribeEnsNetSaleDistrictResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEnsNetSaleDistrictResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsNetSaleDistrictResponseBody</p>
     */
    public static class EnsNetDistrict extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionIdCount")
        private String ensRegionIdCount;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private String instanceCount;

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
            this.instanceCount = builder.instanceCount;
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
         * @return instanceCount
         */
        public String getInstanceCount() {
            return this.instanceCount;
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
            private String instanceCount; 
            private String netDistrictCode; 
            private String netDistrictEnName; 
            private String netDistrictFatherCode; 
            private String netDistrictLevel; 
            private String netDistrictName; 

            /**
             * <p>The information about the ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>{                         &quot;count&quot;:2,                         &quot;name&quot;:&quot;telecommunication&quot;,                         &quot;code&quot;:&quot;telecom&quot;,                         &quot;country&quot;:&quot;cn&quot;                     }</p>
             */
            public Builder ensRegionIdCount(String ensRegionIdCount) {
                this.ensRegionIdCount = ensRegionIdCount;
                return this;
            }

            /**
             * <p>The information about the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>{                         &quot;count&quot;:2,                         &quot;code&quot;:&quot;multiCarrier&quot;                     }</p>
             */
            public Builder instanceCount(String instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The region code.</p>
             * 
             * <strong>example:</strong>
             * <p>100101</p>
             */
            public Builder netDistrictCode(String netDistrictCode) {
                this.netDistrictCode = netDistrictCode;
                return this;
            }

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>northEast</p>
             */
            public Builder netDistrictEnName(String netDistrictEnName) {
                this.netDistrictEnName = netDistrictEnName;
                return this;
            }

            /**
             * <p>The parent code of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder netDistrictFatherCode(String netDistrictFatherCode) {
                this.netDistrictFatherCode = netDistrictFatherCode;
                return this;
            }

            /**
             * <p>The region level. Valid values:</p>
             * <ul>
             * <li><strong>Big</strong>: area</li>
             * <li><strong>Middle</strong>: province</li>
             * <li><strong>Small</strong>: city</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Big</p>
             */
            public Builder netDistrictLevel(String netDistrictLevel) {
                this.netDistrictLevel = netDistrictLevel;
                return this;
            }

            /**
             * <p>The Chinese name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>Northeast China</p>
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
    /**
     * 
     * {@link DescribeEnsNetSaleDistrictResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsNetSaleDistrictResponseBody</p>
     */
    public static class EnsNetDistricts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsNetDistrict")
        private java.util.List<EnsNetDistrict> ensNetDistrict;

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
        public java.util.List<EnsNetDistrict> getEnsNetDistrict() {
            return this.ensNetDistrict;
        }

        public static final class Builder {
            private java.util.List<EnsNetDistrict> ensNetDistrict; 

            /**
             * EnsNetDistrict.
             */
            public Builder ensNetDistrict(java.util.List<EnsNetDistrict> ensNetDistrict) {
                this.ensNetDistrict = ensNetDistrict;
                return this;
            }

            public EnsNetDistricts build() {
                return new EnsNetDistricts(this);
            } 

        } 

    }
}
