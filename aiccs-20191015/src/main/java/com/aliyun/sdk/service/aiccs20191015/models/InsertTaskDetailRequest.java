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
 * {@link InsertTaskDetailRequest} extends {@link RequestModel}
 *
 * <p>InsertTaskDetailRequest</p>
 */
public class InsertTaskDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallInfos")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutboundTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long outboundTaskId;

    private InsertTaskDetailRequest(Builder builder) {
        super(builder);
        this.callInfos = builder.callInfos;
        this.instanceId = builder.instanceId;
        this.outboundTaskId = builder.outboundTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertTaskDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callInfos
     */
    public String getCallInfos() {
        return this.callInfos;
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

    public static final class Builder extends Request.Builder<InsertTaskDetailRequest, Builder> {
        private String callInfos; 
        private String instanceId; 
        private Long outboundTaskId; 

        private Builder() {
            super();
        } 

        private Builder(InsertTaskDetailRequest request) {
            super(request);
            this.callInfos = request.callInfos;
            this.instanceId = request.instanceId;
            this.outboundTaskId = request.outboundTaskId;
        } 

        /**
         * <p>The outbound call information.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;dnis&quot;:&quot;1&quot;,&quot;memberId&quot;:1133,&quot;memberName&quot;:&quot;Test member&quot;,&quot;priority&quot;:10}]</p>
         */
        public Builder callInfos(String callInfos) {
            this.putQueryParameter("CallInfos", callInfos);
            this.callInfos = callInfos;
            return this;
        }

        /**
         * <p>Instance ID of the AICCS instance. You can obtain instance ID from the Artificial Intelligence Cloud Call Service console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the outbound task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>120001</p>
         */
        public Builder outboundTaskId(Long outboundTaskId) {
            this.putQueryParameter("OutboundTaskId", outboundTaskId);
            this.outboundTaskId = outboundTaskId;
            return this;
        }

        @Override
        public InsertTaskDetailRequest build() {
            return new InsertTaskDetailRequest(this);
        } 

    } 

}
