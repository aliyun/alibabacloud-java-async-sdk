// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link CreateCollectorRequest} extends {@link RequestModel}
 *
 * <p>CreateCollectorRequest</p>
 */
public class CreateCollectorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collectorPaths")
    private java.util.List<String> collectorPaths;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Configs> configs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dryRun")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extendConfigs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<java.util.Map<String, ?>> extendConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateCollectorRequest(Builder builder) {
        super(builder);
        this.collectorPaths = builder.collectorPaths;
        this.configs = builder.configs;
        this.dryRun = builder.dryRun;
        this.extendConfigs = builder.extendConfigs;
        this.name = builder.name;
        this.resType = builder.resType;
        this.resVersion = builder.resVersion;
        this.vpcId = builder.vpcId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCollectorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collectorPaths
     */
    public java.util.List<String> getCollectorPaths() {
        return this.collectorPaths;
    }

    /**
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return extendConfigs
     */
    public java.util.List<java.util.Map<String, ?>> getExtendConfigs() {
        return this.extendConfigs;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resType
     */
    public String getResType() {
        return this.resType;
    }

    /**
     * @return resVersion
     */
    public String getResVersion() {
        return this.resVersion;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateCollectorRequest, Builder> {
        private java.util.List<String> collectorPaths; 
        private java.util.List<Configs> configs; 
        private Boolean dryRun; 
        private java.util.List<java.util.Map<String, ?>> extendConfigs; 
        private String name; 
        private String resType; 
        private String resVersion; 
        private String vpcId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateCollectorRequest request) {
            super(request);
            this.collectorPaths = request.collectorPaths;
            this.configs = request.configs;
            this.dryRun = request.dryRun;
            this.extendConfigs = request.extendConfigs;
            this.name = request.name;
            this.resType = request.resType;
            this.resVersion = request.resVersion;
            this.vpcId = request.vpcId;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The collection path for Filebeat. This parameter is required only when the collector is installed on an ECS instance.</p>
         */
        public Builder collectorPaths(java.util.List<String> collectorPaths) {
            this.putBodyParameter("collectorPaths", collectorPaths);
            this.collectorPaths = collectorPaths;
            return this;
        }

        /**
         * <p>The configuration file information of the collector.</p>
         * <p>This parameter is required.</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.putBodyParameter("configs", configs);
            this.configs = configs;
            return this;
        }

        /**
         * <p>Specifies whether to validate and create the collector. This parameter is used only when you create or update a collector. Valid values:</p>
         * <ul>
         * <li>true: validates the request without creating the collector.</li>
         * <li>false: validates the request and creates the collector.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The extended configuration of the collector.</p>
         * <p>This parameter is required.</p>
         */
        public Builder extendConfigs(java.util.List<java.util.Map<String, ?>> extendConfigs) {
            this.putBodyParameter("extendConfigs", extendConfigs);
            this.extendConfigs = extendConfigs;
            return this;
        }

        /**
         * <p>The name of the collector. The name must be 1 to 30 characters in length and must start with a letter. It can contain letters, digits, underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ct-test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The type of the collector. Valid values: fileBeat, metricBeat, heartBeat, and auditBeat.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fileBeat</p>
         */
        public Builder resType(String resType) {
            this.putBodyParameter("resType", resType);
            this.resType = resType;
            return this;
        }

        /**
         * <p>The version of the collector. Valid values:</p>
         * <ul>
         * <li>6.8.5_with_community: deployed on ECS instances.</li>
         * <li>6.8.13_with_community: deployed on ACK clusters.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6.8.5_with_community</p>
         */
        public Builder resVersion(String resVersion) {
            this.putBodyParameter("resVersion", resVersion);
            this.resVersion = resVersion;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) where the collector resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp12nu14urf0upaf*****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The client token used to ensure the idempotence of the request. The value is generated by the client and must be unique across different requests. The token can contain a maximum of 64 ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateCollectorRequest build() {
            return new CreateCollectorRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCollectorRequest} extends {@link TeaModel}
     *
     * <p>CreateCollectorRequest</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("fileName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileName;

        private Configs(Builder builder) {
            this.content = builder.content;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String content; 
            private String fileName; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.content = model.content;
                this.fileName = model.fileName;
            } 

            /**
             * <p>The content of the file.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;filebeat.inputs:xxx&quot;</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>filebeat.yml</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
