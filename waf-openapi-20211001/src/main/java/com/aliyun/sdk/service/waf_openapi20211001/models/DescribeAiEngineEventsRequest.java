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
 * {@link DescribeAiEngineEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAiEngineEventsRequest</p>
 */
public class DescribeAiEngineEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeAiEngineEventsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
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
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiEngineEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeAiEngineEventsRequest, Builder> {
        private Long endTime; 
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
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAiEngineEventsRequest request) {
            super(request);
            this.endTime = request.endTime;
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
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end time. The time is a UNIX timestamp in UTC. Unit: seconds. The data is filtered based on the time when the event was last detected. The end time must be later than the start time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1793059200</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The filter conditions. Exact match is used, and multiple conditions are connected by the AND logical operator.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;riskLevel&quot;:&quot;high&quot;,&quot;resource&quot;:&quot;resource-api-example&quot;}</p>
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
         * <p>waf_dddsdf3****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language of the response.</p>
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
         * <p>The number of entries to return on each page in a paging query. Valid values: 1 to 100. Default value: 20.</p>
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
         * <p>The pagination token. The value is the <strong>NextToken</strong> parameter value returned by the previous API call. You do not need to specify this parameter for the first query.</p>
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
         * <p>The region ID of the WAF instance.</p>
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
         * <p>rg-****mo</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The search value. This parameter is used together with SearchKey. Maximum length: 256 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        public Builder seachValue(String seachValue) {
            this.putQueryParameter("SeachValue", seachValue);
            this.seachValue = seachValue;
            return this;
        }

        /**
         * <p>The search field. This parameter is used together with SeachValue.</p>
         * 
         * <strong>example:</strong>
         * <p>eventName</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * <p>The field by which to sort the results.</p>
         * 
         * <strong>example:</strong>
         * <p>last_seen</p>
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
         * <p>desc</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>The start time. The time is a UNIX timestamp in UTC. Unit: seconds. The data is filtered based on the time when the event was last detected. You can query data within the last 30 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1792972800</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeAiEngineEventsRequest build() {
            return new DescribeAiEngineEventsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAiEngineEventsRequest} extends {@link TeaModel}
     *
     * <p>DescribeAiEngineEventsRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domain")
        @com.aliyun.core.annotation.Validation(maxLength = 253, minLength = 1)
        private String domain;

        @com.aliyun.core.annotation.NameInMap("eventId")
        @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("eventNodeCount")
        private Integer eventNodeCount;

        @com.aliyun.core.annotation.NameInMap("handleStatus")
        private String handleStatus;

        @com.aliyun.core.annotation.NameInMap("resource")
        @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
        private String resource;

        @com.aliyun.core.annotation.NameInMap("riskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("sourceAccount")
        private String sourceAccount;

        @com.aliyun.core.annotation.NameInMap("sourceFingerprint")
        private String sourceFingerprint;

        @com.aliyun.core.annotation.NameInMap("sourceIp")
        private String sourceIp;

        private Filter(Builder builder) {
            this.domain = builder.domain;
            this.eventId = builder.eventId;
            this.eventNodeCount = builder.eventNodeCount;
            this.handleStatus = builder.handleStatus;
            this.resource = builder.resource;
            this.riskLevel = builder.riskLevel;
            this.sourceAccount = builder.sourceAccount;
            this.sourceFingerprint = builder.sourceFingerprint;
            this.sourceIp = builder.sourceIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventNodeCount
         */
        public Integer getEventNodeCount() {
            return this.eventNodeCount;
        }

        /**
         * @return handleStatus
         */
        public String getHandleStatus() {
            return this.handleStatus;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return sourceAccount
         */
        public String getSourceAccount() {
            return this.sourceAccount;
        }

        /**
         * @return sourceFingerprint
         */
        public String getSourceFingerprint() {
            return this.sourceFingerprint;
        }

        /**
         * @return sourceIp
         */
        public String getSourceIp() {
            return this.sourceIp;
        }

        public static final class Builder {
            private String domain; 
            private String eventId; 
            private Integer eventNodeCount; 
            private String handleStatus; 
            private String resource; 
            private String riskLevel; 
            private String sourceAccount; 
            private String sourceFingerprint; 
            private String sourceIp; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.domain = model.domain;
                this.eventId = model.eventId;
                this.eventNodeCount = model.eventNodeCount;
                this.handleStatus = model.handleStatus;
                this.resource = model.resource;
                this.riskLevel = model.riskLevel;
                this.sourceAccount = model.sourceAccount;
                this.sourceFingerprint = model.sourceFingerprint;
                this.sourceIp = model.sourceIp;
            } 

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>api.example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>EVT-20261025109</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The number of nodes included in the event.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder eventNodeCount(Integer eventNodeCount) {
                this.eventNodeCount = eventNodeCount;
                return this;
            }

            /**
             * <p>The event handling status.</p>
             * 
             * <strong>example:</strong>
             * <p>unhandled</p>
             */
            public Builder handleStatus(String handleStatus) {
                this.handleStatus = handleStatus;
                return this;
            }

            /**
             * <p>The protected object.</p>
             * 
             * <strong>example:</strong>
             * <p>resource-api-example</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The source account of the attack.</p>
             * 
             * <strong>example:</strong>
             * <p>account-demo-***</p>
             */
            public Builder sourceAccount(String sourceAccount) {
                this.sourceAccount = sourceAccount;
                return this;
            }

            /**
             * <p>The source fingerprint of the attack.</p>
             * 
             * <strong>example:</strong>
             * <p>fingerprint-demo-***</p>
             */
            public Builder sourceFingerprint(String sourceFingerprint) {
                this.sourceFingerprint = sourceFingerprint;
                return this;
            }

            /**
             * <p>The source IP address of the attack.</p>
             * 
             * <strong>example:</strong>
             * <p>203.0.113.109</p>
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
