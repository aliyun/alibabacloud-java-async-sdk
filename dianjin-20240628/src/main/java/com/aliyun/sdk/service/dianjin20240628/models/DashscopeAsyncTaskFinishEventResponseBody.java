// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link DashscopeAsyncTaskFinishEventResponseBody} extends {@link TeaModel}
 *
 * <p>DashscopeAsyncTaskFinishEventResponseBody</p>
 */
public class DashscopeAsyncTaskFinishEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("retryAble")
    private Boolean retryAble;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DashscopeAsyncTaskFinishEventResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.retryAble = builder.retryAble;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DashscopeAsyncTaskFinishEventResponseBody create() {
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
     * @return retryAble
     */
    public Boolean getRetryAble() {
        return this.retryAble;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Boolean retryAble; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DashscopeAsyncTaskFinishEventResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.retryAble = model.retryAble;
            this.success = model.success;
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
         * retryAble.
         */
        public Builder retryAble(Boolean retryAble) {
            this.retryAble = retryAble;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DashscopeAsyncTaskFinishEventResponseBody build() {
            return new DashscopeAsyncTaskFinishEventResponseBody(this);
        } 

    } 

}
