// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link BindAppDomainRequest} extends {@link RequestModel}
 *
 * <p>BindAppDomainRequest</p>
 */
public class BindAppDomainRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployType")
    private String deployType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainType")
    private String domainType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    private String operateType;

    private BindAppDomainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.deployType = builder.deployType;
        this.domainName = builder.domainName;
        this.domainType = builder.domainType;
        this.extend = builder.extend;
        this.operateType = builder.operateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAppDomainRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return deployType
     */
    public String getDeployType() {
        return this.deployType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainType
     */
    public String getDomainType() {
        return this.domainType;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    public static final class Builder extends Request.Builder<BindAppDomainRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String deployType; 
        private String domainName; 
        private String domainType; 
        private String extend; 
        private String operateType; 

        private Builder() {
            super();
        } 

        private Builder(BindAppDomainRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.deployType = request.deployType;
            this.domainName = request.domainName;
            this.domainType = request.domainType;
            this.extend = request.extend;
            this.operateType = request.operateType;
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
         * <p>The business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250820143531000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The domain hosting method. Valid values:</p>
         * <ul>
         * <li>CUSTOMER_ESA: Uses the customer\&quot;s own Edge Security Acceleration (ESA). Only supported when DomainType is set to CUSTOM.</li>
         * </ul>
         * <p>If this parameter is not specified, the original hosting process is used.</p>
         * 
         * <strong>example:</strong>
         * <p>CDN</p>
         */
        public Builder deployType(String deployType) {
            this.putQueryParameter("DeployType", deployType);
            this.deployType = deployType;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>xiaoniu.link</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The domain management type. Valid values:</p>
         * <ul>
         * <li>CUSTOM</li>
         * <li>PLATFORM_PREFIX</li>
         * </ul>
         * <p>Default value: CUSTOM.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        public Builder domainType(String domainType) {
            this.putQueryParameter("DomainType", domainType);
            this.domainType = domainType;
            return this;
        }

        /**
         * <p>The extended information (OverwriteExistingRecord).</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;deliveryNodeName\&quot;:\&quot;Website acceptance\&quot;,\&quot;deliveryNodeStatus\&quot;:\&quot;Reject\&quot;,\&quot;deliveryOperatorRole\&quot;:\&quot;Customer\&quot;}</p>
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * <p>The operation type for domain binding.</p>
         * 
         * <strong>example:</strong>
         * <p>vul_fix</p>
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        @Override
        public BindAppDomainRequest build() {
            return new BindAppDomainRequest(this);
        } 

    } 

}
