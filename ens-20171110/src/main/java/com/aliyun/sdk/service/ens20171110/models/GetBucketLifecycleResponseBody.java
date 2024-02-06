// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBucketLifecycleResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketLifecycleResponseBody</p>
 */
public class GetBucketLifecycleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rule")
    private java.util.List < Rule> rule;

    private GetBucketLifecycleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rule = builder.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketLifecycleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rule
     */
    public java.util.List < Rule> getRule() {
        return this.rule;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Rule> rule; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The detailed information about the rule.
         */
        public Builder rule(java.util.List < Rule> rule) {
            this.rule = rule;
            return this;
        }

        public GetBucketLifecycleResponseBody build() {
            return new GetBucketLifecycleResponseBody(this);
        } 

    } 

    public static class Expiration extends TeaModel {
        @NameInMap("CreatedBeforeDate")
        private String createdBeforeDate;

        @NameInMap("Days")
        private String days;

        private Expiration(Builder builder) {
            this.createdBeforeDate = builder.createdBeforeDate;
            this.days = builder.days;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Expiration create() {
            return builder().build();
        }

        /**
         * @return createdBeforeDate
         */
        public String getCreatedBeforeDate() {
            return this.createdBeforeDate;
        }

        /**
         * @return days
         */
        public String getDays() {
            return this.days;
        }

        public static final class Builder {
            private String createdBeforeDate; 
            private String days; 

            /**
             * The expiration date.
             */
            public Builder createdBeforeDate(String createdBeforeDate) {
                this.createdBeforeDate = createdBeforeDate;
                return this;
            }

            /**
             * The validity period, in days.
             */
            public Builder days(String days) {
                this.days = days;
                return this;
            }

            public Expiration build() {
                return new Expiration(this);
            } 

        } 

    }
    public static class Rule extends TeaModel {
        @NameInMap("Expiration")
        private Expiration expiration;

        @NameInMap("ID")
        private String id;

        @NameInMap("Prefix")
        private String prefix;

        @NameInMap("Status")
        private String status;

        private Rule(Builder builder) {
            this.expiration = builder.expiration;
            this.id = builder.id;
            this.prefix = builder.prefix;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
            return builder().build();
        }

        /**
         * @return expiration
         */
        public Expiration getExpiration() {
            return this.expiration;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return prefix
         */
        public String getPrefix() {
            return this.prefix;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Expiration expiration; 
            private String id; 
            private String prefix; 
            private String status; 

            /**
             * The expiration time.
             */
            public Builder expiration(Expiration expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * The unique ID of the rule.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The prefix that is applied to the rule.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * The status of the rule. Valid values:
             * <p>
             * 
             * *   **Enabled**: The rule is periodically executed.
             * *   **Disabled**: The rule is ignored.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
}
