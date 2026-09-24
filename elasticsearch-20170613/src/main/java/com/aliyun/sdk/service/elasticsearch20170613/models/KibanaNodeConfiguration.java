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
 * {@link KibanaNodeConfiguration} extends {@link TeaModel}
 *
 * <p>KibanaNodeConfiguration</p>
 */
public class KibanaNodeConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("amount")
    @com.aliyun.core.annotation.Validation(maximum = 1, minimum = 1)
    private Long amount;

    @com.aliyun.core.annotation.NameInMap("disk")
    private Long disk;

    @com.aliyun.core.annotation.NameInMap("spec")
    @com.aliyun.core.annotation.Validation(required = true)
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
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder {
        private Long amount; 
        private Long disk; 
        private String spec; 

        private Builder() {
        } 

        private Builder(KibanaNodeConfiguration model) {
            this.amount = model.amount;
            this.disk = model.disk;
            this.spec = model.spec;
        } 

        /**
         * <p>The number of Kibana nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * <p>The storage space of the Kibana node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder disk(Long disk) {
            this.disk = disk;
            return this;
        }

        /**
         * <p>The Kibana node specifications. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.sn2ne.large</p>
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
