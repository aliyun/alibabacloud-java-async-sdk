// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLayerVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLayerVersionsResponseBody</p>
 */
public class ListLayerVersionsResponseBody extends TeaModel {
    @NameInMap("layers")
    private java.util.List < Layer > layers;

    @NameInMap("nextVersion")
    private Integer nextVersion;

    private ListLayerVersionsResponseBody(Builder builder) {
        this.layers = builder.layers;
        this.nextVersion = builder.nextVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLayerVersionsResponseBody create() {
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
         * The information about layer versions.
         */
        public Builder layers(java.util.List < Layer > layers) {
            this.layers = layers;
            return this;
        }

        /**
         * The initial version of the layer for the next query.
         */
        public Builder nextVersion(Integer nextVersion) {
            this.nextVersion = nextVersion;
            return this;
        }

        public ListLayerVersionsResponseBody build() {
            return new ListLayerVersionsResponseBody(this);
        } 

    } 

}
