// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConfigRequest} extends {@link RequestModel}
 *
 * <p>GetConfigRequest</p>
 */
public class GetConfigRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ObjectId")
    private String objectId;

    @Query
    @NameInMap("ObjectType")
    @Validation(required = true)
    private String objectType;

    private GetConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<GetConfigRequest, Builder> {
        private String instanceId; 
        private String name; 
        private String objectId; 
        private String objectType; 

        private Builder() {
            super();
        } 

        private Builder(GetConfigRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.name = response.name;
            this.objectId = response.objectId;
            this.objectType = response.objectType;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
        public GetConfigRequest build() {
            return new GetConfigRequest(this);
        } 

    } 

}
