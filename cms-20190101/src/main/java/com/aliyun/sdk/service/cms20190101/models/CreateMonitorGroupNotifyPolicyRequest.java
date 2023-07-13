// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMonitorGroupNotifyPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorGroupNotifyPolicyRequest</p>
 */
public class CreateMonitorGroupNotifyPolicyRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("PolicyType")
    @Validation(required = true)
    private String policyType;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private CreateMonitorGroupNotifyPolicyRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.groupId = builder.groupId;
        this.policyType = builder.policyType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorGroupNotifyPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateMonitorGroupNotifyPolicyRequest, Builder> {
        private Long endTime; 
        private String groupId; 
        private String policyType; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitorGroupNotifyPolicyRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.groupId = request.groupId;
            this.policyType = request.policyType;
            this.startTime = request.startTime;
        } 

        /**
         * The ID of the request.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The HTTP status code 200 indicates that the call succeeds.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The timestamp that indicates the end time of the validity period for the policy.
         * <p>
         * 
         * This value is a UNIX timestamp that represents the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * The error message.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateMonitorGroupNotifyPolicyRequest build() {
            return new CreateMonitorGroupNotifyPolicyRequest(this);
        } 

    } 

}
