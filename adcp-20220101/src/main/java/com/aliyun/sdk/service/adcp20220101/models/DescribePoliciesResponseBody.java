// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePoliciesResponseBody</p>
 */
public class DescribePoliciesResponseBody extends TeaModel {
    @NameInMap("Policies")
    private java.util.List < Policies> policies;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePoliciesResponseBody(Builder builder) {
        this.policies = builder.policies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return policies
     */
    public java.util.List < Policies> getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Policies> policies; 
        private String requestId; 

        /**
         * A list of policies.
         */
        public Builder policies(java.util.List < Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePoliciesResponseBody build() {
            return new DescribePoliciesResponseBody(this);
        } 

    } 

    public static class Policies extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Names")
        private java.util.List < String > names;

        private Policies(Builder builder) {
            this.category = builder.category;
            this.names = builder.names;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return names
         */
        public java.util.List < String > getNames() {
            return this.names;
        }

        public static final class Builder {
            private String category; 
            private java.util.List < String > names; 

            /**
             * The policy type.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The names of the policies of each policy type.
             */
            public Builder names(java.util.List < String > names) {
                this.names = names;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
