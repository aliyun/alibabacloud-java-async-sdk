// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckSlrRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CheckSlrRoleResponseBody</p>
 */
public class CheckSlrRoleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Exist")
    private Boolean exist;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RequireOldWayCheck")
    private Boolean requireOldWayCheck;

    @NameInMap("Success")
    private Boolean success;

    private CheckSlrRoleResponseBody(Builder builder) {
        this.code = builder.code;
        this.exist = builder.exist;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.requireOldWayCheck = builder.requireOldWayCheck;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSlrRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return exist
     */
    public Boolean getExist() {
        return this.exist;
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
     * @return requireOldWayCheck
     */
    public Boolean getRequireOldWayCheck() {
        return this.requireOldWayCheck;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Boolean exist; 
        private String message; 
        private String requestId; 
        private Boolean requireOldWayCheck; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Exist.
         */
        public Builder exist(Boolean exist) {
            this.exist = exist;
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
         * RequireOldWayCheck.
         */
        public Builder requireOldWayCheck(Boolean requireOldWayCheck) {
            this.requireOldWayCheck = requireOldWayCheck;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CheckSlrRoleResponseBody build() {
            return new CheckSlrRoleResponseBody(this);
        } 

    } 

}
