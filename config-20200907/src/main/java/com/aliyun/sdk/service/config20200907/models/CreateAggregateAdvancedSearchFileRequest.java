// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAggregateAdvancedSearchFileRequest} extends {@link RequestModel}
 *
 * <p>CreateAggregateAdvancedSearchFileRequest</p>
 */
public class CreateAggregateAdvancedSearchFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sql")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sql;

    private CreateAggregateAdvancedSearchFileRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.sql = builder.sql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAggregateAdvancedSearchFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    public static final class Builder extends Request.Builder<CreateAggregateAdvancedSearchFileRequest, Builder> {
        private String aggregatorId; 
        private String sql; 

        private Builder() {
            super();
        } 

        private Builder(CreateAggregateAdvancedSearchFileRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.sql = request.sql;
        } 

        /**
         * The ID of the account group.
         * <p>
         * 
         * For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The SQL statement used to query resources.
         */
        public Builder sql(String sql) {
            this.putQueryParameter("Sql", sql);
            this.sql = sql;
            return this;
        }

        @Override
        public CreateAggregateAdvancedSearchFileRequest build() {
            return new CreateAggregateAdvancedSearchFileRequest(this);
        } 

    } 

}
