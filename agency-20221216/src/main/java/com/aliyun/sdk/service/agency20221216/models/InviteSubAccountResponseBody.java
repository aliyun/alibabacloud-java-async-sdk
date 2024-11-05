// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InviteSubAccountResponseBody} extends {@link TeaModel}
 *
 * <p>InviteSubAccountResponseBody</p>
 */
public class InviteSubAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private Results results;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private InviteSubAccountResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InviteSubAccountResponseBody create() {
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
     * @return results
     */
    public Results getResults() {
        return this.results;
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
        private Results results; 
        private Boolean success; 

        /**
         * <p>Error Code: </br>
         * • 200 OK</br>
         * • 1109 System Error</br></p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Message</br></p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID, Alibaba Cloud will track errors with this ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of invitation sending results</p>
         */
        public Builder results(Results results) {
            this.results = results;
            return this;
        }

        /**
         * <p>Candidate Values: True/False, this value states if the current API calling action is successful. It does not guarantee the success of subsequent business operations.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public InviteSubAccountResponseBody build() {
            return new InviteSubAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InviteSubAccountResponseBody} extends {@link TeaModel}
     *
     * <p>InviteSubAccountResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Days")
        private Integer days;

        @com.aliyun.core.annotation.NameInMap("InviteId")
        private Long inviteId;

        @com.aliyun.core.annotation.NameInMap("RegUrl")
        private String regUrl;

        private Result(Builder builder) {
            this.days = builder.days;
            this.inviteId = builder.inviteId;
            this.regUrl = builder.regUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return days
         */
        public Integer getDays() {
            return this.days;
        }

        /**
         * @return inviteId
         */
        public Long getInviteId() {
            return this.inviteId;
        }

        /**
         * @return regUrl
         */
        public String getRegUrl() {
            return this.regUrl;
        }

        public static final class Builder {
            private Integer days; 
            private Long inviteId; 
            private String regUrl; 

            /**
             * <p>Valid days of registration URL, count on daily basis.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder days(Integer days) {
                this.days = days;
                return this;
            }

            /**
             * <p>Invitation ID, The invitation status tracking code.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder inviteId(Long inviteId) {
                this.inviteId = inviteId;
                return this;
            }

            /**
             * <p>URL for Partner Customer Registration.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://agency-intl.console.aliyun.com/customer/register?intl=true&fxinfo=-4uT%2FMWHnnUdvr5GXVd1AYK8luTnGgH3M7Y3lSCd5M1fxRwAkViTWtDJDpckh0HL">http://agency-intl.console.aliyun.com/customer/register?intl=true&amp;fxinfo=-4uT%2FMWHnnUdvr5GXVd1AYK8luTnGgH3M7Y3lSCd5M1fxRwAkViTWtDJDpckh0HL</a></p>
             */
            public Builder regUrl(String regUrl) {
                this.regUrl = regUrl;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link InviteSubAccountResponseBody} extends {@link TeaModel}
     *
     * <p>InviteSubAccountResponseBody</p>
     */
    public static class ResultsResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private ResultsResult(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.result = builder.result;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultsResult create() {
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
            private String code; 
            private String message; 
            private Result result; 
            private Boolean success; 

            /**
             * <p>Error Code, 200 OK</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Message, Notes of Code</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Returning Message of Invitation Results</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>Always true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public ResultsResult build() {
                return new ResultsResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link InviteSubAccountResponseBody} extends {@link TeaModel}
     *
     * <p>InviteSubAccountResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < ResultsResult> result;

        private Results(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List < ResultsResult> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List < ResultsResult> result; 

            /**
             * <p>Returning Message of Invitation Results</p>
             */
            public Builder result(java.util.List < ResultsResult> result) {
                this.result = result;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
