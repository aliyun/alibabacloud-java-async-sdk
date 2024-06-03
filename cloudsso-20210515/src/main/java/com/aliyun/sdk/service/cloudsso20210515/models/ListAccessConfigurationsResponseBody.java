// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessConfigurationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccessConfigurationsResponseBody</p>
 */
public class ListAccessConfigurationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessConfigurations")
    private java.util.List < AccessConfigurations> accessConfigurations;

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

    /**
     * @return accessConfigurations
     */
    public java.util.List < AccessConfigurations> getAccessConfigurations() {
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
        private java.util.List < AccessConfigurations> accessConfigurations; 
        private Boolean isTruncated; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCounts; 

        /**
         * The access configurations.
         */
        public Builder accessConfigurations(java.util.List < AccessConfigurations> accessConfigurations) {
            this.accessConfigurations = accessConfigurations;
            return this;
        }

        /**
         * Indicates whether the queried entries are truncated. Valid values:
         * <p>
         * 
         * *   true: The queried entries are truncated.
         * *   false: The queried entries are not truncated.
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is returned for the next page.
         * <p>
         * 
         * >  This parameter is returned only when the `IsTruncated` parameter is set to `true`.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public ListAccessConfigurationsResponseBody build() {
            return new ListAccessConfigurationsResponseBody(this);
        } 

    } 

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
        private java.util.List < String > statusNotifications;

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
        public java.util.List < String > getStatusNotifications() {
            return this.statusNotifications;
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
            private java.util.List < String > statusNotifications; 
            private String updateTime; 

            /**
             * The ID of the access configuration.
             */
            public Builder accessConfigurationId(String accessConfigurationId) {
                this.accessConfigurationId = accessConfigurationId;
                return this;
            }

            /**
             * The name of the access configuration.
             */
            public Builder accessConfigurationName(String accessConfigurationName) {
                this.accessConfigurationName = accessConfigurationName;
                return this;
            }

            /**
             * The time when the access configuration was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the access configuration.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The initial web page that is displayed after a CloudSSO user accesses an account in your resource directory by using the access configuration.
             */
            public Builder relayState(String relayState) {
                this.relayState = relayState;
                return this;
            }

            /**
             * The duration of a session in which a CloudSSO user accesses an account in your resource directory by using the access configuration.
             * <p>
             * 
             * Unit: seconds.
             */
            public Builder sessionDuration(Integer sessionDuration) {
                this.sessionDuration = sessionDuration;
                return this;
            }

            /**
             * The status notification.
             */
            public Builder statusNotifications(java.util.List < String > statusNotifications) {
                this.statusNotifications = statusNotifications;
                return this;
            }

            /**
             * The time when the information about the access configuration was modified.
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
