// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRenderingInstanceBandwidthRequest} extends {@link RequestModel}
 *
 * <p>ModifyRenderingInstanceBandwidthRequest</p>
 */
public class ModifyRenderingInstanceBandwidthRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxEgressBandwidth")
    private Integer maxEgressBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxIngressBandwidth")
    private Integer maxIngressBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    private ModifyRenderingInstanceBandwidthRequest(Builder builder) {
        super(builder);
        this.maxEgressBandwidth = builder.maxEgressBandwidth;
        this.maxIngressBandwidth = builder.maxIngressBandwidth;
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRenderingInstanceBandwidthRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxEgressBandwidth
     */
    public Integer getMaxEgressBandwidth() {
        return this.maxEgressBandwidth;
    }

    /**
     * @return maxIngressBandwidth
     */
    public Integer getMaxIngressBandwidth() {
        return this.maxIngressBandwidth;
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public static final class Builder extends Request.Builder<ModifyRenderingInstanceBandwidthRequest, Builder> {
        private Integer maxEgressBandwidth; 
        private Integer maxIngressBandwidth; 
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRenderingInstanceBandwidthRequest request) {
            super(request);
            this.maxEgressBandwidth = request.maxEgressBandwidth;
            this.maxIngressBandwidth = request.maxIngressBandwidth;
            this.renderingInstanceId = request.renderingInstanceId;
        } 

        /**
         * MaxEgressBandwidth.
         */
        public Builder maxEgressBandwidth(Integer maxEgressBandwidth) {
            this.putQueryParameter("MaxEgressBandwidth", maxEgressBandwidth);
            this.maxEgressBandwidth = maxEgressBandwidth;
            return this;
        }

        /**
         * MaxIngressBandwidth.
         */
        public Builder maxIngressBandwidth(Integer maxIngressBandwidth) {
            this.putQueryParameter("MaxIngressBandwidth", maxIngressBandwidth);
            this.maxIngressBandwidth = maxIngressBandwidth;
            return this;
        }

        /**
         * RenderingInstanceId.
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.putQueryParameter("RenderingInstanceId", renderingInstanceId);
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        @Override
        public ModifyRenderingInstanceBandwidthRequest build() {
            return new ModifyRenderingInstanceBandwidthRequest(this);
        } 

    } 

}
