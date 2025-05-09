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
 * {@link QueryDatasetDetailInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDatasetDetailInfoResponseBody</p>
 */
public class QueryDatasetDetailInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDatasetDetailInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDatasetDetailInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private String result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryDatasetDetailInfoResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DC4E1E63-B337-44F8-8C22-6F00DF67E2C3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returns the dataset data in JSON format: <code>{ &quot;cube&quot;: { &quot;dimensions&quot;: [ { &quot;caption&quot;: &quot;customer name&quot;, &quot;dataType&quot;: &quot;string&quot;, &quot;dimensionType&quot;: &quot;standard_dimension&quot;, &quot;factColumn&quot;: &quot;customer_name&quot;, &quot;uid&quot;: &quot;N5820f5_customer_name&quot; }, { &quot;caption&quot;: &quot;datastring&quot;, &quot;&quot; standard_dimension&quot;, &quot;factColumn&quot;: &quot;order_id&quot;, &quot;uid&quot;: &quot;N5820f5_order_id&quot; }, ], &quot;measures&quot;: [ { &quot;caption&quot;: &quot;order amount &quot;, &quot;dataType&quot;: &quot;number&quot;, &quot;factColumn&quot;: &quot;order_amt&quot;, &quot;measureType&quot;: &quot;standard_measure &quot;: &quot; Nderamid &quot; }, &quot; { &quot;customsql&quot;: false, &quot;dsId&quot;: &quot;261b252d-c3c3-498a-a0a7-5d1ec6cd****&quot;, &quot;tableName&quot;: &quot;company_sales_record_copy&quot; } }, &quot;datasetId&quot;: &quot;5820f58c-c734-4d8a-baf1-7979af4f****&quot;, &quot;datasetName&quot;: &quot;company_sales_record_copy12&quot;, &quot;datasource&quot;: { &quot;dsId&quot;: &quot;261b252d-c3c3-498a-a0a7-5d1ec6cd****&quot;, &quot;dsName&quot;: &quot;Self-use&quot;, &quot;dsType&quot;: &quot;mysql&quot; }, &quot;directory&quot; { &quot;id&quot;: &quot;schemaad8aad00-9c55-4984-a767-b4e0ec60****&quot;, &quot;name&quot;: &quot;My dataset&quot;, &quot;pathId&quot;: &quot;schemaad8aad00-9c55-4984-a767-b4e0ec60****&quot;, &quot;pathName&quot;: &quot;My dataset&quot; }, &quot;ownerId&quot;: &quot;13651626232****&quot;, &quot;ownerName&quot;: &quot;Zhang San&quot;, &quot;rowLevel&quot;: false, &quot;workspaceId&quot;: &quot;95296e95-ca89-4c7d-8af9-dedf0ad0****&quot;, &quot;workspaceName&quot;: &quot;Test Workspace&quot; }</code></p>
         * 
         * <strong>example:</strong>
         * <p>A JSON dataset is returned. For more information, see the description on the left.</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The execution result of the interface is returned. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDatasetDetailInfoResponseBody build() {
            return new QueryDatasetDetailInfoResponseBody(this);
        } 

    } 

}
