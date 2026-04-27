// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudAgentLogoutRequest} extends {@link RequestModel}
 *
 * <p>CloudAgentLogoutRequest</p>
 */
public class CloudAgentLogoutRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cno")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreOffline")
    private Long ignoreOffline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsKickout")
    private Long isKickout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoveBinding")
    private Long removeBinding;

    private CloudAgentLogoutRequest(Builder builder) {
        super(builder);
        this.cno = builder.cno;
        this.enterpriseId = builder.enterpriseId;
        this.ignoreOffline = builder.ignoreOffline;
        this.isKickout = builder.isKickout;
        this.removeBinding = builder.removeBinding;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudAgentLogoutRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cno
     */
    public String getCno() {
        return this.cno;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return ignoreOffline
     */
    public Long getIgnoreOffline() {
        return this.ignoreOffline;
    }

    /**
     * @return isKickout
     */
    public Long getIsKickout() {
        return this.isKickout;
    }

    /**
     * @return removeBinding
     */
    public Long getRemoveBinding() {
        return this.removeBinding;
    }

    public static final class Builder extends Request.Builder<CloudAgentLogoutRequest, Builder> {
        private String cno; 
        private Long enterpriseId; 
        private Long ignoreOffline; 
        private Long isKickout; 
        private Long removeBinding; 

        private Builder() {
            super();
        } 

        private Builder(CloudAgentLogoutRequest request) {
            super(request);
            this.cno = request.cno;
            this.enterpriseId = request.enterpriseId;
            this.ignoreOffline = request.ignoreOffline;
            this.isKickout = request.isKickout;
            this.removeBinding = request.removeBinding;
        } 

        /**
         * <p>座席工号；取值3-10位正整数</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder cno(String cno) {
            this.putQueryParameter("Cno", cno);
            this.cno = cno;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>是否忽略重复下线报错；取值：0:不忽略 1:忽略 默认为0，不忽略</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ignoreOffline(Long ignoreOffline) {
            this.putQueryParameter("IgnoreOffline", ignoreOffline);
            this.ignoreOffline = ignoreOffline;
            return this;
        }

        /**
         * <p>是否给座席发生kickout事件；取值： 0:不发送， 1:发送 默认为1，发送</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isKickout(Long isKickout) {
            this.putQueryParameter("IsKickout", isKickout);
            this.isKickout = isKickout;
            return this;
        }

        /**
         * <p>取值： 0:不解除绑定电话， 1:解除绑定电话 默认为0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder removeBinding(Long removeBinding) {
            this.putQueryParameter("RemoveBinding", removeBinding);
            this.removeBinding = removeBinding;
            return this;
        }

        @Override
        public CloudAgentLogoutRequest build() {
            return new CloudAgentLogoutRequest(this);
        } 

    } 

}
