// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCollectorRequest} extends {@link RequestModel}
 *
 * <p>CreateCollectorRequest</p>
 */
public class CreateCollectorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collectorPaths")
    private java.util.List < String > collectorPaths;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Configs> configs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dryRun")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extendConfigs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < java.util.Map<String, ?>> extendConfigs;

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
    public java.util.List < String > getCollectorPaths() {
        return this.collectorPaths;
    }

    /**
     * @return configs
     */
    public java.util.List < Configs> getConfigs() {
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
    public java.util.List < java.util.Map<String, ?>> getExtendConfigs() {
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
        private java.util.List < String > collectorPaths; 
        private java.util.List < Configs> configs; 
        private Boolean dryRun; 
        private java.util.List < java.util.Map<String, ?>> extendConfigs; 
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
         * collectorPaths.
         */
        public Builder collectorPaths(java.util.List < String > collectorPaths) {
            this.putBodyParameter("collectorPaths", collectorPaths);
            this.collectorPaths = collectorPaths;
            return this;
        }

        /**
         * configs.
         */
        public Builder configs(java.util.List < Configs> configs) {
            this.putBodyParameter("configs", configs);
            this.configs = configs;
            return this;
        }

        /**
         * dryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * extendConfigs.
         */
        public Builder extendConfigs(java.util.List < java.util.Map<String, ?>> extendConfigs) {
            this.putBodyParameter("extendConfigs", extendConfigs);
            this.extendConfigs = extendConfigs;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * resType.
         */
        public Builder resType(String resType) {
            this.putBodyParameter("resType", resType);
            this.resType = resType;
            return this;
        }

        /**
         * resVersion.
         */
        public Builder resVersion(String resVersion) {
            this.putBodyParameter("resVersion", resVersion);
            this.resVersion = resVersion;
            return this;
        }

        /**
         * vpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The ID of the created crawer.
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

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * fileName.
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
