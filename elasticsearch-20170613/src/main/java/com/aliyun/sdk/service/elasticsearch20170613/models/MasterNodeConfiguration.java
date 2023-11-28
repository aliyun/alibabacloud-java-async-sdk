// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MasterNodeConfiguration} extends {@link TeaModel}
 *
 * <p>MasterNodeConfiguration</p>
 */
public class MasterNodeConfiguration extends TeaModel {
    @NameInMap("amount")
    @Validation(required = true, maximum = 3, minimum = 3)
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

    private MasterNodeConfiguration(Builder builder) {
        this.amount = builder.amount;
        this.disk = builder.disk;
        this.diskType = builder.diskType;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MasterNodeConfiguration create() {
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
         * amount.
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * disk.
         */
        public Builder disk(Long disk) {
            this.disk = disk;
            return this;
        }

        /**
         * diskType.
         */
        public Builder diskType(String diskType) {
            this.diskType = diskType;
            return this;
        }

        /**
         * spec.
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        public MasterNodeConfiguration build() {
            return new MasterNodeConfiguration(this);
        } 

    } 

}
