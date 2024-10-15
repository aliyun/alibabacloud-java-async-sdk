// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>状态码。取值范围：</p>
         * <ul>
         * <li>UserRequest：用户请求。</li>
         * <li>OutOfStock：请求的ECS实例类型无库存。</li>
         * <li>NotAuthorized：无权限。</li>
         * <li>QuotaExceeded：Quota超出。</li>
         * <li>OperationDenied：操作被拒绝。</li>
         * <li>AccountException：账号异常。</li>
         * <li>NodeFailure：ECS节点异常。</li>
         * <li>BootstrapFailure：引导失败。</li>
         * <li>ValidationFail：业务逻辑校验失败。</li>
         * <li>ServiceFailure：依赖的其他服务失败。</li>
         * <li>InternalError：内部错误。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OutOfStock</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>状态变化信息。</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource is sold out in the specified zone, try other types of resources or other regions and zones.</p>
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
