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
 * {@link CreateDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDeviceGroupRequest</p>
 */
public class CreateDeviceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupDesc")
    private String groupDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SuperGroupId")
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

        private Builder(CreateDeviceGroupRequest request) {
            super(request);
            this.groupDesc = request.groupDesc;
            this.groupName = request.groupName;
            this.iotInstanceId = request.iotInstanceId;
            this.superGroupId = request.superGroupId;
        } 

        /**
         * <p>The description of the group. The description must be 1 to 100 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Group test</p>
         */
        public Builder groupDesc(String groupDesc) {
            this.putQueryParameter("GroupDesc", groupDesc);
            this.groupDesc = groupDesc;
            return this;
        }

        /**
         * <p>The name of the group. The alias must be 4 to 30 characters in length, and can contain letters, digits, and underscores (_).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>grouptest</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
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

        /**
         * <p>The ID of the parent group.</p>
         * <p>If you need to create a first-level group, do not specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>SuperGroupId1</p>
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
