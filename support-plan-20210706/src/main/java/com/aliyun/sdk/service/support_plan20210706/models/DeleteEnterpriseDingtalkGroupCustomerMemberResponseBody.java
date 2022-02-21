// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody</p>
 */
public class DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 接口请求结果返回码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 错误信息, 当success=false的时候, 可以取到message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 接口请求的唯一ID, 每次调用requestID唯一
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 调用接口返回是否成功, true代表调用正常
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody build() {
            return new DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody(this);
        } 

    } 

}
