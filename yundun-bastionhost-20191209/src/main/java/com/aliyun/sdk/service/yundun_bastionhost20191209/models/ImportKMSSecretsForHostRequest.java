// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ImportKMSSecretsForHostRequest} extends {@link RequestModel}
 *
 * <p>ImportKMSSecretsForHostRequest</p>
 */
public class ImportKMSSecretsForHostRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer hostId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Secrets")
    private java.util.List<Secrets> secrets;

    private ImportKMSSecretsForHostRequest(Builder builder) {
        super(builder);
        this.hostId = builder.hostId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.secrets = builder.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportKMSSecretsForHostRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostId
     */
    public Integer getHostId() {
        return this.hostId;
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
     * @return secrets
     */
    public java.util.List<Secrets> getSecrets() {
        return this.secrets;
    }

    public static final class Builder extends Request.Builder<ImportKMSSecretsForHostRequest, Builder> {
        private Integer hostId; 
        private String instanceId; 
        private String regionId; 
        private java.util.List<Secrets> secrets; 

        private Builder() {
            super();
        } 

        private Builder(ImportKMSSecretsForHostRequest request) {
            super(request);
            this.hostId = request.hostId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.secrets = request.secrets;
        } 

        /**
         * <p>The ID of the host to import the KMS secrets to.</p>
         * <blockquote>
         * <p>Only ECS hosts can import KMS secrets. You can call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hostId(Integer hostId) {
            this.putQueryParameter("HostId", hostId);
            this.hostId = hostId;
            return this;
        }

        /**
         * <p>The ID of the Bastionhost instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the Bastionhost instance.</p>
         * <blockquote>
         * <p>For more information about region IDs and names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and availability zones</a>.</p>
         * </blockquote>
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
         * <p>The KMS secrets to import.</p>
         */
        public Builder secrets(java.util.List<Secrets> secrets) {
            String secretsShrink = shrink(secrets, "Secrets", "json");
            this.putQueryParameter("Secrets", secretsShrink);
            this.secrets = secrets;
            return this;
        }

        @Override
        public ImportKMSSecretsForHostRequest build() {
            return new ImportKMSSecretsForHostRequest(this);
        } 

    } 

    /**
     * 
     * {@link ImportKMSSecretsForHostRequest} extends {@link TeaModel}
     *
     * <p>ImportKMSSecretsForHostRequest</p>
     */
    public static class Secrets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecretName")
        private String secretName;

        @com.aliyun.core.annotation.NameInMap("SecretType")
        private String secretType;

        private Secrets(Builder builder) {
            this.secretName = builder.secretName;
            this.secretType = builder.secretType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Secrets create() {
            return builder().build();
        }

        /**
         * @return secretName
         */
        public String getSecretName() {
            return this.secretName;
        }

        /**
         * @return secretType
         */
        public String getSecretType() {
            return this.secretType;
        }

        public static final class Builder {
            private String secretName; 
            private String secretType; 

            private Builder() {
            } 

            private Builder(Secrets model) {
                this.secretName = model.secretName;
                this.secretType = model.secretType;
            } 

            /**
             * <p>The name of the KMS secret.</p>
             * 
             * <strong>example:</strong>
             * <p>secret</p>
             */
            public Builder secretName(String secretName) {
                this.secretName = secretName;
                return this;
            }

            /**
             * <p>The type of the KMS secret. Valid values:</p>
             * <ul>
             * <li><strong>ECS</strong>: an ECS credential.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder secretType(String secretType) {
                this.secretType = secretType;
                return this;
            }

            public Secrets build() {
                return new Secrets(this);
            } 

        } 

    }
}
