// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceDynamicGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDeviceDynamicGroupRequest</p>
 */
public class CreateDeviceDynamicGroupRequest extends Request {
    @Query
    @NameInMap("DynamicGroupExpression")
    @Validation(required = true)
    private String dynamicGroupExpression;

    @Query
    @NameInMap("GroupDesc")
    private String groupDesc;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("IotInstanceId")
    @Validation(required = true)
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
         * DynamicGroupExpression.
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

        @Override
        public CreateDeviceDynamicGroupRequest build() {
            return new CreateDeviceDynamicGroupRequest(this);
        } 

    } 

}
