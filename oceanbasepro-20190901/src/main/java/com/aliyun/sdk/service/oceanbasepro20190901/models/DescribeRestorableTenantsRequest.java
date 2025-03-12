// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeRestorableTenantsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRestorableTenantsRequest</p>
 */
public class DescribeRestorableTenantsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsOnline")
    private Boolean isOnline;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsRemote")
    private Boolean isRemote;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Method")
    private String method;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RestoreMode")
    private String restoreMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RestoreObjectType")
    private String restoreObjectType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SetId")
    private String setId;

    private DescribeRestorableTenantsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.isOnline = builder.isOnline;
        this.isRemote = builder.isRemote;
        this.method = builder.method;
        this.restoreMode = builder.restoreMode;
        this.restoreObjectType = builder.restoreObjectType;
        this.setId = builder.setId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestorableTenantsRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isOnline
     */
    public Boolean getIsOnline() {
        return this.isOnline;
    }

    /**
     * @return isRemote
     */
    public Boolean getIsRemote() {
        return this.isRemote;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return restoreMode
     */
    public String getRestoreMode() {
        return this.restoreMode;
    }

    /**
     * @return restoreObjectType
     */
    public String getRestoreObjectType() {
        return this.restoreObjectType;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    public static final class Builder extends Request.Builder<DescribeRestorableTenantsRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private Boolean isOnline; 
        private Boolean isRemote; 
        private String method; 
        private String restoreMode; 
        private String restoreObjectType; 
        private String setId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRestorableTenantsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.isOnline = request.isOnline;
            this.isRemote = request.isRemote;
            this.method = request.method;
            this.restoreMode = request.restoreMode;
            this.restoreObjectType = request.restoreObjectType;
            this.setId = request.setId;
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
         * <p>The ID of the OceanBase cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether the target cluster is online. <strong>Note</strong> This parameter is used for compatibility with earlier versions and can be left empty. When left empty, it specifies negation for the value of <code>isRemote</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isOnline(Boolean isOnline) {
            this.putBodyParameter("IsOnline", isOnline);
            this.isOnline = isOnline;
            return this;
        }

        /**
         * <p>This parameter is provided for compatibility with earlier versions and can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isRemote(Boolean isRemote) {
            this.putBodyParameter("IsRemote", isRemote);
            this.isRemote = isRemote;
            return this;
        }

        /**
         * <p>The backup method.</p>
         * 
         * <strong>example:</strong>
         * <p>native_logical</p>
         */
        public Builder method(String method) {
            this.putBodyParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * <p>The restore method. This parameter is required when <code>IsRemote</code> is set to <code>true</code>, and is optional otherwise.</p>
         * 
         * <strong>example:</strong>
         * <p>from_time_point</p>
         */
        public Builder restoreMode(String restoreMode) {
            this.putBodyParameter("RestoreMode", restoreMode);
            this.restoreMode = restoreMode;
            return this;
        }

        /**
         * <p>The type of the restore object.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant</p>
         */
        public Builder restoreObjectType(String restoreObjectType) {
            this.putBodyParameter("RestoreObjectType", restoreObjectType);
            this.restoreObjectType = restoreObjectType;
            return this;
        }

        /**
         * <p>The ID of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>bak-xxxxx</p>
         */
        public Builder setId(String setId) {
            this.putBodyParameter("SetId", setId);
            this.setId = setId;
            return this;
        }

        @Override
        public DescribeRestorableTenantsRequest build() {
            return new DescribeRestorableTenantsRequest(this);
        } 

    } 

}
