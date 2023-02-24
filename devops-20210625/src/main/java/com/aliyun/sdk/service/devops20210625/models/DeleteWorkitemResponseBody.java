// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWorkitemResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteWorkitemResponseBody</p>
 */
public class DeleteWorkitemResponseBody extends TeaModel {
    @NameInMap("deleteFlag")
    private Boolean deleteFlag;

    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private DeleteWorkitemResponseBody(Builder builder) {
        this.deleteFlag = builder.deleteFlag;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkitemResponseBody create() {
        return builder().build();
    }

    /**
     * @return deleteFlag
     */
    public Boolean getDeleteFlag() {
        return this.deleteFlag;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
        private Boolean deleteFlag; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        /**
         * 是否成功
         */
        public Builder deleteFlag(Boolean deleteFlag) {
            this.deleteFlag = deleteFlag;
            return this;
        }

        /**
         * 错误状态码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true/false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteWorkitemResponseBody build() {
            return new DeleteWorkitemResponseBody(this);
        } 

    } 

}
