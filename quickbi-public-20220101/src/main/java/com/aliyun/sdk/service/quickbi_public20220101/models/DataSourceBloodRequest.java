// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataSourceBloodRequest} extends {@link RequestModel}
 *
 * <p>DataSourceBloodRequest</p>
 */
public class DataSourceBloodRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    private DataSourceBloodRequest(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataSourceBloodRequest create() {
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

    public static final class Builder extends Request.Builder<DataSourceBloodRequest, Builder> {
        private String dataSourceId; 

        private Builder() {
            super();
        } 

        private Builder(DataSourceBloodRequest request) {
            super(request);
            this.dataSourceId = request.dataSourceId;
        } 

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        @Override
        public DataSourceBloodRequest build() {
            return new DataSourceBloodRequest(this);
        } 

    } 

}
