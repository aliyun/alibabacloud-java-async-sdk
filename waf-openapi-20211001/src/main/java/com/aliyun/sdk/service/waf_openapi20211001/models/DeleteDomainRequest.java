// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDomainRequest} extends {@link RequestModel}
 *
 * <p>DeleteDomainRequest</p>
 */
public class DeleteDomainRequest extends Request {
    @Query
    @NameInMap("AccessType")
    private String accessType;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("DomainId")
    private String domainId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteDomainRequest(Builder builder) {
        super(builder);
        this.accessType = builder.accessType;
        this.domain = builder.domain;
        this.domainId = builder.domainId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessType
     */
    public String getAccessType() {
        return this.accessType;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteDomainRequest, Builder> {
        private String accessType; 
        private String domain; 
        private String domainId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDomainRequest request) {
            super(request);
            this.accessType = request.accessType;
            this.domain = request.domain;
            this.domainId = request.domainId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The mode in which the domain name is added to WAF. Valid values:
         * <p>
         * 
         * *   **share:** CNAME record mode. This is the default value.
         * *   **hybrid_cloud_cname:** hybrid cloud reverse proxy mode.
         */
        public Builder accessType(String accessType) {
            this.putQueryParameter("AccessType", accessType);
            this.accessType = accessType;
            return this;
        }

        /**
         * The domain name that you want to delete.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The ID of the domain name.
         */
        public Builder domainId(String domainId) {
            this.putQueryParameter("DomainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The ID of the WAF instance.
         * <p>
         * 
         * >  You can call the [DescribeInstance](~~433756~~) operation to obtain the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region where the WAF instance resides. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou:** the Chinese mainland.
         * *   **ap-southeast-1:** outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteDomainRequest build() {
            return new DeleteDomainRequest(this);
        } 

    } 

}
