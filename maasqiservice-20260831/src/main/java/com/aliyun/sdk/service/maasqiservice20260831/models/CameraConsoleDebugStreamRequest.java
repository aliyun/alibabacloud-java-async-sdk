// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maasqiservice20260831.models;

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
 * {@link CameraConsoleDebugStreamRequest} extends {@link RequestModel}
 *
 * <p>CameraConsoleDebugStreamRequest</p>
 */
public class CameraConsoleDebugStreamRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-QI-Instance-Id")
    private String xQIInstanceId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-QI-Request-Id")
    private String xQIRequestId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-QI-Session-Id")
    private String xQISessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private Config config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("input")
    @com.aliyun.core.annotation.Validation(required = true)
    private Input input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameters")
    private Parameters parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scenario")
    private String scenario;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    private CameraConsoleDebugStreamRequest(Builder builder) {
        super(builder);
        this.xQIInstanceId = builder.xQIInstanceId;
        this.xQIRequestId = builder.xQIRequestId;
        this.xQISessionId = builder.xQISessionId;
        this.config = builder.config;
        this.input = builder.input;
        this.instanceId = builder.instanceId;
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
        this.scenario = builder.scenario;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CameraConsoleDebugStreamRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xQIInstanceId
     */
    public String getXQIInstanceId() {
        return this.xQIInstanceId;
    }

    /**
     * @return xQIRequestId
     */
    public String getXQIRequestId() {
        return this.xQIRequestId;
    }

    /**
     * @return xQISessionId
     */
    public String getXQISessionId() {
        return this.xQISessionId;
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return parameters
     */
    public Parameters getParameters() {
        return this.parameters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scenario
     */
    public String getScenario() {
        return this.scenario;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<CameraConsoleDebugStreamRequest, Builder> {
        private String xQIInstanceId; 
        private String xQIRequestId; 
        private String xQISessionId; 
        private Config config; 
        private Input input; 
        private String instanceId; 
        private Parameters parameters; 
        private String requestId; 
        private String scenario; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(CameraConsoleDebugStreamRequest request) {
            super(request);
            this.xQIInstanceId = request.xQIInstanceId;
            this.xQIRequestId = request.xQIRequestId;
            this.xQISessionId = request.xQISessionId;
            this.config = request.config;
            this.input = request.input;
            this.instanceId = request.instanceId;
            this.parameters = request.parameters;
            this.requestId = request.requestId;
            this.scenario = request.scenario;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>实例 ID，非空 Header 优先于 Body。</p>
         */
        public Builder xQIInstanceId(String xQIInstanceId) {
            this.putHeaderParameter("X-QI-Instance-Id", xQIInstanceId);
            this.xQIInstanceId = xQIInstanceId;
            return this;
        }

        /**
         * <p>请求 ID 优先级：可信 POP 注入的 x-acs-request-id、非空 X-QI-Request-Id Header、Body.requestId。没有前两者时 Body.requestId 必填；没有可信 POP ID 时 Header 与 Body.requestId 至少提供一个。 1～128 位，仅字母、数字及 ._:-。成功重放还须复用同一 Session；已记录为失败的请求须换新 ID。POP 重试分配新 ID 时会按新请求处理。</p>
         */
        public Builder xQIRequestId(String xQIRequestId) {
            this.putHeaderParameter("X-QI-Request-Id", xQIRequestId);
            this.xQIRequestId = xQIRequestId;
            return this;
        }

        /**
         * <p>可选会话 ID，非空 Header 优先于 Body.sessionId；省略时生成。1～128 位，仅字母、数字及 ._:-。成功重放必须复用原 Session 和有效 Request ID；切换配置时换新 Session，人物识别同时换新 scene_id。</p>
         */
        public Builder xQISessionId(String xQISessionId) {
            this.putHeaderParameter("X-QI-Session-Id", xQISessionId);
            this.xQISessionId = xQISessionId;
            return this;
        }

        /**
         * config.
         */
        public Builder config(Config config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder input(Input input) {
            this.putBodyParameter("input", input);
            this.input = input;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * parameters.
         */
        public Builder parameters(Parameters parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>请求 ID 优先级：可信 POP 注入的 x-acs-request-id、非空 X-QI-Request-Id Header、Body.requestId。没有前两者时 Body.requestId 必填；没有可信 POP ID 时 Header 与 Body.requestId 至少提供一个。 格式同 sessionId。成功重放还须复用原 Session；已记录为失败的请求须换新 Request ID。</p>
         * 
         * <strong>example:</strong>
         * <p>debug-request-001</p>
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * scenario.
         */
        public Builder scenario(String scenario) {
            this.putBodyParameter("scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public CameraConsoleDebugStreamRequest build() {
            return new CameraConsoleDebugStreamRequest(this);
        } 

    } 

    /**
     * 
     * {@link CameraConsoleDebugStreamRequest} extends {@link TeaModel}
     *
     * <p>CameraConsoleDebugStreamRequest</p>
     */
    public static class Camera extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("headMaxHeightRatio")
        private Double headMaxHeightRatio;

        @com.aliyun.core.annotation.NameInMap("headMinHeightRatio")
        private Double headMinHeightRatio;

        @com.aliyun.core.annotation.NameInMap("minConfidence")
        private Double minConfidence;

        @com.aliyun.core.annotation.NameInMap("scenario")
        private String scenario;

        private Camera(Builder builder) {
            this.headMaxHeightRatio = builder.headMaxHeightRatio;
            this.headMinHeightRatio = builder.headMinHeightRatio;
            this.minConfidence = builder.minConfidence;
            this.scenario = builder.scenario;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Camera create() {
            return builder().build();
        }

        /**
         * @return headMaxHeightRatio
         */
        public Double getHeadMaxHeightRatio() {
            return this.headMaxHeightRatio;
        }

        /**
         * @return headMinHeightRatio
         */
        public Double getHeadMinHeightRatio() {
            return this.headMinHeightRatio;
        }

        /**
         * @return minConfidence
         */
        public Double getMinConfidence() {
            return this.minConfidence;
        }

        /**
         * @return scenario
         */
        public String getScenario() {
            return this.scenario;
        }

        public static final class Builder {
            private Double headMaxHeightRatio; 
            private Double headMinHeightRatio; 
            private Double minConfidence; 
            private String scenario; 

            private Builder() {
            } 

            private Builder(Camera model) {
                this.headMaxHeightRatio = model.headMaxHeightRatio;
                this.headMinHeightRatio = model.headMinHeightRatio;
                this.minConfidence = model.minConfidence;
                this.scenario = model.scenario;
            } 

            /**
             * headMaxHeightRatio.
             */
            public Builder headMaxHeightRatio(Double headMaxHeightRatio) {
                this.headMaxHeightRatio = headMaxHeightRatio;
                return this;
            }

            /**
             * headMinHeightRatio.
             */
            public Builder headMinHeightRatio(Double headMinHeightRatio) {
                this.headMinHeightRatio = headMinHeightRatio;
                return this;
            }

            /**
             * minConfidence.
             */
            public Builder minConfidence(Double minConfidence) {
                this.minConfidence = minConfidence;
                return this;
            }

            /**
             * scenario.
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            public Camera build() {
                return new Camera(this);
            } 

        } 

    }
    /**
     * 
     * {@link CameraConsoleDebugStreamRequest} extends {@link TeaModel}
     *
     * <p>CameraConsoleDebugStreamRequest</p>
     */
    public static class PersonScan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxHeightRatio")
        private Double maxHeightRatio;

        @com.aliyun.core.annotation.NameInMap("minHeightRatio")
        private Double minHeightRatio;

        @com.aliyun.core.annotation.NameInMap("minScore")
        private Double minScore;

        private PersonScan(Builder builder) {
            this.maxHeightRatio = builder.maxHeightRatio;
            this.minHeightRatio = builder.minHeightRatio;
            this.minScore = builder.minScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PersonScan create() {
            return builder().build();
        }

        /**
         * @return maxHeightRatio
         */
        public Double getMaxHeightRatio() {
            return this.maxHeightRatio;
        }

        /**
         * @return minHeightRatio
         */
        public Double getMinHeightRatio() {
            return this.minHeightRatio;
        }

        /**
         * @return minScore
         */
        public Double getMinScore() {
            return this.minScore;
        }

        public static final class Builder {
            private Double maxHeightRatio; 
            private Double minHeightRatio; 
            private Double minScore; 

            private Builder() {
            } 

            private Builder(PersonScan model) {
                this.maxHeightRatio = model.maxHeightRatio;
                this.minHeightRatio = model.minHeightRatio;
                this.minScore = model.minScore;
            } 

            /**
             * maxHeightRatio.
             */
            public Builder maxHeightRatio(Double maxHeightRatio) {
                this.maxHeightRatio = maxHeightRatio;
                return this;
            }

            /**
             * minHeightRatio.
             */
            public Builder minHeightRatio(Double minHeightRatio) {
                this.minHeightRatio = minHeightRatio;
                return this;
            }

            /**
             * minScore.
             */
            public Builder minScore(Double minScore) {
                this.minScore = minScore;
                return this;
            }

            public PersonScan build() {
                return new PersonScan(this);
            } 

        } 

    }
    /**
     * 
     * {@link CameraConsoleDebugStreamRequest} extends {@link TeaModel}
     *
     * <p>CameraConsoleDebugStreamRequest</p>
     */
    public static class ExtensionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("camera")
        private Camera camera;

        @com.aliyun.core.annotation.NameInMap("personScan")
        private PersonScan personScan;

        @com.aliyun.core.annotation.NameInMap("scenario")
        private String scenario;

        private ExtensionConfig(Builder builder) {
            this.camera = builder.camera;
            this.personScan = builder.personScan;
            this.scenario = builder.scenario;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtensionConfig create() {
            return builder().build();
        }

        /**
         * @return camera
         */
        public Camera getCamera() {
            return this.camera;
        }

        /**
         * @return personScan
         */
        public PersonScan getPersonScan() {
            return this.personScan;
        }

        /**
         * @return scenario
         */
        public String getScenario() {
            return this.scenario;
        }

        public static final class Builder {
            private Camera camera; 
            private PersonScan personScan; 
            private String scenario; 

            private Builder() {
            } 

            private Builder(ExtensionConfig model) {
                this.camera = model.camera;
                this.personScan = model.personScan;
                this.scenario = model.scenario;
            } 

            /**
             * camera.
             */
            public Builder camera(Camera camera) {
                this.camera = camera;
                return this;
            }

            /**
             * personScan.
             */
            public Builder personScan(PersonScan personScan) {
                this.personScan = personScan;
                return this;
            }

            /**
             * scenario.
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            public ExtensionConfig build() {
                return new ExtensionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CameraConsoleDebugStreamRequest} extends {@link TeaModel}
     *
     * <p>CameraConsoleDebugStreamRequest</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("catalogModelId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String catalogModelId;

        private Model(Builder builder) {
            this.catalogModelId = builder.catalogModelId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return catalogModelId
         */
        public String getCatalogModelId() {
            return this.catalogModelId;
        }

        public static final class Builder {
            private String catalogModelId; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.catalogModelId = model.catalogModelId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>&lt;主模型目录ID&gt;</p>
             */
            public Builder catalogModelId(String catalogModelId) {
                this.catalogModelId = catalogModelId;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
    /**
     * 
     * {@link CameraConsoleDebugStreamRequest} extends {@link TeaModel}
     *
     * <p>CameraConsoleDebugStreamRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String agentType;

        @com.aliyun.core.annotation.NameInMap("apiName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("extensionConfig")
        private ExtensionConfig extensionConfig;

        @com.aliyun.core.annotation.NameInMap("instructions")
        private String instructions;

        @com.aliyun.core.annotation.NameInMap("maxIterations")
        private Integer maxIterations;

        @com.aliyun.core.annotation.NameInMap("model")
        private Model model;

        private Config(Builder builder) {
            this.agentType = builder.agentType;
            this.apiName = builder.apiName;
            this.extensionConfig = builder.extensionConfig;
            this.instructions = builder.instructions;
            this.maxIterations = builder.maxIterations;
            this.model = builder.model;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return agentType
         */
        public String getAgentType() {
            return this.agentType;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return extensionConfig
         */
        public ExtensionConfig getExtensionConfig() {
            return this.extensionConfig;
        }

        /**
         * @return instructions
         */
        public String getInstructions() {
            return this.instructions;
        }

        /**
         * @return maxIterations
         */
        public Integer getMaxIterations() {
            return this.maxIterations;
        }

        /**
         * @return model
         */
        public Model getModel() {
            return this.model;
        }

        public static final class Builder {
            private String agentType; 
            private String apiName; 
            private ExtensionConfig extensionConfig; 
            private String instructions; 
            private Integer maxIterations; 
            private Model model; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.agentType = model.agentType;
                this.apiName = model.apiName;
                this.extensionConfig = model.extensionConfig;
                this.instructions = model.instructions;
                this.maxIterations = model.maxIterations;
                this.model = model.model;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CAMERA</p>
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CameraStandard</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * extensionConfig.
             */
            public Builder extensionConfig(ExtensionConfig extensionConfig) {
                this.extensionConfig = extensionConfig;
                return this;
            }

            /**
             * instructions.
             */
            public Builder instructions(String instructions) {
                this.instructions = instructions;
                return this;
            }

            /**
             * maxIterations.
             */
            public Builder maxIterations(Integer maxIterations) {
                this.maxIterations = maxIterations;
                return this;
            }

            /**
             * model.
             */
            public Builder model(Model model) {
                this.model = model;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link CameraConsoleDebugStreamRequest} extends {@link TeaModel}
     *
     * <p>CameraConsoleDebugStreamRequest</p>
     */
    public static class ImageUrl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("url")
        @com.aliyun.core.annotation.Validation(required = true)
        private String url;

        private ImageUrl(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageUrl create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String url; 

            private Builder() {
            } 

            private Builder(ImageUrl model) {
                this.url = model.url;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/images/person.jpg">https://example.com/images/person.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ImageUrl build() {
                return new ImageUrl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CameraConsoleDebugStreamRequest} extends {@link TeaModel}
     *
     * <p>CameraConsoleDebugStreamRequest</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("imageUrl")
        @com.aliyun.core.annotation.Validation(required = true)
        private ImageUrl imageUrl;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Content(Builder builder) {
            this.imageUrl = builder.imageUrl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return imageUrl
         */
        public ImageUrl getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ImageUrl imageUrl; 
            private String type; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.imageUrl = model.imageUrl;
                this.type = model.type;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder imageUrl(ImageUrl imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>image_url</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link CameraConsoleDebugStreamRequest} extends {@link TeaModel}
     *
     * <p>CameraConsoleDebugStreamRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("role")
        @com.aliyun.core.annotation.Validation(required = true)
        private String role;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private java.util.List<Content> content; 
            private String role; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link CameraConsoleDebugStreamRequest} extends {@link TeaModel}
     *
     * <p>CameraConsoleDebugStreamRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("messages")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Messages> messages;

        @com.aliyun.core.annotation.NameInMap("sceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("stream")
        private Boolean stream;

        private Input(Builder builder) {
            this.messages = builder.messages;
            this.sceneId = builder.sceneId;
            this.stream = builder.stream;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return messages
         */
        public java.util.List<Messages> getMessages() {
            return this.messages;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return stream
         */
        public Boolean getStream() {
            return this.stream;
        }

        public static final class Builder {
            private java.util.List<Messages> messages; 
            private String sceneId; 
            private Boolean stream; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.messages = model.messages;
                this.sceneId = model.sceneId;
                this.stream = model.stream;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:[{&quot;type&quot;:&quot;image_url&quot;,&quot;image_url&quot;:{&quot;url&quot;:&quot;<a href="https://example.com/images/person.jpg%22%7D%7D%5D%7D%5D">https://example.com/images/person.jpg&quot;}}]}]</a></p>
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * sceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * stream.
             */
            public Builder stream(Boolean stream) {
                this.stream = stream;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link CameraConsoleDebugStreamRequest} extends {@link TeaModel}
     *
     * <p>CameraConsoleDebugStreamRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxHeightRatio")
        private Double maxHeightRatio;

        @com.aliyun.core.annotation.NameInMap("minHeightRatio")
        private Double minHeightRatio;

        @com.aliyun.core.annotation.NameInMap("minScore")
        private Double minScore;

        private Parameters(Builder builder) {
            this.maxHeightRatio = builder.maxHeightRatio;
            this.minHeightRatio = builder.minHeightRatio;
            this.minScore = builder.minScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return maxHeightRatio
         */
        public Double getMaxHeightRatio() {
            return this.maxHeightRatio;
        }

        /**
         * @return minHeightRatio
         */
        public Double getMinHeightRatio() {
            return this.minHeightRatio;
        }

        /**
         * @return minScore
         */
        public Double getMinScore() {
            return this.minScore;
        }

        public static final class Builder {
            private Double maxHeightRatio; 
            private Double minHeightRatio; 
            private Double minScore; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.maxHeightRatio = model.maxHeightRatio;
                this.minHeightRatio = model.minHeightRatio;
                this.minScore = model.minScore;
            } 

            /**
             * maxHeightRatio.
             */
            public Builder maxHeightRatio(Double maxHeightRatio) {
                this.maxHeightRatio = maxHeightRatio;
                return this;
            }

            /**
             * minHeightRatio.
             */
            public Builder minHeightRatio(Double minHeightRatio) {
                this.minHeightRatio = minHeightRatio;
                return this;
            }

            /**
             * minScore.
             */
            public Builder minScore(Double minScore) {
                this.minScore = minScore;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
