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
 * {@link CreateVolumeInput} extends {@link TeaModel}
 *
 * <p>CreateVolumeInput</p>
 */
public class CreateVolumeInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agenticFSVolumeConfig")
    private AgenticFSVolumeConfig agenticFSVolumeConfig;

    @com.aliyun.core.annotation.NameInMap("ossVolumeConfig")
    private OSSVolumeConfig ossVolumeConfig;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("volumeName")
    private String volumeName;

    private CreateVolumeInput(Builder builder) {
        this.agenticFSVolumeConfig = builder.agenticFSVolumeConfig;
        this.ossVolumeConfig = builder.ossVolumeConfig;
        this.teamID = builder.teamID;
        this.volumeName = builder.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVolumeInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agenticFSVolumeConfig
     */
    public AgenticFSVolumeConfig getAgenticFSVolumeConfig() {
        return this.agenticFSVolumeConfig;
    }

    /**
     * @return ossVolumeConfig
     */
    public OSSVolumeConfig getOssVolumeConfig() {
        return this.ossVolumeConfig;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return volumeName
     */
    public String getVolumeName() {
        return this.volumeName;
    }

    public static final class Builder {
        private AgenticFSVolumeConfig agenticFSVolumeConfig; 
        private OSSVolumeConfig ossVolumeConfig; 
        private String teamID; 
        private String volumeName; 

        private Builder() {
        } 

        private Builder(CreateVolumeInput model) {
            this.agenticFSVolumeConfig = model.agenticFSVolumeConfig;
            this.ossVolumeConfig = model.ossVolumeConfig;
            this.teamID = model.teamID;
            this.volumeName = model.volumeName;
        } 

        /**
         * agenticFSVolumeConfig.
         */
        public Builder agenticFSVolumeConfig(AgenticFSVolumeConfig agenticFSVolumeConfig) {
            this.agenticFSVolumeConfig = agenticFSVolumeConfig;
            return this;
        }

        /**
         * ossVolumeConfig.
         */
        public Builder ossVolumeConfig(OSSVolumeConfig ossVolumeConfig) {
            this.ossVolumeConfig = ossVolumeConfig;
            return this;
        }

        /**
         * teamID.
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * volumeName.
         */
        public Builder volumeName(String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        public CreateVolumeInput build() {
            return new CreateVolumeInput(this);
        } 

    } 

}
