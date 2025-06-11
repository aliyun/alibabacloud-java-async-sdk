// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
 * {@link ListAccessConfigurationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccessConfigurationsResponseBody</p>
 */
public class ListAccessConfigurationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessConfigurations")
    private java.util.List<AccessConfigurations> accessConfigurations;

    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCounts")
    private Integer totalCounts;

    private ListAccessConfigurationsResponseBody(Builder builder) {
        this.accessConfigurations = builder.accessConfigurations;
        this.isTruncated = builder.isTruncated;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCounts = builder.totalCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessConfigurationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessConfigurations
     */
    public java.util.List<AccessConfigurations> getAccessConfigurations() {
        return this.accessConfigurations;
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
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
     * @return totalCounts
     */
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static final class Builder {
        private java.util.List<AccessConfigurations> accessConfigurations; 
        private Boolean isTruncated; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCounts; 

        private Builder() {
        } 

        private Builder(ListAccessConfigurationsResponseBody model) {
            this.accessConfigurations = model.accessConfigurations;
            this.isTruncated = model.isTruncated;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCounts = model.totalCounts;
        } 

        /**
         * <p>The access configurations.</p>
         */
        public Builder accessConfigurations(java.util.List<AccessConfigurations> accessConfigurations) {
            this.accessConfigurations = accessConfigurations;
            return this;
        }

        /**
         * <p>Indicates whether the queried entries are truncated. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * <blockquote>
         * <p> This parameter is returned only when the value of the <code>IsTruncated</code> parameter is <code>true</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2BC0CBAC-45E1-5BD3-BF6E-F69D1D5391C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public ListAccessConfigurationsResponseBody build() {
            return new ListAccessConfigurationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccessConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccessConfigurationsResponseBody</p>
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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAccessConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccessConfigurationsResponseBody</p>
     */
    public static class AccessConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessConfigurationId")
        private String accessConfigurationId;

        @com.aliyun.core.annotation.NameInMap("AccessConfigurationName")
        private String accessConfigurationName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RelayState")
        private String relayState;

        @com.aliyun.core.annotation.NameInMap("SessionDuration")
        private Integer sessionDuration;

        @com.aliyun.core.annotation.NameInMap("StatusNotifications")
        private java.util.List<String> statusNotifications;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private AccessConfigurations(Builder builder) {
            this.accessConfigurationId = builder.accessConfigurationId;
            this.accessConfigurationName = builder.accessConfigurationName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.relayState = builder.relayState;
            this.sessionDuration = builder.sessionDuration;
            this.statusNotifications = builder.statusNotifications;
            this.tags = builder.tags;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessConfigurations create() {
            return builder().build();
        }

        /**
         * @return accessConfigurationId
         */
        public String getAccessConfigurationId() {
            return this.accessConfigurationId;
        }

        /**
         * @return accessConfigurationName
         */
        public String getAccessConfigurationName() {
            return this.accessConfigurationName;
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
         * @return relayState
         */
        public String getRelayState() {
            return this.relayState;
        }

        /**
         * @return sessionDuration
         */
        public Integer getSessionDuration() {
            return this.sessionDuration;
        }

        /**
         * @return statusNotifications
         */
        public java.util.List<String> getStatusNotifications() {
            return this.statusNotifications;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String accessConfigurationId; 
            private String accessConfigurationName; 
            private String createTime; 
            private String description; 
            private String relayState; 
            private Integer sessionDuration; 
            private java.util.List<String> statusNotifications; 
            private java.util.List<Tags> tags; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(AccessConfigurations model) {
                this.accessConfigurationId = model.accessConfigurationId;
                this.accessConfigurationName = model.accessConfigurationName;
                this.createTime = model.createTime;
                this.description = model.description;
                this.relayState = model.relayState;
                this.sessionDuration = model.sessionDuration;
                this.statusNotifications = model.statusNotifications;
                this.tags = model.tags;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the access configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>ac-00jhtfl8thteu6uj****</p>
             */
            public Builder accessConfigurationId(String accessConfigurationId) {
                this.accessConfigurationId = accessConfigurationId;
                return this;
            }

            /**
             * <p>The name of the access configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS-Admin</p>
             */
            public Builder accessConfigurationName(String accessConfigurationName) {
                this.accessConfigurationName = accessConfigurationName;
                return this;
            }

            /**
             * <p>The time when the access configuration was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-02T08:44:23Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the access configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>This is an access configuration.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The initial web page</p>
             * <p>that is displayed after a CloudSSO user uses the access configuration to access an account in your resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cloudsso.console.aliyun.com">https://cloudsso.console.aliyun.com</a></p>
             */
            public Builder relayState(String relayState) {
                this.relayState = relayState;
                return this;
            }

            /**
             * <p>The duration of a session</p>
             * <p>in which a CloudSSO user uses the access configuration to access an account in your resource directory.</p>
             * <p>Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder sessionDuration(Integer sessionDuration) {
                this.sessionDuration = sessionDuration;
                return this;
            }

            /**
             * <p>The status notifications.</p>
             */
            public Builder statusNotifications(java.util.List<String> statusNotifications) {
                this.statusNotifications = statusNotifications;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time when the information about the access configuration was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-02T08:44:23Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public AccessConfigurations build() {
                return new AccessConfigurations(this);
            } 

        } 

    }
}
