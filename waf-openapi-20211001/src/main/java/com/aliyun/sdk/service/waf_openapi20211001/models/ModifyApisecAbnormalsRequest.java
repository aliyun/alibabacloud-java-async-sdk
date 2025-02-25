// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link ModifyApisecAbnormalsRequest} extends {@link RequestModel}
 *
 * <p>ModifyApisecAbnormalsRequest</p>
 */
public class ModifyApisecAbnormalsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AbnormalIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> abnormalIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Note")
    private String note;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userStatus;

    private ModifyApisecAbnormalsRequest(Builder builder) {
        super(builder);
        this.abnormalIds = builder.abnormalIds;
        this.clusterId = builder.clusterId;
        this.instanceId = builder.instanceId;
        this.note = builder.note;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.userStatus = builder.userStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApisecAbnormalsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return abnormalIds
     */
    public java.util.List<String> getAbnormalIds() {
        return this.abnormalIds;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return userStatus
     */
    public String getUserStatus() {
        return this.userStatus;
    }

    public static final class Builder extends Request.Builder<ModifyApisecAbnormalsRequest, Builder> {
        private java.util.List<String> abnormalIds; 
        private String clusterId; 
        private String instanceId; 
        private String note; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String userStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApisecAbnormalsRequest request) {
            super(request);
            this.abnormalIds = request.abnormalIds;
            this.clusterId = request.clusterId;
            this.instanceId = request.instanceId;
            this.note = request.note;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.userStatus = request.userStatus;
        } 

        /**
         * <p>The risk IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder abnormalIds(java.util.List<String> abnormalIds) {
            this.putQueryParameter("AbnormalIds", abnormalIds);
            this.abnormalIds = abnormalIds;
            return this;
        }

        /**
         * <p>The ID of the hybrid cloud cluster.</p>
         * <blockquote>
         * <p>For hybrid cloud scenarios only, you can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query the hybrid cloud clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>428</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the Web Application Firewall (WAF) instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v3prepaid_public_cn-****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>already fixed.</p>
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * <p>The region in which the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: the Chinese mainland.</li>
         * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>阿里云资源组ID。</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The risk status. Valid values:</p>
         * <ul>
         * <li><strong>toBeConfirmed</strong></li>
         * <li><strong>confirmed</strong></li>
         * <li><strong>toBeFixed</strong></li>
         * <li><strong>fixed</strong></li>
         * <li><strong>ignored</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        public Builder userStatus(String userStatus) {
            this.putQueryParameter("UserStatus", userStatus);
            this.userStatus = userStatus;
            return this;
        }

        @Override
        public ModifyApisecAbnormalsRequest build() {
            return new ModifyApisecAbnormalsRequest(this);
        } 

    } 

}
