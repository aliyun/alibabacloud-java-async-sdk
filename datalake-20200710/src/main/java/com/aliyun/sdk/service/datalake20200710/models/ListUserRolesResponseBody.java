// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserRolesResponseBody</p>
 */
public class ListUserRolesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("NextPageToken")
    private String nextPageToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("UserRoles")
    private java.util.List < UserRole > userRoles;

    private ListUserRolesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.nextPageToken = builder.nextPageToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.userRoles = builder.userRoles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserRolesResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return userRoles
     */
    public java.util.List < UserRole > getUserRoles() {
        return this.userRoles;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String nextPageToken; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < UserRole > userRoles; 

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
         * NextPageToken
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Data
         */
        public Builder userRoles(java.util.List < UserRole > userRoles) {
            this.userRoles = userRoles;
            return this;
        }

        public ListUserRolesResponseBody build() {
            return new ListUserRolesResponseBody(this);
        } 

    } 

}
