// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link GetUserCommandResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserCommandResponseBody</p>
 */
public class GetUserCommandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OnStart")
    private OnStart onStart;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("UserCommandId")
    private String userCommandId;

    @com.aliyun.core.annotation.NameInMap("accessDeniedDetail")
    private java.util.Map<String, ?> accessDeniedDetail;

    private GetUserCommandResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.onStart = builder.onStart;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.userCommandId = builder.userCommandId;
        this.accessDeniedDetail = builder.accessDeniedDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserCommandResponseBody create() {
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
     * @return onStart
     */
    public OnStart getOnStart() {
        return this.onStart;
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
     * @return userCommandId
     */
    public String getUserCommandId() {
        return this.userCommandId;
    }

    /**
     * @return accessDeniedDetail
     */
    public java.util.Map<String, ?> getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private OnStart onStart; 
        private String requestId; 
        private Boolean success; 
        private String userCommandId; 
        private java.util.Map<String, ?> accessDeniedDetail; 

        private Builder() {
        } 

        private Builder(GetUserCommandResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.onStart = model.onStart;
            this.requestId = model.requestId;
            this.success = model.success;
            this.userCommandId = model.userCommandId;
            this.accessDeniedDetail = model.accessDeniedDetail;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * OnStart.
         */
        public Builder onStart(OnStart onStart) {
            this.onStart = onStart;
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

        /**
         * UserCommandId.
         */
        public Builder userCommandId(String userCommandId) {
            this.userCommandId = userCommandId;
            return this;
        }

        /**
         * accessDeniedDetail.
         */
        public Builder accessDeniedDetail(java.util.Map<String, ?> accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        public GetUserCommandResponseBody build() {
            return new GetUserCommandResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserCommandResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserCommandResponseBody</p>
     */
    public static class OnStart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        private OnStart(Builder builder) {
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnStart create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        public static final class Builder {
            private String content; 

            private Builder() {
            } 

            private Builder(OnStart model) {
                this.content = model.content;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            public OnStart build() {
                return new OnStart(this);
            } 

        } 

    }
}
