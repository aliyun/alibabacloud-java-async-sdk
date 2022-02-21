// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDeviceGroupRequest</p>
 */
public class CreateDeviceGroupRequest extends Request {
    @Query
    @NameInMap("GroupDesc")
    private String groupDesc;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("SuperGroupId")
    private String superGroupId;

    private CreateDeviceGroupRequest(Builder builder) {
        super(builder);
        this.groupDesc = builder.groupDesc;
        this.groupName = builder.groupName;
        this.iotInstanceId = builder.iotInstanceId;
        this.superGroupId = builder.superGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceGroupRequest create() {
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
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return superGroupId
     */
    public String getSuperGroupId() {
        return this.superGroupId;
    }

    public static final class Builder extends Request.Builder<CreateDeviceGroupRequest, Builder> {
        private String groupDesc; 
        private String groupName; 
        private String iotInstanceId; 
        private String superGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeviceGroupRequest response) {
            super(response);
            this.groupDesc = response.groupDesc;
            this.groupName = response.groupName;
            this.iotInstanceId = response.iotInstanceId;
            this.superGroupId = response.superGroupId;
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
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
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
         * SuperGroupId.
         */
        public Builder superGroupId(String superGroupId) {
            this.putQueryParameter("SuperGroupId", superGroupId);
            this.superGroupId = superGroupId;
            return this;
        }

        @Override
        public CreateDeviceGroupRequest build() {
            return new CreateDeviceGroupRequest(this);
        } 

    } 

}
