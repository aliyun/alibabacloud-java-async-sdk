// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi_intl20211015.models;

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
 * {@link SignalCallResponseBody} extends {@link TeaModel}
 *
 * <p>SignalCallResponseBody</p>
 */
public class SignalCallResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SignalCallResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SignalCallResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
     * @return model
     */
    public Model getModel() {
        return this.model;
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
        private String accessDeniedDetail; 
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>请求状态码。  返回OK代表请求成功。 其他错误码，请参见API错误码。</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>返回信息描述。</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * <p>请求ID。</p>
         * 
         * <strong>example:</strong>
         * <p>D9CB****-<strong><strong>-</strong></strong>-****-********9D23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>请求是否成功，成功：true，失败：false。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SignalCallResponseBody build() {
            return new SignalCallResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SignalCallResponseBody} extends {@link TeaModel}
     *
     * <p>SignalCallResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        private Model(Builder builder) {
            this.callId = builder.callId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        public static final class Builder {
            private String callId; 

            /**
             * <p>任务ID，可以通过此ID查询任务的详情。</p>
             * 
             * <strong>example:</strong>
             * <p>550E****-<strong><strong>-</strong></strong>-****-********0CA0</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
