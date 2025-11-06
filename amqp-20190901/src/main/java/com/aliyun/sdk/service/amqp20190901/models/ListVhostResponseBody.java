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
 * {@link ListVhostResponseBody} extends {@link TeaModel}
 *
 * <p>ListVhostResponseBody</p>
 */
public class ListVhostResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListVhostResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVhostResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListVhostResponseBody model) {
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
        public Builder data(Data data) {
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

        public ListVhostResponseBody build() {
            return new ListVhostResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVhostResponseBody} extends {@link TeaModel}
     *
     * <p>ListVhostResponseBody</p>
     */
    public static class Vhosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelNum")
        private Integer channelNum;

        @com.aliyun.core.annotation.NameInMap("ConnectionNum")
        private Integer connectionNum;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Vhosts(Builder builder) {
            this.channelNum = builder.channelNum;
            this.connectionNum = builder.connectionNum;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vhosts create() {
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer channelNum; 
            private Integer connectionNum; 
            private String name; 

            private Builder() {
            } 

            private Builder(Vhosts model) {
                this.channelNum = model.channelNum;
                this.connectionNum = model.connectionNum;
                this.name = model.name;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Vhosts build() {
                return new Vhosts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVhostResponseBody} extends {@link TeaModel}
     *
     * <p>ListVhostResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Vhosts")
        private java.util.List<Vhosts> vhosts;

        private Data(Builder builder) {
            this.vhosts = builder.vhosts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return vhosts
         */
        public java.util.List<Vhosts> getVhosts() {
            return this.vhosts;
        }

        public static final class Builder {
            private java.util.List<Vhosts> vhosts; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.vhosts = model.vhosts;
            } 

            /**
             * Vhosts.
             */
            public Builder vhosts(java.util.List<Vhosts> vhosts) {
                this.vhosts = vhosts;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
