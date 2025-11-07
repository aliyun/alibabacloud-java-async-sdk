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
 * {@link ModifyControlStrategyRequest} extends {@link RequestModel}
 *
 * <p>ModifyControlStrategyRequest</p>
 */
public class ModifyControlStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ControlStrategyList")
    private java.util.List<ControlStrategyList> controlStrategyList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyControlStrategyRequest(Builder builder) {
        super(builder);
        this.controlStrategyList = builder.controlStrategyList;
        this.productType = builder.productType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyControlStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return controlStrategyList
     */
    public java.util.List<ControlStrategyList> getControlStrategyList() {
        return this.controlStrategyList;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyControlStrategyRequest, Builder> {
        private java.util.List<ControlStrategyList> controlStrategyList; 
        private String productType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyControlStrategyRequest request) {
            super(request);
            this.controlStrategyList = request.controlStrategyList;
            this.productType = request.productType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>List of security alarm rules.</p>
         */
        public Builder controlStrategyList(java.util.List<ControlStrategyList> controlStrategyList) {
            String controlStrategyListShrink = shrink(controlStrategyList, "ControlStrategyList", "json");
            this.putQueryParameter("ControlStrategyList", controlStrategyListShrink);
            this.controlStrategyList = controlStrategyList;
            return this;
        }

        /**
         * <p>Product type, currently only supports <strong>ANT_CLOUD_AUTH</strong> (Financial-grade Real Person), all others are phased out.</p>
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
         * <p>Region ID of the intelligent access gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyControlStrategyRequest build() {
            return new ModifyControlStrategyRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyControlStrategyRequest} extends {@link TeaModel}
     *
     * <p>ModifyControlStrategyRequest</p>
     */
    public static class ControlStrategyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Double threshold;

        private ControlStrategyList(Builder builder) {
            this.apiName = builder.apiName;
            this.bizType = builder.bizType;
            this.id = builder.id;
            this.status = builder.status;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlStrategyList create() {
            return builder().build();
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
        public Double getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String apiName; 
            private String bizType; 
            private Long id; 
            private String status; 
            private Double threshold; 

            private Builder() {
            } 

            private Builder(ControlStrategyList model) {
                this.apiName = model.apiName;
                this.bizType = model.bizType;
                this.id = model.id;
                this.status = model.status;
                this.threshold = model.threshold;
            } 

            /**
             * <p>API name, same as <strong>ProductCode</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>ID_PRO</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>Rule configuration type:</p>
             * <ul>
             * <li><strong>QPS</strong>: QPS greater than</li>
             * <li><strong>SUCCESS_RATE_5_MIN</strong>: Success rate in the last 5 minutes less than</li>
             * <li><strong>RESP_TIME_5_MIN</strong>: Average response time in the last 5 minutes greater than</li>
             * <li><strong>AMOUNT_RISE</strong>: Call volume growth ratio greater than</li>
             * <li><strong>AMOUNT_FALL</strong>: Call volume decline ratio less than</li>
             * <li><strong>PASSED_RATE_1_HOUR</strong>: Verification consistency rate in the last hour less than</li>
             * <li><strong>PARAM_ERROR_RATE_1_HOUR</strong>: Parameter error rate in the last hour greater than</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS_RATE_5_MIN</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
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
             * <p>Status:</p>
             * <ul>
             * <li><strong>disabled</strong>: Disabled</li>
             * <li><strong>normal</strong>: Enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Alarm threshold for the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder threshold(Double threshold) {
                this.threshold = threshold;
                return this;
            }

            public ControlStrategyList build() {
                return new ControlStrategyList(this);
            } 

        } 

    }
}
