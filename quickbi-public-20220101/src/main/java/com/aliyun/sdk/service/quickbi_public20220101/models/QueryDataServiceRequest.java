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
         * <p>The ID of the API in Data Service. For more information, see <a href="https://help.aliyun.com/document_detail/144980.html">Data Service</a>.</p>
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
         * <p>The query conditions for Data Service, which are passed as key-value pairs. The value is a string of the map type. The key is the name of the request parameter, and the value is the value of the request parameter. Keys and values must appear in pairs.</p>
         * <p><strong>Note:</strong></p>
         * <ul>
         * <li><p>When the operator of a request parameter is set to <strong>Enum Filter</strong>, the value can contain multiple values. In this case, the value must be a JSON-formatted list. Example: <code>area=[&quot;East China&quot;,&quot;North China&quot;,&quot;South China&quot;]</code>     </p>
         * </li>
         * <li><p>For dates, different input formats are provided based on the type:</p>
         * <ul>
         * <li><p>Year: 2019</p>
         * </li>
         * <li><p>Quarter: 2019Q1</p>
         * </li>
         * <li><p>Month: 201901 (including the leading zero)</p>
         * </li>
         * <li><p>Week: 2019-52</p>
         * </li>
         * <li><p>Day: 20190101</p>
         * </li>
         * <li><p>Hour: 14:00:00 (minutes and seconds are 00)</p>
         * </li>
         * <li><p>Minute: 14:12:00 (seconds are 00)</p>
         * </li>
         * <li><p>Second: 14:34:34</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;area&quot;: [&quot;East China&quot;, &quot;North China&quot;],  &quot;shopping_date&quot;: &quot;2019Q1&quot;,  }</p>
         */
        public Builder conditions(String conditions) {
            this.putQueryParameter("Conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>The list of names of the response parameters. The value is a string of the list type.</p>
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
