// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAntChainSubnetMemberCheckResponseBody} extends {@link TeaModel}
 *
 * <p>AddAntChainSubnetMemberCheckResponseBody</p>
 */
public class AddAntChainSubnetMemberCheckResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
    private String resultMessage;

    @NameInMap("Success")
    private Boolean success;

    private AddAntChainSubnetMemberCheckResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAntChainSubnetMemberCheckResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private Result result; 
        private String resultCode; 
        private String resultMessage; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddAntChainSubnetMemberCheckResponseBody build() {
            return new AddAntChainSubnetMemberCheckResponseBody(this);
        } 

    } 

    public static class ConsortiumMemberInfoList extends TeaModel {
        @NameInMap("MemberId")
        private String memberId;

        @NameInMap("MemberName")
        private String memberName;

        private ConsortiumMemberInfoList(Builder builder) {
            this.memberId = builder.memberId;
            this.memberName = builder.memberName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsortiumMemberInfoList create() {
            return builder().build();
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        public static final class Builder {
            private String memberId; 
            private String memberName; 

            /**
             * MemberId.
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * MemberName.
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            public ConsortiumMemberInfoList build() {
                return new ConsortiumMemberInfoList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("ConsortiumMemberInfoList")
        private java.util.List < ConsortiumMemberInfoList> consortiumMemberInfoList;

        private Result(Builder builder) {
            this.consortiumMemberInfoList = builder.consortiumMemberInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return consortiumMemberInfoList
         */
        public java.util.List < ConsortiumMemberInfoList> getConsortiumMemberInfoList() {
            return this.consortiumMemberInfoList;
        }

        public static final class Builder {
            private java.util.List < ConsortiumMemberInfoList> consortiumMemberInfoList; 

            /**
             * ConsortiumMemberInfoList.
             */
            public Builder consortiumMemberInfoList(java.util.List < ConsortiumMemberInfoList> consortiumMemberInfoList) {
                this.consortiumMemberInfoList = consortiumMemberInfoList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
