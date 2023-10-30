// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptOperationTicketRequest} extends {@link RequestModel}
 *
 * <p>AcceptOperationTicketRequest</p>
 */
public class AcceptOperationTicketRequest extends Request {
    @Query
    @NameInMap("EffectCount")
    @Validation(required = true)
    private String effectCount;

    @Query
    @NameInMap("EffectEndTime")
    @Validation(required = true)
    private String effectEndTime;

    @Query
    @NameInMap("EffectStartTime")
    @Validation(required = true)
    private String effectStartTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OperationTicketId")
    @Validation(required = true)
    private String operationTicketId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private AcceptOperationTicketRequest(Builder builder) {
        super(builder);
        this.effectCount = builder.effectCount;
        this.effectEndTime = builder.effectEndTime;
        this.effectStartTime = builder.effectStartTime;
        this.instanceId = builder.instanceId;
        this.operationTicketId = builder.operationTicketId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptOperationTicketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return effectCount
     */
    public String getEffectCount() {
        return this.effectCount;
    }

    /**
     * @return effectEndTime
     */
    public String getEffectEndTime() {
        return this.effectEndTime;
    }

    /**
     * @return effectStartTime
     */
    public String getEffectStartTime() {
        return this.effectStartTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return operationTicketId
     */
    public String getOperationTicketId() {
        return this.operationTicketId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AcceptOperationTicketRequest, Builder> {
        private String effectCount; 
        private String effectEndTime; 
        private String effectStartTime; 
        private String instanceId; 
        private String operationTicketId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AcceptOperationTicketRequest request) {
            super(request);
            this.effectCount = request.effectCount;
            this.effectEndTime = request.effectEndTime;
            this.effectStartTime = request.effectStartTime;
            this.instanceId = request.instanceId;
            this.operationTicketId = request.operationTicketId;
            this.regionId = request.regionId;
        } 

        /**
         * The maximum number of logons allowed. Valid values:
         * <p>
         * 
         * *   0: The number of logons is unlimited. The O\&M engineer can log on to the specified asset for an unlimited number of times during the validity period.
         * *   1: The O\&M engineer can log on to the specified asset only once during the validity period.
         * 
         * >  You can set this parameter only to 0 if you review an O\&M application on a database.
         */
        public Builder effectCount(String effectCount) {
            this.putQueryParameter("EffectCount", effectCount);
            this.effectCount = effectCount;
            return this;
        }

        /**
         * The end time of the validity period. The value is a UNIX timestamp. Unit: seconds.
         */
        public Builder effectEndTime(String effectEndTime) {
            this.putQueryParameter("EffectEndTime", effectEndTime);
            this.effectEndTime = effectEndTime;
            return this;
        }

        /**
         * The start time of the validity period. The value is a UNIX timestamp. Unit: seconds.
         */
        public Builder effectStartTime(String effectStartTime) {
            this.putQueryParameter("EffectStartTime", effectStartTime);
            this.effectStartTime = effectStartTime;
            return this;
        }

        /**
         * The ID of the bastion host.
         * <p>
         * 
         * > You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the O\&M application that you want to approve. You can call the ListOperationTickets operation to query the IDs of all O\&M applications that require review.
         */
        public Builder operationTicketId(String operationTicketId) {
            this.putQueryParameter("OperationTicketId", operationTicketId);
            this.operationTicketId = operationTicketId;
            return this;
        }

        /**
         * The region ID of the bastion host.
         * <p>
         * 
         * >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AcceptOperationTicketRequest build() {
            return new AcceptOperationTicketRequest(this);
        } 

    } 

}
