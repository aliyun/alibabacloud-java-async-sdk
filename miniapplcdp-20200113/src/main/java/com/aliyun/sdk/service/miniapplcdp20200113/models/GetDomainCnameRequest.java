// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDomainCnameRequest} extends {@link RequestModel}
 *
 * <p>GetDomainCnameRequest</p>
 */
public class GetDomainCnameRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("DomainType")
    @Validation(required = true)
    private String domainType;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true)
    private String envId;

    @Query
    @NameInMap("Source")
    private String source;

    private GetDomainCnameRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.domain = builder.domain;
        this.domainType = builder.domainType;
        this.envId = builder.envId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainCnameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return domainType
     */
    public String getDomainType() {
        return this.domainType;
    }

    /**
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<GetDomainCnameRequest, Builder> {
        private String appId; 
        private String domain; 
        private String domainType; 
        private String envId; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(GetDomainCnameRequest request) {
            super(request);
            this.appId = request.appId;
            this.domain = request.domain;
            this.domainType = request.domainType;
            this.envId = request.envId;
            this.source = request.source;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * DomainType.
         */
        public Builder domainType(String domainType) {
            this.putQueryParameter("DomainType", domainType);
            this.domainType = domainType;
            return this;
        }

        /**
         * EnvId.
         */
        public Builder envId(String envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public GetDomainCnameRequest build() {
            return new GetDomainCnameRequest(this);
        } 

    } 

}
