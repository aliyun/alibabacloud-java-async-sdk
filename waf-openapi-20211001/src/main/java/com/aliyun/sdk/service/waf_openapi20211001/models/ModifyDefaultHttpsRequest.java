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
         * <p>The type of the cipher suites. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: all cipher suites.</li>
         * <li><strong>2</strong>: strong cipher suites.</li>
         * <li><strong>99</strong>: custom cipher suites.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder cipherSuite(Integer cipherSuite) {
            this.putQueryParameter("CipherSuite", cipherSuite);
            this.cipherSuite = cipherSuite;
            return this;
        }

        /**
         * <p>The custom cipher suites that you want to add. This parameter is available only if you set <strong>CipherSuite</strong> to <strong>99</strong>.</p>
         */
        public Builder customCiphers(java.util.List<String> customCiphers) {
            this.putQueryParameter("CustomCiphers", customCiphers);
            this.customCiphers = customCiphers;
            return this;
        }

        /**
         * <p>Specifies whether to support TLS 1.3. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The ID of the Web Application Firewall (WAF) instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
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
         * <p>The region in which the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: the Chinese mainland.</li>
         * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
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
         * <p>阿里云资源组ID。</p>
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
         * <p>The version of the TLS protocol. Valid values:</p>
         * <ul>
         * <li><strong>tlsv1</strong></li>
         * <li><strong>tlsv1.1</strong></li>
         * <li><strong>tlsv1.2</strong></li>
         * </ul>
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
