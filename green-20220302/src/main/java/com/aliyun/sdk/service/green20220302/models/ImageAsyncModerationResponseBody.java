// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ImageAsyncModerationResponseBody} extends {@link TeaModel}
 *
 * <p>ImageAsyncModerationResponseBody</p>
 */
public class ImageAsyncModerationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ImageAsyncModerationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageAsyncModerationResponseBody create() {
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
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String msg; 
        private String requestId; 

        /**
         * <p>The returned HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned in response to the request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4A926AE2-4C96-573F-824F-0532960799F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ImageAsyncModerationResponseBody build() {
            return new ImageAsyncModerationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ImageAsyncModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageAsyncModerationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("ReqId")
        private String reqId;

        private Data(Builder builder) {
            this.dataId = builder.dataId;
            this.reqId = builder.reqId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return reqId
         */
        public String getReqId() {
            return this.reqId;
        }

        public static final class Builder {
            private String dataId; 
            private String reqId; 

            /**
             * <p>The ID of the moderated object.</p>
             * 
             * <strong>example:</strong>
             * <p>fb5ffab1-993b-449f-b8d6-b97d5e3331f2</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>The reqId field returned by the Image Async Moderation API. You can use this field to query the detection results.</p>
             * 
             * <strong>example:</strong>
             * <p>A07B3DB9-D762-5C56-95B1-8EC55CF176D2</p>
             */
            public Builder reqId(String reqId) {
                this.reqId = reqId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
