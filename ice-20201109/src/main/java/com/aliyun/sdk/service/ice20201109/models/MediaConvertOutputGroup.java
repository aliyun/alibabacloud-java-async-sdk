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
 * {@link MediaConvertOutputGroup} extends {@link TeaModel}
 *
 * <p>MediaConvertOutputGroup</p>
 */
public class MediaConvertOutputGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupConfig")
    private MediaConvertOutputGroupConfig groupConfig;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Outputs")
    private java.util.List<MediaConvertOutputGroupOutput> outputs;

    private MediaConvertOutputGroup(Builder builder) {
        this.groupConfig = builder.groupConfig;
        this.name = builder.name;
        this.outputs = builder.outputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertOutputGroup create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupConfig
     */
    public MediaConvertOutputGroupConfig getGroupConfig() {
        return this.groupConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return outputs
     */
    public java.util.List<MediaConvertOutputGroupOutput> getOutputs() {
        return this.outputs;
    }

    public static final class Builder {
        private MediaConvertOutputGroupConfig groupConfig; 
        private String name; 
        private java.util.List<MediaConvertOutputGroupOutput> outputs; 

        private Builder() {
        } 

        private Builder(MediaConvertOutputGroup model) {
            this.groupConfig = model.groupConfig;
            this.name = model.name;
            this.outputs = model.outputs;
        } 

        /**
         * GroupConfig.
         */
        public Builder groupConfig(MediaConvertOutputGroupConfig groupConfig) {
            this.groupConfig = groupConfig;
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
         * Outputs.
         */
        public Builder outputs(java.util.List<MediaConvertOutputGroupOutput> outputs) {
            this.outputs = outputs;
            return this;
        }

        public MediaConvertOutputGroup build() {
            return new MediaConvertOutputGroup(this);
        } 

    } 

}
