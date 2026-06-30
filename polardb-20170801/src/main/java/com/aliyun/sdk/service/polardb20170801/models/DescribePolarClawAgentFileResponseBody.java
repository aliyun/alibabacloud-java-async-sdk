// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarClawAgentFileResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarClawAgentFileResponseBody</p>
 */
public class DescribePolarClawAgentFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("File")
    private File file;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Workspace")
    private String workspace;

    private DescribePolarClawAgentFileResponseBody(Builder builder) {
        this.agentId = builder.agentId;
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.file = builder.file;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawAgentFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return file
     */
    public File getFile() {
        return this.file;
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
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String agentId; 
        private String applicationId; 
        private Integer code; 
        private File file; 
        private String message; 
        private String requestId; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(DescribePolarClawAgentFileResponseBody model) {
            this.agentId = model.agentId;
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.file = model.file;
            this.message = model.message;
            this.requestId = model.requestId;
            this.workspace = model.workspace;
        } 

        /**
         * <p>Agent ID</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * File.
         */
        public Builder file(File file) {
            this.file = file;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F45FFACC-xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public DescribePolarClawAgentFileResponseBody build() {
            return new DescribePolarClawAgentFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarClawAgentFileResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawAgentFileResponseBody</p>
     */
    public static class File extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Missing")
        private Boolean missing;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("UpdatedAtMs")
        private Long updatedAtMs;

        private File(Builder builder) {
            this.content = builder.content;
            this.missing = builder.missing;
            this.name = builder.name;
            this.path = builder.path;
            this.size = builder.size;
            this.updatedAtMs = builder.updatedAtMs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static File create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return missing
         */
        public Boolean getMissing() {
            return this.missing;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return updatedAtMs
         */
        public Long getUpdatedAtMs() {
            return this.updatedAtMs;
        }

        public static final class Builder {
            private String content; 
            private Boolean missing; 
            private String name; 
            private String path; 
            private Long size; 
            private Long updatedAtMs; 

            private Builder() {
            } 

            private Builder(File model) {
                this.content = model.content;
                this.missing = model.missing;
                this.name = model.name;
                this.path = model.path;
                this.size = model.size;
                this.updatedAtMs = model.updatedAtMs;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Missing.
             */
            public Builder missing(Boolean missing) {
                this.missing = missing;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * UpdatedAtMs.
             */
            public Builder updatedAtMs(Long updatedAtMs) {
                this.updatedAtMs = updatedAtMs;
                return this;
            }

            public File build() {
                return new File(this);
            } 

        } 

    }
}
