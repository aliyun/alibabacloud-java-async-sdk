// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduembed20240101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLabReservationRequest} extends {@link RequestModel}
 *
 * <p>CreateLabReservationRequest</p>
 */
public class CreateLabReservationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long labId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MemberCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long memberCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private CreateLabReservationRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.endTime = builder.endTime;
        this.labId = builder.labId;
        this.memberCount = builder.memberCount;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLabReservationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return labId
     */
    public Long getLabId() {
        return this.labId;
    }

    /**
     * @return memberCount
     */
    public Long getMemberCount() {
        return this.memberCount;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateLabReservationRequest, Builder> {
        private Long accountId; 
        private String endTime; 
        private Long labId; 
        private Long memberCount; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateLabReservationRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.endTime = request.endTime;
            this.labId = request.labId;
            this.memberCount = request.memberCount;
            this.startTime = request.startTime;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(Long accountId) {
            this.putBodyParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * LabId.
         */
        public Builder labId(Long labId) {
            this.putBodyParameter("LabId", labId);
            this.labId = labId;
            return this;
        }

        /**
         * MemberCount.
         */
        public Builder memberCount(Long memberCount) {
            this.putBodyParameter("MemberCount", memberCount);
            this.memberCount = memberCount;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateLabReservationRequest build() {
            return new CreateLabReservationRequest(this);
        } 

    } 

}
