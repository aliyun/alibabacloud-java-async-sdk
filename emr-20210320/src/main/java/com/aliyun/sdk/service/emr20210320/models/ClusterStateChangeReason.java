// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClusterStateChangeReason} extends {@link TeaModel}
 *
 * <p>ClusterStateChangeReason</p>
 */
public class ClusterStateChangeReason extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    private ClusterStateChangeReason(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClusterStateChangeReason create() {
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

    public static final class Builder {
        private String code; 
        private String message; 

        /**
         * 状态码。取值范围：
         * <p>
         * - UserRequest：用户请求。
         * - OutOfStock：请求的ECS实例类型无库存。
         * - NotAuthorized：无权限。
         * - QuotaExceeded：Quota超出。
         * - OperationDenied：操作被拒绝。
         * - AccountException：账号异常。
         * - NodeFailure：ECS节点异常。
         * - BootstrapFailure：引导失败。
         * - ValidationFail：业务逻辑校验失败。
         * - ServiceFailure：依赖的其他服务失败。
         * - InternalError：内部错误。
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 状态变化信息。
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public ClusterStateChangeReason build() {
            return new ClusterStateChangeReason(this);
        } 

    } 

}
