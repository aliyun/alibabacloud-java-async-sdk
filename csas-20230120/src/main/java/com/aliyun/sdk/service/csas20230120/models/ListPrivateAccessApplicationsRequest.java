// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrivateAccessApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListPrivateAccessApplicationsRequest</p>
 */
public class ListPrivateAccessApplicationsRequest extends Request {
    @Query
    @NameInMap("Address")
    private String address;

    @Query
    @NameInMap("ApplicationIds")
    private java.util.List < String > applicationIds;

    @Query
    @NameInMap("ConnectorId")
    private String connectorId;

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
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("TagId")
    private String tagId;

    private ListPrivateAccessApplicationsRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.applicationIds = builder.applicationIds;
        this.connectorId = builder.connectorId;
        this.currentPage = builder.currentPage;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.policyId = builder.policyId;
        this.status = builder.status;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateAccessApplicationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return applicationIds
     */
    public java.util.List < String > getApplicationIds() {
        return this.applicationIds;
    }

    /**
     * @return connectorId
     */
    public String getConnectorId() {
        return this.connectorId;
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

    public static final class Builder extends Request.Builder<ListPrivateAccessApplicationsRequest, Builder> {
        private String address; 
        private java.util.List < String > applicationIds; 
        private String connectorId; 
        private Integer currentPage; 
        private String name; 
        private Integer pageSize; 
        private String policyId; 
        private String status; 
        private String tagId; 

        private Builder() {
            super();
        } 

        private Builder(ListPrivateAccessApplicationsRequest request) {
            super(request);
            this.address = request.address;
            this.applicationIds = request.applicationIds;
            this.connectorId = request.connectorId;
            this.currentPage = request.currentPage;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.policyId = request.policyId;
            this.status = request.status;
            this.tagId = request.tagId;
        } 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * ApplicationIds.
         */
        public Builder applicationIds(java.util.List < String > applicationIds) {
            this.putQueryParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * ConnectorId.
         */
        public Builder connectorId(String connectorId) {
            this.putQueryParameter("ConnectorId", connectorId);
            this.connectorId = connectorId;
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

        @Override
        public ListPrivateAccessApplicationsRequest build() {
            return new ListPrivateAccessApplicationsRequest(this);
        } 

    } 

}
