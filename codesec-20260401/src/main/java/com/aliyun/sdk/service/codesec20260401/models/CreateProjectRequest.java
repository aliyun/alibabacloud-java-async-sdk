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
 * {@link CreateProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectRequest</p>
 */
public class CreateProjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 2028)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("engines")
    private Engines engines;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instructionPrompt")
    private String instructionPrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 512)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("source")
    private Source source;

    private CreateProjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.engines = builder.engines;
        this.instructionPrompt = builder.instructionPrompt;
        this.name = builder.name;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return source
     */
    public Source getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CreateProjectRequest, Builder> {
        private String regionId; 
        private String description; 
        private Engines engines; 
        private String instructionPrompt; 
        private String name; 
        private Source source; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.engines = request.engines;
            this.instructionPrompt = request.instructionPrompt;
            this.name = request.name;
            this.source = request.source;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * engines.
         */
        public Builder engines(Engines engines) {
            String enginesShrink = shrink(engines, "engines", "json");
            this.putQueryParameter("engines", enginesShrink);
            this.engines = engines;
            return this;
        }

        /**
         * instructionPrompt.
         */
        public Builder instructionPrompt(String instructionPrompt) {
            this.putQueryParameter("instructionPrompt", instructionPrompt);
            this.instructionPrompt = instructionPrompt;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_paswd_103</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * source.
         */
        public Builder source(Source source) {
            String sourceShrink = shrink(source, "source", "json");
            this.putQueryParameter("source", sourceShrink);
            this.source = source;
            return this;
        }

        @Override
        public CreateProjectRequest build() {
            return new CreateProjectRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
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
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
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
