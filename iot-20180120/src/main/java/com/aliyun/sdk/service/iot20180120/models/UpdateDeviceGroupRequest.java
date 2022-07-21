// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeviceGroupRequest</p>
 */
public class UpdateDeviceGroupRequest extends Request {
    @Query
    @NameInMap("GroupDesc")
    private String groupDesc;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("GroupType")
    private String groupType;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private UpdateDeviceGroupRequest(Builder builder) {
        super(builder);
        this.groupDesc = builder.groupDesc;
        this.groupId = builder.groupId;
        this.groupType = builder.groupType;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeviceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupDesc
     */
    public String getGroupDesc() {
        return this.groupDesc;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<UpdateDeviceGroupRequest, Builder> {
        private String groupDesc; 
        private String groupId; 
        private String groupType; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeviceGroupRequest request) {
            super(request);
            this.groupDesc = request.groupDesc;
            this.groupId = request.groupId;
            this.groupType = request.groupType;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * GroupDesc.
         */
        public Builder groupDesc(String groupDesc) {
            this.putQueryParameter("GroupDesc", groupDesc);
            this.groupDesc = groupDesc;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupType.
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
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

        @Override
        public UpdateDeviceGroupRequest build() {
            return new UpdateDeviceGroupRequest(this);
        } 

    } 

}
