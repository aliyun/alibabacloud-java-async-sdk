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
 * {@link QueryDataRequest} extends {@link RequestModel}
 *
 * <p>QueryDataRequest</p>
 */
public class QueryDataRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private QueryDataRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.conditions = builder.conditions;
        this.returnFields = builder.returnFields;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDataRequest create() {
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

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<QueryDataRequest, Builder> {
        private String apiId; 
        private String conditions; 
        private String returnFields; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDataRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.conditions = request.conditions;
            this.returnFields = request.returnFields;
            this.userId = request.userId;
        } 

        /**
         * <p>The API ID in the data service. For more information, see: <a href="https://help.aliyun.com/document_detail/144980.html">Data Service</a>.</p>
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
         * <p>The query conditions for the data service, passed in as Key and Value pairs. A map-type string. Here, Key is the name of the request parameter, and Value is the value of the request parameter. Key and Value must appear in pairs.</p>
         * <p><strong>Note:</strong></p>
         * <ul>
         * <li><p>When the operator of the request parameter is set to <strong>enumeration filtering</strong>, the value can contain multiple values, and the format of the value should be a JSON-formatted List. For example: <code>area=[&quot;East China&quot;,&quot;North China&quot;,&quot;South China&quot;]</code></p>
         * </li>
         * <li><p>For dates, different formats are provided based on the type:</p>
         * <ul>
         * <li><p>Year: 2019</p>
         * </li>
         * <li><p>Quarter: 2019Q1</p>
         * </li>
         * <li><p>Month: 201901 (with leading zero)</p>
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
         * <p>{ &quot;area&quot;: [&quot;华东&quot;, &quot;华北&quot;],  &quot;shopping_date&quot;: &quot;2019Q1&quot;,  }</p>
         */
        public Builder conditions(String conditions) {
            this.putQueryParameter("Conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>A list of return parameter names, in a List-type string.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;area&quot;, &quot;city&quot;, &quot;price&quot;, &quot;date&quot;]</p>
         */
        public Builder returnFields(String returnFields) {
            this.putQueryParameter("ReturnFields", returnFields);
            this.returnFields = returnFields;
            return this;
        }

        /**
         * <p>The userId in Quick BI. For how to obtain the userId, see: <a href="https://next.api.aliyun.com/document/quickbi-public/2022-01-01/QueryUserInfoByAccount">Query User Information by Account Interface</a></p>
         * <blockquote>
         * <p>This parameter is used to specify the identity of the person using the data service, which can be used in conjunction with the row and column permission configurations of the dataset.</p>
         * </blockquote>
         * <blockquote>
         * <p>Notice: If the parameter is not passed, an empty string is passed, or null is passed, the default userId will be the owner of the current Quick BI organization.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>b5d8fd9348cc4327****afb604</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QueryDataRequest build() {
            return new QueryDataRequest(this);
        } 

    } 

}
