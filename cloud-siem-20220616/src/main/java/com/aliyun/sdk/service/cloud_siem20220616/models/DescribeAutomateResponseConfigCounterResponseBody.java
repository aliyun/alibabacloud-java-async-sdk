// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutomateResponseConfigCounterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutomateResponseConfigCounterResponseBody</p>
 */
public class DescribeAutomateResponseConfigCounterResponseBody extends TeaModel {
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

    private DescribeAutomateResponseConfigCounterResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutomateResponseConfigCounterResponseBody create() {
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

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAutomateResponseConfigCounterResponseBody build() {
            return new DescribeAutomateResponseConfigCounterResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("All")
        private Long all;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Long online;

        private Data(Builder builder) {
            this.all = builder.all;
            this.online = builder.online;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return all
         */
        public Long getAll() {
            return this.all;
        }

        /**
         * @return online
         */
        public Long getOnline() {
            return this.online;
        }

        public static final class Builder {
            private Long all; 
            private Long online; 

            /**
             * The total number of rules.
             */
            public Builder all(Long all) {
                this.all = all;
                return this;
            }

            /**
             * The number of enabled rules.
             */
            public Builder online(Long online) {
                this.online = online;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
