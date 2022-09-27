// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link KibanaNodeConfiguration} extends {@link TeaModel}
 *
 * <p>KibanaNodeConfiguration</p>
 */
public class KibanaNodeConfiguration extends TeaModel {
    @NameInMap("amount")
    private Long amount;

    @NameInMap("disk")
    private Long disk;

    @NameInMap("spec")
    private String spec;

    private KibanaNodeConfiguration(Builder builder) {
        this.amount = builder.amount;
        this.disk = builder.disk;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KibanaNodeConfiguration create() {
        return builder().build();
    }

    /**
     * @return amount
     */
    public Long getAmount() {
        return this.amount;
    }

    /**
     * @return disk
     */
    public Long getDisk() {
        return this.disk;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder {
        private Long amount; 
        private Long disk; 
        private String spec; 

        /**
         * Kibana节点数量
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Kibana节点磁盘大小
         */
        public Builder disk(Long disk) {
            this.disk = disk;
            return this;
        }

        /**
         * Kibana节点规格
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        public KibanaNodeConfiguration build() {
            return new KibanaNodeConfiguration(this);
        } 

    } 

}
