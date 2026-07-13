// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link ListProtectionPolicyApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListProtectionPolicyApplicationsRequest</p>
 */
public class ListProtectionPolicyApplicationsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ProtectionPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protectionPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyStatus")
    private String applyStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubProtectionPolicyType")
    private String subProtectionPolicyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private ListProtectionPolicyApplicationsRequest(Builder builder) {
        super(builder);
        this.protectionPolicyId = builder.protectionPolicyId;
        this.applyStatus = builder.applyStatus;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceType = builder.resourceType;
        this.subProtectionPolicyType = builder.subProtectionPolicyType;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProtectionPolicyApplicationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return protectionPolicyId
     */
    public String getProtectionPolicyId() {
        return this.protectionPolicyId;
    }

    /**
     * @return applyStatus
     */
    public String getApplyStatus() {
        return this.applyStatus;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return subProtectionPolicyType
     */
    public String getSubProtectionPolicyType() {
        return this.subProtectionPolicyType;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ListProtectionPolicyApplicationsRequest, Builder> {
        private String protectionPolicyId; 
        private String applyStatus; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceType; 
        private String subProtectionPolicyType; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(ListProtectionPolicyApplicationsRequest request) {
            super(request);
            this.protectionPolicyId = request.protectionPolicyId;
            this.applyStatus = request.applyStatus;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceType = request.resourceType;
            this.subProtectionPolicyType = request.subProtectionPolicyType;
            this.taskId = request.taskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p-123***7890</p>
         */
        public Builder protectionPolicyId(String protectionPolicyId) {
            this.putPathParameter("ProtectionPolicyId", protectionPolicyId);
            this.protectionPolicyId = protectionPolicyId;
            return this;
        }

        /**
         * ApplyStatus.
         */
        public Builder applyStatus(String applyStatus) {
            this.putQueryParameter("ApplyStatus", applyStatus);
            this.applyStatus = applyStatus;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * SubProtectionPolicyType.
         */
        public Builder subProtectionPolicyType(String subProtectionPolicyType) {
            this.putQueryParameter("SubProtectionPolicyType", subProtectionPolicyType);
            this.subProtectionPolicyType = subProtectionPolicyType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t-0004d9ctt1ii********</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ListProtectionPolicyApplicationsRequest build() {
            return new ListProtectionPolicyApplicationsRequest(this);
        } 

    } 

}
