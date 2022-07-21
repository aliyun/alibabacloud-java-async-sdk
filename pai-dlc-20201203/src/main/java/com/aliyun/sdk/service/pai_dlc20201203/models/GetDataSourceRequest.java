// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSourceRequest} extends {@link RequestModel}
 *
 * <p>GetDataSourceRequest</p>
 */
public class GetDataSourceRequest extends Request {
    @Path
    @NameInMap("DataSourceId")
    @Validation(required = true, maxLength = 256, minLength = 1)
    private String dataSourceId;

    private GetDataSourceRequest(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceRequest create() {
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

    public static final class Builder extends Request.Builder<GetDataSourceRequest, Builder> {
        private String dataSourceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataSourceRequest request) {
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
        public GetDataSourceRequest build() {
            return new GetDataSourceRequest(this);
        } 

    } 

}
