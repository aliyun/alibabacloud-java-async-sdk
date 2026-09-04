// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.codesec20260401.models;

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
 * {@link CreateProjectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProjectResponseBody</p>
 */
public class CreateProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("configRevision")
    private Long configRevision;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("createdBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("engines")
    private Engines engines;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("instructionPrompt")
    private String instructionPrompt;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("source")
    private Source source;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    private CreateProjectResponseBody(Builder builder) {
        this.configRevision = builder.configRevision;
        this.createdAt = builder.createdAt;
        this.createdBy = builder.createdBy;
        this.description = builder.description;
        this.engines = builder.engines;
        this.id = builder.id;
        this.instructionPrompt = builder.instructionPrompt;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.source = builder.source;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configRevision
     */
    public Long getConfigRevision() {
        return this.configRevision;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return engines
     */
    public Engines getEngines() {
        return this.engines;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return instructionPrompt
     */
    public String getInstructionPrompt() {
        return this.instructionPrompt;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return source
     */
    public Source getSource() {
        return this.source;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private Long configRevision; 
        private String createdAt; 
        private String createdBy; 
        private String description; 
        private Engines engines; 
        private Long id; 
        private String instructionPrompt; 
        private String name; 
        private String requestId; 
        private Source source; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(CreateProjectResponseBody model) {
            this.configRevision = model.configRevision;
            this.createdAt = model.createdAt;
            this.createdBy = model.createdBy;
            this.description = model.description;
            this.engines = model.engines;
            this.id = model.id;
            this.instructionPrompt = model.instructionPrompt;
            this.name = model.name;
            this.requestId = model.requestId;
            this.source = model.source;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * configRevision.
         */
        public Builder configRevision(Long configRevision) {
            this.configRevision = configRevision;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * createdBy.
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * engines.
         */
        public Builder engines(Engines engines) {
            this.engines = engines;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * instructionPrompt.
         */
        public Builder instructionPrompt(String instructionPrompt) {
            this.instructionPrompt = instructionPrompt;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * source.
         */
        public Builder source(Source source) {
            this.source = source;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public CreateProjectResponseBody build() {
            return new CreateProjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateProjectResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProjectResponseBody</p>
     */
    public static class Engines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sast")
        private Boolean sast;

        @com.aliyun.core.annotation.NameInMap("sca")
        private Boolean sca;

        private Engines(Builder builder) {
            this.sast = builder.sast;
            this.sca = builder.sca;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Engines create() {
            return builder().build();
        }

        /**
         * @return sast
         */
        public Boolean getSast() {
            return this.sast;
        }

        /**
         * @return sca
         */
        public Boolean getSca() {
            return this.sca;
        }

        public static final class Builder {
            private Boolean sast; 
            private Boolean sca; 

            private Builder() {
            } 

            private Builder(Engines model) {
                this.sast = model.sast;
                this.sca = model.sca;
            } 

            /**
             * sast.
             */
            public Builder sast(Boolean sast) {
                this.sast = sast;
                return this;
            }

            /**
             * sca.
             */
            public Builder sca(Boolean sca) {
                this.sca = sca;
                return this;
            }

            public Engines build() {
                return new Engines(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProjectResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Source(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String type; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.type = model.type;
            } 

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
}
