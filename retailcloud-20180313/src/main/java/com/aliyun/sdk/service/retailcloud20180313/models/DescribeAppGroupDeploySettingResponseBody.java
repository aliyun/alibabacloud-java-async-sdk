// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppGroupDeploySettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppGroupDeploySettingResponseBody</p>
 */
public class DescribeAppGroupDeploySettingResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeAppGroupDeploySettingResponseBody(Builder builder) {
        this.code = builder.code;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppGroupDeploySettingResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String errMsg; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * CodeEnum
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAppGroupDeploySettingResponseBody build() {
            return new DescribeAppGroupDeploySettingResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("DefaultPacketComment")
        private String defaultPacketComment;

        @NameInMap("DefaultPacketId")
        private Long defaultPacketId;

        private Result(Builder builder) {
            this.defaultPacketComment = builder.defaultPacketComment;
            this.defaultPacketId = builder.defaultPacketId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return defaultPacketComment
         */
        public String getDefaultPacketComment() {
            return this.defaultPacketComment;
        }

        /**
         * @return defaultPacketId
         */
        public Long getDefaultPacketId() {
            return this.defaultPacketId;
        }

        public static final class Builder {
            private String defaultPacketComment; 
            private Long defaultPacketId; 

            /**
             * 默认代码包描述
             */
            public Builder defaultPacketComment(String defaultPacketComment) {
                this.defaultPacketComment = defaultPacketComment;
                return this;
            }

            /**
             * 默认代码包id
             */
            public Builder defaultPacketId(Long defaultPacketId) {
                this.defaultPacketId = defaultPacketId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
