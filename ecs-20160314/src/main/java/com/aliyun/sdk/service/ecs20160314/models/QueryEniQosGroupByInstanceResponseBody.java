// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEniQosGroupByInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEniQosGroupByInstanceResponseBody</p>
 */
public class QueryEniQosGroupByInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private QueryEniQosGroupByInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEniQosGroupByInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryEniQosGroupByInstanceResponseBody build() {
            return new QueryEniQosGroupByInstanceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("EniQosGroups")
        private java.util.List < String > eniQosGroups;

        private Data(Builder builder) {
            this.eniQosGroups = builder.eniQosGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eniQosGroups
         */
        public java.util.List < String > getEniQosGroups() {
            return this.eniQosGroups;
        }

        public static final class Builder {
            private java.util.List < String > eniQosGroups; 

            /**
             * EniQosGroups.
             */
            public Builder eniQosGroups(java.util.List < String > eniQosGroups) {
                this.eniQosGroups = eniQosGroups;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
