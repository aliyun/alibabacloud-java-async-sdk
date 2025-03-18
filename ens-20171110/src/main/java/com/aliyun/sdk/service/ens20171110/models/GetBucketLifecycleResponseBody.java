// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link GetBucketLifecycleResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketLifecycleResponseBody</p>
 */
public class GetBucketLifecycleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rule")
    private java.util.List<Rule> rule;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Rule> getRule() {
        return this.rule;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Rule> rule; 

        private Builder() {
        } 

        private Builder(GetBucketLifecycleResponseBody model) {
            this.requestId = model.requestId;
            this.rule = model.rule;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A2583E8B-B930-4F59-ADC0-0E209A90C46E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The detailed information about the rule.</p>
         */
        public Builder rule(java.util.List<Rule> rule) {
            this.rule = rule;
            return this;
        }

        public GetBucketLifecycleResponseBody build() {
            return new GetBucketLifecycleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBucketLifecycleResponseBody} extends {@link TeaModel}
     *
     * <p>GetBucketLifecycleResponseBody</p>
     */
    public static class Expiration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedBeforeDate")
        private String createdBeforeDate;

        @com.aliyun.core.annotation.NameInMap("Days")
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

            private Builder() {
            } 

            private Builder(Expiration model) {
                this.createdBeforeDate = model.createdBeforeDate;
                this.days = model.days;
            } 

            /**
             * <p>The expiration date.</p>
             * 
             * <strong>example:</strong>
             * <p>yyy-MM-DDThh:mm:ssZ</p>
             */
            public Builder createdBeforeDate(String createdBeforeDate) {
                this.createdBeforeDate = createdBeforeDate;
                return this;
            }

            /**
             * <p>The validity period, in days.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
    /**
     * 
     * {@link GetBucketLifecycleResponseBody} extends {@link TeaModel}
     *
     * <p>GetBucketLifecycleResponseBody</p>
     */
    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expiration")
        private Expiration expiration;

        @com.aliyun.core.annotation.NameInMap("ID")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Prefix")
        private String prefix;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(Rule model) {
                this.expiration = model.expiration;
                this.id = model.id;
                this.prefix = model.prefix;
                this.status = model.status;
            } 

            /**
             * <p>The expiration time.</p>
             */
            public Builder expiration(Expiration expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * <p>The unique ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The prefix that is applied to the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>image</p>
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * <p>The status of the rule. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: The rule is periodically executed.</li>
             * <li><strong>Disabled</strong>: The rule is ignored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
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
