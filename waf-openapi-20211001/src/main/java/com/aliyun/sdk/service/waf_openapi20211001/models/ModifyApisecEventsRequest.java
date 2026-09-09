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
 * {@link ModifyApisecEventsRequest} extends {@link RequestModel}
 *
 * <p>ModifyApisecEventsRequest</p>
 */
public class ModifyApisecEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> eventIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventScope")
    private String eventScope;

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

    private ModifyApisecEventsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.eventIds = builder.eventIds;
        this.eventScope = builder.eventScope;
        this.instanceId = builder.instanceId;
        this.note = builder.note;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.userStatus = builder.userStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApisecEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return eventIds
     */
    public java.util.List<String> getEventIds() {
        return this.eventIds;
    }

    /**
     * @return eventScope
     */
    public String getEventScope() {
        return this.eventScope;
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

    public static final class Builder extends Request.Builder<ModifyApisecEventsRequest, Builder> {
        private String clusterId; 
        private java.util.List<String> eventIds; 
        private String eventScope; 
        private String instanceId; 
        private String note; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String userStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApisecEventsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.eventIds = request.eventIds;
            this.eventScope = request.eventScope;
            this.instanceId = request.instanceId;
            this.note = request.note;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.userStatus = request.userStatus;
        } 

        /**
         * <p>The hybrid cloud cluster ID.</p>
         * <blockquote>
         * <p>This parameter applies only to hybrid cloud scenarios. You can call <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> to obtain hybrid cloud cluster information.</p>
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
         * <p>The list of API security event IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder eventIds(java.util.List<String> eventIds) {
            this.putQueryParameter("EventIds", eventIds);
            this.eventIds = eventIds;
            return this;
        }

        /**
         * <p>The dimension of the security event.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder eventScope(String eventScope) {
            this.putQueryParameter("EventScope", eventScope);
            this.eventScope = eventScope;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to obtain the ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v3prepaid_***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>already confirmed.</p>
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * <p>The region where the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
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
         * <p>The Alibaba Cloud resource group ID.</p>
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
         * <p>The event status. Valid values:</p>
         * <ul>
         * <li><strong>toBeConfirmed</strong>: To be confirmed.</li>
         * <li><strong>confirmed</strong>: Confirmed.</li>
         * <li><strong>ignored</strong>: Ignored.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>confirmed</p>
         */
        public Builder userStatus(String userStatus) {
            this.putQueryParameter("UserStatus", userStatus);
            this.userStatus = userStatus;
            return this;
        }

        @Override
        public ModifyApisecEventsRequest build() {
            return new ModifyApisecEventsRequest(this);
        } 

    } 

}
