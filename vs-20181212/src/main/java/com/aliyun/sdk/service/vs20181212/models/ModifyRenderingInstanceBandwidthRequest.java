// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
         * <p>The maximum outbound bandwidth limit, in Mbit/s. You must specify at least one of MaxIngressBandwidth and MaxEgressBandwidth.</p>
         * <ul>
         * <li>The original configuration of the instance does not limit the bandwidth.</li>
         * <li>If you do not specify this parameter or specify 0, the last configuration is retained by default.</li>
         * <li>If you specify a value less than 0, the bandwidth limit is reset to unlimited.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxEgressBandwidth(Integer maxEgressBandwidth) {
            this.putQueryParameter("MaxEgressBandwidth", maxEgressBandwidth);
            this.maxEgressBandwidth = maxEgressBandwidth;
            return this;
        }

        /**
         * <p>The maximum inbound bandwidth limit, in Mbit/s. You must specify at least one of MaxIngressBandwidth and MaxEgressBandwidth.</p>
         * <ul>
         * <li>The original configuration of the instance does not limit the bandwidth.</li>
         * <li>If you do not specify this parameter or specify 0, the last configuration is retained by default.</li>
         * <li>If you specify a value less than 0, the bandwidth limit is reset to unlimited.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxIngressBandwidth(Integer maxIngressBandwidth) {
            this.putQueryParameter("MaxIngressBandwidth", maxIngressBandwidth);
            this.maxIngressBandwidth = maxIngressBandwidth;
            return this;
        }

        /**
         * <p>The instance ID of the cloud application service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
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
