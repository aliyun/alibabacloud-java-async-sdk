// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlgorithmNamesByDeviceIdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlgorithmNamesByDeviceIdsResponseBody</p>
 */
public class ListAlgorithmNamesByDeviceIdsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListAlgorithmNamesByDeviceIdsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlgorithmNamesByDeviceIdsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 返回结果编码  200：获取成功  Failed：获取失败  Retry：按需拉流模式，正在建立取流连接，请稍后重试
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 返回结果消息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求ID
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

        public ListAlgorithmNamesByDeviceIdsResponseBody build() {
            return new ListAlgorithmNamesByDeviceIdsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AlgorithmNames")
        private java.util.List < String > algorithmNames;

        @NameInMap("GbId")
        private String gbId;

        private Data(Builder builder) {
            this.algorithmNames = builder.algorithmNames;
            this.gbId = builder.gbId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return algorithmNames
         */
        public java.util.List < String > getAlgorithmNames() {
            return this.algorithmNames;
        }

        /**
         * @return gbId
         */
        public String getGbId() {
            return this.gbId;
        }

        public static final class Builder {
            private java.util.List < String > algorithmNames; 
            private String gbId; 

            /**
             * 设备ID对应呗计算的算法名称集合
             */
            public Builder algorithmNames(java.util.List < String > algorithmNames) {
                this.algorithmNames = algorithmNames;
                return this;
            }

            /**
             * 设备ID
             */
            public Builder gbId(String gbId) {
                this.gbId = gbId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
