// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataSourcesRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataSourcesRequest</p>
 */
public class DeleteDataSourcesRequest extends Request {
    @Body
    @NameInMap("DataSourceIdList")
    @Validation(required = true)
    private String dataSourceIdList;

    private DeleteDataSourcesRequest(Builder builder) {
        super(builder);
        this.dataSourceIdList = builder.dataSourceIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataSourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceIdList
     */
    public String getDataSourceIdList() {
        return this.dataSourceIdList;
    }

    public static final class Builder extends Request.Builder<DeleteDataSourcesRequest, Builder> {
        private String dataSourceIdList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataSourcesRequest response) {
            super(response);
            this.dataSourceIdList = response.dataSourceIdList;
        } 

        /**
         * DataSourceIdList.
         */
        public Builder dataSourceIdList(String dataSourceIdList) {
            this.putBodyParameter("DataSourceIdList", dataSourceIdList);
            this.dataSourceIdList = dataSourceIdList;
            return this;
        }

        @Override
        public DeleteDataSourcesRequest build() {
            return new DeleteDataSourcesRequest(this);
        } 

    } 

}
