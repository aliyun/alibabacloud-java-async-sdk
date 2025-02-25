// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRolesResponseBody</p>
 */
public class ListRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Roles")
    private java.util.List < Role > roles;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListRolesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.nextPageToken = builder.nextPageToken;
        this.requestId = builder.requestId;
        this.roles = builder.roles;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRolesResponseBody create() {
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
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roles
     */
    public java.util.List < Role > getRoles() {
        return this.roles;
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
        private String nextPageToken; 
        private String requestId; 
        private java.util.List < Role > roles; 
        private Boolean success; 

        /**
         * code
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * data
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * role list data
         */
        public Builder roles(java.util.List < Role > roles) {
            this.roles = roles;
            return this;
        }

        /**
         * success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRolesResponseBody build() {
            return new ListRolesResponseBody(this);
        } 

    } 

}
