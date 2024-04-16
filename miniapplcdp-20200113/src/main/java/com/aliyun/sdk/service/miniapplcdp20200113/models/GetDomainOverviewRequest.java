// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDomainOverviewRequest} extends {@link RequestModel}
 *
 * <p>GetDomainOverviewRequest</p>
 */
public class GetDomainOverviewRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true)
    private String envId;

    @Query
    @NameInMap("Source")
    private String source;

    private GetDomainOverviewRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.domain = builder.domain;
        this.envId = builder.envId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainOverviewRequest create() {
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

    public static final class Builder extends Request.Builder<GetDomainOverviewRequest, Builder> {
        private String appId; 
        private String domain; 
        private String envId; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(GetDomainOverviewRequest request) {
            super(request);
            this.appId = request.appId;
            this.domain = request.domain;
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
        public GetDomainOverviewRequest build() {
            return new GetDomainOverviewRequest(this);
        } 

    } 

}
