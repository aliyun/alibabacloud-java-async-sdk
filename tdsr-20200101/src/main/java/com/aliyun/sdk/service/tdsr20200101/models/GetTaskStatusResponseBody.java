// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskStatusResponseBody</p>
 */
public class GetTaskStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Type")
    private String type;

    private GetTaskStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long code; 
        private String errorCode; 
        private String errorMsg; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 
        private String type; 

        /**
         * ?????????
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * ???????????????????????????
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ??????????????????????????????
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * ????????????
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * ??????ID????????????requestId??????
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ????????? :init ????????? : processing    ?????? :failure   ?????? :succeed  ?????? :canceled
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * ????????????: wall_line ??????: cut_image   ??????: build  ???????????????right_angle_optimization  ?????????other
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GetTaskStatusResponseBody build() {
            return new GetTaskStatusResponseBody(this);
        } 

    } 

}
