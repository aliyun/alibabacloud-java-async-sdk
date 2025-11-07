// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link ModifyCustomizeFlowStrategyListRequest} extends {@link RequestModel}
 *
 * <p>ModifyCustomizeFlowStrategyListRequest</p>
 */
public class ModifyCustomizeFlowStrategyListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyObject")
    private java.util.List<StrategyObject> strategyObject;

    private ModifyCustomizeFlowStrategyListRequest(Builder builder) {
        super(builder);
        this.productType = builder.productType;
        this.strategyObject = builder.strategyObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCustomizeFlowStrategyListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return strategyObject
     */
    public java.util.List<StrategyObject> getStrategyObject() {
        return this.strategyObject;
    }

    public static final class Builder extends Request.Builder<ModifyCustomizeFlowStrategyListRequest, Builder> {
        private String productType; 
        private java.util.List<StrategyObject> strategyObject; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCustomizeFlowStrategyListRequest request) {
            super(request);
            this.productType = request.productType;
            this.strategyObject = request.strategyObject;
        } 

        /**
         * <p>Product type, currently only supports <strong>ANT_CLOUD_AUTH</strong> (Financial-grade real person), all others have been phased out.</p>
         * 
         * <strong>example:</strong>
         * <p>ANT_CLOUD_AUTH</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>Strategy list.</p>
         */
        public Builder strategyObject(java.util.List<StrategyObject> strategyObject) {
            String strategyObjectShrink = shrink(strategyObject, "StrategyObject", "json");
            this.putQueryParameter("StrategyObject", strategyObjectShrink);
            this.strategyObject = strategyObject;
            return this;
        }

        @Override
        public ModifyCustomizeFlowStrategyListRequest build() {
            return new ModifyCustomizeFlowStrategyListRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyCustomizeFlowStrategyListRequest} extends {@link TeaModel}
     *
     * <p>ModifyCustomizeFlowStrategyListRequest</p>
     */
    public static class StrategyObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccumulateKey")
        private String accumulateKey;

        @com.aliyun.core.annotation.NameInMap("AccumulateWindow")
        private Long accumulateWindow;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("FlowType")
        private String flowType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Status")
        @com.aliyun.core.annotation.Validation(required = true)
        private String status;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer threshold;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private StrategyObject(Builder builder) {
            this.accumulateKey = builder.accumulateKey;
            this.accumulateWindow = builder.accumulateWindow;
            this.apiName = builder.apiName;
            this.flowType = builder.flowType;
            this.id = builder.id;
            this.operation = builder.operation;
            this.status = builder.status;
            this.threshold = builder.threshold;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StrategyObject create() {
            return builder().build();
        }

        /**
         * @return accumulateKey
         */
        public String getAccumulateKey() {
            return this.accumulateKey;
        }

        /**
         * @return accumulateWindow
         */
        public Long getAccumulateWindow() {
            return this.accumulateWindow;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return flowType
         */
        public String getFlowType() {
            return this.flowType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return threshold
         */
        public Integer getThreshold() {
            return this.threshold;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String accumulateKey; 
            private Long accumulateWindow; 
            private String apiName; 
            private String flowType; 
            private Long id; 
            private String operation; 
            private String status; 
            private Integer threshold; 
            private Long userId; 

            private Builder() {
            } 

            private Builder(StrategyObject model) {
                this.accumulateKey = model.accumulateKey;
                this.accumulateWindow = model.accumulateWindow;
                this.apiName = model.apiName;
                this.flowType = model.flowType;
                this.id = model.id;
                this.operation = model.operation;
                this.status = model.status;
                this.threshold = model.threshold;
                this.userId = model.userId;
            } 

            /**
             * <p>AccumulateKey</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder accumulateKey(String accumulateKey) {
                this.accumulateKey = accumulateKey;
                return this;
            }

            /**
             * <p>Flow control statistical window size, in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder accumulateWindow(Long accumulateWindow) {
                this.accumulateWindow = accumulateWindow;
                return this;
            }

            /**
             * <p>API name, same as <strong>ProductCode</strong>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ID_PRO</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>Flow type:</p>
             * <ul>
             * <li><strong>ACCUMULATE</strong>: Repeated appearance of ID card</li>
             * <li><strong>PASSED_RATE</strong>: Pass rate less than</li>
             * <li><strong>SUB_CODE_205</strong>: Authentication failed and liveness attack 205 ratio greater than</li>
             * <li><strong>SUB_CODE_206</strong>: Authentication failed and liveness attack 206 ratio greater than</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACCUMULATE</p>
             */
            public Builder flowType(String flowType) {
                this.flowType = flowType;
                return this;
            }

            /**
             * <p>Rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>38</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Operation.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>Status:</p>
             * <ul>
             * <li><strong>disabled</strong>: Disabled</li>
             * <li><strong>normal</strong>: Enabled</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Flow control threshold.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder threshold(Integer threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>126005125163xxxx</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public StrategyObject build() {
                return new StrategyObject(this);
            } 

        } 

    }
}
