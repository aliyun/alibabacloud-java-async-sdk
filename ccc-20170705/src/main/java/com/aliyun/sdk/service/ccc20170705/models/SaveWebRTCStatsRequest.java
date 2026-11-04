// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link SaveWebRTCStatsRequest} extends {@link RequestModel}
 *
 * <p>SaveWebRTCStatsRequest</p>
 */
public class SaveWebRTCStatsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallStartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long callStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalleeNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calleeNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callerNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long recordTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Stats")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stats;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(SaveWebRTCStatsRequest request) {
            super(request);
            this.callId = request.callId;
            this.callStartTime = request.callStartTime;
            this.calleeNumber = request.calleeNumber;
            this.callerNumber = request.callerNumber;
            this.instanceId = request.instanceId;
            this.recordTime = request.recordTime;
            this.stats = request.stats;
            this.tenantId = request.tenantId;
            this.uid = request.uid;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder callStartTime(Long callStartTime) {
            this.putQueryParameter("CallStartTime", callStartTime);
            this.callStartTime = callStartTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder calleeNumber(String calleeNumber) {
            this.putQueryParameter("CalleeNumber", calleeNumber);
            this.calleeNumber = calleeNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder callerNumber(String callerNumber) {
            this.putQueryParameter("CallerNumber", callerNumber);
            this.callerNumber = callerNumber;
            return this;
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
        public Builder recordTime(Long recordTime) {
            this.putQueryParameter("RecordTime", recordTime);
            this.recordTime = recordTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder stats(String stats) {
            this.putQueryParameter("Stats", stats);
            this.stats = stats;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
