// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConfigItemsRequest} extends {@link RequestModel}
 *
 * <p>UpdateConfigItemsRequest</p>
 */
public class UpdateConfigItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigItems")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectType;

    private UpdateConfigItemsRequest(Builder builder) {
        super(builder);
        this.configItems = builder.configItems;
        this.instanceId = builder.instanceId;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConfigItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configItems
     */
    public String getConfigItems() {
        return this.configItems;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    public static final class Builder extends Request.Builder<UpdateConfigItemsRequest, Builder> {
        private String configItems; 
        private String instanceId; 
        private String objectId; 
        private String objectType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConfigItemsRequest request) {
            super(request);
            this.configItems = request.configItems;
            this.instanceId = request.instanceId;
            this.objectId = request.objectId;
            this.objectType = request.objectType;
        } 

        /**
         * ConfigItems.
         */
        public Builder configItems(String configItems) {
            this.putQueryParameter("ConfigItems", configItems);
            this.configItems = configItems;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ObjectId.
         */
        public Builder objectId(String objectId) {
            this.putQueryParameter("ObjectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        @Override
        public UpdateConfigItemsRequest build() {
            return new UpdateConfigItemsRequest(this);
        } 

    } 

}
