// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDeviceGroupTagsRequest} extends {@link RequestModel}
 *
 * <p>SetDeviceGroupTagsRequest</p>
 */
public class SetDeviceGroupTagsRequest extends Request {
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

    @Query
    @NameInMap("TagString")
    private String tagString;

    private SetDeviceGroupTagsRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.groupType = builder.groupType;
        this.iotInstanceId = builder.iotInstanceId;
        this.tagString = builder.tagString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDeviceGroupTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return tagString
     */
    public String getTagString() {
        return this.tagString;
    }

    public static final class Builder extends Request.Builder<SetDeviceGroupTagsRequest, Builder> {
        private String groupId; 
        private String groupType; 
        private String iotInstanceId; 
        private String tagString; 

        private Builder() {
            super();
        } 

        private Builder(SetDeviceGroupTagsRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.groupType = request.groupType;
            this.iotInstanceId = request.iotInstanceId;
            this.tagString = request.tagString;
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

        /**
         * TagString.
         */
        public Builder tagString(String tagString) {
            this.putQueryParameter("TagString", tagString);
            this.tagString = tagString;
            return this;
        }

        @Override
        public SetDeviceGroupTagsRequest build() {
            return new SetDeviceGroupTagsRequest(this);
        } 

    } 

}
