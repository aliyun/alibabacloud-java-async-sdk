// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDataServiceRequest} extends {@link RequestModel}
 *
 * <p>QueryDataServiceRequest</p>
 */
public class QueryDataServiceRequest extends Request {
    @Query
    @NameInMap("ApiId")
    @Validation(required = true)
    private String apiId;

    @Query
    @NameInMap("Conditions")
    private String conditions;

    @Query
    @NameInMap("ReturnFields")
    private String returnFields;

    private QueryDataServiceRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.conditions = builder.conditions;
        this.returnFields = builder.returnFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDataServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return conditions
     */
    public String getConditions() {
        return this.conditions;
    }

    /**
     * @return returnFields
     */
    public String getReturnFields() {
        return this.returnFields;
    }

    public static final class Builder extends Request.Builder<QueryDataServiceRequest, Builder> {
        private String apiId; 
        private String conditions; 
        private String returnFields; 

        private Builder() {
            super();
        } 

        private Builder(QueryDataServiceRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.conditions = request.conditions;
            this.returnFields = request.returnFields;
        } 

        /**
         * ApiId.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * Conditions.
         */
        public Builder conditions(String conditions) {
            this.putQueryParameter("Conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * ReturnFields.
         */
        public Builder returnFields(String returnFields) {
            this.putQueryParameter("ReturnFields", returnFields);
            this.returnFields = returnFields;
            return this;
        }

        @Override
        public QueryDataServiceRequest build() {
            return new QueryDataServiceRequest(this);
        } 

    } 

}
