// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourceTablesRequest} extends {@link RequestModel}
 *
 * <p>ListDataSourceTablesRequest</p>
 */
public class ListDataSourceTablesRequest extends Request {
    @Path
    @NameInMap("dataSourceType")
    @Validation(required = true)
    private String dataSourceType;

    @Query
    @NameInMap("params")
    @Validation(required = true)
    private String params;

    private ListDataSourceTablesRequest(Builder builder) {
        super(builder);
        this.dataSourceType = builder.dataSourceType;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceTablesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<ListDataSourceTablesRequest, Builder> {
        private String dataSourceType; 
        private String params; 

        private Builder() {
            super();
        } 

        private Builder(ListDataSourceTablesRequest response) {
            super(response);
            this.dataSourceType = response.dataSourceType;
            this.params = response.params;
        } 

        /**
         * dataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putPathParameter("dataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * params.
         */
        public Builder params(String params) {
            this.putQueryParameter("params", params);
            this.params = params;
            return this;
        }

        @Override
        public ListDataSourceTablesRequest build() {
            return new ListDataSourceTablesRequest(this);
        } 

    } 

}
