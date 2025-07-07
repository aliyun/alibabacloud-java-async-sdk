// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseRoleCreateBizRoleResponseBody} extends {@link TeaModel}
 *
 * <p>EnterpriseRoleCreateBizRoleResponseBody</p>
 */
public class EnterpriseRoleCreateBizRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizRoleCode")
    private String bizRoleCode;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private EnterpriseRoleCreateBizRoleResponseBody(Builder builder) {
        this.bizRoleCode = builder.bizRoleCode;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseRoleCreateBizRoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizRoleCode
     */
    public String getBizRoleCode() {
        return this.bizRoleCode;
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
        private String bizRoleCode; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(EnterpriseRoleCreateBizRoleResponseBody model) {
            this.bizRoleCode = model.bizRoleCode;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * BizRoleCode.
         */
        public Builder bizRoleCode(String bizRoleCode) {
            this.bizRoleCode = bizRoleCode;
            return this;
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

        public EnterpriseRoleCreateBizRoleResponseBody build() {
            return new EnterpriseRoleCreateBizRoleResponseBody(this);
        } 

    } 

}
