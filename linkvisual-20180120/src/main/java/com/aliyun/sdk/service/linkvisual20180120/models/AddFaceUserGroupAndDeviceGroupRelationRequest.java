// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link AddFaceUserGroupAndDeviceGroupRelationRequest} extends {@link RequestModel}
 *
 * <p>AddFaceUserGroupAndDeviceGroupRelationRequest</p>
 */
public class AddFaceUserGroupAndDeviceGroupRelationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsolationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isolationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Relation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String relation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupId;

    private AddFaceUserGroupAndDeviceGroupRelationRequest(Builder builder) {
        super(builder);
        this.deviceGroupId = builder.deviceGroupId;
        this.iotInstanceId = builder.iotInstanceId;
        this.isolationId = builder.isolationId;
        this.relation = builder.relation;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFaceUserGroupAndDeviceGroupRelationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceGroupId
     */
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return isolationId
     */
    public String getIsolationId() {
        return this.isolationId;
    }

    /**
     * @return relation
     */
    public String getRelation() {
        return this.relation;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<AddFaceUserGroupAndDeviceGroupRelationRequest, Builder> {
        private String deviceGroupId; 
        private String iotInstanceId; 
        private String isolationId; 
        private String relation; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AddFaceUserGroupAndDeviceGroupRelationRequest request) {
            super(request);
            this.deviceGroupId = request.deviceGroupId;
            this.iotInstanceId = request.iotInstanceId;
            this.isolationId = request.isolationId;
            this.relation = request.relation;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * <p>The device group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kvjyhurc</p>
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.putQueryParameter("DeviceGroupId", deviceGroupId);
            this.deviceGroupId = deviceGroupId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>TestInstanceId</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The isolation ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestIsolationId</p>
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        /**
         * <p>The face synchronization relationship.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SYNC_INFO_PICTURE</p>
         */
        public Builder relation(String relation) {
            this.putQueryParameter("Relation", relation);
            this.relation = relation;
            return this;
        }

        /**
         * <p>The user group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>avjyxurd</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public AddFaceUserGroupAndDeviceGroupRelationRequest build() {
            return new AddFaceUserGroupAndDeviceGroupRelationRequest(this);
        } 

    } 

}
