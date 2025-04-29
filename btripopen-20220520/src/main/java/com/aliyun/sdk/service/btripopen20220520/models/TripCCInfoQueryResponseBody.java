// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link TripCCInfoQueryResponseBody} extends {@link TeaModel}
 *
 * <p>TripCCInfoQueryResponseBody</p>
 */
public class TripCCInfoQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private java.util.List<Module> module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private TripCCInfoQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TripCCInfoQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public java.util.List<Module> getModule() {
        return this.module;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List<Module> module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(TripCCInfoQueryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>module。</p>
         */
        public Builder module(java.util.List<Module> module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>21041ce316577904808056433edbb2</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public TripCCInfoQueryResponseBody build() {
            return new TripCCInfoQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TripCCInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TripCCInfoQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("notifier")
        private String notifier;

        @com.aliyun.core.annotation.NameInMap("notify_start_time")
        private Long notifyStartTime;

        private Module(Builder builder) {
            this.notifier = builder.notifier;
            this.notifyStartTime = builder.notifyStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return notifier
         */
        public String getNotifier() {
            return this.notifier;
        }

        /**
         * @return notifyStartTime
         */
        public Long getNotifyStartTime() {
            return this.notifyStartTime;
        }

        public static final class Builder {
            private String notifier; 
            private Long notifyStartTime; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.notifier = model.notifier;
                this.notifyStartTime = model.notifyStartTime;
            } 

            /**
             * notifier.
             */
            public Builder notifier(String notifier) {
                this.notifier = notifier;
                return this;
            }

            /**
             * notify_start_time.
             */
            public Builder notifyStartTime(Long notifyStartTime) {
                this.notifyStartTime = notifyStartTime;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
