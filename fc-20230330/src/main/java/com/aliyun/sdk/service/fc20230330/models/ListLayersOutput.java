// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ListLayersOutput} extends {@link TeaModel}
 *
 * <p>ListLayersOutput</p>
 */
public class ListLayersOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("layers")
    private java.util.List<Layer> layers;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListLayersOutput(Builder builder) {
        this.layers = builder.layers;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLayersOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return layers
     */
    public java.util.List<Layer> getLayers() {
        return this.layers;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List<Layer> layers; 
        private String nextToken; 

        private Builder() {
        } 

        private Builder(ListLayersOutput model) {
            this.layers = model.layers;
            this.nextToken = model.nextToken;
        } 

        /**
         * layers.
         */
        public Builder layers(java.util.List<Layer> layers) {
            this.layers = layers;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListLayersOutput build() {
            return new ListLayersOutput(this);
        } 

    } 

}
