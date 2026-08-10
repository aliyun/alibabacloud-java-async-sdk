// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link CreateContextDatabaseMemberRequest} extends {@link RequestModel}
 *
 * <p>CreateContextDatabaseMemberRequest</p>
 */
public class CreateContextDatabaseMemberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GenerateInitialKey")
    private Boolean generateInitialKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitialKeyName")
    private String initialKeyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memberName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    @com.aliyun.core.annotation.Validation(required = true)
    private String role;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateContextDatabaseMemberRequest(Builder builder) {
        super(builder);
        this.generateInitialKey = builder.generateInitialKey;
        this.initialKeyName = builder.initialKeyName;
        this.memberName = builder.memberName;
        this.role = builder.role;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContextDatabaseMemberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return generateInitialKey
     */
    public Boolean getGenerateInitialKey() {
        return this.generateInitialKey;
    }

    /**
     * @return initialKeyName
     */
    public String getInitialKeyName() {
        return this.initialKeyName;
    }

    /**
     * @return memberName
     */
    public String getMemberName() {
        return this.memberName;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateContextDatabaseMemberRequest, Builder> {
        private Boolean generateInitialKey; 
        private String initialKeyName; 
        private String memberName; 
        private String role; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateContextDatabaseMemberRequest request) {
            super(request);
            this.generateInitialKey = request.generateInitialKey;
            this.initialKeyName = request.initialKeyName;
            this.memberName = request.memberName;
            this.role = request.role;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * GenerateInitialKey.
         */
        public Builder generateInitialKey(Boolean generateInitialKey) {
            this.putQueryParameter("GenerateInitialKey", generateInitialKey);
            this.generateInitialKey = generateInitialKey;
            return this;
        }

        /**
         * InitialKeyName.
         */
        public Builder initialKeyName(String initialKeyName) {
            this.putQueryParameter("InitialKeyName", initialKeyName);
            this.initialKeyName = initialKeyName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        public Builder memberName(String memberName) {
            this.putQueryParameter("MemberName", memberName);
            this.memberName = memberName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>member</p>
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-as1llqmkol****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateContextDatabaseMemberRequest build() {
            return new CreateContextDatabaseMemberRequest(this);
        } 

    } 

}
