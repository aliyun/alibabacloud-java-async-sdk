// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link RunInstanceInspectionRequest} extends {@link RequestModel}
 *
 * <p>RunInstanceInspectionRequest</p>
 */
public class RunInstanceInspectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itemOverrides")
    private java.util.List<ItemOverrides> itemOverrides;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private RunInstanceInspectionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.itemOverrides = builder.itemOverrides;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunInstanceInspectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return itemOverrides
     */
    public java.util.List<ItemOverrides> getItemOverrides() {
        return this.itemOverrides;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RunInstanceInspectionRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private java.util.List<ItemOverrides> itemOverrides; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RunInstanceInspectionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clientToken = request.clientToken;
            this.itemOverrides = request.itemOverrides;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-example</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>inspection-request-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * itemOverrides.
         */
        public Builder itemOverrides(java.util.List<ItemOverrides> itemOverrides) {
            this.putBodyParameter("itemOverrides", itemOverrides);
            this.itemOverrides = itemOverrides;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RunInstanceInspectionRequest build() {
            return new RunInstanceInspectionRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunInstanceInspectionRequest} extends {@link TeaModel}
     *
     * <p>RunInstanceInspectionRequest</p>
     */
    public static class ItemOverrides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("parameters")
        @com.aliyun.core.annotation.Validation(required = true)
        private Object parameters;

        @com.aliyun.core.annotation.NameInMap("templateCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String templateCode;

        private ItemOverrides(Builder builder) {
            this.parameters = builder.parameters;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemOverrides create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public Object getParameters() {
            return this.parameters;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private Object parameters; 
            private String templateCode; 

            private Builder() {
            } 

            private Builder(ItemOverrides model) {
                this.parameters = model.parameters;
                this.templateCode = model.templateCode;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;lookback&quot;:&quot;30m&quot;}</p>
             */
            public Builder parameters(Object parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq.consumer-health</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public ItemOverrides build() {
                return new ItemOverrides(this);
            } 

        } 

    }
}
