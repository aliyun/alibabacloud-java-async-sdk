// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link UpdateK8sSecretRequest} extends {@link RequestModel}
 *
 * <p>UpdateK8sSecretRequest</p>
 */
public class UpdateK8sSecretRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Base64Encoded")
    private Boolean base64Encoded;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CertId")
    private String certId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CertRegionId")
    private String certRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private UpdateK8sSecretRequest(Builder builder) {
        super(builder);
        this.base64Encoded = builder.base64Encoded;
        this.certId = builder.certId;
        this.certRegionId = builder.certRegionId;
        this.clusterId = builder.clusterId;
        this.data = builder.data;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateK8sSecretRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return base64Encoded
     */
    public Boolean getBase64Encoded() {
        return this.base64Encoded;
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateK8sSecretRequest, Builder> {
        private Boolean base64Encoded; 
        private String certId; 
        private String certRegionId; 
        private String clusterId; 
        private String data; 
        private String name; 
        private String namespace; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateK8sSecretRequest request) {
            super(request);
            this.base64Encoded = request.base64Encoded;
            this.certId = request.certId;
            this.certRegionId = request.certRegionId;
            this.clusterId = request.clusterId;
            this.data = request.data;
            this.name = request.name;
            this.namespace = request.namespace;
            this.type = request.type;
        } 

        /**
         * <p>Specifies whether the data has been encoded in Base64.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder base64Encoded(Boolean base64Encoded) {
            this.putBodyParameter("Base64Encoded", base64Encoded);
            this.base64Encoded = base64Encoded;
            return this;
        }

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>6650277</p>
         */
        public Builder certId(String certId) {
            this.putBodyParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        /**
         * <p>The region ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder certRegionId(String certRegionId) {
            this.putBodyParameter("CertRegionId", certRegionId);
            this.certRegionId = certRegionId;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>9c28bbb9-****-44b3-b953-54ef8a2d0be2</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The data of the Secret. The value must be a JSON array that contains the following information:</p>
         * <ul>
         * <li>Key: Secret key</li>
         * <li>Value: Secret value</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Key&quot;:&quot;name&quot;,&quot;Value&quot;:&quot;william&quot;},{&quot;Key&quot;:&quot;age&quot;,&quot;Value&quot;:&quot;12&quot;}]</p>
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The name of the Secret. The name must start with a letter, and can contain digits, letters, and hyphens (-). It can be up to 63 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>my-secret</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The namespace of the Kubernetes cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The type of the Secret. Valid values:</p>
         * <ul>
         * <li>Opaque: user-defined data type</li>
         * <li>kubernetes.io/tls: Transport Layer Security (TLS) certificate type</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Opaque</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateK8sSecretRequest build() {
            return new UpdateK8sSecretRequest(this);
        } 

    } 

}
