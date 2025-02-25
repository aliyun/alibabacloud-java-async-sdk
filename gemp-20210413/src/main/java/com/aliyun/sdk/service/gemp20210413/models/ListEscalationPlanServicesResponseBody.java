// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEscalationPlanServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEscalationPlanServicesResponseBody</p>
 */
public class ListEscalationPlanServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListEscalationPlanServicesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEscalationPlanServicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * data
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEscalationPlanServicesResponseBody build() {
            return new ListEscalationPlanServicesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("scopeObjectId")
        private Long scopeObjectId;

        private Data(Builder builder) {
            this.scope = builder.scope;
            this.scopeObjectId = builder.scopeObjectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return scopeObjectId
         */
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

        public static final class Builder {
            private String scope; 
            private Long scopeObjectId; 

            /**
             * scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * scopeObjectId.
             */
            public Builder scopeObjectId(Long scopeObjectId) {
                this.scopeObjectId = scopeObjectId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
