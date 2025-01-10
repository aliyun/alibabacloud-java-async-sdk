// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link ListErAttachmentsRequest} extends {@link RequestModel}
 *
 * <p>ListErAttachmentsRequest</p>
 */
public class ListErAttachmentsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoReceiveAllRoute")
    private Boolean autoReceiveAllRoute;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnablePage")
    private Boolean enablePage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErAttachmentId")
    private String erAttachmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErAttachmentName")
    private String erAttachmentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String erId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceTenantId")
    private String resourceTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListErAttachmentsRequest(Builder builder) {
        super(builder);
        this.autoReceiveAllRoute = builder.autoReceiveAllRoute;
        this.enablePage = builder.enablePage;
        this.erAttachmentId = builder.erAttachmentId;
        this.erAttachmentName = builder.erAttachmentName;
        this.erId = builder.erId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceTenantId = builder.resourceTenantId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListErAttachmentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoReceiveAllRoute
     */
    public Boolean getAutoReceiveAllRoute() {
        return this.autoReceiveAllRoute;
    }

    /**
     * @return enablePage
     */
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    /**
     * @return erAttachmentId
     */
    public String getErAttachmentId() {
        return this.erAttachmentId;
    }

    /**
     * @return erAttachmentName
     */
    public String getErAttachmentName() {
        return this.erAttachmentName;
    }

    /**
     * @return erId
     */
    public String getErId() {
        return this.erId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceTenantId
     */
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListErAttachmentsRequest, Builder> {
        private Boolean autoReceiveAllRoute; 
        private Boolean enablePage; 
        private String erAttachmentId; 
        private String erAttachmentName; 
        private String erId; 
        private String instanceId; 
        private String instanceType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceTenantId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListErAttachmentsRequest request) {
            super(request);
            this.autoReceiveAllRoute = request.autoReceiveAllRoute;
            this.enablePage = request.enablePage;
            this.erAttachmentId = request.erAttachmentId;
            this.erAttachmentName = request.erAttachmentName;
            this.erId = request.erId;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceTenantId = request.resourceTenantId;
            this.status = request.status;
        } 

        /**
         * <p>Whether to automatically receive all routes from all instances under this Lingjun HUB. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: received automatically.</li>
         * <li><strong>false</strong>: Not received.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoReceiveAllRoute(Boolean autoReceiveAllRoute) {
            this.putBodyParameter("AutoReceiveAllRoute", autoReceiveAllRoute);
            this.autoReceiveAllRoute = autoReceiveAllRoute;
            return this;
        }

        /**
         * <p>Specifies whether to enable paged query. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables paged query.</li>
         * <li><strong>false</strong>: Paged query is not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enablePage(Boolean enablePage) {
            this.putBodyParameter("EnablePage", enablePage);
            this.enablePage = enablePage;
            return this;
        }

        /**
         * <p>The ID of the network instance connection</p>
         * 
         * <strong>example:</strong>
         * <p>er-attachment-i1ioibyf</p>
         */
        public Builder erAttachmentId(String erAttachmentId) {
            this.putBodyParameter("ErAttachmentId", erAttachmentId);
            this.erAttachmentId = erAttachmentId;
            return this;
        }

        /**
         * <p>The name of the network instance connection.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-209300qha01</p>
         */
        public Builder erAttachmentName(String erAttachmentName) {
            this.putBodyParameter("ErAttachmentName", erAttachmentName);
            this.erAttachmentName = erAttachmentName;
            return this;
        }

        /**
         * <p>The ID of the Lingjun HUB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        public Builder erId(String erId) {
            this.putBodyParameter("ErId", erId);
            this.erId = erId;
            return this;
        }

        /**
         * <p>The ID of the network instance. Valid values: <strong>VPD</strong> and <strong>VCC</strong>.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/444430.html">What is Lingjun?</a></p>
         * <p>You can query <strong>Lingjun CIDR blocks</strong> and <strong>Lingjun connections</strong> by <a href="https://help.aliyun.com/document_detail/2331077.html">ListVpds</a> and <a href="https://help.aliyun.com/document_detail/2399526.html?">ListVccs</a> respectively.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-209300qha01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The mitigation plan of the instance. Valid values:</p>
         * <ul>
         * <li><strong>VPD</strong>: indicates the Lingjun CIDR block.</li>
         * <li><strong>VCC</strong>: indicates a Lingjun connection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VCC</p>
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The page number to return. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Resource group instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzb3n5lgk2ieq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the tenant to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1111156667137893</p>
         */
        public Builder resourceTenantId(String resourceTenantId) {
            this.putBodyParameter("ResourceTenantId", resourceTenantId);
            this.resourceTenantId = resourceTenantId;
            return this;
        }

        /**
         * <p>The status of the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>Available</strong>: Normal.</li>
         * <li><strong>Not Available</strong>: Not available.</li>
         * <li><strong>Executing</strong>: The task is being executed.</li>
         * <li><strong>Deleting</strong>: The account is being deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListErAttachmentsRequest build() {
            return new ListErAttachmentsRequest(this);
        } 

    } 

}
