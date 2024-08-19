// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsOnline.
         */
        public Builder isOnline(Boolean isOnline) {
            this.putBodyParameter("IsOnline", isOnline);
            this.isOnline = isOnline;
            return this;
        }

        /**
         * IsRemote.
         */
        public Builder isRemote(Boolean isRemote) {
            this.putBodyParameter("IsRemote", isRemote);
            this.isRemote = isRemote;
            return this;
        }

        /**
         * Method.
         */
        public Builder method(String method) {
            this.putBodyParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * RestoreMode.
         */
        public Builder restoreMode(String restoreMode) {
            this.putBodyParameter("RestoreMode", restoreMode);
            this.restoreMode = restoreMode;
            return this;
        }

        /**
         * RestoreObjectType.
         */
        public Builder restoreObjectType(String restoreObjectType) {
            this.putBodyParameter("RestoreObjectType", restoreObjectType);
            this.restoreObjectType = restoreObjectType;
            return this;
        }

        /**
         * SetId.
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
