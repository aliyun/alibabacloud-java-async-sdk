// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Quota} extends {@link TeaModel}
 *
 * <p>Quota</p>
 */
public class Quota extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("computeResource")
    private Integer computeResource;

    @com.aliyun.core.annotation.NameInMap("docSize")
    private Integer docSize;

    @com.aliyun.core.annotation.NameInMap("orderType")
    private String orderType;

    @com.aliyun.core.annotation.NameInMap("spec")
    private String spec;

    private Quota(Builder builder) {
        this.computeResource = builder.computeResource;
        this.docSize = builder.docSize;
        this.orderType = builder.orderType;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Quota create() {
        return builder().build();
    }

    /**
     * @return computeResource
     */
    public Integer getComputeResource() {
        return this.computeResource;
    }

    /**
     * @return docSize
     */
    public Integer getDocSize() {
        return this.docSize;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder {
        private Integer computeResource; 
        private Integer docSize; 
        private String orderType; 
        private String spec; 

        /**
         * computeResource.
         */
        public Builder computeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }

        /**
         * docSize.
         */
        public Builder docSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }

        /**
         * orderType.
         */
        public Builder orderType(String orderType) {
            this.orderType = orderType;
            return this;
        }

        /**
         * spec.
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        public Quota build() {
            return new Quota(this);
        } 

    } 

}
