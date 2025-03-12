// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link CreateLayer4RuleRequest} extends {@link RequestModel}
 *
 * <p>CreateLayer4RuleRequest</p>
 */
public class CreateLayer4RuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Listeners")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listeners;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyEnable")
    private Integer proxyEnable;

    private CreateLayer4RuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listeners = builder.listeners;
        this.proxyEnable = builder.proxyEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLayer4RuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return listeners
     */
    public String getListeners() {
        return this.listeners;
    }

    /**
     * @return proxyEnable
     */
    public Integer getProxyEnable() {
        return this.proxyEnable;
    }

    public static final class Builder extends Request.Builder<CreateLayer4RuleRequest, Builder> {
        private String regionId; 
        private String listeners; 
        private Integer proxyEnable; 

        private Builder() {
            super();
        } 

        private Builder(CreateLayer4RuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listeners = request.listeners;
            this.proxyEnable = request.proxyEnable;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;InstanceId&quot;:&quot;xxxxxx-xxxxxx-xxxxxx-xxxxxxx&quot;,&quot;Protocol&quot;:&quot;tcp&quot;,&quot;FrontendPort&quot;:80,&quot;BackendPort&quot;:5,&quot;RealServers&quot;:&quot;1.1.1.1&quot;,&quot;2.2.2.2&quot;}]</p>
         */
        public Builder listeners(String listeners) {
            this.putQueryParameter("Listeners", listeners);
            this.listeners = listeners;
            return this;
        }

        /**
         * ProxyEnable.
         */
        public Builder proxyEnable(Integer proxyEnable) {
            this.putQueryParameter("ProxyEnable", proxyEnable);
            this.proxyEnable = proxyEnable;
            return this;
        }

        @Override
        public CreateLayer4RuleRequest build() {
            return new CreateLayer4RuleRequest(this);
        } 

    } 

}
