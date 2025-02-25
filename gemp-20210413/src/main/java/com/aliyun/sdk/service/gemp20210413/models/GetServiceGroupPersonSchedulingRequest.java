// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceGroupPersonSchedulingRequest} extends {@link RequestModel}
 *
 * <p>GetServiceGroupPersonSchedulingRequest</p>
 */
public class GetServiceGroupPersonSchedulingRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    private Long serviceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    private Long userId;

    private GetServiceGroupPersonSchedulingRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.endTime = builder.endTime;
        this.serviceGroupId = builder.serviceGroupId;
        this.startTime = builder.startTime;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceGroupPersonSchedulingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetServiceGroupPersonSchedulingRequest, Builder> {
        private String clientToken; 
        private String endTime; 
        private Long serviceGroupId; 
        private String startTime; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceGroupPersonSchedulingRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.endTime = request.endTime;
            this.serviceGroupId = request.serviceGroupId;
            this.startTime = request.startTime;
            this.userId = request.userId;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * serviceGroupId.
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.putBodyParameter("serviceGroupId", serviceGroupId);
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetServiceGroupPersonSchedulingRequest build() {
            return new GetServiceGroupPersonSchedulingRequest(this);
        } 

    } 

}
