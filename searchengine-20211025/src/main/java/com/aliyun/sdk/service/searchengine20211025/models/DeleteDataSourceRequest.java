// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataSourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataSourceRequest</p>
 */
public class DeleteDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("dataSourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceName;

    private DeleteDataSourceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dataSourceName = builder.dataSourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataSourceRequest create() {
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
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public static final class Builder extends Request.Builder<DeleteDataSourceRequest, Builder> {
        private String instanceId; 
        private String dataSourceName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataSourceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dataSourceName = request.dataSourceName;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the data source.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putPathParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        @Override
        public DeleteDataSourceRequest build() {
            return new DeleteDataSourceRequest(this);
        } 

    } 

}
