// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCollectorRequest} extends {@link RequestModel}
 *
 * <p>CreateCollectorRequest</p>
 */
public class CreateCollectorRequest extends Request {
    @Body
    @NameInMap("collectorPaths")
    private java.util.List < String > collectorPaths;

    @Body
    @NameInMap("configs")
    @Validation(required = true)
    private java.util.List < Configs> configs;

    @Body
    @NameInMap("dryRun")
    @Validation(required = true)
    private Boolean dryRun;

    @Body
    @NameInMap("extendConfigs")
    @Validation(required = true)
    private java.util.List < java.util.Map<String, ?>> extendConfigs;

    @Body
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("resType")
    @Validation(required = true)
    private String resType;

    @Body
    @NameInMap("resVersion")
    @Validation(required = true)
    private String resVersion;

    @Body
    @NameInMap("vpcId")
    @Validation(required = true)
    private String vpcId;

    @Query
    @NameInMap("clientToken")
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
         * filebeat的采集路径，只有ECS机器上的使用
         */
        public Builder collectorPaths(java.util.List < String > collectorPaths) {
            this.putBodyParameter("collectorPaths", collectorPaths);
            this.collectorPaths = collectorPaths;
            return this;
        }

        /**
         * 配置文件信息
         */
        public Builder configs(java.util.List < Configs> configs) {
            this.putBodyParameter("configs", configs);
            this.configs = configs;
            return this;
        }

        /**
         * 创建是否校验。true:只校验不创建，false：校验并创建
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 采集器Output实例配置
         */
        public Builder extendConfigs(java.util.List < java.util.Map<String, ?>> extendConfigs) {
            this.putBodyParameter("extendConfigs", extendConfigs);
            this.extendConfigs = extendConfigs;
            return this;
        }

        /**
         * 采集器实例名称，自定义
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * 采集器类型。
         */
        public Builder resType(String resType) {
            this.putBodyParameter("resType", resType);
            this.resType = resType;
            return this;
        }

        /**
         * 采集器版本
         */
        public Builder resVersion(String resVersion) {
            this.putBodyParameter("resVersion", resVersion);
            this.resVersion = resVersion;
            return this;
        }

        /**
         * 采集器所属专有网络ID。
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * 5A2CFF0E-5718-45B5-9D4D-70B3FF\*\*\*\*
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
        @NameInMap("content")
        @Validation(required = true)
        private String content;

        @NameInMap("fileName")
        @Validation(required = true)
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
             * 文件内容。详见：https://help.aliyun.com/document_detail/146447.html
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 文件路径名称
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
