// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ReleaseVersionImage} extends {@link TeaModel}
 *
 * <p>ReleaseVersionImage</p>
 */
public class ReleaseVersionImage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cpuArchitecture")
    private String cpuArchitecture;

    @com.aliyun.core.annotation.NameInMap("imageId")
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("runtimeEngineType")
    private String runtimeEngineType;

    private ReleaseVersionImage(Builder builder) {
        this.cpuArchitecture = builder.cpuArchitecture;
        this.imageId = builder.imageId;
        this.runtimeEngineType = builder.runtimeEngineType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseVersionImage create() {
        return builder().build();
    }

    /**
     * @return cpuArchitecture
     */
    public String getCpuArchitecture() {
        return this.cpuArchitecture;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return runtimeEngineType
     */
    public String getRuntimeEngineType() {
        return this.runtimeEngineType;
    }

    public static final class Builder {
        private String cpuArchitecture; 
        private String imageId; 
        private String runtimeEngineType; 

        /**
         * cpuArchitecture.
         */
        public Builder cpuArchitecture(String cpuArchitecture) {
            this.cpuArchitecture = cpuArchitecture;
            return this;
        }

        /**
         * imageId.
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * runtimeEngineType.
         */
        public Builder runtimeEngineType(String runtimeEngineType) {
            this.runtimeEngineType = runtimeEngineType;
            return this;
        }

        public ReleaseVersionImage build() {
            return new ReleaseVersionImage(this);
        } 

    } 

}
