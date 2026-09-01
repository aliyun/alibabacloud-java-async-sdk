// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link CreateTemplateInput} extends {@link TeaModel}
 *
 * <p>CreateTemplateInput</p>
 */
public class CreateTemplateInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("buildConfig")
    private CreateTemplateBuildConfig buildConfig;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("runtimeConfig")
    private CreateTemplateRuntimeConfig runtimeConfig;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    private CreateTemplateInput(Builder builder) {
        this.buildConfig = builder.buildConfig;
        this.name = builder.name;
        this.runtimeConfig = builder.runtimeConfig;
        this.teamID = builder.teamID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildConfig
     */
    public CreateTemplateBuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return runtimeConfig
     */
    public CreateTemplateRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    public static final class Builder {
        private CreateTemplateBuildConfig buildConfig; 
        private String name; 
        private CreateTemplateRuntimeConfig runtimeConfig; 
        private String teamID; 

        private Builder() {
        } 

        private Builder(CreateTemplateInput model) {
            this.buildConfig = model.buildConfig;
            this.name = model.name;
            this.runtimeConfig = model.runtimeConfig;
            this.teamID = model.teamID;
        } 

        /**
         * buildConfig.
         */
        public Builder buildConfig(CreateTemplateBuildConfig buildConfig) {
            this.buildConfig = buildConfig;
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
         * runtimeConfig.
         */
        public Builder runtimeConfig(CreateTemplateRuntimeConfig runtimeConfig) {
            this.runtimeConfig = runtimeConfig;
            return this;
        }

        /**
         * teamID.
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        public CreateTemplateInput build() {
            return new CreateTemplateInput(this);
        } 

    } 

}
