// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDomainRequest} extends {@link RequestModel}
 *
 * <p>GetDomainRequest</p>
 */
public class GetDomainRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("domainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    private GetDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.appGroupIdentity = builder.appGroupIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    public static final class Builder extends Request.Builder<GetDomainRequest, Builder> {
        private String domainName; 
        private String appGroupIdentity; 

        private Builder() {
            super();
        } 

        private Builder(GetDomainRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.appGroupIdentity = request.appGroupIdentity;
        } 

        /**
         * The type of the industry.
         */
        public Builder domainName(String domainName) {
            this.putPathParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The name or ID of the application.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putQueryParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        @Override
        public GetDomainRequest build() {
            return new GetDomainRequest(this);
        } 

    } 

}
