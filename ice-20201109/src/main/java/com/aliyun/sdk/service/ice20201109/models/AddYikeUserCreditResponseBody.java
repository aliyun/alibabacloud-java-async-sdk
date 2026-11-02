// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link AddYikeUserCreditResponseBody} extends {@link TeaModel}
 *
 * <p>AddYikeUserCreditResponseBody</p>
 */
public class AddYikeUserCreditResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    private AddYikeUserCreditResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddYikeUserCreditResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String errorCode; 
        private String requestId; 
        private Boolean result; 

        private Builder() {
        } 

        private Builder(AddYikeUserCreditResponseBody model) {
            this.errorCode = model.errorCode;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The error code. This parameter is returned when the increase fails. Valid values:</p>
         * <ul>
         * <li>NOT_ENOUGH_ALLOCATE_CREDIT_QUOTA: The credit balance of the Alibaba Cloud account is insufficient.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NOT_ENOUGH_ALLOCATE_CREDIT_QUOTA</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the credits are increased successfully. Valid values:</p>
         * <ul>
         * <li>true: Succeeded.</li>
         * <li>false: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public AddYikeUserCreditResponseBody build() {
            return new AddYikeUserCreditResponseBody(this);
        } 

    } 

}
