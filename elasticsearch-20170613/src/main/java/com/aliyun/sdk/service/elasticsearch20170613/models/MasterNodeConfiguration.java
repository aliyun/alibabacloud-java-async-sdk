// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link MasterNodeConfiguration} extends {@link TeaModel}
 *
 * <p>MasterNodeConfiguration</p>
 */
public class MasterNodeConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("amount")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 3, minimum = 3)
    private Long amount;

    @com.aliyun.core.annotation.NameInMap("disk")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 20, minimum = 20)
    private Long disk;

    @com.aliyun.core.annotation.NameInMap("diskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskType;

    @com.aliyun.core.annotation.NameInMap("spec")
    @com.aliyun.core.annotation.Validation(required = true)
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(MasterNodeConfiguration model) {
            this.amount = model.amount;
            this.disk = model.disk;
            this.diskType = model.diskType;
            this.spec = model.spec;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder disk(Long disk) {
            this.disk = disk;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder diskType(String diskType) {
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
