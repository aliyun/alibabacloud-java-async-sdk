// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link ListEgressProxyConfigurationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEgressProxyConfigurationsResponseBody</p>
 */
public class ListEgressProxyConfigurationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurations")
    private java.util.List<EgressProxyConfigurations> egressProxyConfigurations;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListEgressProxyConfigurationsResponseBody(Builder builder) {
        this.egressProxyConfigurations = builder.egressProxyConfigurations;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEgressProxyConfigurationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressProxyConfigurations
     */
    public java.util.List<EgressProxyConfigurations> getEgressProxyConfigurations() {
        return this.egressProxyConfigurations;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<EgressProxyConfigurations> egressProxyConfigurations; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListEgressProxyConfigurationsResponseBody model) {
            this.egressProxyConfigurations = model.egressProxyConfigurations;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of egress proxy configurations.</p>
         */
        public Builder egressProxyConfigurations(java.util.List<EgressProxyConfigurations> egressProxyConfigurations) {
            this.egressProxyConfigurations = egressProxyConfigurations;
            return this;
        }

        /**
         * <p>The maximum number of entries returned for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query. Valid values:</p>
         * <ul>
         * <li>If NextToken is empty, no next query is required.</li>
         * <li>If NextToken is returned, the value indicates the token for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>01A05ABD-A4C0-5F6B-A554-AEEEC73F9F70</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of egress proxy configurations that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEgressProxyConfigurationsResponseBody build() {
            return new ListEgressProxyConfigurationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEgressProxyConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEgressProxyConfigurationsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. The key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The value can be up to 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEgressProxyConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEgressProxyConfigurationsResponseBody</p>
     */
    public static class EgressProxyConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurationId")
        private String egressProxyConfigurationId;

        @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurationName")
        private String egressProxyConfigurationName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private EgressProxyConfigurations(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.egressProxyConfigurationId = builder.egressProxyConfigurationId;
            this.egressProxyConfigurationName = builder.egressProxyConfigurationName;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressProxyConfigurations create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return egressProxyConfigurationId
         */
        public String getEgressProxyConfigurationId() {
            return this.egressProxyConfigurationId;
        }

        /**
         * @return egressProxyConfigurationName
         */
        public String getEgressProxyConfigurationName() {
            return this.egressProxyConfigurationName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String egressProxyConfigurationId; 
            private String egressProxyConfigurationName; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(EgressProxyConfigurations model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.egressProxyConfigurationId = model.egressProxyConfigurationId;
                this.egressProxyConfigurationName = model.egressProxyConfigurationName;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The time when the egress proxy configuration was created. The time is displayed in UTC in the yyyy-MM-ddTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-02T02:49:05Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the egress proxy configuration. The description must be 2 to 256 characters in length, and can contain Chinese characters, letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
             * 
             * <strong>example:</strong>
             * <p>testEpg</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the egress proxy configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>epc-gw80d16a969933e7****</p>
             */
            public Builder egressProxyConfigurationId(String egressProxyConfigurationId) {
                this.egressProxyConfigurationId = egressProxyConfigurationId;
                return this;
            }

            /**
             * <p>The name of the egress proxy configuration. The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>testEpg</p>
             */
            public Builder egressProxyConfigurationName(String egressProxyConfigurationName) {
                this.egressProxyConfigurationName = egressProxyConfigurationName;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek6jw4dpt****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The status of the egress proxy configuration. Valid values:</p>
             * <ul>
             * <li><p><strong>Provisioning</strong>: The egress proxy configuration is being created.</p>
             * </li>
             * <li><p><strong>Available</strong>: The egress proxy configuration is available.</p>
             * </li>
             * <li><p><strong>Configuring</strong>: The specifications of the egress proxy configuration are being changed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public EgressProxyConfigurations build() {
                return new EgressProxyConfigurations(this);
            } 

        } 

    }
}
