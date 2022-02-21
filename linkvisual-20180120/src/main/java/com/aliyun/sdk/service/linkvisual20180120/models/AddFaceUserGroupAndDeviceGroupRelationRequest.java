// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFaceUserGroupAndDeviceGroupRelationRequest} extends {@link RequestModel}
 *
 * <p>AddFaceUserGroupAndDeviceGroupRelationRequest</p>
 */
public class AddFaceUserGroupAndDeviceGroupRelationRequest extends Request {
    @Query
    @NameInMap("DeviceGroupId")
    @Validation(required = true)
    private String deviceGroupId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
    private String isolationId;

    @Query
    @NameInMap("Relation")
    @Validation(required = true)
    private String relation;

    @Query
    @NameInMap("UserGroupId")
    @Validation(required = true)
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

        private Builder(AddFaceUserGroupAndDeviceGroupRelationRequest response) {
            super(response);
            this.deviceGroupId = response.deviceGroupId;
            this.iotInstanceId = response.iotInstanceId;
            this.isolationId = response.isolationId;
            this.relation = response.relation;
            this.userGroupId = response.userGroupId;
        } 

        /**
         * DeviceGroupId.
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.putQueryParameter("DeviceGroupId", deviceGroupId);
            this.deviceGroupId = deviceGroupId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * IsolationId.
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        /**
         * Relation.
         */
        public Builder relation(String relation) {
            this.putQueryParameter("Relation", relation);
            this.relation = relation;
            return this;
        }

        /**
         * UserGroupId.
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
