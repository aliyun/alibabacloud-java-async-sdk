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
 * {@link ModifyAiEngineEventStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyAiEngineEventStatusRequest</p>
 */
public class ModifyAiEngineEventStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    @com.aliyun.core.annotation.Validation(maxLength = 512)
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetStatus;

    private ModifyAiEngineEventStatusRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.eventId = builder.eventId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.targetStatus = builder.targetStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAiEngineEventStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return targetStatus
     */
    public String getTargetStatus() {
        return this.targetStatus;
    }

    public static final class Builder extends Request.Builder<ModifyAiEngineEventStatusRequest, Builder> {
        private String comment; 
        private String eventId; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String targetStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAiEngineEventStatusRequest request) {
            super(request);
            this.comment = request.comment;
            this.eventId = request.eventId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.targetStatus = request.targetStatus;
        } 

        /**
         * <p>The comment. The value can be up to 512 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>testComment</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The ID of the event.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EVT-20261025109</p>
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_des*****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the WAF instance.</p>
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
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-de***</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The target status of the event.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>handling</p>
         */
        public Builder targetStatus(String targetStatus) {
            this.putQueryParameter("TargetStatus", targetStatus);
            this.targetStatus = targetStatus;
            return this;
        }

        @Override
        public ModifyAiEngineEventStatusRequest build() {
            return new ModifyAiEngineEventStatusRequest(this);
        } 

    } 

}
