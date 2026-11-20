// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeAiEngineEvidenceRequestsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAiEngineEvidenceRequestsRequest</p>
 */
public class DescribeAiEngineEvidenceRequestsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private Filter filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SeachValue")
    @com.aliyun.core.annotation.Validation(maxLength = 256, minLength = 1)
    private String seachValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    private DescribeAiEngineEvidenceRequestsRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.filter = builder.filter;
        this.instanceId = builder.instanceId;
        this.language = builder.language;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.seachValue = builder.seachValue;
        this.searchKey = builder.searchKey;
        this.sortBy = builder.sortBy;
        this.sortOrder = builder.sortOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiEngineEvidenceRequestsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return filter
     */
    public Filter getFilter() {
        return this.filter;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return seachValue
     */
    public String getSeachValue() {
        return this.seachValue;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static final class Builder extends Request.Builder<DescribeAiEngineEvidenceRequestsRequest, Builder> {
        private String eventId; 
        private Filter filter; 
        private String instanceId; 
        private String language; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String seachValue; 
        private String searchKey; 
        private String sortBy; 
        private String sortOrder; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAiEngineEvidenceRequestsRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.filter = request.filter;
            this.instanceId = request.instanceId;
            this.language = request.language;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.seachValue = request.seachValue;
            this.searchKey = request.searchKey;
            this.sortBy = request.sortBy;
            this.sortOrder = request.sortOrder;
        } 

        /**
         * <p>The event ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EVT-20241025-109</p>
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The filter conditions. Exact match is used, and multiple conditions are connected by the AND logical operator.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;suspectedBypass&quot;:&quot;1&quot;,&quot;httpStatus&quot;:&quot;500&quot;}</p>
         */
        public Builder filter(Filter filter) {
            String filterShrink = shrink(filter, "Filter", "json");
            this.putQueryParameter("Filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-de****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The response language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The number of entries to return per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page. The value is the <strong>NextToken</strong> parameter value returned by the previous API call. You do not need to specify this parameter for the first query.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region where the WAF instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-dsdo*****</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The search value. This parameter is used together with SearchKey. The value can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>trace-20241***ssdas</p>
         */
        public Builder seachValue(String seachValue) {
            this.putQueryParameter("SeachValue", seachValue);
            this.seachValue = seachValue;
            return this;
        }

        /**
         * <p>The search key. This parameter is used together with SeachValue.</p>
         * 
         * <strong>example:</strong>
         * <p>traceId</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * <p>The sort field.</p>
         * 
         * <strong>example:</strong>
         * <p>request_time</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The sort order.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        @Override
        public DescribeAiEngineEvidenceRequestsRequest build() {
            return new DescribeAiEngineEvidenceRequestsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAiEngineEvidenceRequestsRequest} extends {@link TeaModel}
     *
     * <p>DescribeAiEngineEvidenceRequestsRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("httpStatus")
        private String httpStatus;

        @com.aliyun.core.annotation.NameInMap("impactType")
        private String impactType;

        @com.aliyun.core.annotation.NameInMap("method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("nodeId")
        @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("suspectedBypass")
        private String suspectedBypass;

        private Filter(Builder builder) {
            this.httpStatus = builder.httpStatus;
            this.impactType = builder.impactType;
            this.method = builder.method;
            this.nodeId = builder.nodeId;
            this.sourceType = builder.sourceType;
            this.suspectedBypass = builder.suspectedBypass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return httpStatus
         */
        public String getHttpStatus() {
            return this.httpStatus;
        }

        /**
         * @return impactType
         */
        public String getImpactType() {
            return this.impactType;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return suspectedBypass
         */
        public String getSuspectedBypass() {
            return this.suspectedBypass;
        }

        public static final class Builder {
            private String httpStatus; 
            private String impactType; 
            private String method; 
            private String nodeId; 
            private String sourceType; 
            private String suspectedBypass; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.httpStatus = model.httpStatus;
                this.impactType = model.impactType;
                this.method = model.method;
                this.nodeId = model.nodeId;
                this.sourceType = model.sourceType;
                this.suspectedBypass = model.suspectedBypass;
            } 

            /**
             * <p>The HTTP status code.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder httpStatus(String httpStatus) {
                this.httpStatus = httpStatus;
                return this;
            }

            /**
             * <p>The evidence impact tag.</p>
             * 
             * <strong>example:</strong>
             * <p>bypass</p>
             */
            public Builder impactType(String impactType) {
                this.impactType = impactType;
                return this;
            }

            /**
             * <p>The HTTP request method. Exact match is used.</p>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The node ID. Exact match is used. The value can be up to 64 ASCII characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>n109-04</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The attack source type.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>Specifies whether the request is a suspected bypass.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder suspectedBypass(String suspectedBypass) {
                this.suspectedBypass = suspectedBypass;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
