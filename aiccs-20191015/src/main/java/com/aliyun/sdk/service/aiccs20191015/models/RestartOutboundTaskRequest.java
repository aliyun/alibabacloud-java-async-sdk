// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link RestartOutboundTaskRequest} extends {@link RequestModel}
 *
 * <p>RestartOutboundTaskRequest</p>
 */
public class RestartOutboundTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutboundTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long outboundTaskId;

    private RestartOutboundTaskRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.outboundTaskId = builder.outboundTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartOutboundTaskRequest create() {
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
     * @return outboundTaskId
     */
    public Long getOutboundTaskId() {
        return this.outboundTaskId;
    }

    public static final class Builder extends Request.Builder<RestartOutboundTaskRequest, Builder> {
        private String instanceId; 
        private Long outboundTaskId; 

        private Builder() {
            super();
        } 

        private Builder(RestartOutboundTaskRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.outboundTaskId = request.outboundTaskId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder outboundTaskId(Long outboundTaskId) {
            this.putQueryParameter("OutboundTaskId", outboundTaskId);
            this.outboundTaskId = outboundTaskId;
            return this;
        }

        @Override
        public RestartOutboundTaskRequest build() {
            return new RestartOutboundTaskRequest(this);
        } 

    } 

}
