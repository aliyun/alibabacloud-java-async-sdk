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
 * {@link CompanyRoleCreateCmd} extends {@link TeaModel}
 *
 * <p>CompanyRoleCreateCmd</p>
 */
public class CompanyRoleCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("companyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CompanyRoleCreateCmd(Builder builder) {
        this.companyId = builder.companyId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompanyRoleCreateCmd create() {
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

    public static final class Builder {
        private Long companyId; 
        private String name; 

        private Builder() {
        } 

        private Builder(CompanyRoleCreateCmd model) {
            this.companyId = model.companyId;
            this.name = model.name;
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
         * 
         * <strong>example:</strong>
         * <p>多端商城</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public CompanyRoleCreateCmd build() {
            return new CompanyRoleCreateCmd(this);
        } 

    } 

}
