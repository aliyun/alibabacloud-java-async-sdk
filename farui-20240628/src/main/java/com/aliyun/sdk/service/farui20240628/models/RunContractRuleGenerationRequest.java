// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.farui20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunContractRuleGenerationRequest} extends {@link RequestModel}
 *
 * <p>RunContractRuleGenerationRequest</p>
 */
public class RunContractRuleGenerationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assistant")
    private Assistant assistant;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    private RunContractRuleGenerationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.appId = builder.appId;
        this.assistant = builder.assistant;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunContractRuleGenerationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return assistant
     */
    public Assistant getAssistant() {
        return this.assistant;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<RunContractRuleGenerationRequest, Builder> {
        private String workspaceId; 
        private String appId; 
        private Assistant assistant; 
        private Boolean stream; 

        private Builder() {
            super();
        } 

        private Builder(RunContractRuleGenerationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.appId = request.appId;
            this.assistant = request.assistant;
            this.stream = request.stream;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * assistant.
         */
        public Builder assistant(Assistant assistant) {
            String assistantShrink = shrink(assistant, "assistant", "json");
            this.putBodyParameter("assistant", assistantShrink);
            this.assistant = assistant;
            return this;
        }

        /**
         * stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public RunContractRuleGenerationRequest build() {
            return new RunContractRuleGenerationRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunContractRuleGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunContractRuleGenerationRequest</p>
     */
    public static class MetaData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("position")
        private String position;

        private MetaData(Builder builder) {
            this.fileId = builder.fileId;
            this.position = builder.position;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaData create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        public static final class Builder {
            private String fileId; 
            private String position; 

            /**
             * fileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * position.
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            public MetaData build() {
                return new MetaData(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunContractRuleGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunContractRuleGenerationRequest</p>
     */
    public static class Assistant extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metaData")
        private MetaData metaData;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Assistant(Builder builder) {
            this.metaData = builder.metaData;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assistant create() {
            return builder().build();
        }

        /**
         * @return metaData
         */
        public MetaData getMetaData() {
            return this.metaData;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private MetaData metaData; 
            private String type; 
            private String version; 

            /**
             * metaData.
             */
            public Builder metaData(MetaData metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Assistant build() {
                return new Assistant(this);
            } 

        } 

    }
}
