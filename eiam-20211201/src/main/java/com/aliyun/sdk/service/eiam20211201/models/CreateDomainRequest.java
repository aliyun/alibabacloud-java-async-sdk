// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateDomainRequest</p>
 */
public class CreateDomainRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("Filing")
    private Filing filing;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    private CreateDomainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.filing = builder.filing;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDomainRequest create() {
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return filing
     */
    public Filing getFiling() {
        return this.filing;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateDomainRequest, Builder> {
        private String regionId; 
        private String domain; 
        private Filing filing; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDomainRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.filing = request.filing;
            this.instanceId = request.instanceId;
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
         * 域名。最大长度限制255，格式由数字、字母、横线（-）点（.）组成;
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * 备案信息参数。
         */
        public Builder filing(Filing filing) {
            this.putQueryParameter("Filing", filing);
            this.filing = filing;
            return this;
        }

        /**
         * IDaaS EIAM实例的ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public CreateDomainRequest build() {
            return new CreateDomainRequest(this);
        } 

    } 

    public static class Filing extends TeaModel {
        @NameInMap("IcpNumber")
        private String icpNumber;

        private Filing(Builder builder) {
            this.icpNumber = builder.icpNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filing create() {
            return builder().build();
        }

        /**
         * @return icpNumber
         */
        public String getIcpNumber() {
            return this.icpNumber;
        }

        public static final class Builder {
            private String icpNumber; 

            /**
             * 域名关联的备案号，长度最大限制64。
             */
            public Builder icpNumber(String icpNumber) {
                this.icpNumber = icpNumber;
                return this;
            }

            public Filing build() {
                return new Filing(this);
            } 

        } 

    }
}
