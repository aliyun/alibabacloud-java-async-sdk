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
 * {@link AddFaceDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>AddFaceDeviceGroupRequest</p>
 */
public class AddFaceDeviceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsolationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isolationId;

    private AddFaceDeviceGroupRequest(Builder builder) {
        super(builder);
        this.deviceGroupName = builder.deviceGroupName;
        this.isolationId = builder.isolationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFaceDeviceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceGroupName
     */
    public String getDeviceGroupName() {
        return this.deviceGroupName;
    }

    /**
     * @return isolationId
     */
    public String getIsolationId() {
        return this.isolationId;
    }

    public static final class Builder extends Request.Builder<AddFaceDeviceGroupRequest, Builder> {
        private String deviceGroupName; 
        private String isolationId; 

        private Builder() {
            super();
        } 

        private Builder(AddFaceDeviceGroupRequest request) {
            super(request);
            this.deviceGroupName = request.deviceGroupName;
            this.isolationId = request.isolationId;
        } 

        /**
         * <p>The name of the device group. You can customize the value. The name can be up to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDeviceGroup</p>
         */
        public Builder deviceGroupName(String deviceGroupName) {
            this.putQueryParameter("DeviceGroupName", deviceGroupName);
            this.deviceGroupName = deviceGroupName;
            return this;
        }

        /**
         * <p>The business isolation ID. It is used to isolate data between different business applications under the same Alibaba Cloud account. It supports uppercase and lowercase English letters and digits.</p>
         * <p>For example, if you have face recognition businesses in Region A and Region B, you can set different business isolation IDs to distinguish the face recognition businesses in Region A and Region B.</p>
         * <blockquote>
         * <p>Notice: 
         * Save the business isolation ID properly for use when you call other API operations in this business isolation zone.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZheJiangHZ</p>
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        @Override
        public AddFaceDeviceGroupRequest build() {
            return new AddFaceDeviceGroupRequest(this);
        } 

    } 

}
