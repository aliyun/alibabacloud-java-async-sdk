// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link CreateDatabaseRequest} extends {@link RequestModel}
 *
 * <p>CreateDatabaseRequest</p>
 */
public class CreateDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("databaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("permissionModel")
    private String permissionModel;

    private CreateDatabaseRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.databaseName = builder.databaseName;
        this.permissionModel = builder.permissionModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatabaseRequest create() {
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
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return permissionModel
     */
    public String getPermissionModel() {
        return this.permissionModel;
    }

    public static final class Builder extends Request.Builder<CreateDatabaseRequest, Builder> {
        private String instanceId; 
        private String databaseName; 
        private String permissionModel; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatabaseRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.databaseName = request.databaseName;
            this.permissionModel = request.permissionModel;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * databaseName.
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("databaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * permissionModel.
         */
        public Builder permissionModel(String permissionModel) {
            this.putBodyParameter("permissionModel", permissionModel);
            this.permissionModel = permissionModel;
            return this;
        }

        @Override
        public CreateDatabaseRequest build() {
            return new CreateDatabaseRequest(this);
        } 

    } 

}
