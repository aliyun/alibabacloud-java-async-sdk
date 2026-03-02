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
 * {@link PdpServiceGroupUpdateCmd} extends {@link TeaModel}
 *
 * <p>PdpServiceGroupUpdateCmd</p>
 */
public class PdpServiceGroupUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private PdpServiceGroupUpdateCmd(Builder builder) {
        this.alias = builder.alias;
        this.description = builder.description;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpServiceGroupUpdateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder {
        private String alias; 
        private String description; 
        private Long id; 

        private Builder() {
        } 

        private Builder(PdpServiceGroupUpdateCmd model) {
            this.alias = model.alias;
            this.description = model.description;
            this.id = model.id;
        } 

        /**
         * alias.
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
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

        public PdpServiceGroupUpdateCmd build() {
            return new PdpServiceGroupUpdateCmd(this);
        } 

    } 

}
