// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScenePreviewResourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetScenePreviewResourceResponseBody</p>
 */
public class GetScenePreviewResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetScenePreviewResourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScenePreviewResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 返回码
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * 模型数据
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误消息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否请求成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetScenePreviewResourceResponseBody build() {
            return new GetScenePreviewResourceResponseBody(this);
        } 

    } 

    public static class ResourceDirectory extends TeaModel {
        @NameInMap("HotspotTagConfig")
        private String hotspotTagConfig;

        @NameInMap("ModelConfig")
        private String modelConfig;

        @NameInMap("OrthomapConfig")
        private String orthomapConfig;

        @NameInMap("RootPath")
        private String rootPath;

        private ResourceDirectory(Builder builder) {
            this.hotspotTagConfig = builder.hotspotTagConfig;
            this.modelConfig = builder.modelConfig;
            this.orthomapConfig = builder.orthomapConfig;
            this.rootPath = builder.rootPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDirectory create() {
            return builder().build();
        }

        /**
         * @return hotspotTagConfig
         */
        public String getHotspotTagConfig() {
            return this.hotspotTagConfig;
        }

        /**
         * @return modelConfig
         */
        public String getModelConfig() {
            return this.modelConfig;
        }

        /**
         * @return orthomapConfig
         */
        public String getOrthomapConfig() {
            return this.orthomapConfig;
        }

        /**
         * @return rootPath
         */
        public String getRootPath() {
            return this.rootPath;
        }

        public static final class Builder {
            private String hotspotTagConfig; 
            private String modelConfig; 
            private String orthomapConfig; 
            private String rootPath; 

            /**
             * 热点文件路径
             */
            public Builder hotspotTagConfig(String hotspotTagConfig) {
                this.hotspotTagConfig = hotspotTagConfig;
                return this;
            }

            /**
             * 模型配置路径
             */
            public Builder modelConfig(String modelConfig) {
                this.modelConfig = modelConfig;
                return this;
            }

            /**
             * 小地图数据文件路径
             */
            public Builder orthomapConfig(String orthomapConfig) {
                this.orthomapConfig = orthomapConfig;
                return this;
            }

            /**
             * 模型路径
             */
            public Builder rootPath(String rootPath) {
                this.rootPath = rootPath;
                return this;
            }

            public ResourceDirectory build() {
                return new ResourceDirectory(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("ResourceDirectory")
        private ResourceDirectory resourceDirectory;

        @NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.name = builder.name;
            this.resourceDirectory = builder.resourceDirectory;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceDirectory
         */
        public ResourceDirectory getResourceDirectory() {
            return this.resourceDirectory;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private ResourceDirectory resourceDirectory; 
            private String version; 

            /**
             * 模型名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 资源路径
             */
            public Builder resourceDirectory(ResourceDirectory resourceDirectory) {
                this.resourceDirectory = resourceDirectory;
                return this;
            }

            /**
             * 版本
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
