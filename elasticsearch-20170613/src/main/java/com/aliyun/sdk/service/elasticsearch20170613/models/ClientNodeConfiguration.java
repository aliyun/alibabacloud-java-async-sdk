// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClientNodeConfiguration} extends {@link TeaModel}
 *
 * <p>ClientNodeConfiguration</p>
 */
public class ClientNodeConfiguration extends TeaModel {
    @NameInMap("amount")
    @Validation(required = true, maximum = 25, minimum = 2)
    private Long amount;

    @NameInMap("disk")
    @Validation(required = true, maximum = 20, minimum = 20)
    private Long disk;

    @NameInMap("diskType")
    @Validation(required = true)
    private String diskType;

    @NameInMap("spec")
    @Validation(required = true)
    private String spec;

    private ClientNodeConfiguration(Builder builder) {
        this.amount = builder.amount;
        this.disk = builder.disk;
        this.diskType = builder.diskType;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClientNodeConfiguration create() {
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
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
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
        private String diskType; 
        private String spec; 

        /**
         * 协调节点数量
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * 协调节点磁盘大小
         */
        public Builder disk(Long disk) {
            this.disk = disk;
            return this;
        }

        /**
         * 协调节点磁盘类型
         */
        public Builder diskType(String diskType) {
            this.diskType = diskType;
            return this;
        }

        /**
         * 协调节点规格
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        public ClientNodeConfiguration build() {
            return new ClientNodeConfiguration(this);
        } 

    } 

}
