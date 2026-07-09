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
 * {@link GetInstanceCustomizedDomainResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceCustomizedDomainResponseBody</p>
 */
public class GetInstanceCustomizedDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertId")
    private String certId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("DomainType")
    private String domainType;

    @com.aliyun.core.annotation.NameInMap("EndpointType")
    private String endpointType;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("ModifiedTime")
    private Long modifiedTime;

    @com.aliyun.core.annotation.NameInMap("ModuleName")
    private String moduleName;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInstanceCustomizedDomainResponseBody(Builder builder) {
        this.certId = builder.certId;
        this.code = builder.code;
        this.createTime = builder.createTime;
        this.domain = builder.domain;
        this.domainType = builder.domainType;
        this.endpointType = builder.endpointType;
        this.instanceId = builder.instanceId;
        this.isSuccess = builder.isSuccess;
        this.modifiedTime = builder.modifiedTime;
        this.moduleName = builder.moduleName;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceCustomizedDomainResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certId
     */
    public String getCertId() {
        return this.certId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
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
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return modifiedTime
     */
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String certId; 
        private String code; 
        private Long createTime; 
        private String domain; 
        private String domainType; 
        private String endpointType; 
        private String instanceId; 
        private Boolean isSuccess; 
        private Long modifiedTime; 
        private String moduleName; 
        private String regionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInstanceCustomizedDomainResponseBody model) {
            this.certId = model.certId;
            this.code = model.code;
            this.createTime = model.createTime;
            this.domain = model.domain;
            this.domainType = model.domainType;
            this.endpointType = model.endpointType;
            this.instanceId = model.instanceId;
            this.isSuccess = model.isSuccess;
            this.modifiedTime = model.modifiedTime;
            this.moduleName = model.moduleName;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
        } 

        /**
         * CertId.
         */
        public Builder certId(String certId) {
            this.certId = certId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * DomainType.
         */
        public Builder domainType(String domainType) {
            this.domainType = domainType;
            return this;
        }

        /**
         * EndpointType.
         */
        public Builder endpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * ModifiedTime.
         */
        public Builder modifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * ModuleName.
         */
        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceCustomizedDomainResponseBody build() {
            return new GetInstanceCustomizedDomainResponseBody(this);
        } 

    } 

}
