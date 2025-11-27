// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link CreateGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupRequest</p>
 */
public class CreateGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentGroupId")
    private String parentGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SolutionId")
    private String solutionId;

    private CreateGroupRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.parentGroupId = builder.parentGroupId;
        this.solutionId = builder.solutionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return parentGroupId
     */
    public String getParentGroupId() {
        return this.parentGroupId;
    }

    /**
     * @return solutionId
     */
    public String getSolutionId() {
        return this.solutionId;
    }

    public static final class Builder extends Request.Builder<CreateGroupRequest, Builder> {
        private String bizType; 
        private String description; 
        private String groupName; 
        private String parentGroupId; 
        private String solutionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGroupRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.description = request.description;
            this.groupName = request.groupName;
            this.parentGroupId = request.parentGroupId;
            this.solutionId = request.solutionId;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The description of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>TestGroup</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder parentGroupId(String parentGroupId) {
            this.putQueryParameter("ParentGroupId", parentGroupId);
            this.parentGroupId = parentGroupId;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>co-0esnf80jab***</p>
         */
        public Builder solutionId(String solutionId) {
            this.putQueryParameter("SolutionId", solutionId);
            this.solutionId = solutionId;
            return this;
        }

        @Override
        public CreateGroupRequest build() {
            return new CreateGroupRequest(this);
        } 

    } 

}
