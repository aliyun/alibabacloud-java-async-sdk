// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link InitializeDbsServiceLinkedRoleResponseBody} extends {@link TeaModel}
 *
 * <p>InitializeDbsServiceLinkedRoleResponseBody</p>
 */
public class InitializeDbsServiceLinkedRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private InitializeDbsServiceLinkedRoleResponseBody(Builder builder) {
        this.data = builder.data;
        this.errMessage = builder.errMessage;
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeDbsServiceLinkedRoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String data; 
        private String errMessage; 
        private String errorCode; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(InitializeDbsServiceLinkedRoleResponseBody model) {
            this.data = model.data;
            this.errMessage = model.errMessage;
            this.errorCode = model.errorCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The value is null.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>EntityAlreadyExists.Role : The role already exists:AliyunServiceRoleForDBS\r\nRequestId : 73******-3B4D-501A-9505-FA8B9******</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>EntityAlreadyExists.Role</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4F1888AC-1138-4995-B9FE-D2734F61C058</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public InitializeDbsServiceLinkedRoleResponseBody build() {
            return new InitializeDbsServiceLinkedRoleResponseBody(this);
        } 

    } 

}
