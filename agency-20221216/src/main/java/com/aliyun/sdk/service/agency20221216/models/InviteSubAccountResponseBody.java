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
    private java.util.List < Results> results;

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
    public java.util.List < Results> getResults() {
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
        private java.util.List < Results> results; 
        private Boolean success; 

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
         * Results.
         */
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        /**
         * Success.
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
             * Days.
             */
            public Builder days(Integer days) {
                this.days = days;
                return this;
            }

            /**
             * InviteId.
             */
            public Builder inviteId(Long inviteId) {
                this.inviteId = inviteId;
                return this;
            }

            /**
             * RegUrl.
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
    public static class Results extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
        private String message;

        @NameInMap("Result")
        private Result result;

        @NameInMap("Success")
        private Boolean success;

        private Results(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.result = builder.result;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
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

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
