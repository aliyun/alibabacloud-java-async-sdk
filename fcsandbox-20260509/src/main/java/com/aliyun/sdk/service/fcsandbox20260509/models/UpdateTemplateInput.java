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
 * {@link UpdateTemplateInput} extends {@link TeaModel}
 *
 * <p>UpdateTemplateInput</p>
 */
public class UpdateTemplateInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("containerConfiguration")
    private ContainerConfiguration containerConfiguration;

    @com.aliyun.core.annotation.NameInMap("logConfiguration")
    private LogConfiguration logConfiguration;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    private UpdateTemplateInput(Builder builder) {
        this.containerConfiguration = builder.containerConfiguration;
        this.logConfiguration = builder.logConfiguration;
        this.networkConfiguration = builder.networkConfiguration;
        this.teamID = builder.teamID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTemplateInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containerConfiguration
     */
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    /**
     * @return logConfiguration
     */
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    /**
     * @return networkConfiguration
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    public static final class Builder {
        private ContainerConfiguration containerConfiguration; 
        private LogConfiguration logConfiguration; 
        private NetworkConfiguration networkConfiguration; 
        private String teamID; 

        private Builder() {
        } 

        private Builder(UpdateTemplateInput model) {
            this.containerConfiguration = model.containerConfiguration;
            this.logConfiguration = model.logConfiguration;
            this.networkConfiguration = model.networkConfiguration;
            this.teamID = model.teamID;
        } 

        /**
         * containerConfiguration.
         */
        public Builder containerConfiguration(ContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }

        /**
         * logConfiguration.
         */
        public Builder logConfiguration(LogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        /**
         * networkConfiguration.
         */
        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * teamID.
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        public UpdateTemplateInput build() {
            return new UpdateTemplateInput(this);
        } 

    } 

}
