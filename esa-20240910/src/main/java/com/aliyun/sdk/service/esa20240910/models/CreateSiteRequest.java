// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateSiteRequest} extends {@link RequestModel}
 *
 * <p>CreateSiteRequest</p>
 */
public class CreateSiteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Coverage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coverage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwner")
    private Long resourceOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String siteName;

    private CreateSiteRequest(Builder builder) {
        super(builder);
        this.accessType = builder.accessType;
        this.coverage = builder.coverage;
        this.instanceId = builder.instanceId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwner = builder.resourceOwner;
        this.siteName = builder.siteName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSiteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessType
     */
    public String getAccessType() {
        return this.accessType;
    }

    /**
     * @return coverage
     */
    public String getCoverage() {
        return this.coverage;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwner
     */
    public Long getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * @return siteName
     */
    public String getSiteName() {
        return this.siteName;
    }

    public static final class Builder extends Request.Builder<CreateSiteRequest, Builder> {
        private String accessType; 
        private String coverage; 
        private String instanceId; 
        private String resourceGroupId; 
        private Long resourceOwner; 
        private String siteName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSiteRequest request) {
            super(request);
            this.accessType = request.accessType;
            this.coverage = request.coverage;
            this.instanceId = request.instanceId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwner = request.resourceOwner;
            this.siteName = request.siteName;
        } 

        /**
         * <p>The access type of the site. Valid values:</p>
         * <ul>
         * <li><strong>NS</strong>: hosted NS access</li>
         * <li><strong>CNAME</strong>: CNAME access</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NS</p>
         */
        public Builder accessType(String accessType) {
            this.putQueryParameter("AccessType", accessType);
            this.accessType = accessType;
            return this;
        }

        /**
         * <p>The acceleration region. Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong>: the Chinese mainland</li>
         * <li><strong>global</strong>: global</li>
         * <li><strong>overseas</strong>: global (excluding the Chinese mainland)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        public Builder coverage(String coverage) {
            this.putQueryParameter("Coverage", coverage);
            this.coverage = coverage;
            return this;
        }

        /**
         * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/2852398.html">ListUserRatePlanInstances</a> operation to obtain the instance ID. You must specify at least one of the instance ID and the site ID. If both are specified, the instance ID takes precedence.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbaudit-cn-nwy349jdb03</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The resource group ID. If you do not specify this parameter, the system automatically uses the ID of the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmw4znnok****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The UID of the owner of the site plan associated with the site. By default, you do not need to specify this parameter. You only need to specify this parameter when you use a site plan shared across accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>122********801267</p>
         */
        public Builder resourceOwner(Long resourceOwner) {
            this.putQueryParameter("ResourceOwner", resourceOwner);
            this.resourceOwner = resourceOwner;
            return this;
        }

        /**
         * <p>The name of the site.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder siteName(String siteName) {
            this.putQueryParameter("SiteName", siteName);
            this.siteName = siteName;
            return this;
        }

        @Override
        public CreateSiteRequest build() {
            return new CreateSiteRequest(this);
        } 

    } 

}
