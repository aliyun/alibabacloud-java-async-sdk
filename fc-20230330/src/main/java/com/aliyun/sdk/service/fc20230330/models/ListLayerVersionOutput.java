// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLayerVersionOutput} extends {@link TeaModel}
 *
 * <p>ListLayerVersionOutput</p>
 */
public class ListLayerVersionOutput extends TeaModel {
    @NameInMap("layers")
    private java.util.List < Layer > layers;

    @NameInMap("nextVersion")
    private Integer nextVersion;

    private ListLayerVersionOutput(Builder builder) {
        this.layers = builder.layers;
        this.nextVersion = builder.nextVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLayerVersionOutput create() {
        return builder().build();
    }

    /**
     * @return layers
     */
    public java.util.List < Layer > getLayers() {
        return this.layers;
    }

    /**
     * @return nextVersion
     */
    public Integer getNextVersion() {
        return this.nextVersion;
    }

    public static final class Builder {
        private java.util.List < Layer > layers; 
        private Integer nextVersion; 

        /**
         * layers.
         */
        public Builder layers(java.util.List < Layer > layers) {
            this.layers = layers;
            return this;
        }

        /**
         * nextVersion.
         */
        public Builder nextVersion(Integer nextVersion) {
            this.nextVersion = nextVersion;
            return this;
        }

        public ListLayerVersionOutput build() {
            return new ListLayerVersionOutput(this);
        } 

    } 

}
