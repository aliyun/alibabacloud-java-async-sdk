// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientAlertModeResponseBody} extends {@link TeaModel}
 *
 * <p>ListClientAlertModeResponseBody</p>
 */
public class ListClientAlertModeResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListClientAlertModeResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientAlertModeResponseBody create() {
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
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClientAlertModeResponseBody build() {
            return new ListClientAlertModeResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Uuids")
        private java.util.List < String > uuids;

        private Data(Builder builder) {
            this.count = builder.count;
            this.uuids = builder.uuids;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return uuids
         */
        public java.util.List < String > getUuids() {
            return this.uuids;
        }

        public static final class Builder {
            private Integer count; 
            private java.util.List < String > uuids; 

            /**
             * The total number of entries returned.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The UUIDs of the assets.
             */
            public Builder uuids(java.util.List < String > uuids) {
                this.uuids = uuids;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
