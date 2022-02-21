// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DissociateAclsFromListenerRequest} extends {@link RequestModel}
 *
 * <p>DissociateAclsFromListenerRequest</p>
 */
public class DissociateAclsFromListenerRequest extends Request {
    @Query
    @NameInMap("AclIds")
    @Validation(required = true)
    private java.util.List < String > aclIds;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    private DissociateAclsFromListenerRequest(Builder builder) {
        super(builder);
        this.aclIds = builder.aclIds;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.listenerId = builder.listenerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DissociateAclsFromListenerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclIds
     */
    public java.util.List < String > getAclIds() {
        return this.aclIds;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    public static final class Builder extends Request.Builder<DissociateAclsFromListenerRequest, Builder> {
        private java.util.List < String > aclIds; 
        private String clientToken; 
        private Boolean dryRun; 
        private String listenerId; 

        private Builder() {
            super();
        } 

        private Builder(DissociateAclsFromListenerRequest response) {
            super(response);
            this.aclIds = response.aclIds;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.listenerId = response.listenerId;
        } 

        /**
         * 访问控制策略Id
         */
        public Builder aclIds(java.util.List < String > aclIds) {
            this.putQueryParameter("AclIds", aclIds);
            this.aclIds = aclIds;
            return this;
        }

        /**
         * 幂等标识
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 预检此次请求
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 监听Id
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        @Override
        public DissociateAclsFromListenerRequest build() {
            return new DissociateAclsFromListenerRequest(this);
        } 

    } 

}
