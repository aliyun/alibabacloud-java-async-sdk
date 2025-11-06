// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link GetVhostRateResponseBody} extends {@link TeaModel}
 *
 * <p>GetVhostRateResponseBody</p>
 */
public class GetVhostRateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetVhostRateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVhostRateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
        return this.data;
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetVhostRateResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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

        public GetVhostRateResponseBody build() {
            return new GetVhostRateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVhostRateResponseBody} extends {@link TeaModel}
     *
     * <p>GetVhostRateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelNum")
        private Integer channelNum;

        @com.aliyun.core.annotation.NameInMap("ConnectionNum")
        private Integer connectionNum;

        @com.aliyun.core.annotation.NameInMap("InQps")
        private Long inQps;

        @com.aliyun.core.annotation.NameInMap("OutQps")
        private Long outQps;

        @com.aliyun.core.annotation.NameInMap("VhostName")
        private String vhostName;

        private Data(Builder builder) {
            this.channelNum = builder.channelNum;
            this.connectionNum = builder.connectionNum;
            this.inQps = builder.inQps;
            this.outQps = builder.outQps;
            this.vhostName = builder.vhostName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return channelNum
         */
        public Integer getChannelNum() {
            return this.channelNum;
        }

        /**
         * @return connectionNum
         */
        public Integer getConnectionNum() {
            return this.connectionNum;
        }

        /**
         * @return inQps
         */
        public Long getInQps() {
            return this.inQps;
        }

        /**
         * @return outQps
         */
        public Long getOutQps() {
            return this.outQps;
        }

        /**
         * @return vhostName
         */
        public String getVhostName() {
            return this.vhostName;
        }

        public static final class Builder {
            private Integer channelNum; 
            private Integer connectionNum; 
            private Long inQps; 
            private Long outQps; 
            private String vhostName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.channelNum = model.channelNum;
                this.connectionNum = model.connectionNum;
                this.inQps = model.inQps;
                this.outQps = model.outQps;
                this.vhostName = model.vhostName;
            } 

            /**
             * ChannelNum.
             */
            public Builder channelNum(Integer channelNum) {
                this.channelNum = channelNum;
                return this;
            }

            /**
             * ConnectionNum.
             */
            public Builder connectionNum(Integer connectionNum) {
                this.connectionNum = connectionNum;
                return this;
            }

            /**
             * InQps.
             */
            public Builder inQps(Long inQps) {
                this.inQps = inQps;
                return this;
            }

            /**
             * OutQps.
             */
            public Builder outQps(Long outQps) {
                this.outQps = outQps;
                return this;
            }

            /**
             * VhostName.
             */
            public Builder vhostName(String vhostName) {
                this.vhostName = vhostName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
