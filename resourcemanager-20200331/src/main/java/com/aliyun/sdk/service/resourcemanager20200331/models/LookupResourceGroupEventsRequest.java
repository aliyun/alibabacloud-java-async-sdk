// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link LookupResourceGroupEventsRequest} extends {@link RequestModel}
 *
 * <p>LookupResourceGroupEventsRequest</p>
 */
public class LookupResourceGroupEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventCategory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LookupAttributes")
    private java.util.List<LookupAttributes> lookupAttributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupDisplayName")
    private String resourceGroupDisplayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private LookupResourceGroupEventsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.eventCategory = builder.eventCategory;
        this.lookupAttributes = builder.lookupAttributes;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceGroupDisplayName = builder.resourceGroupDisplayName;
        this.resourceGroupId = builder.resourceGroupId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LookupResourceGroupEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventCategory
     */
    public String getEventCategory() {
        return this.eventCategory;
    }

    /**
     * @return lookupAttributes
     */
    public java.util.List<LookupAttributes> getLookupAttributes() {
        return this.lookupAttributes;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return resourceGroupDisplayName
     */
    public String getResourceGroupDisplayName() {
        return this.resourceGroupDisplayName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<LookupResourceGroupEventsRequest, Builder> {
        private String endTime; 
        private String eventCategory; 
        private java.util.List<LookupAttributes> lookupAttributes; 
        private String maxResults; 
        private String nextToken; 
        private String resourceGroupDisplayName; 
        private String resourceGroupId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(LookupResourceGroupEventsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.eventCategory = request.eventCategory;
            this.lookupAttributes = request.lookupAttributes;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceGroupDisplayName = request.resourceGroupDisplayName;
            this.resourceGroupId = request.resourceGroupId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end of the time range to query. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-30 23:43:16</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The event type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MemberShipChange</p>
         */
        public Builder eventCategory(String eventCategory) {
            this.putQueryParameter("EventCategory", eventCategory);
            this.eventCategory = eventCategory;
            return this;
        }

        /**
         * <p>The attributes used for advanced search.</p>
         */
        public Builder lookupAttributes(java.util.List<LookupAttributes> lookupAttributes) {
            this.putQueryParameter("LookupAttributes", lookupAttributes);
            this.lookupAttributes = lookupAttributes;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The resource group name.</p>
         * 
         * <strong>example:</strong>
         * <p>ProjectA</p>
         */
        public Builder resourceGroupDisplayName(String resourceGroupDisplayName) {
            this.putQueryParameter("ResourceGroupDisplayName", resourceGroupDisplayName);
            this.resourceGroupDisplayName = resourceGroupDisplayName;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-9gLOoK****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-30 23:43:16</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public LookupResourceGroupEventsRequest build() {
            return new LookupResourceGroupEventsRequest(this);
        } 

    } 

    /**
     * 
     * {@link LookupResourceGroupEventsRequest} extends {@link TeaModel}
     *
     * <p>LookupResourceGroupEventsRequest</p>
     */
    public static class LookupAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private LookupAttributes(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LookupAttributes create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(LookupAttributes model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the attribute.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the attribute.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LookupAttributes build() {
                return new LookupAttributes(this);
            } 

        } 

    }
}
