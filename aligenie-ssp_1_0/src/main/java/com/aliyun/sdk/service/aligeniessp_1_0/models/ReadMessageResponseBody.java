// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link ReadMessageResponseBody} extends {@link TeaModel}
 *
 * <p>ReadMessageResponseBody</p>
 */
public class ReadMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    private ReadMessageResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadMessageResponseBody create() {
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
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Boolean result; 

        private Builder() {
        } 

        private Builder(ReadMessageResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.result = model.result;
        } 

        /**
         * <p>Status code returned by the service. Only &quot;SUCCESS&quot; indicates success; all other values indicate failure.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>error message</p>
         * 
         * <strong>example:</strong>
         * <p>外部userId映射关系不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Succeeded in marking as read</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public ReadMessageResponseBody build() {
            return new ReadMessageResponseBody(this);
        } 

    } 

}
