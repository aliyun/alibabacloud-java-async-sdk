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
 * {@link CreateErAttachmentRequest} extends {@link RequestModel}
 *
 * <p>CreateErAttachmentRequest</p>
 */
public class CreateErAttachmentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoReceiveAllRoute")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean autoReceiveAllRoute;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErAttachmentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String erAttachmentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String erId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceTenantId")
    private String resourceTenantId;

    private CreateErAttachmentRequest(Builder builder) {
        super(builder);
        this.autoReceiveAllRoute = builder.autoReceiveAllRoute;
        this.erAttachmentName = builder.erAttachmentName;
        this.erId = builder.erId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.regionId = builder.regionId;
        this.resourceTenantId = builder.resourceTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateErAttachmentRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceTenantId
     */
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

    public static final class Builder extends Request.Builder<CreateErAttachmentRequest, Builder> {
        private Boolean autoReceiveAllRoute; 
        private String erAttachmentName; 
        private String erId; 
        private String instanceId; 
        private String instanceType; 
        private String regionId; 
        private String resourceTenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateErAttachmentRequest request) {
            super(request);
            this.autoReceiveAllRoute = request.autoReceiveAllRoute;
            this.erAttachmentName = request.erAttachmentName;
            this.erId = request.erId;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.regionId = request.regionId;
            this.resourceTenantId = request.resourceTenantId;
        } 

        /**
         * <p>Indicates whether to automatically receive all routes from all instances under the Lingjun HUB. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: received automatically.</li>
         * <li><strong>false</strong>: Not received.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The name of the network instance connection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>er-attachemnt-vpd-xksd2obl</p>
         */
        public Builder erAttachmentName(String erAttachmentName) {
            this.putBodyParameter("ErAttachmentName", erAttachmentName);
            this.erAttachmentName = erAttachmentName;
            return this;
        }

        /**
         * <p>Lingjun HUB ID.</p>
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
         * <p>You can query <strong>Lingjun CIDR Block</strong> and <strong>Lingjun Connection</strong> by <a href="https://help.aliyun.com/document_detail/2331077.html">ListVpds</a> and <a href="https://help.aliyun.com/document_detail/2399526.html?">ListVccs</a> respectively.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-xksd2obl</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The category of the instance. Valid values:</p>
         * <ul>
         * <li><strong>VPD</strong>: indicates the Lingjun CIDR block.</li>
         * <li><strong>VCC</strong>: indicates a Lingjun connection.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VPD</p>
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
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
         * <p>The ID of the tenant to which the resource belongs. This parameter is required for cross-account resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166277</p>
         */
        public Builder resourceTenantId(String resourceTenantId) {
            this.putBodyParameter("ResourceTenantId", resourceTenantId);
            this.resourceTenantId = resourceTenantId;
            return this;
        }

        @Override
        public CreateErAttachmentRequest build() {
            return new CreateErAttachmentRequest(this);
        } 

    } 

}
