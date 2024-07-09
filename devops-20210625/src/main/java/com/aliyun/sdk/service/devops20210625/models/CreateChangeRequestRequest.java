// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateChangeRequestRequest} extends {@link RequestModel}
 *
 * <p>CreateChangeRequestRequest</p>
 */
public class CreateChangeRequestRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appCodeRepoSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCodeRepoSn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoDeleteBranchWhenEnd")
    private Boolean autoDeleteBranchWhenEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("branchName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String branchName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("createBranch")
    private Boolean createBranch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ownerAccountId")
    private String ownerAccountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ownerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ownerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    private String organizationId;

    private CreateChangeRequestRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.appCodeRepoSn = builder.appCodeRepoSn;
        this.autoDeleteBranchWhenEnd = builder.autoDeleteBranchWhenEnd;
        this.branchName = builder.branchName;
        this.createBranch = builder.createBranch;
        this.ownerAccountId = builder.ownerAccountId;
        this.ownerId = builder.ownerId;
        this.title = builder.title;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChangeRequestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appCodeRepoSn
     */
    public String getAppCodeRepoSn() {
        return this.appCodeRepoSn;
    }

    /**
     * @return autoDeleteBranchWhenEnd
     */
    public Boolean getAutoDeleteBranchWhenEnd() {
        return this.autoDeleteBranchWhenEnd;
    }

    /**
     * @return branchName
     */
    public String getBranchName() {
        return this.branchName;
    }

    /**
     * @return createBranch
     */
    public Boolean getCreateBranch() {
        return this.createBranch;
    }

    /**
     * @return ownerAccountId
     */
    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<CreateChangeRequestRequest, Builder> {
        private String appName; 
        private String appCodeRepoSn; 
        private Boolean autoDeleteBranchWhenEnd; 
        private String branchName; 
        private Boolean createBranch; 
        private String ownerAccountId; 
        private String ownerId; 
        private String title; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(CreateChangeRequestRequest request) {
            super(request);
            this.appName = request.appName;
            this.appCodeRepoSn = request.appCodeRepoSn;
            this.autoDeleteBranchWhenEnd = request.autoDeleteBranchWhenEnd;
            this.branchName = request.branchName;
            this.createBranch = request.createBranch;
            this.ownerAccountId = request.ownerAccountId;
            this.ownerId = request.ownerId;
            this.title = request.title;
            this.organizationId = request.organizationId;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * appCodeRepoSn.
         */
        public Builder appCodeRepoSn(String appCodeRepoSn) {
            this.putBodyParameter("appCodeRepoSn", appCodeRepoSn);
            this.appCodeRepoSn = appCodeRepoSn;
            return this;
        }

        /**
         * autoDeleteBranchWhenEnd.
         */
        public Builder autoDeleteBranchWhenEnd(Boolean autoDeleteBranchWhenEnd) {
            this.putBodyParameter("autoDeleteBranchWhenEnd", autoDeleteBranchWhenEnd);
            this.autoDeleteBranchWhenEnd = autoDeleteBranchWhenEnd;
            return this;
        }

        /**
         * branchName.
         */
        public Builder branchName(String branchName) {
            this.putBodyParameter("branchName", branchName);
            this.branchName = branchName;
            return this;
        }

        /**
         * createBranch.
         */
        public Builder createBranch(Boolean createBranch) {
            this.putBodyParameter("createBranch", createBranch);
            this.createBranch = createBranch;
            return this;
        }

        /**
         * ownerAccountId.
         */
        public Builder ownerAccountId(String ownerAccountId) {
            this.putBodyParameter("ownerAccountId", ownerAccountId);
            this.ownerAccountId = ownerAccountId;
            return this;
        }

        /**
         * ownerId.
         */
        public Builder ownerId(String ownerId) {
            this.putBodyParameter("ownerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public CreateChangeRequestRequest build() {
            return new CreateChangeRequestRequest(this);
        } 

    } 

}
