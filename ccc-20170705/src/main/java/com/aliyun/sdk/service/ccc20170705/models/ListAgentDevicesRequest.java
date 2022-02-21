// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentDevicesRequest} extends {@link RequestModel}
 *
 * <p>ListAgentDevicesRequest</p>
 */
public class ListAgentDevicesRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RamIds")
    private String ramIds;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("StopTime")
    private Long stopTime;

    private ListAgentDevicesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ramIds = builder.ramIds;
        this.startTime = builder.startTime;
        this.stopTime = builder.stopTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentDevicesRequest create() {
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
     * @return ramIds
     */
    public String getRamIds() {
        return this.ramIds;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return stopTime
     */
    public Long getStopTime() {
        return this.stopTime;
    }

    public static final class Builder extends Request.Builder<ListAgentDevicesRequest, Builder> {
        private String instanceId; 
        private String ramIds; 
        private Long startTime; 
        private Long stopTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentDevicesRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.ramIds = response.ramIds;
            this.startTime = response.startTime;
            this.stopTime = response.stopTime;
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
         * RamIds.
         */
        public Builder ramIds(String ramIds) {
            this.putQueryParameter("RamIds", ramIds);
            this.ramIds = ramIds;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * StopTime.
         */
        public Builder stopTime(Long stopTime) {
            this.putQueryParameter("StopTime", stopTime);
            this.stopTime = stopTime;
            return this;
        }

        @Override
        public ListAgentDevicesRequest build() {
            return new ListAgentDevicesRequest(this);
        } 

    } 

}
