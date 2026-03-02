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
 * {@link PdpMetadataRoleCreateCmd} extends {@link TeaModel}
 *
 * <p>PdpMetadataRoleCreateCmd</p>
 */
public class PdpMetadataRoleCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("companyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("pbcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pbcId;

    private PdpMetadataRoleCreateCmd(Builder builder) {
        this.companyId = builder.companyId;
        this.name = builder.name;
        this.pbcId = builder.pbcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpMetadataRoleCreateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pbcId
     */
    public Long getPbcId() {
        return this.pbcId;
    }

    public static final class Builder {
        private Long companyId; 
        private String name; 
        private Long pbcId; 

        private Builder() {
        } 

        private Builder(PdpMetadataRoleCreateCmd model) {
            this.companyId = model.companyId;
            this.name = model.name;
            this.pbcId = model.pbcId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pbcId(Long pbcId) {
            this.pbcId = pbcId;
            return this;
        }

        public PdpMetadataRoleCreateCmd build() {
            return new PdpMetadataRoleCreateCmd(this);
        } 

    } 

}
