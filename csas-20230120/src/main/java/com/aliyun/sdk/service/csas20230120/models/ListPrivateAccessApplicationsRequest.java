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
 * {@link ListPrivateAccessApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListPrivateAccessApplicationsRequest</p>
 */
public class ListPrivateAccessApplicationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessModes")
    private String accessModes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    private java.util.List<String> applicationIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    private String connectorId;

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
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagId")
    private String tagId;

    private ListPrivateAccessApplicationsRequest(Builder builder) {
        super(builder);
        this.accessModes = builder.accessModes;
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
     * @return accessModes
     */
    public String getAccessModes() {
        return this.accessModes;
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
    public java.util.List<String> getApplicationIds() {
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
        private String accessModes; 
        private String address; 
        private java.util.List<String> applicationIds; 
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
            this.accessModes = request.accessModes;
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
         * <p>The access mode. Valid values:</p>
         * <ul>
         * <li><strong>app</strong>: application access. Filters applications that support application access.</li>
         * <li><strong>browser</strong>: browser access. Filters applications that support browser access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        public Builder accessModes(String accessModes) {
            this.putQueryParameter("AccessModes", accessModes);
            this.accessModes = accessModes;
            return this;
        }

        /**
         * <p>The address of the internal-facing access application. The address is 1 to 128 characters in length and supports IPv4 addresses, CIDR blocks, domain names, and wildcard domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * <p>The IDs of internal-facing access applications. You can specify up to 100 application IDs.</p>
         */
        public Builder applicationIds(java.util.List<String> applicationIds) {
            this.putQueryParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * <p>The connector ID. You can obtain the ID from the <a href="~~ListConnectors~~">ListConnectors</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-94db94e06b98****</p>
         */
        public Builder connectorId(String connectorId) {
            this.putQueryParameter("ConnectorId", connectorId);
            this.connectorId = connectorId;
            return this;
        }

        /**
         * <p>The page number of the current page displayed in a paged query. Valid values: 1 to 10000.</p>
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
         * <p>The name of the internal-facing access application. The name is 1 to 128 characters in length, supports Chinese and uppercase and lowercase letters, and can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>private_access_application_name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Valid values: 1 to 1000.</p>
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
         * <p>The ID of the internal-facing access policy. You can obtain the ID from the following operations:</p>
         * <ul>
         * <li><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: queries internal-facing access policies in batches.</li>
         * <li><a href="~~CreatePrivateAccessPolicy~~">CreatePrivateAccessPolicy</a>: creates an internal-facing access policy.</li>
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
         * <p>The status of the internal-facing access application. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: enabled.</li>
         * <li><strong>Disabled</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the internal-facing access tag. You can obtain the ID from the following operations:</p>
         * <ul>
         * <li><a href="~~ListPrivateAccessTags~~">ListPrivateAccessTags</a>: queries internal-facing access tags in batches.</li>
         * <li><a href="~~CreatePrivateAccessTag~~">CreatePrivateAccessTag</a>: creates an internal-facing access tag.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tag-d3f64e8bdd4a****</p>
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
