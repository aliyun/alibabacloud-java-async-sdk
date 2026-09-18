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
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is default function description by fc-deploy component</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The engine switches for the project or scan snapshot. Only SAST and SCA are supported.</p>
         */
        public Builder engines(Engines engines) {
            String enginesShrink = shrink(engines, "engines", "json");
            this.putQueryParameter("engines", enginesShrink);
            this.engines = engines;
            return this;
        }

        /**
         * <p>The natural language prompt that describes scanning or result processing preferences, such as ignoring low-risk vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>such as ignoring low-severity vulnerabilities, etc.</p>
         */
        public Builder instructionPrompt(String instructionPrompt) {
            this.putQueryParameter("instructionPrompt", instructionPrompt);
            this.instructionPrompt = instructionPrompt;
            return this;
        }

        /**
         * <p>The project name.</p>
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
         * <p>The project source.</p>
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
    public static class SastConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("remediation")
        private Boolean remediation;

        private SastConfig(Builder builder) {
            this.remediation = builder.remediation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SastConfig create() {
            return builder().build();
        }

        /**
         * @return remediation
         */
        public Boolean getRemediation() {
            return this.remediation;
        }

        public static final class Builder {
            private Boolean remediation; 

            private Builder() {
            } 

            private Builder(SastConfig model) {
                this.remediation = model.remediation;
            } 

            /**
             * <p>Specifies whether to generate remediation suggestions.</p>
             */
            public Builder remediation(Boolean remediation) {
                this.remediation = remediation;
                return this;
            }

            public SastConfig build() {
                return new SastConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class ScaConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("remediation")
        private Boolean remediation;

        private ScaConfig(Builder builder) {
            this.remediation = builder.remediation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaConfig create() {
            return builder().build();
        }

        /**
         * @return remediation
         */
        public Boolean getRemediation() {
            return this.remediation;
        }

        public static final class Builder {
            private Boolean remediation; 

            private Builder() {
            } 

            private Builder(ScaConfig model) {
                this.remediation = model.remediation;
            } 

            /**
             * <p>Specifies whether to generate remediation suggestions.</p>
             */
            public Builder remediation(Boolean remediation) {
                this.remediation = remediation;
                return this;
            }

            public ScaConfig build() {
                return new ScaConfig(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("sastConfig")
        private SastConfig sastConfig;

        @com.aliyun.core.annotation.NameInMap("sca")
        private Boolean sca;

        @com.aliyun.core.annotation.NameInMap("scaConfig")
        private ScaConfig scaConfig;

        private Engines(Builder builder) {
            this.sast = builder.sast;
            this.sastConfig = builder.sastConfig;
            this.sca = builder.sca;
            this.scaConfig = builder.scaConfig;
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
         * @return sastConfig
         */
        public SastConfig getSastConfig() {
            return this.sastConfig;
        }

        /**
         * @return sca
         */
        public Boolean getSca() {
            return this.sca;
        }

        /**
         * @return scaConfig
         */
        public ScaConfig getScaConfig() {
            return this.scaConfig;
        }

        public static final class Builder {
            private Boolean sast; 
            private SastConfig sastConfig; 
            private Boolean sca; 
            private ScaConfig scaConfig; 

            private Builder() {
            } 

            private Builder(Engines model) {
                this.sast = model.sast;
                this.sastConfig = model.sastConfig;
                this.sca = model.sca;
                this.scaConfig = model.scaConfig;
            } 

            /**
             * <p>Specifies whether SAST is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sast(Boolean sast) {
                this.sast = sast;
                return this;
            }

            /**
             * <p>The engine-level configuration.</p>
             */
            public Builder sastConfig(SastConfig sastConfig) {
                this.sastConfig = sastConfig;
                return this;
            }

            /**
             * <p>Specifies whether SCA is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sca(Boolean sca) {
                this.sca = sca;
                return this;
            }

            /**
             * <p>The engine-level configuration.</p>
             */
            public Builder scaConfig(ScaConfig scaConfig) {
                this.scaConfig = scaConfig;
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
             * <p>The project type.</p>
             * 
             * <strong>example:</strong>
             * <p>api</p>
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
