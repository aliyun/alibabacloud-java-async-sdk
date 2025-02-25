// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link CloneNacosConfigRequest} extends {@link RequestModel}
 *
 * <p>CloneNacosConfigRequest</p>
 */
public class CloneNacosConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataIds")
    private String dataIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    @Deprecated
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginNamespaceId")
    private String originNamespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetNamespaceId")
    private String targetNamespaceId;

    private CloneNacosConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.dataIds = builder.dataIds;
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
     * @return dataIds
     */
    public String getDataIds() {
        return this.dataIds;
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
        private String dataIds; 
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
            this.dataIds = request.dataIds;
            this.ids = request.ids;
            this.instanceId = request.instanceId;
            this.originNamespaceId = request.originNamespaceId;
            this.policy = request.policy;
            this.targetNamespaceId = request.targetNamespaceId;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The configuration items that you want to clone. The value of this parameter is the combination of the values of the dataId and group parameters. Separate multiple configuration items with commas (,).</p>
         */
        public Builder dataIds(String dataIds) {
            this.putQueryParameter("DataIds", dataIds);
            this.dataIds = dataIds;
            return this;
        }

        /**
         * <p>The list of configuration IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>253661,253662</p>
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * <p>The ID of the destination namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_prepaid_public_cn-i7m25igg403</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The policy used when a write conflict occurs.</p>
         * <ul>
         * <li>ABORT</li>
         * <li>SKIP</li>
         * <li>OVERWRITE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>be821963-6d48-4ea5-9910-6057d****</p>
         */
        public Builder originNamespaceId(String originNamespaceId) {
            this.putQueryParameter("OriginNamespaceId", originNamespaceId);
            this.originNamespaceId = originNamespaceId;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OVERWRITE</p>
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>The IDs of configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>08be4b5d-2d1c-4e6e-aa85-83b9****</p>
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
