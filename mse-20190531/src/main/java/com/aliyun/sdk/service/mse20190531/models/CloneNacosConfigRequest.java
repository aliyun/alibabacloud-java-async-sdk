// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneNacosConfigRequest} extends {@link RequestModel}
 *
 * <p>CloneNacosConfigRequest</p>
 */
public class CloneNacosConfigRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("Ids")
    @Validation(required = true)
    private String ids;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OriginNamespaceId")
    private String originNamespaceId;

    @Query
    @NameInMap("Policy")
    @Validation(required = true)
    private String policy;

    @Query
    @NameInMap("TargetNamespaceId")
    private String targetNamespaceId;

    private CloneNacosConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.ids = builder.ids;
        this.instanceId = builder.instanceId;
        this.originNamespaceId = builder.originNamespaceId;
        this.policy = builder.policy;
        this.targetNamespaceId = builder.targetNamespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneNacosConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return originNamespaceId
     */
    public String getOriginNamespaceId() {
        return this.originNamespaceId;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return targetNamespaceId
     */
    public String getTargetNamespaceId() {
        return this.targetNamespaceId;
    }

    public static final class Builder extends Request.Builder<CloneNacosConfigRequest, Builder> {
        private String acceptLanguage; 
        private String ids; 
        private String instanceId; 
        private String originNamespaceId; 
        private String policy; 
        private String targetNamespaceId; 

        private Builder() {
            super();
        } 

        private Builder(CloneNacosConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.ids = request.ids;
            this.instanceId = request.instanceId;
            this.originNamespaceId = request.originNamespaceId;
            this.policy = request.policy;
            this.targetNamespaceId = request.targetNamespaceId;
        } 

        /**
         * 返回结果显示的语言。取值：zh（默认值）：中文，en：英文
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Ids.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OriginNamespaceId.
         */
        public Builder originNamespaceId(String originNamespaceId) {
            this.putQueryParameter("OriginNamespaceId", originNamespaceId);
            this.originNamespaceId = originNamespaceId;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * TargetNamespaceId.
         */
        public Builder targetNamespaceId(String targetNamespaceId) {
            this.putQueryParameter("TargetNamespaceId", targetNamespaceId);
            this.targetNamespaceId = targetNamespaceId;
            return this;
        }

        @Override
        public CloneNacosConfigRequest build() {
            return new CloneNacosConfigRequest(this);
        } 

    } 

}
