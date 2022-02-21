// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertTaskDetailRequest} extends {@link RequestModel}
 *
 * <p>InsertTaskDetailRequest</p>
 */
public class InsertTaskDetailRequest extends Request {
    @Query
    @NameInMap("CallInfos")
    @Validation(required = true)
    private String callInfos;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OutboundTaskId")
    @Validation(required = true)
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

        private Builder(InsertTaskDetailRequest response) {
            super(response);
            this.callInfos = response.callInfos;
            this.instanceId = response.instanceId;
            this.outboundTaskId = response.outboundTaskId;
        } 

        /**
         * CallInfos.
         */
        public Builder callInfos(String callInfos) {
            this.putQueryParameter("CallInfos", callInfos);
            this.callInfos = callInfos;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OutboundTaskId.
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
