// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiLatencyDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeApiLatencyDataRequest</p>
 */
public class DescribeApiLatencyDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StageName")
    private String stageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeApiLatencyDataRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.endTime = builder.endTime;
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiLatencyDataRequest create() {
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
     * @return stageName
     */
    public String getStageName() {
        return this.stageName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeApiLatencyDataRequest, Builder> {
        private String apiId; 
        private String endTime; 
        private String groupId; 
        private String securityToken; 
        private String stageName; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApiLatencyDataRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.endTime = request.endTime;
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
            this.startTime = request.startTime;
        } 

        /**
         * The ID of the API.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * The end time in UTC. Format: YYYY-MM-DDThh:mm:ssZ
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the API group.
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
         * The environment. Valid values:
         * <p>
         * 
         * *   **RELEASE**
         * *   **PRE**: the pre-release environment
         * *   **TEST**
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        /**
         * The start time in UTC. Format: YYYY-MM-DDThh:mm:ssZ
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeApiLatencyDataRequest build() {
            return new DescribeApiLatencyDataRequest(this);
        } 

    } 

}
