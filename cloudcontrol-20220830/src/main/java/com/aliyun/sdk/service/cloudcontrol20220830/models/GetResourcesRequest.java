// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

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
 * {@link GetResourcesRequest} extends {@link RequestModel}
 *
 * <p>GetResourcesRequest</p>
 */
public class GetResourcesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("requestPath")
    private String requestPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filter")
    private java.util.Map<String, ?> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private GetResourcesRequest(Builder builder) {
        super(builder);
        this.requestPath = builder.requestPath;
        this.filter = builder.filter;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestPath
     */
    public String getRequestPath() {
        return this.requestPath;
    }

    /**
     * @return filter
     */
    public java.util.Map<String, ?> getFilter() {
        return this.filter;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetResourcesRequest, Builder> {
        private String requestPath; 
        private java.util.Map<String, ?> filter; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetResourcesRequest request) {
            super(request);
            this.requestPath = request.requestPath;
            this.filter = request.filter;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The URL of the request.</p>
         * <p>The request URL determines whether the List or Get operation is called.</p>
         * <ul>
         * <li><p>List: <code>/api/v1/providers/{provider}/products/{product}/resources/{resourceType}</code></p>
         * </li>
         * <li><p>Get: <code>/api/v1/providers/{provider}/products/{product}/resources/{resourceType}/{resourceId}</code></p>
         * </li>
         * </ul>
         * <p>The request URL contains the following variables:</p>
         * <ul>
         * <li><p>provider: The cloud service provider. Currently, only <code>Aliyun</code> is supported.</p>
         * </li>
         * <li><p>product: The product code.</p>
         * </li>
         * <li><p>resourceType: The <a href="https://help.aliyun.com/document_detail/2246871.html">resource type</a>. If a parent resource exists, the format is <code>{parent resource type code}/{parent resource ID}/{resource type code}</code>.</p>
         * </li>
         * <li><p>resourceId: The resource ID.</p>
         * </li>
         * </ul>
         */
        public Builder requestPath(String requestPath) {
            this.putPathParameter("requestPath", requestPath);
            this.requestPath = requestPath;
            return this;
        }

        /**
         * <p>The filter conditions for resources.</p>
         * <p>Specify multiple key-value pairs in JSON format to filter resources. If a List or Get operation for a cloud product supports filtering by specific properties, you can use those properties as filter conditions for this parameter.</p>
         * <blockquote>
         * <p>The supported filter fields may vary for different resource types. For more information about the supported fields, see the OpenAPI documentation for the specific resource.</p>
         * </blockquote>
         * <p>For example, DBInstance resources support filtering by the <code>EditionType</code> and <code>PaymentType</code> fields.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;EditionType&quot;: &quot;Community&quot;,
         *   &quot;PaymentType&quot;: &quot;PostPaid&quot;
         * }</p>
         */
        public Builder filter(java.util.Map<String, ?> filter) {
            String filterShrink = shrink(filter, "filter", "json");
            this.putQueryParameter("filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The maximum number of records to return on each page for a paged query. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * <ul>
         * <li><p>You do not need to specify this parameter for the first query. The system returns data from the first page.</p>
         * </li>
         * <li><p>For subsequent queries, set this parameter to the nextToken value returned from the previous call.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If this parameter contains only digits, Cloud Control API treats it as the <code>PageNumber</code> for paging.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID. This parameter is required if the cloud product is region-specific.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetResourcesRequest build() {
            return new GetResourcesRequest(this);
        } 

    } 

}
