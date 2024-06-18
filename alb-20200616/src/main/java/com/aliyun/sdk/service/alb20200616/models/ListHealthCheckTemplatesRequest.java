// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHealthCheckTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListHealthCheckTemplatesRequest</p>
 */
public class ListHealthCheckTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckTemplateIds")
    private java.util.List < String > healthCheckTemplateIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckTemplateNames")
    private java.util.List < String > healthCheckTemplateNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private ListHealthCheckTemplatesRequest(Builder builder) {
        super(builder);
        this.healthCheckTemplateIds = builder.healthCheckTemplateIds;
        this.healthCheckTemplateNames = builder.healthCheckTemplateNames;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHealthCheckTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return healthCheckTemplateIds
     */
    public java.util.List < String > getHealthCheckTemplateIds() {
        return this.healthCheckTemplateIds;
    }

    /**
     * @return healthCheckTemplateNames
     */
    public java.util.List < String > getHealthCheckTemplateNames() {
        return this.healthCheckTemplateNames;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListHealthCheckTemplatesRequest, Builder> {
        private java.util.List < String > healthCheckTemplateIds; 
        private java.util.List < String > healthCheckTemplateNames; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListHealthCheckTemplatesRequest request) {
            super(request);
            this.healthCheckTemplateIds = request.healthCheckTemplateIds;
            this.healthCheckTemplateNames = request.healthCheckTemplateNames;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.tag = request.tag;
        } 

        /**
         * The IDs of health check templates.
         */
        public Builder healthCheckTemplateIds(java.util.List < String > healthCheckTemplateIds) {
            this.putQueryParameter("HealthCheckTemplateIds", healthCheckTemplateIds);
            this.healthCheckTemplateIds = healthCheckTemplateIds;
            return this;
        }

        /**
         * The health check templates.
         */
        public Builder healthCheckTemplateNames(java.util.List < String > healthCheckTemplateNames) {
            this.putQueryParameter("HealthCheckTemplateNames", healthCheckTemplateNames);
            this.healthCheckTemplateNames = healthCheckTemplateNames;
            return this;
        }

        /**
         * The number of entries per page. Valid values: **1** to **100**. Default value: **20**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   You do not need to specify this parameter for the first request.
         * *   You must specify the token that is obtained from the previous query as the value of **NextToken**.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListHealthCheckTemplatesRequest build() {
            return new ListHealthCheckTemplatesRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            /**
             * The tag key. The tag key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value. The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
