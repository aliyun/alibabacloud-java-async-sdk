// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CustomDomainResult} extends {@link TeaModel}
 *
 * <p>CustomDomainResult</p>
 */
public class CustomDomainResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private CustomDomain data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CustomDomainResult(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomDomainResult create() {
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
     * @return data
     */
    public CustomDomain getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private CustomDomain data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CustomDomainResult model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>SUCCESS 为成功，失败情况返回对应错误类型，比如 ERR_BAD_REQUEST ERR_VALIDATION_FAILED ERR_INTERNAL_SERVER_ERROR</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>自定义域名的详细信息</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder data(CustomDomain data) {
            this.data = data;
            return this;
        }

        /**
         * <p>唯一的请求标识符，用于问题追踪</p>
         * 
         * <strong>example:</strong>
         * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CustomDomainResult build() {
            return new CustomDomainResult(this);
        } 

    } 

}
