// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigItemsRequest} extends {@link RequestModel}
 *
 * <p>ListConfigItemsRequest</p>
 */
public class ListConfigItemsRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ObjectId")
    @Validation(required = true)
    private String objectId;

    @Query
    @NameInMap("ObjectType")
    @Validation(required = true)
    private String objectType;

    private ListConfigItemsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ListConfigItemsRequest, Builder> {
        private String instanceId; 
        private String objectId; 
        private String objectType; 

        private Builder() {
            super();
        } 

        private Builder(ListConfigItemsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.objectId = request.objectId;
            this.objectType = request.objectType;
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
        public ListConfigItemsRequest build() {
            return new ListConfigItemsRequest(this);
        } 

    } 

}
