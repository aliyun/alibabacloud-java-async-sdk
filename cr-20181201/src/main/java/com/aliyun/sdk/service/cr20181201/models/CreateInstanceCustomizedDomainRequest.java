// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link CreateInstanceCustomizedDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceCustomizedDomainRequest</p>
 */
public class CreateInstanceCustomizedDomainRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertRegionId")
    private String certRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleName;

    private CreateInstanceCustomizedDomainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.certId = builder.certId;
        this.certRegionId = builder.certRegionId;
        this.domain = builder.domain;
        this.instanceId = builder.instanceId;
        this.moduleName = builder.moduleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceCustomizedDomainRequest create() {
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
     * @return certId
     */
    public String getCertId() {
        return this.certId;
    }

    /**
     * @return certRegionId
     */
    public String getCertRegionId() {
        return this.certRegionId;
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

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    public static final class Builder extends Request.Builder<CreateInstanceCustomizedDomainRequest, Builder> {
        private String regionId; 
        private String certId; 
        private String certRegionId; 
        private String domain; 
        private String instanceId; 
        private String moduleName; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceCustomizedDomainRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.certId = request.certId;
            this.certRegionId = request.certRegionId;
            this.domain = request.domain;
            this.instanceId = request.instanceId;
            this.moduleName = request.moduleName;
        } 

        /**
         * <p>This parameter is required.</p>
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
         * <p>21428921</p>
         */
        public Builder certId(String certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        /**
         * CertRegionId.
         */
        public Builder certRegionId(String certRegionId) {
            this.putQueryParameter("CertRegionId", certRegionId);
            this.certRegionId = certRegionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Registry</p>
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        @Override
        public CreateInstanceCustomizedDomainRequest build() {
            return new CreateInstanceCustomizedDomainRequest(this);
        } 

    } 

}
