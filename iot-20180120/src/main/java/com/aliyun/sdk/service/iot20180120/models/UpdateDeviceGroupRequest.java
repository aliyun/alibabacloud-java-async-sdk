// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link UpdateDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeviceGroupRequest</p>
 */
public class UpdateDeviceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupDesc")
    private String groupDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
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
         * <p>The description of the group. The description must be 1 to 100 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>test2</p>
         */
        public Builder groupDesc(String groupDesc) {
            this.putQueryParameter("GroupDesc", groupDesc);
            this.groupDesc = groupDesc;
            return this;
        }

        /**
         * <p>The ID of the group. The ID is the globally unique identifier (GUID) for the group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>W16X8Tvdosec****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The type of the group.</p>
         * <p>If you set the value to <strong>LINK_PLATFORM_DYNAMIC</strong>, a dynamic group is queried. If you do not specify this parameter, a static group is queried by default.</p>
         * 
         * <strong>example:</strong>
         * <p>LINK_PLATFORM_DYNAMIC</p>
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
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
