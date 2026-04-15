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
 * {@link QueryUserInfoToMsenceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserInfoToMsenceResponseBody</p>
 */
public class QueryUserInfoToMsenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MpaasUserInfoShareResponse")
    private MpaasUserInfoShareResponse mpaasUserInfoShareResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMsg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryUserInfoToMsenceResponseBody(Builder builder) {
        this.mpaasUserInfoShareResponse = builder.mpaasUserInfoShareResponse;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserInfoToMsenceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mpaasUserInfoShareResponse
     */
    public MpaasUserInfoShareResponse getMpaasUserInfoShareResponse() {
        return this.mpaasUserInfoShareResponse;
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
        private MpaasUserInfoShareResponse mpaasUserInfoShareResponse; 
        private String requestId; 
        private String resultCode; 
        private String resultMsg; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryUserInfoToMsenceResponseBody model) {
            this.mpaasUserInfoShareResponse = model.mpaasUserInfoShareResponse;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMsg = model.resultMsg;
            this.success = model.success;
        } 

        /**
         * MpaasUserInfoShareResponse.
         */
        public Builder mpaasUserInfoShareResponse(MpaasUserInfoShareResponse mpaasUserInfoShareResponse) {
            this.mpaasUserInfoShareResponse = mpaasUserInfoShareResponse;
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

        public QueryUserInfoToMsenceResponseBody build() {
            return new QueryUserInfoToMsenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryUserInfoToMsenceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUserInfoToMsenceResponseBody</p>
     */
    public static class MpaasUserInfoShareResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("Gender")
        private String gender;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        private MpaasUserInfoShareResponse(Builder builder) {
            this.avatar = builder.avatar;
            this.gender = builder.gender;
            this.nickName = builder.nickName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MpaasUserInfoShareResponse create() {
            return builder().build();
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        public static final class Builder {
            private String avatar; 
            private String gender; 
            private String nickName; 

            private Builder() {
            } 

            private Builder(MpaasUserInfoShareResponse model) {
                this.avatar = model.avatar;
                this.gender = model.gender;
                this.nickName = model.nickName;
            } 

            /**
             * Avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * Gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            public MpaasUserInfoShareResponse build() {
                return new MpaasUserInfoShareResponse(this);
            } 

        } 

    }
}
