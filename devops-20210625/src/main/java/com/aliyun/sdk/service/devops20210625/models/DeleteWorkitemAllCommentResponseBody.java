// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWorkitemAllCommentResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteWorkitemAllCommentResponseBody</p>
 */
public class DeleteWorkitemAllCommentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deleteFlag")
    private Boolean deleteFlag;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    private DeleteWorkitemAllCommentResponseBody(Builder builder) {
        this.deleteFlag = builder.deleteFlag;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkitemAllCommentResponseBody create() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Boolean deleteFlag; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private String success; 

        /**
         * deleteFlag.
         */
        public Builder deleteFlag(Boolean deleteFlag) {
            this.deleteFlag = deleteFlag;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
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
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DeleteWorkitemAllCommentResponseBody build() {
            return new DeleteWorkitemAllCommentResponseBody(this);
        } 

    } 

}
