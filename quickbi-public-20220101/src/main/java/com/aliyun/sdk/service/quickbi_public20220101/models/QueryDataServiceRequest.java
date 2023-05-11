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
         * Call an API that is created in DataService Studio.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * # Prerequisites
         * <p>
         * 
         * You can use the Quick BI data service to create an API for the data service. For more information, see [Data service](~~144980~~).
         * 
         * # Limits
         * 
         * *   The Data Service feature is available only to Professional customers.
         * *   The timeout period for API calls is 60s. The QPS of a single API is 10 times per second.
         * *   If row-level permissions are enabled for datasets that are referenced by a Data Service API, the API may be blocked by row-level permission policies.
         */
        public Builder conditions(String conditions) {
            this.putQueryParameter("Conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * The query conditions of the data service. The query conditions are specified in the form of keys and values. A string of the map type. Key is the name of the request parameters parameter, and Value is the value of the request parameters parameter. Key and Value must appear in pairs.
         * <p>
         * 
         * **Note:**
         * 
         * *   If a value contains multiple values, the value is a List in the JSON format. Example: `area=["East China","North China","South China"]`
         * 
         * *   For dates, different input parameter formats are provided based on different types:
         * 
         *     *   Year: 2019
         *     *   Season: 2019Q1
         *     *   Month: 201901 (carry 0)
         *     *   Week: 2019-52
         *     *   Day: 20190101
         *     *   Hours: 14:00:00 (minutes and seconds are 00)
         *     *   Minutes: 14:12:00 (seconds are 00)
         *     *   Seconds: 14:34:34
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
