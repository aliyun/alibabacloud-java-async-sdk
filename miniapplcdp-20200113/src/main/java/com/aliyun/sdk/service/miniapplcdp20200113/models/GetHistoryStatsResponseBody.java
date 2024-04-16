// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHistoryStatsResponseBody} extends {@link TeaModel}
 *
 * <p>GetHistoryStatsResponseBody</p>
 */
public class GetHistoryStatsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetHistoryStatsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistoryStatsResponseBody create() {
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

        public GetHistoryStatsResponseBody build() {
            return new GetHistoryStatsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("HistoryPv")
        private java.util.Map < String, String > historyPv;

        @NameInMap("HistoryUv")
        private java.util.Map < String, String > historyUv;

        private Data(Builder builder) {
            this.historyPv = builder.historyPv;
            this.historyUv = builder.historyUv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return historyPv
         */
        public java.util.Map < String, String > getHistoryPv() {
            return this.historyPv;
        }

        /**
         * @return historyUv
         */
        public java.util.Map < String, String > getHistoryUv() {
            return this.historyUv;
        }

        public static final class Builder {
            private java.util.Map < String, String > historyPv; 
            private java.util.Map < String, String > historyUv; 

            /**
             * HistoryPv.
             */
            public Builder historyPv(java.util.Map < String, String > historyPv) {
                this.historyPv = historyPv;
                return this;
            }

            /**
             * HistoryUv.
             */
            public Builder historyUv(java.util.Map < String, String > historyUv) {
                this.historyUv = historyUv;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
