// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(InviteSubAccountResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.results = model.results;
            this.success = model.success;
        } 

        /**
         * <p>The fault code. Valid values:</p>
         * <ul>
         * <li>200: OK.</li>
         * <li>1109: System Error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>成功</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud uses this ID for fault tracking.</p>
         * 
         * <strong>example:</strong>
         * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Results.
         */
        public Builder results(Results results) {
            this.results = results;
            return this;
        }

        /**
         * <p>Indicates whether the current API invocation is successful. Valid values: True and False. This does not indicate whether the subsequent business operation is successful.</p>
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.days = model.days;
                this.inviteId = model.inviteId;
                this.regUrl = model.regUrl;
            } 

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

            private Builder() {
            } 

            private Builder(ResultsResult model) {
                this.code = model.code;
                this.message = model.message;
                this.result = model.result;
                this.success = model.success;
            } 

            /**
             * <p>The fault code. Valid values:</p>
             * <ul>
             * <li>200: OK.</li>
             * <li>1109: System Error.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>成功</p>
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
             * <p>Indicates whether the current API invocation is successful. Valid values: True and False. This does not indicate whether the subsequent business operation is successful.</p>
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
        private java.util.List<ResultsResult> result;

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
        public java.util.List<ResultsResult> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List<ResultsResult> result; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.result = model.result;
            } 

            /**
             * Result.
             */
            public Builder result(java.util.List<ResultsResult> result) {
                this.result = result;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
