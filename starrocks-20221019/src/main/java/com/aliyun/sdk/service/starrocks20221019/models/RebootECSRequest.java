// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link RebootECSRequest} extends {@link RequestModel}
 *
 * <p>RebootECSRequest</p>
 */
public class RebootECSRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RebootTime")
    private Long rebootTime;

    private RebootECSRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.eventId = builder.eventId;
        this.instanceId = builder.instanceId;
        this.rebootTime = builder.rebootTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootECSRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return rebootTime
     */
    public Long getRebootTime() {
        return this.rebootTime;
    }

    public static final class Builder extends Request.Builder<RebootECSRequest, Builder> {
        private String regionId; 
        private String eventId; 
        private String instanceId; 
        private Long rebootTime; 

        private Builder() {
            super();
        } 

        private Builder(RebootECSRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.eventId = request.eventId;
            this.instanceId = request.instanceId;
            this.rebootTime = request.rebootTime;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
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
         * RebootTime.
         */
        public Builder rebootTime(Long rebootTime) {
            this.putQueryParameter("RebootTime", rebootTime);
            this.rebootTime = rebootTime;
            return this;
        }

        @Override
        public RebootECSRequest build() {
            return new RebootECSRequest(this);
        } 

    } 

}
