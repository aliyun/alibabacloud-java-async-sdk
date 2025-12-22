// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link ListDataSourceTablesRequest} extends {@link RequestModel}
 *
 * <p>ListDataSourceTablesRequest</p>
 */
public class ListDataSourceTablesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("dataSourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("params")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(ListDataSourceTablesRequest request) {
            super(request);
            this.dataSourceType = request.dataSourceType;
            this.params = request.params;
        } 

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li>rds</li>
         * <li>polardb</li>
         * <li>odps</li>
         * <li>mysql</li>
         * <li>drds</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putPathParameter("dataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>The parameters of the data source. The value is a JSON string which must be encoded in the urlencode format.</p>
         * <p>Different types of data sources use different parameters. For more information, see the following sections of the &quot;DataSource&quot; topic:</p>
         * <ul>
         * <li><a href="https://help.aliyun.com/document_detail/170005.html">rds</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/170005.html">polardb</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/170005.html">odps</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/173627.html">mysql</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/173627.html">drds</a></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
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
