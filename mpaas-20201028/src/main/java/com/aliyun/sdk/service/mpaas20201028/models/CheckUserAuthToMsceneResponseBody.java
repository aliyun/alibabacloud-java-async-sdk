// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link CheckUserAuthToMsceneResponseBody} extends {@link TeaModel}
 *
 * <p>CheckUserAuthToMsceneResponseBody</p>
 */
public class CheckUserAuthToMsceneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MpaasUserAuthCheckResponse")
    private MpaasUserAuthCheckResponse mpaasUserAuthCheckResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMsg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CheckUserAuthToMsceneResponseBody(Builder builder) {
        this.mpaasUserAuthCheckResponse = builder.mpaasUserAuthCheckResponse;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUserAuthToMsceneResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mpaasUserAuthCheckResponse
     */
    public MpaasUserAuthCheckResponse getMpaasUserAuthCheckResponse() {
        return this.mpaasUserAuthCheckResponse;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private MpaasUserAuthCheckResponse mpaasUserAuthCheckResponse; 
        private String requestId; 
        private String resultCode; 
        private String resultMsg; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CheckUserAuthToMsceneResponseBody model) {
            this.mpaasUserAuthCheckResponse = model.mpaasUserAuthCheckResponse;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMsg = model.resultMsg;
            this.success = model.success;
        } 

        /**
         * MpaasUserAuthCheckResponse.
         */
        public Builder mpaasUserAuthCheckResponse(MpaasUserAuthCheckResponse mpaasUserAuthCheckResponse) {
            this.mpaasUserAuthCheckResponse = mpaasUserAuthCheckResponse;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * ResultMsg.
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CheckUserAuthToMsceneResponseBody build() {
            return new CheckUserAuthToMsceneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckUserAuthToMsceneResponseBody} extends {@link TeaModel}
     *
     * <p>CheckUserAuthToMsceneResponseBody</p>
     */
    public static class MpaasUserAuthCheckResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Matched")
        private Boolean matched;

        private MpaasUserAuthCheckResponse(Builder builder) {
            this.matched = builder.matched;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MpaasUserAuthCheckResponse create() {
            return builder().build();
        }

        /**
         * @return matched
         */
        public Boolean getMatched() {
            return this.matched;
        }

        public static final class Builder {
            private Boolean matched; 

            private Builder() {
            } 

            private Builder(MpaasUserAuthCheckResponse model) {
                this.matched = model.matched;
            } 

            /**
             * Matched.
             */
            public Builder matched(Boolean matched) {
                this.matched = matched;
                return this;
            }

            public MpaasUserAuthCheckResponse build() {
                return new MpaasUserAuthCheckResponse(this);
            } 

        } 

    }
}
