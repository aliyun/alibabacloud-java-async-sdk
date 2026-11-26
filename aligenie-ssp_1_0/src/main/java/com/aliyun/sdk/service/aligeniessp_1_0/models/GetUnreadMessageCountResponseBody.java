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
 * {@link GetUnreadMessageCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetUnreadMessageCountResponseBody</p>
 */
public class GetUnreadMessageCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Integer result;

    private GetUnreadMessageCountResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUnreadMessageCountResponseBody create() {
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
    public Integer getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Integer result; 

        private Builder() {
        } 

        private Builder(GetUnreadMessageCountResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.result = model.result;
        } 

        /**
         * <p>Status code returned by the service</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>用户信息不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Number of unread messages</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder result(Integer result) {
            this.result = result;
            return this;
        }

        public GetUnreadMessageCountResponseBody build() {
            return new GetUnreadMessageCountResponseBody(this);
        } 

    } 

}
