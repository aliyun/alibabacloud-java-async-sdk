// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHistogramsResponseBody} extends {@link TeaModel}
 *
 * <p>GetHistogramsResponseBody</p>
 */
public class GetHistogramsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetHistogramsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistogramsResponseBody create() {
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
         * The data of the charts.
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

        public GetHistogramsResponseBody build() {
            return new GetHistogramsResponseBody(this);
        } 

    } 

    public static class Histograms extends TeaModel {
        @NameInMap("CompletedOrNot")
        private Boolean completedOrNot;

        @NameInMap("Count")
        private Long count;

        @NameInMap("From")
        private Integer from;

        @NameInMap("To")
        private Integer to;

        private Histograms(Builder builder) {
            this.completedOrNot = builder.completedOrNot;
            this.count = builder.count;
            this.from = builder.from;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Histograms create() {
            return builder().build();
        }

        /**
         * @return completedOrNot
         */
        public Boolean getCompletedOrNot() {
            return this.completedOrNot;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return from
         */
        public Integer getFrom() {
            return this.from;
        }

        /**
         * @return to
         */
        public Integer getTo() {
            return this.to;
        }

        public static final class Builder {
            private Boolean completedOrNot; 
            private Long count; 
            private Integer from; 
            private Integer to; 

            /**
             * Indicates whether the query results within the subinterval is complete. Valid values:
             * <p>
             * 
             * *   true: The query is complete and the returned result is complete.
             * *   false: The query is complete but the returned result is incomplete. You must repeat the request to obtain the complete result.
             */
            public Builder completedOrNot(Boolean completedOrNot) {
                this.completedOrNot = completedOrNot;
                return this;
            }

            /**
             * The number of logs within the subinterval.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The start time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder from(Integer from) {
                this.from = from;
                return this;
            }

            /**
             * The end time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder to(Integer to) {
                this.to = to;
                return this;
            }

            public Histograms build() {
                return new Histograms(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Histograms")
        private java.util.List < Histograms> histograms;

        @NameInMap("Server")
        private String server;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.histograms = builder.histograms;
            this.server = builder.server;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return histograms
         */
        public java.util.List < Histograms> getHistograms() {
            return this.histograms;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Histograms> histograms; 
            private String server; 
            private Long totalCount; 

            /**
             * The distribution of logs.
             */
            public Builder histograms(java.util.List < Histograms> histograms) {
                this.histograms = histograms;
                return this;
            }

            /**
             * The name of the server.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * The number of logs that are generated within the subinterval.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
