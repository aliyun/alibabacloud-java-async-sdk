// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InviteSubAccountResponseBody} extends {@link TeaModel}
 *
 * <p>InviteSubAccountResponseBody</p>
 */
public class InviteSubAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Results")
    private Results results;

    @NameInMap("Success")
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
         * Error Code: </br>
         * <p>
         * • 200 OK</br>
         * • 1109 System Error</br>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message</br>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Request ID, Alibaba Cloud will track errors with this ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * List of invitation sending results
         */
        public Builder results(Results results) {
            this.results = results;
            return this;
        }

        /**
         * Candidate Values: True/False, this value states if the current API calling action is successful. It does not guarantee the success of subsequent business operations.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public InviteSubAccountResponseBody build() {
            return new InviteSubAccountResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Days")
        private Integer days;

        @NameInMap("InviteId")
        private Long inviteId;

        @NameInMap("RegUrl")
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
             * Valid days of registration URL, count on daily basis.
             */
            public Builder days(Integer days) {
                this.days = days;
                return this;
            }

            /**
             * Invitation ID, The invitation status tracking code.
             */
            public Builder inviteId(Long inviteId) {
                this.inviteId = inviteId;
                return this;
            }

            /**
             * URL for Partner Customer Registration.
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
    public static class ResultsResult extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
        private String message;

        @NameInMap("Result")
        private Result result;

        @NameInMap("Success")
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
             * Error Code, 200 OK
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Message, Notes of Code
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Returning Message of Invitation Results
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * Always true.
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
    public static class Results extends TeaModel {
        @NameInMap("Result")
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
             * Returning Message of Invitation Results
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
