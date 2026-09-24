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
         * <p>The number of dedicated master nodes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * <p>The storage space of dedicated master nodes. Unit: GB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder disk(Long disk) {
            this.disk = disk;
            return this;
        }

        /**
         * <p>The storage type of dedicated master nodes. Valid values:</p>
         * <ul>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_essd (default): Enterprise SSD (ESSD).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        public Builder diskType(String diskType) {
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>The node specifications of dedicated master nodes. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.sn2ne.large</p>
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
