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
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("DyCode")
    private String dyCode;

    @NameInMap("DyMessage")
    private String dyMessage;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetHistogramsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dyCode = builder.dyCode;
        this.dyMessage = builder.dyMessage;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistogramsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dyCode
     */
    public String getDyCode() {
        return this.dyCode;
    }

    /**
     * @return dyMessage
     */
    public String getDyMessage() {
        return this.dyMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String dyCode; 
        private String dyMessage; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * DyCode.
         */
        public Builder dyCode(String dyCode) {
            this.dyCode = dyCode;
            return this;
        }

        /**
         * DyMessage.
         */
        public Builder dyMessage(String dyMessage) {
            this.dyMessage = dyMessage;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
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
             * CompletedOrNot.
             */
            public Builder completedOrNot(Boolean completedOrNot) {
                this.completedOrNot = completedOrNot;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * From.
             */
            public Builder from(Integer from) {
                this.from = from;
                return this;
            }

            /**
             * To.
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
             * Histograms.
             */
            public Builder histograms(java.util.List < Histograms> histograms) {
                this.histograms = histograms;
                return this;
            }

            /**
             * Server.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * TotalCount.
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
