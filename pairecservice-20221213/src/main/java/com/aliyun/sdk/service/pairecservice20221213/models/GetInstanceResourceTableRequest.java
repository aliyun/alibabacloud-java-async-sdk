// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceResourceTableRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceResourceTableRequest</p>
 */
public class GetInstanceResourceTableRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    private String instanceId;

    @Path
    @NameInMap("ResourceId")
    private String resourceId;

    @Path
    @NameInMap("TableName")
    private String tableName;

    private GetInstanceResourceTableRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resourceId = builder.resourceId;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResourceTableRequest create() {
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<GetInstanceResourceTableRequest, Builder> {
        private String instanceId; 
        private String resourceId; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceResourceTableRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.resourceId = request.resourceId;
            this.tableName = request.tableName;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putPathParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public GetInstanceResourceTableRequest build() {
            return new GetInstanceResourceTableRequest(this);
        } 

    } 

}
