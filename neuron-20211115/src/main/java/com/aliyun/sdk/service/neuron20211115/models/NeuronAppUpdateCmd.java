// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link NeuronAppUpdateCmd} extends {@link TeaModel}
 *
 * <p>NeuronAppUpdateCmd</p>
 */
public class NeuronAppUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("desc")
    private String desc;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private NeuronAppUpdateCmd(Builder builder) {
        this.desc = builder.desc;
        this.id = builder.id;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronAppUpdateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String desc; 
        private Long id; 
        private String status; 

        private Builder() {
        } 

        private Builder(NeuronAppUpdateCmd model) {
            this.desc = model.desc;
            this.id = model.id;
            this.status = model.status;
        } 

        /**
         * desc.
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public NeuronAppUpdateCmd build() {
            return new NeuronAppUpdateCmd(this);
        } 

    } 

}
