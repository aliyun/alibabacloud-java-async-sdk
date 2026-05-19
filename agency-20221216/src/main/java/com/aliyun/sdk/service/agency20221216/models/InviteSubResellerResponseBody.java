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
 * {@link InviteSubResellerResponseBody} extends {@link TeaModel}
 *
 * <p>InviteSubResellerResponseBody</p>
 */
public class InviteSubResellerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private InviteSubResellerResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InviteSubResellerResponseBody create() {
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
    public java.util.List<Results> getResults() {
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
        private java.util.List<Results> results; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(InviteSubResellerResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.results = model.results;
            this.success = model.success;
        } 

        /**
         * <p>Result code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Message.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>邀请结果信息</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public InviteSubResellerResponseBody build() {
            return new InviteSubResellerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InviteSubResellerResponseBody} extends {@link TeaModel}
     *
     * <p>InviteSubResellerResponseBody</p>
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
             * <p>Validity period of the registration URL, in days</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder days(Integer days) {
                this.days = days;
                return this;
            }

            /**
             * <p>Invitation ID, used for querying the invitation status</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder inviteId(Long inviteId) {
                this.inviteId = inviteId;
                return this;
            }

            /**
             * <p>T2 Reseller registration URL</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://agency-intl.console.aliyun.com/customer/register?intl=true&fxinfo=XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX">http://agency-intl.console.aliyun.com/customer/register?intl=true&amp;fxinfo=XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</a></p>
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
     * {@link InviteSubResellerResponseBody} extends {@link TeaModel}
     *
     * <p>InviteSubResellerResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("Success")
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

            private Builder() {
            } 

            private Builder(Results model) {
                this.code = model.code;
                this.message = model.message;
                this.result = model.result;
                this.success = model.success;
            } 

            /**
             * <p>Error code, 200 OK</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Prompt message, explanation of the code</p>
             * 
             * <strong>example:</strong>
             * <p>成功</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Returned invitation result information</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>Always true</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
