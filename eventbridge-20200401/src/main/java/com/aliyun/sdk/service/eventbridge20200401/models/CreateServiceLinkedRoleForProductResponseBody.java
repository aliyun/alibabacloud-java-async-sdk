// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link CreateServiceLinkedRoleForProductResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceLinkedRoleForProductResponseBody</p>
 */
public class CreateServiceLinkedRoleForProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateServiceLinkedRoleForProductResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceLinkedRoleForProductResponseBody create() {
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
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
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
        private Integer httpCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateServiceLinkedRoleForProductResponseBody model) {
            this.code = model.code;
            this.httpCode = model.httpCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code of the request. \<code>Success\\</code> indicates that the request was successful. For more information about error codes, see the Error codes section.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><p><strong>2xx</strong>: a 2xx status code.</p>
         * </li>
         * <li><p><strong>3xx</strong>: a 3xx status code.</p>
         * </li>
         * <li><p><strong>4xx</strong>: a 4xx status code.</p>
         * </li>
         * <li><p><strong>5xx</strong>: a 5xx status code.</p>
         * </li>
         * </ul>
         * <p>If this parameter is not specified, all HTTP status codes are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The returned message. If the request is successful, \<code>success\\</code> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C36345A1-75F3-5A1A-BFCF-33B8271971FA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. If the request is successful, \<code>true\\</code> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateServiceLinkedRoleForProductResponseBody build() {
            return new CreateServiceLinkedRoleForProductResponseBody(this);
        } 

    } 

}
