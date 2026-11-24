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
    @com.aliyun.core.annotation.NameInMap("HealthCheckStatus")
    private String healthCheckStatus;

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
        this.healthCheckStatus = builder.healthCheckStatus;
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
     * @return healthCheckStatus
     */
    public String getHealthCheckStatus() {
        return this.healthCheckStatus;
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
        private String healthCheckStatus; 
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
            this.healthCheckStatus = request.healthCheckStatus;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.policyId = request.policyId;
            this.status = request.status;
            this.tagId = request.tagId;
        } 

        /**
         * <p>The access mode. Valid values:</p>
         * <ul>
         * <li><strong>app</strong>: Application access. Filters applications that support application access.</li>
         * <li><strong>browser</strong>: Browser access. Filters applications that support browser access.</li>
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
         * <p>The address of the private access application. The address must be 1 to 128 characters in length, and can be an IPv4 address, a CIDR block, a domain name, or a wildcard domain name.</p>
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
         * <p>The IDs of the private access applications. You can enter up to 100 private access application IDs.</p>
         */
        public Builder applicationIds(java.util.List<String> applicationIds) {
            this.putQueryParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * <p>The ID of the connector. You can obtain the value from the following operation: <a href="~~ListConnectors~~">ListConnectors</a>: List connectors.</p>
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
         * <p>The page number of the current page in a paged query. Valid values: 1 to 10000.</p>
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
         * <p>Filters by health check status. Valid values:</p>
         * <ul>
         * <li>normal: The success rate of the last check is greater than or equal to 95%.</li>
         * <li>partialError: The success rate of the last check is greater than 0 and less than 95%.</li>
         * <li>error: The success rate of the last check is 0.</li>
         * <li>uncompleted: No check results are available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder healthCheckStatus(String healthCheckStatus) {
            this.putQueryParameter("HealthCheckStatus", healthCheckStatus);
            this.healthCheckStatus = healthCheckStatus;
            return this;
        }

        /**
         * <p>The name of the private access application. The name must be 1 to 128 characters in length, and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
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
         * <p>The ID of the private access policy. You can obtain the value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: List private access policies.</li>
         * <li><a href="~~CreatePrivateAccessPolicy~~">CreatePrivateAccessPolicy</a>: Create a private access policy.</li>
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
         * <p>The status of the private access application. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
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
         * <p>The ID of the private access tag. You can obtain the value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListPrivateAccessTags~~">ListPrivateAccessTags</a>: List private access tags.</li>
         * <li><a href="~~CreatePrivateAccessTag~~">CreatePrivateAccessTag</a>: Create a private access tag.</li>
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
