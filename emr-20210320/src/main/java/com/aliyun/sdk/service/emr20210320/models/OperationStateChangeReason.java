// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperationStateChangeReason} extends {@link TeaModel}
 *
 * <p>OperationStateChangeReason</p>
 */
public class OperationStateChangeReason extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    private OperationStateChangeReason(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperationStateChangeReason create() {
        return builder().build();
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

    public static final class Builder {
        private String code; 
        private String message; 

        /**
         * 状态码。
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 状态变化信息。
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public OperationStateChangeReason build() {
            return new OperationStateChangeReason(this);
        } 

    } 

}
