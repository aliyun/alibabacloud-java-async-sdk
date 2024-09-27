// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReportSessionStatusRequest} extends {@link RequestModel}
 *
 * <p>ReportSessionStatusRequest</p>
 */
public class ReportSessionStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionChangeTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sessionChangeTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionStatus;

    private ReportSessionStatusRequest(Builder builder) {
        super(builder);
        this.endUserId = builder.endUserId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.sessionChangeTime = builder.sessionChangeTime;
        this.sessionId = builder.sessionId;
        this.sessionStatus = builder.sessionStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportSessionStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionChangeTime
     */
    public Long getSessionChangeTime() {
        return this.sessionChangeTime;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sessionStatus
     */
    public String getSessionStatus() {
        return this.sessionStatus;
    }

    public static final class Builder extends Request.Builder<ReportSessionStatusRequest, Builder> {
        private String endUserId; 
        private String instanceId; 
        private String regionId; 
        private Long sessionChangeTime; 
        private String sessionId; 
        private String sessionStatus; 

        private Builder() {
            super();
        } 

        private Builder(ReportSessionStatusRequest request) {
            super(request);
            this.endUserId = request.endUserId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.sessionChangeTime = request.sessionChangeTime;
            this.sessionId = request.sessionId;
            this.sessionStatus = request.sessionStatus;
        } 

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SessionChangeTime.
         */
        public Builder sessionChangeTime(Long sessionChangeTime) {
            this.putQueryParameter("SessionChangeTime", sessionChangeTime);
            this.sessionChangeTime = sessionChangeTime;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * SessionStatus.
         */
        public Builder sessionStatus(String sessionStatus) {
            this.putQueryParameter("SessionStatus", sessionStatus);
            this.sessionStatus = sessionStatus;
            return this;
        }

        @Override
        public ReportSessionStatusRequest build() {
            return new ReportSessionStatusRequest(this);
        } 

    } 

}
