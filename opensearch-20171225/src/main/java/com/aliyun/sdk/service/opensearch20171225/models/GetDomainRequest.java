// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDomainRequest} extends {@link RequestModel}
 *
 * <p>GetDomainRequest</p>
 */
public class GetDomainRequest extends Request {
    @Path
    @NameInMap("domainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
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
         * N/A
         */
        public Builder domainName(String domainName) {
            this.putPathParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * my_app_group_name
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
