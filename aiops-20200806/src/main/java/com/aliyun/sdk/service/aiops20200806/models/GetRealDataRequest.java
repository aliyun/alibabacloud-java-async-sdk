// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRealDataRequest} extends {@link RequestModel}
 *
 * <p>GetRealDataRequest</p>
 */
public class GetRealDataRequest extends Request {
    @Query
    @NameInMap("EndTimestamp")
    private String endTimestamp;

    @Query
    @NameInMap("FlowName")
    private String flowName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("StartTimestamp")
    private String startTimestamp;

    @Query
    @NameInMap("Uid")
    private Long uid;

    private GetRealDataRequest(Builder builder) {
        super(builder);
        this.endTimestamp = builder.endTimestamp;
        this.flowName = builder.flowName;
        this.instanceId = builder.instanceId;
        this.startTimestamp = builder.startTimestamp;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTimestamp
     */
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return startTimestamp
     */
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetRealDataRequest, Builder> {
        private String endTimestamp; 
        private String flowName; 
        private String instanceId; 
        private String startTimestamp; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(GetRealDataRequest request) {
            super(request);
            this.endTimestamp = request.endTimestamp;
            this.flowName = request.flowName;
            this.instanceId = request.instanceId;
            this.startTimestamp = request.startTimestamp;
            this.uid = request.uid;
        } 

        /**
         * EndTimestamp.
         */
        public Builder endTimestamp(String endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("FlowName", flowName);
            this.flowName = flowName;
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
         * StartTimestamp.
         */
        public Builder startTimestamp(String startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetRealDataRequest build() {
            return new GetRealDataRequest(this);
        } 

    } 

}
