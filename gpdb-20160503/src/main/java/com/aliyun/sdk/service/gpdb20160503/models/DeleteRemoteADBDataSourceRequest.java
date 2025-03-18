// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DeleteRemoteADBDataSourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteRemoteADBDataSourceRequest</p>
 */
public class DeleteRemoteADBDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalDBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String localDBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    private DeleteRemoteADBDataSourceRequest(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
        this.localDBInstanceId = builder.localDBInstanceId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRemoteADBDataSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return localDBInstanceId
     */
    public String getLocalDBInstanceId() {
        return this.localDBInstanceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DeleteRemoteADBDataSourceRequest, Builder> {
        private String dataSourceId; 
        private String localDBInstanceId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRemoteADBDataSourceRequest request) {
            super(request);
            this.dataSourceId = request.dataSourceId;
            this.localDBInstanceId = request.localDBInstanceId;
            this.ownerId = request.ownerId;
        } 

        /**
         * <p>The service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>The ID of the instance that uses the data provided by another instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-test</p>
         */
        public Builder localDBInstanceId(String localDBInstanceId) {
            this.putQueryParameter("LocalDBInstanceId", localDBInstanceId);
            this.localDBInstanceId = localDBInstanceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DeleteRemoteADBDataSourceRequest build() {
            return new DeleteRemoteADBDataSourceRequest(this);
        } 

    } 

}
