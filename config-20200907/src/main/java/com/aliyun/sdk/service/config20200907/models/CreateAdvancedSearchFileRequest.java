// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link CreateAdvancedSearchFileRequest} extends {@link RequestModel}
 *
 * <p>CreateAdvancedSearchFileRequest</p>
 */
public class CreateAdvancedSearchFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sql")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sql;

    private CreateAdvancedSearchFileRequest(Builder builder) {
        super(builder);
        this.sql = builder.sql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAdvancedSearchFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    public static final class Builder extends Request.Builder<CreateAdvancedSearchFileRequest, Builder> {
        private String sql; 

        private Builder() {
            super();
        } 

        private Builder(CreateAdvancedSearchFileRequest request) {
            super(request);
            this.sql = request.sql;
        } 

        /**
         * <p>The SQL statement used to query resources.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * WHERE ResourceType = &quot;ACS::ECS::Instance&quot;</p>
         */
        public Builder sql(String sql) {
            this.putQueryParameter("Sql", sql);
            this.sql = sql;
            return this;
        }

        @Override
        public CreateAdvancedSearchFileRequest build() {
            return new CreateAdvancedSearchFileRequest(this);
        } 

    } 

}
