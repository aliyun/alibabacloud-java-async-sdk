// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link ModifyDefaultHttpsRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefaultHttpsRequest</p>
 */
public class ModifyDefaultHttpsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CipherSuite")
    private Integer cipherSuite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomCiphers")
    private java.util.List<String> customCiphers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableTLSv3")
    private Boolean enableTLSv3;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TLSVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String TLSVersion;

    private ModifyDefaultHttpsRequest(Builder builder) {
        super(builder);
        this.certId = builder.certId;
        this.cipherSuite = builder.cipherSuite;
        this.customCiphers = builder.customCiphers;
        this.enableTLSv3 = builder.enableTLSv3;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.TLSVersion = builder.TLSVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDefaultHttpsRequest create() {
        return builder().build();
    }

@Override
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
     * @return cipherSuite
     */
    public Integer getCipherSuite() {
        return this.cipherSuite;
    }

    /**
     * @return customCiphers
     */
    public java.util.List<String> getCustomCiphers() {
        return this.customCiphers;
    }

    /**
     * @return enableTLSv3
     */
    public Boolean getEnableTLSv3() {
        return this.enableTLSv3;
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

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return TLSVersion
     */
    public String getTLSVersion() {
        return this.TLSVersion;
    }

    public static final class Builder extends Request.Builder<ModifyDefaultHttpsRequest, Builder> {
        private String certId; 
        private Integer cipherSuite; 
        private java.util.List<String> customCiphers; 
        private Boolean enableTLSv3; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String TLSVersion; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDefaultHttpsRequest request) {
            super(request);
            this.certId = request.certId;
            this.cipherSuite = request.cipherSuite;
            this.customCiphers = request.customCiphers;
            this.enableTLSv3 = request.enableTLSv3;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.TLSVersion = request.TLSVersion;
        } 

        /**
         * <p>The ID of the certificate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        public Builder certId(String certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        /**
         * <p>The cipher suite type.</p>
         * <blockquote>
         * <p>This parameter is required. You must specify this parameter when you call this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cipherSuite(Integer cipherSuite) {
            this.putQueryParameter("CipherSuite", cipherSuite);
            this.cipherSuite = cipherSuite;
            return this;
        }

        /**
         * <p>The custom cipher suites to add. This parameter is used only when <strong>CipherSuite</strong> is set to <strong>99</strong>.</p>
         */
        public Builder customCiphers(java.util.List<String> customCiphers) {
            this.putQueryParameter("CustomCiphers", customCiphers);
            this.customCiphers = customCiphers;
            return this;
        }

        /**
         * <p>Specifies whether TLS 1.3 is supported. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: TLS 1.3 is supported.</p>
         * </li>
         * <li><p><strong>false</strong>: TLS 1.3 is not supported.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is used only when HttpsPorts is not empty, which indicates that the domain name uses the HTTPS protocol. If TLSVersion is set to tlsv1.3, this value must be true.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableTLSv3(Boolean enableTLSv3) {
            this.putQueryParameter("EnableTLSv3", enableTLSv3);
            this.enableTLSv3 = enableTLSv3;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region where the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The TLS version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tlsv1</p>
         */
        public Builder TLSVersion(String TLSVersion) {
            this.putQueryParameter("TLSVersion", TLSVersion);
            this.TLSVersion = TLSVersion;
            return this;
        }

        @Override
        public ModifyDefaultHttpsRequest build() {
            return new ModifyDefaultHttpsRequest(this);
        } 

    } 

}
