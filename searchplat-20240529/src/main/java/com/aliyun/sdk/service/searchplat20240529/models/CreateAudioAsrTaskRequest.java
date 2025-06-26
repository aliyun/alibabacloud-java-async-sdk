// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

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
 * {@link CreateAudioAsrTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateAudioAsrTaskRequest</p>
 */
public class CreateAudioAsrTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("service_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("input")
    private Input input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("output")
    private Output output;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map<String, ?> parameters;

    private CreateAudioAsrTaskRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.serviceId = builder.serviceId;
        this.input = builder.input;
        this.output = builder.output;
        this.parameters = builder.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAudioAsrTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return output
     */
    public Output getOutput() {
        return this.output;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public static final class Builder extends Request.Builder<CreateAudioAsrTaskRequest, Builder> {
        private String workspaceName; 
        private String serviceId; 
        private Input input; 
        private Output output; 
        private java.util.Map<String, ?> parameters; 

        private Builder() {
            super();
        } 

        private Builder(CreateAudioAsrTaskRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.serviceId = request.serviceId;
            this.input = request.input;
            this.output = request.output;
            this.parameters = request.parameters;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspace_name", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("service_id", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * input.
         */
        public Builder input(Input input) {
            this.putBodyParameter("input", input);
            this.input = input;
            return this;
        }

        /**
         * output.
         */
        public Builder output(Output output) {
            this.putBodyParameter("output", output);
            this.output = output;
            return this;
        }

        /**
         * parameters.
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        @Override
        public CreateAudioAsrTaskRequest build() {
            return new CreateAudioAsrTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAudioAsrTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateAudioAsrTaskRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("file_name")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("oss")
        private String oss;

        private Input(Builder builder) {
            this.content = builder.content;
            this.fileName = builder.fileName;
            this.oss = builder.oss;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
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

        /**
         * @return oss
         */
        public String getOss() {
            return this.oss;
        }

        public static final class Builder {
            private String content; 
            private String fileName; 
            private String oss; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.content = model.content;
                this.fileName = model.fileName;
                this.oss = model.oss;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * file_name.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * oss.
             */
            public Builder oss(String oss) {
                this.oss = oss;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAudioAsrTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateAudioAsrTaskRequest</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("oss")
        private String oss;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Output(Builder builder) {
            this.oss = builder.oss;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return oss
         */
        public String getOss() {
            return this.oss;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String oss; 
            private String type; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.oss = model.oss;
                this.type = model.type;
            } 

            /**
             * oss.
             */
            public Builder oss(String oss) {
                this.oss = oss;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
}
