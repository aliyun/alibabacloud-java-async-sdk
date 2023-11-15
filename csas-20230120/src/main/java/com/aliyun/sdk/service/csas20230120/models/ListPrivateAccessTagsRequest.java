// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrivateAccessTagsRequest} extends {@link RequestModel}
 *
 * <p>ListPrivateAccessTagsRequest</p>
 */
public class ListPrivateAccessTagsRequest extends Request {
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
    @NameInMap("PolicyId")
    private String policyId;

    @Query
    @NameInMap("SimpleMode")
    private Boolean simpleMode;

    @Query
    @NameInMap("TagIds")
    private java.util.List < String > tagIds;

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
    public java.util.List < String > getTagIds() {
        return this.tagIds;
    }

    public static final class Builder extends Request.Builder<ListPrivateAccessTagsRequest, Builder> {
        private String applicationId; 
        private Integer currentPage; 
        private String name; 
        private Integer pageSize; 
        private String policyId; 
        private Boolean simpleMode; 
        private java.util.List < String > tagIds; 

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
         * PolicyId.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * SimpleMode.
         */
        public Builder simpleMode(Boolean simpleMode) {
            this.putQueryParameter("SimpleMode", simpleMode);
            this.simpleMode = simpleMode;
            return this;
        }

        /**
         * TagIds.
         */
        public Builder tagIds(java.util.List < String > tagIds) {
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
