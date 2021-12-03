// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListLayersResponseBody} extends {@link TeaModel}
 *
 * <p>ListLayersResponseBody</p>
 */
public class ListLayersResponseBody extends TeaModel {
    @NameInMap("layers")
    private java.util.List < Layer > layers;

    @NameInMap("nextToken")
    private String nextToken;


    private ListLayersResponseBody(Builder builder) {
        this.layers = builder.layers;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLayersResponseBody create() {
        return builder().build();
    }

    /**
     * @return layers
     */
    public java.util.List < Layer > getLayers() {
        return this.layers;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List < Layer > layers; 
        private String nextToken; 

        /**
         * <p>层列表</p>
         */
        public Builder layers(java.util.List < Layer > layers) {
            this.layers = layers;
            return this;
        }

        /**
         * <p>剩余列表起始层名</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListLayersResponseBody build() {
            return new ListLayersResponseBody(this);
        } 

    } 

}
