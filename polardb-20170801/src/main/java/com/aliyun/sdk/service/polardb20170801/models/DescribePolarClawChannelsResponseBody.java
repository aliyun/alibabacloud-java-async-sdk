// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarClawChannelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarClawChannelsResponseBody</p>
 */
public class DescribePolarClawChannelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Channels")
    private java.util.List<Channels> channels;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePolarClawChannelsResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.channels = builder.channels;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawChannelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return channels
     */
    public java.util.List<Channels> getChannels() {
        return this.channels;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationId; 
        private java.util.List<Channels> channels; 
        private Integer code; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePolarClawChannelsResponseBody model) {
            this.applicationId = model.applicationId;
            this.channels = model.channels;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Channels.
         */
        public Builder channels(java.util.List<Channels> channels) {
            this.channels = channels;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePolarClawChannelsResponseBody build() {
            return new DescribePolarClawChannelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarClawChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawChannelsResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("Configured")
        private Boolean configured;

        @com.aliyun.core.annotation.NameInMap("Connected")
        private Boolean connected;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Issues")
        private java.util.List<String> issues;

        @com.aliyun.core.annotation.NameInMap("LastInboundAt")
        private Long lastInboundAt;

        @com.aliyun.core.annotation.NameInMap("LastOutboundAt")
        private Long lastOutboundAt;

        private Accounts(Builder builder) {
            this.accountId = builder.accountId;
            this.configured = builder.configured;
            this.connected = builder.connected;
            this.enabled = builder.enabled;
            this.issues = builder.issues;
            this.lastInboundAt = builder.lastInboundAt;
            this.lastOutboundAt = builder.lastOutboundAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return configured
         */
        public Boolean getConfigured() {
            return this.configured;
        }

        /**
         * @return connected
         */
        public Boolean getConnected() {
            return this.connected;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return issues
         */
        public java.util.List<String> getIssues() {
            return this.issues;
        }

        /**
         * @return lastInboundAt
         */
        public Long getLastInboundAt() {
            return this.lastInboundAt;
        }

        /**
         * @return lastOutboundAt
         */
        public Long getLastOutboundAt() {
            return this.lastOutboundAt;
        }

        public static final class Builder {
            private String accountId; 
            private Boolean configured; 
            private Boolean connected; 
            private Boolean enabled; 
            private java.util.List<String> issues; 
            private Long lastInboundAt; 
            private Long lastOutboundAt; 

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.accountId = model.accountId;
                this.configured = model.configured;
                this.connected = model.connected;
                this.enabled = model.enabled;
                this.issues = model.issues;
                this.lastInboundAt = model.lastInboundAt;
                this.lastOutboundAt = model.lastOutboundAt;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * Configured.
             */
            public Builder configured(Boolean configured) {
                this.configured = configured;
                return this;
            }

            /**
             * Connected.
             */
            public Builder connected(Boolean connected) {
                this.connected = connected;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Issues.
             */
            public Builder issues(java.util.List<String> issues) {
                this.issues = issues;
                return this;
            }

            /**
             * LastInboundAt.
             */
            public Builder lastInboundAt(Long lastInboundAt) {
                this.lastInboundAt = lastInboundAt;
                return this;
            }

            /**
             * LastOutboundAt.
             */
            public Builder lastOutboundAt(Long lastOutboundAt) {
                this.lastOutboundAt = lastOutboundAt;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarClawChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawChannelsResponseBody</p>
     */
    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accounts")
        private java.util.List<Accounts> accounts;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("Configured")
        private Boolean configured;

        @com.aliyun.core.annotation.NameInMap("DefaultAccountId")
        private String defaultAccountId;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private Channels(Builder builder) {
            this.accounts = builder.accounts;
            this.channelId = builder.channelId;
            this.configured = builder.configured;
            this.defaultAccountId = builder.defaultAccountId;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channels create() {
            return builder().build();
        }

        /**
         * @return accounts
         */
        public java.util.List<Accounts> getAccounts() {
            return this.accounts;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return configured
         */
        public Boolean getConfigured() {
            return this.configured;
        }

        /**
         * @return defaultAccountId
         */
        public String getDefaultAccountId() {
            return this.defaultAccountId;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private java.util.List<Accounts> accounts; 
            private String channelId; 
            private Boolean configured; 
            private String defaultAccountId; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(Channels model) {
                this.accounts = model.accounts;
                this.channelId = model.channelId;
                this.configured = model.configured;
                this.defaultAccountId = model.defaultAccountId;
                this.enabled = model.enabled;
            } 

            /**
             * Accounts.
             */
            public Builder accounts(java.util.List<Accounts> accounts) {
                this.accounts = accounts;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * Configured.
             */
            public Builder configured(Boolean configured) {
                this.configured = configured;
                return this;
            }

            /**
             * DefaultAccountId.
             */
            public Builder defaultAccountId(String defaultAccountId) {
                this.defaultAccountId = defaultAccountId;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
}
