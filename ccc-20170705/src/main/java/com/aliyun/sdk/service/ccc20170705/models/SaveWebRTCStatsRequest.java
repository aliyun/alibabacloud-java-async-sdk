// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveWebRTCStatsRequest} extends {@link RequestModel}
 *
 * <p>SaveWebRTCStatsRequest</p>
 */
public class SaveWebRTCStatsRequest extends Request {
    @Query
    @NameInMap("CallId")
    @Validation(required = true)
    private String callId;

    @Query
    @NameInMap("CallStartTime")
    @Validation(required = true)
    private Long callStartTime;

    @Query
    @NameInMap("CalleeNumber")
    @Validation(required = true)
    private String calleeNumber;

    @Query
    @NameInMap("CallerNumber")
    @Validation(required = true)
    private String callerNumber;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RecordTime")
    @Validation(required = true)
    private Long recordTime;

    @Query
    @NameInMap("Stats")
    @Validation(required = true)
    private String stats;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    @Query
    @NameInMap("Uid")
    @Validation(required = true)
    private String uid;

    private SaveWebRTCStatsRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.callStartTime = builder.callStartTime;
        this.calleeNumber = builder.calleeNumber;
        this.callerNumber = builder.callerNumber;
        this.instanceId = builder.instanceId;
        this.recordTime = builder.recordTime;
        this.stats = builder.stats;
        this.tenantId = builder.tenantId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveWebRTCStatsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return callStartTime
     */
    public Long getCallStartTime() {
        return this.callStartTime;
    }

    /**
     * @return calleeNumber
     */
    public String getCalleeNumber() {
        return this.calleeNumber;
    }

    /**
     * @return callerNumber
     */
    public String getCallerNumber() {
        return this.callerNumber;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return recordTime
     */
    public Long getRecordTime() {
        return this.recordTime;
    }

    /**
     * @return stats
     */
    public String getStats() {
        return this.stats;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<SaveWebRTCStatsRequest, Builder> {
        private String callId; 
        private Long callStartTime; 
        private String calleeNumber; 
        private String callerNumber; 
        private String instanceId; 
        private Long recordTime; 
        private String stats; 
        private String tenantId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(SaveWebRTCStatsRequest response) {
            super(response);
            this.callId = response.callId;
            this.callStartTime = response.callStartTime;
            this.calleeNumber = response.calleeNumber;
            this.callerNumber = response.callerNumber;
            this.instanceId = response.instanceId;
            this.recordTime = response.recordTime;
            this.stats = response.stats;
            this.tenantId = response.tenantId;
            this.uid = response.uid;
        } 

        /**
         * CallId.
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * CallStartTime.
         */
        public Builder callStartTime(Long callStartTime) {
            this.putQueryParameter("CallStartTime", callStartTime);
            this.callStartTime = callStartTime;
            return this;
        }

        /**
         * CalleeNumber.
         */
        public Builder calleeNumber(String calleeNumber) {
            this.putQueryParameter("CalleeNumber", calleeNumber);
            this.calleeNumber = calleeNumber;
            return this;
        }

        /**
         * CallerNumber.
         */
        public Builder callerNumber(String callerNumber) {
            this.putQueryParameter("CallerNumber", callerNumber);
            this.callerNumber = callerNumber;
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
         * RecordTime.
         */
        public Builder recordTime(Long recordTime) {
            this.putQueryParameter("RecordTime", recordTime);
            this.recordTime = recordTime;
            return this;
        }

        /**
         * Stats.
         */
        public Builder stats(String stats) {
            this.putQueryParameter("Stats", stats);
            this.stats = stats;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public SaveWebRTCStatsRequest build() {
            return new SaveWebRTCStatsRequest(this);
        } 

    } 

}
