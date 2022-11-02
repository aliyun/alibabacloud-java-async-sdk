// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainDetailRequest</p>
 */
public class DescribeDomainDetailRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DescribeDomainDetailRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DescribeDomainDetailRequest, Builder> {
        private String domain; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainDetailRequest request) {
            super(request);
            this.domain = request.domain;
            this.instanceId = request.instanceId;
        } 

        /**
         * 域名
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
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

        @Override
        public DescribeDomainDetailRequest build() {
            return new DescribeDomainDetailRequest(this);
        } 

    } 

}
