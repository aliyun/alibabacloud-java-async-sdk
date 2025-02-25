// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link GetConsumerStackResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsumerStackResponseBody</p>
 */
public class GetConsumerStackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("dynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetConsumerStackResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsumerStackResponseBody create() {
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
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Topic.NotFound</p>
         */
        public Builder code(String code) {
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
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceId</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The instance cannot be found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30F2CBC7-F69D-5D78-9661-0254C9E1FBFA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetConsumerStackResponseBody build() {
            return new GetConsumerStackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConsumerStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerStackResponseBody</p>
     */
    public static class Stacks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("thread")
        private String thread;

        @com.aliyun.core.annotation.NameInMap("tracks")
        private java.util.List<String> tracks;

        private Stacks(Builder builder) {
            this.thread = builder.thread;
            this.tracks = builder.tracks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stacks create() {
            return builder().build();
        }

        /**
         * @return thread
         */
        public String getThread() {
            return this.thread;
        }

        /**
         * @return tracks
         */
        public java.util.List<String> getTracks() {
            return this.tracks;
        }

        public static final class Builder {
            private String thread; 
            private java.util.List<String> tracks; 

            /**
             * <p>Thread id.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder thread(String thread) {
                this.thread = thread;
                return this;
            }

            /**
             * <p>Stack Information.</p>
             */
            public Builder tracks(java.util.List<String> tracks) {
                this.tracks = tracks;
                return this;
            }

            public Stacks build() {
                return new Stacks(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetConsumerStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerStackResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("stacks")
        private java.util.List<Stacks> stacks;

        private Data(Builder builder) {
            this.consumerGroupId = builder.consumerGroupId;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.stacks = builder.stacks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return consumerGroupId
         */
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return stacks
         */
        public java.util.List<Stacks> getStacks() {
            return this.stacks;
        }

        public static final class Builder {
            private String consumerGroupId; 
            private String instanceId; 
            private String regionId; 
            private java.util.List<Stacks> stacks; 

            /**
             * <p>The ID of the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>CID-TEST</p>
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-7e22ody****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Stack Information.</p>
             */
            public Builder stacks(java.util.List<Stacks> stacks) {
                this.stacks = stacks;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
