// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link GetSemanticViewRequest} extends {@link RequestModel}
 *
 * <p>GetSemanticViewRequest</p>
 */
public class GetSemanticViewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemaName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schemaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ViewName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String viewName;

    private GetSemanticViewRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.schemaName = builder.schemaName;
        this.viewName = builder.viewName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSemanticViewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return viewName
     */
    public String getViewName() {
        return this.viewName;
    }

    public static final class Builder extends Request.Builder<GetSemanticViewRequest, Builder> {
        private String DBClusterId; 
        private String schemaName; 
        private String viewName; 

        private Builder() {
            super();
        } 

        private Builder(GetSemanticViewRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.schemaName = request.schemaName;
            this.viewName = request.viewName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1d8lbdj22rx****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sv_name</p>
         */
        public Builder viewName(String viewName) {
            this.putQueryParameter("ViewName", viewName);
            this.viewName = viewName;
            return this;
        }

        @Override
        public GetSemanticViewRequest build() {
            return new GetSemanticViewRequest(this);
        } 

    } 

}
