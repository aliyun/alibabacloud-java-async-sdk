// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserGroupMembersResponseBody} extends {@link TeaModel}
 *
 * <p>AddUserGroupMembersResponseBody</p>
 */
public class AddUserGroupMembersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Boolean result;

    @NameInMap("Success")
    private Boolean success;

    private AddUserGroupMembersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserGroupMembersResponseBody create() {
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
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 接口执行结果。取值范围：true：请求成功false：请求失败
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        /**
         * 是否请求成功。取值范围：true：请求成功false：请求失败
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddUserGroupMembersResponseBody build() {
            return new AddUserGroupMembersResponseBody(this);
        } 

    } 

}
