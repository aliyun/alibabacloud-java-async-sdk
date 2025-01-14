// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link SuccessInfoValue} extends {@link TeaModel}
 *
 * <p>SuccessInfoValue</p>
 */
public class SuccessInfoValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    private SuccessInfoValue(Builder builder) {
        this.success = builder.success;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SuccessInfoValue create() {
        return builder().build();
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private Boolean success; 
        private String message; 

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public SuccessInfoValue build() {
            return new SuccessInfoValue(this);
        } 

    } 

}
