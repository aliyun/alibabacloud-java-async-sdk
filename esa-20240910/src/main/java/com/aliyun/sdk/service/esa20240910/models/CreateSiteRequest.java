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
    @com.aliyun.core.annotation.NameInMap("SiteName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String siteName;

    private CreateSiteRequest(Builder builder) {
        super(builder);
        this.accessType = builder.accessType;
        this.coverage = builder.coverage;
        this.instanceId = builder.instanceId;
        this.resourceGroupId = builder.resourceGroupId;
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
            this.siteName = request.siteName;
        } 

        /**
         * <p>The DNS setup. Valid values:</p>
         * <ul>
         * <li><strong>NS</strong></li>
         * <li><strong>CNAME</strong></li>
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
         * <p>The service location. Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong>: the Chinese mainland</li>
         * <li><strong>global</strong>: global</li>
         * <li><strong>overseas</strong>: outside the Chinese mainland</li>
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
         * <p>The instance ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2852398.html">ListUserRatePlanInstances</a> operation. Specify at least one of the instance ID and website ID. If you specify both of them, the instance ID is used.</p>
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
         * <p>The ID of the resource group. If you leave this parameter empty, the system uses the default resource group ID.</p>
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
         * <p>The website name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateSite</p>
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
