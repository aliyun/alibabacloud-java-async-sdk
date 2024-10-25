// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEnsCommodityModuleCodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsCommodityModuleCodeResponseBody</p>
 */
public class DescribeEnsCommodityModuleCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommodityCodesInfo")
    private java.util.List < CommodityCodesInfo> commodityCodesInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEnsCommodityModuleCodeResponseBody(Builder builder) {
        this.commodityCodesInfo = builder.commodityCodesInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsCommodityModuleCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return commodityCodesInfo
     */
    public java.util.List < CommodityCodesInfo> getCommodityCodesInfo() {
        return this.commodityCodesInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CommodityCodesInfo> commodityCodesInfo; 
        private String requestId; 

        /**
         * CommodityCodesInfo.
         */
        public Builder commodityCodesInfo(java.util.List < CommodityCodesInfo> commodityCodesInfo) {
            this.commodityCodesInfo = commodityCodesInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEnsCommodityModuleCodeResponseBody build() {
            return new DescribeEnsCommodityModuleCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEnsCommodityModuleCodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsCommodityModuleCodeResponseBody</p>
     */
    public static class ModuleCodesInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        private ModuleCodesInfo(Builder builder) {
            this.moduleCode = builder.moduleCode;
            this.moduleName = builder.moduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleCodesInfo create() {
            return builder().build();
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        public static final class Builder {
            private String moduleCode; 
            private String moduleName; 

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            public ModuleCodesInfo build() {
                return new ModuleCodesInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnsCommodityModuleCodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsCommodityModuleCodeResponseBody</p>
     */
    public static class CommodityCodesInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("ModuleCodesInfo")
        private java.util.List < ModuleCodesInfo> moduleCodesInfo;

        private CommodityCodesInfo(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.moduleCodesInfo = builder.moduleCodesInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommodityCodesInfo create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return moduleCodesInfo
         */
        public java.util.List < ModuleCodesInfo> getModuleCodesInfo() {
            return this.moduleCodesInfo;
        }

        public static final class Builder {
            private String commodityCode; 
            private java.util.List < ModuleCodesInfo> moduleCodesInfo; 

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * ModuleCodesInfo.
             */
            public Builder moduleCodesInfo(java.util.List < ModuleCodesInfo> moduleCodesInfo) {
                this.moduleCodesInfo = moduleCodesInfo;
                return this;
            }

            public CommodityCodesInfo build() {
                return new CommodityCodesInfo(this);
            } 

        } 

    }
}
