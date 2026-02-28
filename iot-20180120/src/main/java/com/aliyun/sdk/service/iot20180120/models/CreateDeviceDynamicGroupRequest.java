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
 * {@link CreateDeviceDynamicGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDeviceDynamicGroupRequest</p>
 */
public class CreateDeviceDynamicGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicGroupExpression")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dynamicGroupExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupDesc")
    private String groupDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotInstanceId;

    private CreateDeviceDynamicGroupRequest(Builder builder) {
        super(builder);
        this.dynamicGroupExpression = builder.dynamicGroupExpression;
        this.groupDesc = builder.groupDesc;
        this.groupName = builder.groupName;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceDynamicGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicGroupExpression
     */
    public String getDynamicGroupExpression() {
        return this.dynamicGroupExpression;
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

    public static final class Builder extends Request.Builder<CreateDeviceDynamicGroupRequest, Builder> {
        private String dynamicGroupExpression; 
        private String groupDesc; 
        private String groupName; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeviceDynamicGroupRequest request) {
            super(request);
            this.dynamicGroupExpression = request.dynamicGroupExpression;
            this.groupDesc = request.groupDesc;
            this.groupName = request.groupName;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>product_key = &quot;a1***&quot; and name LIKE &quot;test%&quot;</p>
         */
        public Builder dynamicGroupExpression(String dynamicGroupExpression) {
            this.putQueryParameter("DynamicGroupExpression", dynamicGroupExpression);
            this.dynamicGroupExpression = dynamicGroupExpression;
            return this;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-***</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public CreateDeviceDynamicGroupRequest build() {
            return new CreateDeviceDynamicGroupRequest(this);
        } 

    } 

}
