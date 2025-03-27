// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CheckAssumeSlrRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CheckAssumeSlrRoleResponseBody</p>
 */
public class CheckAssumeSlrRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("IsExist")
    private String isExist;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckAssumeSlrRoleResponseBody(Builder builder) {
        this.errorMsg = builder.errorMsg;
        this.isExist = builder.isExist;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAssumeSlrRoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return isExist
     */
    public String getIsExist() {
        return this.isExist;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String errorMsg; 
        private String isExist; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckAssumeSlrRoleResponseBody model) {
            this.errorMsg = model.errorMsg;
            this.isExist = model.isExist;
            this.requestId = model.requestId;
        } 

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * IsExist.
         */
        public Builder isExist(String isExist) {
            this.isExist = isExist;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>34DCBC8A-<strong><strong>-</strong></strong>-****-6DAA11D7DDBD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckAssumeSlrRoleResponseBody build() {
            return new CheckAssumeSlrRoleResponseBody(this);
        } 

    } 

}
