// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryDataServiceRequest} extends {@link RequestModel}
 *
 * <p>QueryDataServiceRequest</p>
 */
public class QueryDataServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Conditions")
    private String conditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnFields")
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
         * <p>Call an API that is created in DataService Studio.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f4cc43bc3***</p>
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <h1>Prerequisites</h1>
         * <p>You can use the Quick BI data service to create an API for the data service. For more information, see <a href="https://help.aliyun.com/document_detail/144980.html">Data service</a>.</p>
         * <h1>Limits</h1>
         * <ul>
         * <li>The Data Service feature is available only to Professional customers.</li>
         * <li>The timeout period for API calls is 60s. The QPS of a single API is 10 times per second.</li>
         * <li>If row-level permissions are enabled for datasets that are referenced by a Data Service API, the API may be blocked by row-level permission policies.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>For more information about API IDs in DataService, see <a href="https://help.aliyun.com/document_detail/144980.html">Data Service</a>.</p>
         */
        public Builder conditions(String conditions) {
            this.putQueryParameter("Conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>The query conditions of the data service. The query conditions are specified in the form of keys and values. A string of the map type. Key is the name of the request parameters parameter, and Value is the value of the request parameters parameter. Key and Value must appear in pairs.</p>
         * <p><strong>Note:</strong></p>
         * <ul>
         * <li><p>If a value contains multiple values, the value is a List in the JSON format. Example: <code>area=[&quot;East China&quot;,&quot;North China&quot;,&quot;South China&quot;]</code></p>
         * </li>
         * <li><p>For dates, different input parameter formats are provided based on different types:</p>
         * <ul>
         * <li>Year: 2019</li>
         * <li>Season: 2019Q1</li>
         * <li>Month: 201901 (carry 0)</li>
         * <li>Week: 2019-52</li>
         * <li>Day: 20190101</li>
         * <li>Hours: 14:00:00 (minutes and seconds are 00)</li>
         * <li>Minutes: 14:12:00 (seconds are 00)</li>
         * <li>Seconds: 14:34:34</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;area&quot;, &quot;city&quot;, &quot;price&quot;, &quot;date&quot;]</p>
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
