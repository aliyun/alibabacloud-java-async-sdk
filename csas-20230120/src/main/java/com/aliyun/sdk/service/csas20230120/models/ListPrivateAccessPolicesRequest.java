// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrivateAccessPolicesRequest} extends {@link RequestModel}
 *
 * <p>ListPrivateAccessPolicesRequest</p>
 */
public class ListPrivateAccessPolicesRequest extends Request {
    @Query
    @NameInMap("ApplicationId")
    private String applicationId;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("PolicyAction")
    private String policyAction;

    @Query
    @NameInMap("PolicyIds")
    private java.util.List < String > policyIds;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("TagId")
    private String tagId;

    @Query
    @NameInMap("UserGroupId")
    private String userGroupId;

    private ListPrivateAccessPolicesRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.currentPage = builder.currentPage;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.policyAction = builder.policyAction;
        this.policyIds = builder.policyIds;
        this.status = builder.status;
        this.tagId = builder.tagId;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateAccessPolicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyAction
     */
    public String getPolicyAction() {
        return this.policyAction;
    }

    /**
     * @return policyIds
     */
    public java.util.List < String > getPolicyIds() {
        return this.policyIds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tagId
     */
    public String getTagId() {
        return this.tagId;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<ListPrivateAccessPolicesRequest, Builder> {
        private String applicationId; 
        private Integer currentPage; 
        private String name; 
        private Integer pageSize; 
        private String policyAction; 
        private java.util.List < String > policyIds; 
        private String status; 
        private String tagId; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListPrivateAccessPolicesRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.currentPage = request.currentPage;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.policyAction = request.policyAction;
            this.policyIds = request.policyIds;
            this.status = request.status;
            this.tagId = request.tagId;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PolicyAction.
         */
        public Builder policyAction(String policyAction) {
            this.putQueryParameter("PolicyAction", policyAction);
            this.policyAction = policyAction;
            return this;
        }

        /**
         * PolicyIds.
         */
        public Builder policyIds(java.util.List < String > policyIds) {
            String policyIdsShrink = shrink(policyIds, "PolicyIds", "json");
            this.putQueryParameter("PolicyIds", policyIdsShrink);
            this.policyIds = policyIds;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TagId.
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        /**
         * UserGroupId.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public ListPrivateAccessPolicesRequest build() {
            return new ListPrivateAccessPolicesRequest(this);
        } 

    } 

}
