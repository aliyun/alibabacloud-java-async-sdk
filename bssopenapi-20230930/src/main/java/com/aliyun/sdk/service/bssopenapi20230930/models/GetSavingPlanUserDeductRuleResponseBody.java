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
 * {@link GetSavingPlanUserDeductRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetSavingPlanUserDeductRuleResponseBody</p>
 */
public class GetSavingPlanUserDeductRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSavingPlanUserDeductRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSavingPlanUserDeductRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSavingPlanUserDeductRuleResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSavingPlanUserDeductRuleResponseBody build() {
            return new GetSavingPlanUserDeductRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSavingPlanUserDeductRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetSavingPlanUserDeductRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CommodityName")
        private String commodityName;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("SkipDeduct")
        private Boolean skipDeduct;

        private Data(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.moduleCode = builder.moduleCode;
            this.moduleName = builder.moduleName;
            this.skipDeduct = builder.skipDeduct;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
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

        /**
         * @return skipDeduct
         */
        public Boolean getSkipDeduct() {
            return this.skipDeduct;
        }

        public static final class Builder {
            private String commodityCode; 
            private String commodityName; 
            private String moduleCode; 
            private String moduleName; 
            private Boolean skipDeduct; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.commodityCode = model.commodityCode;
                this.commodityName = model.commodityName;
                this.moduleCode = model.moduleCode;
                this.moduleName = model.moduleName;
                this.skipDeduct = model.skipDeduct;
            } 

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CommodityName.
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

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

            /**
             * SkipDeduct.
             */
            public Builder skipDeduct(Boolean skipDeduct) {
                this.skipDeduct = skipDeduct;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
