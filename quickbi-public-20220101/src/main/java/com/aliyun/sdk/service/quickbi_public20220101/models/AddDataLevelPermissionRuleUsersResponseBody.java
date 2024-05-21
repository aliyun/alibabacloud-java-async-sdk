// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDataLevelPermissionRuleUsersResponseBody} extends {@link TeaModel}
 *
 * <p>AddDataLevelPermissionRuleUsersResponseBody</p>
 */
public class AddDataLevelPermissionRuleUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AddDataLevelPermissionRuleUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDataLevelPermissionRuleUsersResponseBody create() {
        return builder().build();
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean result; 
        private Boolean success; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The execution result of the interface. Valid values:\n\n*   true: The request was successful.\n*   false: The request failed.\n
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:\n\n*   true: The request was successful.\n*   false: The request failed.\n
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddDataLevelPermissionRuleUsersResponseBody build() {
            return new AddDataLevelPermissionRuleUsersResponseBody(this);
        } 

    } 

}
