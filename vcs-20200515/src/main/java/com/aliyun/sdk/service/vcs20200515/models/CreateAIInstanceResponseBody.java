// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAIInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAIInstanceResponseBody</p>
 */
public class CreateAIInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAIInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAIInstanceResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * 返回code码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 返回数据
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAIInstanceResponseBody build() {
            return new CreateAIInstanceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AcuUsed")
        private Long acuUsed;

        @NameInMap("InstanceId")
        private String instanceId;

        private Data(Builder builder) {
            this.acuUsed = builder.acuUsed;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return acuUsed
         */
        public Long getAcuUsed() {
            return this.acuUsed;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Long acuUsed; 
            private String instanceId; 

            /**
             * 当前实例ACU使用量
             */
            public Builder acuUsed(Long acuUsed) {
                this.acuUsed = acuUsed;
                return this;
            }

            /**
             * 实例Id
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
