// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListPrivateAccessTagsRequest} extends {@link RequestModel}
 *
 * <p>ListPrivateAccessTagsRequest</p>
 */
public class ListPrivateAccessTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SimpleMode")
    private Boolean simpleMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagIds")
    private java.util.List<String> tagIds;

    private ListPrivateAccessTagsRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.currentPage = builder.currentPage;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.policyId = builder.policyId;
        this.simpleMode = builder.simpleMode;
        this.tagIds = builder.tagIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateAccessTagsRequest create() {
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
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return simpleMode
     */
    public Boolean getSimpleMode() {
        return this.simpleMode;
    }

    /**
     * @return tagIds
     */
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    public static final class Builder extends Request.Builder<ListPrivateAccessTagsRequest, Builder> {
        private String applicationId; 
        private Integer currentPage; 
        private String name; 
        private Integer pageSize; 
        private String policyId; 
        private Boolean simpleMode; 
        private java.util.List<String> tagIds; 

        private Builder() {
            super();
        } 

        private Builder(ListPrivateAccessTagsRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.currentPage = request.currentPage;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.policyId = request.policyId;
            this.simpleMode = request.simpleMode;
            this.tagIds = request.tagIds;
        } 

        /**
         * <p>The ID of the internal access application. You can obtain the application ID by calling the following operations:</p>
         * <ul>
         * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: queries all internal access applications.</li>
         * <li><a href="~~CreatePrivateAccessApplication~~">CreatePrivateAccessApplication</a>: creates an internal access application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pa-application-e12860ef6c48****</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The page number. Valid values: 1 to 10000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The name of the internal access tag. The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>tag_name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 1000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the internal access policy. You can obtain the policy ID by calling the following operations:</p>
         * <ul>
         * <li><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: queries all internal access policies.</li>
         * <li><a href="~~CreatePrivateAccessPolicy~~">CreatePrivateAccessPolicy</a>: creates an internal access policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pa-policy-54a7838a48bf****</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the simple query mode. A value of true specifies that policy IDs are not queried.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder simpleMode(Boolean simpleMode) {
            this.putQueryParameter("SimpleMode", simpleMode);
            this.simpleMode = simpleMode;
            return this;
        }

        /**
         * <p>The IDs of internal access tags. You can specify up to 100 tag IDs.</p>
         */
        public Builder tagIds(java.util.List<String> tagIds) {
            this.putQueryParameter("TagIds", tagIds);
            this.tagIds = tagIds;
            return this;
        }

        @Override
        public ListPrivateAccessTagsRequest build() {
            return new ListPrivateAccessTagsRequest(this);
        } 

    } 

}
