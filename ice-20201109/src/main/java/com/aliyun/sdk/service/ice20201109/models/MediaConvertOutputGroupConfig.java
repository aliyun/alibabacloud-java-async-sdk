// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link MediaConvertOutputGroupConfig} extends {@link TeaModel}
 *
 * <p>MediaConvertOutputGroupConfig</p>
 */
public class MediaConvertOutputGroupConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ManifestName")
    private String manifestName;

    @com.aliyun.core.annotation.NameInMap("OutputFileBase")
    private MediaObject outputFileBase;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private MediaConvertOutputGroupConfig(Builder builder) {
        this.manifestName = builder.manifestName;
        this.outputFileBase = builder.outputFileBase;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertOutputGroupConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return manifestName
     */
    public String getManifestName() {
        return this.manifestName;
    }

    /**
     * @return outputFileBase
     */
    public MediaObject getOutputFileBase() {
        return this.outputFileBase;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String manifestName; 
        private MediaObject outputFileBase; 
        private String type; 

        private Builder() {
        } 

        private Builder(MediaConvertOutputGroupConfig model) {
            this.manifestName = model.manifestName;
            this.outputFileBase = model.outputFileBase;
            this.type = model.type;
        } 

        /**
         * ManifestName.
         */
        public Builder manifestName(String manifestName) {
            this.manifestName = manifestName;
            return this;
        }

        /**
         * OutputFileBase.
         */
        public Builder outputFileBase(MediaObject outputFileBase) {
            this.outputFileBase = outputFileBase;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public MediaConvertOutputGroupConfig build() {
            return new MediaConvertOutputGroupConfig(this);
        } 

    } 

}
