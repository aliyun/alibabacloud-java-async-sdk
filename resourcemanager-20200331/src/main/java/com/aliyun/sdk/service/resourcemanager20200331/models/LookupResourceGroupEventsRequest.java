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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
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
         * LookupAttributes.
         */
        public Builder lookupAttributes(java.util.List<LookupAttributes> lookupAttributes) {
            this.putQueryParameter("LookupAttributes", lookupAttributes);
            this.lookupAttributes = lookupAttributes;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ResourceGroupDisplayName.
         */
        public Builder resourceGroupDisplayName(String resourceGroupDisplayName) {
            this.putQueryParameter("ResourceGroupDisplayName", resourceGroupDisplayName);
            this.resourceGroupDisplayName = resourceGroupDisplayName;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * StartTime.
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
