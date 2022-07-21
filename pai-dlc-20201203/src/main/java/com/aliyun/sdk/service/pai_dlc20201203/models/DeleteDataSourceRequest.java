// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataSourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataSourceRequest</p>
 */
public class DeleteDataSourceRequest extends Request {
    @Path
    @NameInMap("DataSourceId")
    @Validation(required = true, maxLength = 256, minLength = 1)
    private String dataSourceId;

    private DeleteDataSourceRequest(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
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
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public static final class Builder extends Request.Builder<DeleteDataSourceRequest, Builder> {
        private String dataSourceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataSourceRequest request) {
            super(request);
            this.dataSourceId = request.dataSourceId;
        } 

        /**
         * 数据源Id
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putPathParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        @Override
        public DeleteDataSourceRequest build() {
            return new DeleteDataSourceRequest(this);
        } 

    } 

}
