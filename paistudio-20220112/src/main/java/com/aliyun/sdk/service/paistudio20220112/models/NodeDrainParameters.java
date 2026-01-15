// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link NodeDrainParameters} extends {@link TeaModel}
 *
 * <p>NodeDrainParameters</p>
 */
public class NodeDrainParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PodFromSubProducts")
    private java.util.List<String> podFromSubProducts;

    @com.aliyun.core.annotation.NameInMap("PodNames")
    private java.util.List<String> podNames;

    private NodeDrainParameters(Builder builder) {
        this.podFromSubProducts = builder.podFromSubProducts;
        this.podNames = builder.podNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeDrainParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return podFromSubProducts
     */
    public java.util.List<String> getPodFromSubProducts() {
        return this.podFromSubProducts;
    }

    /**
     * @return podNames
     */
    public java.util.List<String> getPodNames() {
        return this.podNames;
    }

    public static final class Builder {
        private java.util.List<String> podFromSubProducts; 
        private java.util.List<String> podNames; 

        private Builder() {
        } 

        private Builder(NodeDrainParameters model) {
            this.podFromSubProducts = model.podFromSubProducts;
            this.podNames = model.podNames;
        } 

        /**
         * PodFromSubProducts.
         */
        public Builder podFromSubProducts(java.util.List<String> podFromSubProducts) {
            this.podFromSubProducts = podFromSubProducts;
            return this;
        }

        /**
         * PodNames.
         */
        public Builder podNames(java.util.List<String> podNames) {
            this.podNames = podNames;
            return this;
        }

        public NodeDrainParameters build() {
            return new NodeDrainParameters(this);
        } 

    } 

}
