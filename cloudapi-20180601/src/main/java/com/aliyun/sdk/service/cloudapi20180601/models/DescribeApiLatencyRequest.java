// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiLatencyRequest} extends {@link RequestModel}
 *
 * <p>DescribeApiLatencyRequest</p>
 */
public class DescribeApiLatencyRequest extends Request {
    @Query
    @NameInMap("ApiId")
    @Validation(required = true)
    private String apiId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeApiLatencyRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.endTime = builder.endTime;
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiLatencyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeApiLatencyRequest, Builder> {
        private String apiId; 
        private String endTime; 
        private String groupId; 
        private String securityToken; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApiLatencyRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.endTime = request.endTime;
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
            this.startTime = request.startTime;
        } 

        /**
         * ApiId.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeApiLatencyRequest build() {
            return new DescribeApiLatencyRequest(this);
        } 

    } 

}
