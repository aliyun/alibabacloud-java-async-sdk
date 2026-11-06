// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link EnableCloudPermissionTemplateRequest} extends {@link RequestModel}
 *
 * <p>EnableCloudPermissionTemplateRequest</p>
 */
public class EnableCloudPermissionTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String cloudAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String cloudPermissionTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private EnableCloudPermissionTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cloudAccountId = builder.cloudAccountId;
        this.cloudPermissionTemplateId = builder.cloudPermissionTemplateId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableCloudPermissionTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return cloudAccountId
     */
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    /**
     * @return cloudPermissionTemplateId
     */
    public String getCloudPermissionTemplateId() {
        return this.cloudPermissionTemplateId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<EnableCloudPermissionTemplateRequest, Builder> {
        private String regionId; 
        private String cloudAccountId; 
        private String cloudPermissionTemplateId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(EnableCloudPermissionTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cloudAccountId = request.cloudAccountId;
            this.cloudPermissionTemplateId = request.cloudPermissionTemplateId;
            this.instanceId = request.instanceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The cloud account ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ac_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder cloudAccountId(String cloudAccountId) {
            this.putQueryParameter("CloudAccountId", cloudAccountId);
            this.cloudAccountId = cloudAccountId;
            return this;
        }

        /**
         * <p>The permission template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpt_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder cloudPermissionTemplateId(String cloudPermissionTemplateId) {
            this.putQueryParameter("CloudPermissionTemplateId", cloudPermissionTemplateId);
            this.cloudPermissionTemplateId = cloudPermissionTemplateId;
            return this;
        }

        /**
         * <p>The ID of the IDaaS EIAM instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public EnableCloudPermissionTemplateRequest build() {
            return new EnableCloudPermissionTemplateRequest(this);
        } 

    } 

}
