// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link GetUserByDeviceIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserByDeviceIdResponseBody</p>
 */
public class GetUserByDeviceIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetUserByDeviceIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserByDeviceIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetUserByDeviceIdResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The error code returned. A value of 200 indicates that the call succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The return result of invoking this API.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0EC7*726E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of user information returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetUserByDeviceIdResponseBody build() {
            return new GetUserByDeviceIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserByDeviceIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserByDeviceIdResponseBody</p>
     */
    public static class UserUnionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("UserUnionId")
        private String userUnionId;

        private UserUnionIds(Builder builder) {
            this.organizationId = builder.organizationId;
            this.userUnionId = builder.userUnionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserUnionIds create() {
            return builder().build();
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return userUnionId
         */
        public String getUserUnionId() {
            return this.userUnionId;
        }

        public static final class Builder {
            private String organizationId; 
            private String userUnionId; 

            private Builder() {
            } 

            private Builder(UserUnionIds model) {
                this.organizationId = model.organizationId;
                this.userUnionId = model.userUnionId;
            } 

            /**
             * <p>The organization ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1**2</p>
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * <p>The user&quot;s UnionID.</p>
             * 
             * <strong>example:</strong>
             * <p>1553*B0C3</p>
             */
            public Builder userUnionId(String userUnionId) {
                this.userUnionId = userUnionId;
                return this;
            }

            public UserUnionIds build() {
                return new UserUnionIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUserByDeviceIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserByDeviceIdResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserOpenId")
        private String userOpenId;

        @com.aliyun.core.annotation.NameInMap("UserUnionIds")
        private java.util.List<UserUnionIds> userUnionIds;

        private Result(Builder builder) {
            this.userOpenId = builder.userOpenId;
            this.userUnionIds = builder.userUnionIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return userOpenId
         */
        public String getUserOpenId() {
            return this.userOpenId;
        }

        /**
         * @return userUnionIds
         */
        public java.util.List<UserUnionIds> getUserUnionIds() {
            return this.userUnionIds;
        }

        public static final class Builder {
            private String userOpenId; 
            private java.util.List<UserUnionIds> userUnionIds; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.userOpenId = model.userOpenId;
                this.userUnionIds = model.userUnionIds;
            } 

            /**
             * <p>The openID corresponding to the user information.</p>
             * 
             * <strong>example:</strong>
             * <p>0963*0158</p>
             */
            public Builder userOpenId(String userOpenId) {
                this.userOpenId = userOpenId;
                return this;
            }

            /**
             * <p>The list of organization IDs and UnionIDs for the user.</p>
             */
            public Builder userUnionIds(java.util.List<UserUnionIds> userUnionIds) {
                this.userUnionIds = userUnionIds;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
