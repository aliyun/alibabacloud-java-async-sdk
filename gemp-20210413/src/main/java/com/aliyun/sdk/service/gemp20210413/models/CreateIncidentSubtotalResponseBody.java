// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIncidentSubtotalResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIncidentSubtotalResponseBody</p>
 */
public class CreateIncidentSubtotalResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private CreateIncidentSubtotalResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIncidentSubtotalResponseBody create() {
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
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIncidentSubtotalResponseBody build() {
            return new CreateIncidentSubtotalResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("subtotalId")
        private Long subtotalId;

        private Data(Builder builder) {
            this.subtotalId = builder.subtotalId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return subtotalId
         */
        public Long getSubtotalId() {
            return this.subtotalId;
        }

        public static final class Builder {
            private Long subtotalId; 

            /**
             * subtotalId.
             */
            public Builder subtotalId(Long subtotalId) {
                this.subtotalId = subtotalId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
