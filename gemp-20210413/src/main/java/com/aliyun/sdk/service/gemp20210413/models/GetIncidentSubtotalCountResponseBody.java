// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIncidentSubtotalCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetIncidentSubtotalCountResponseBody</p>
 */
public class GetIncidentSubtotalCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    private GetIncidentSubtotalCountResponseBody(Builder builder) {
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIncidentSubtotalCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private Data data; 

        /**
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public GetIncidentSubtotalCountResponseBody build() {
            return new GetIncidentSubtotalCountResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("subtotalCount")
        private java.util.Map < String, ? > subtotalCount;

        private Data(Builder builder) {
            this.requestId = builder.requestId;
            this.subtotalCount = builder.subtotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return subtotalCount
         */
        public java.util.Map < String, ? > getSubtotalCount() {
            return this.subtotalCount;
        }

        public static final class Builder {
            private String requestId; 
            private java.util.Map < String, ? > subtotalCount; 

            /**
             * id of the request
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * map
             */
            public Builder subtotalCount(java.util.Map < String, ? > subtotalCount) {
                this.subtotalCount = subtotalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
