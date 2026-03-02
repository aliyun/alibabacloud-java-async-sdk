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
 * {@link BucEnterprise} extends {@link TeaModel}
 *
 * <p>BucEnterprise</p>
 */
public class BucEnterprise extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("codeupEnterpriseId")
    private String codeupEnterpriseId;

    @com.aliyun.core.annotation.NameInMap("codeupNamespaceId")
    private Long codeupNamespaceId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private BucEnterprise(Builder builder) {
        this.accountId = builder.accountId;
        this.codeupEnterpriseId = builder.codeupEnterpriseId;
        this.codeupNamespaceId = builder.codeupNamespaceId;
        this.description = builder.description;
        this.id = builder.id;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BucEnterprise create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return codeupEnterpriseId
     */
    public String getCodeupEnterpriseId() {
        return this.codeupEnterpriseId;
    }

    /**
     * @return codeupNamespaceId
     */
    public Long getCodeupNamespaceId() {
        return this.codeupNamespaceId;
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

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String accountId; 
        private String codeupEnterpriseId; 
        private Long codeupNamespaceId; 
        private String description; 
        private Long id; 
        private String name; 
        private String type; 

        private Builder() {
        } 

        private Builder(BucEnterprise model) {
            this.accountId = model.accountId;
            this.codeupEnterpriseId = model.codeupEnterpriseId;
            this.codeupNamespaceId = model.codeupNamespaceId;
            this.description = model.description;
            this.id = model.id;
            this.name = model.name;
            this.type = model.type;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * codeupEnterpriseId.
         */
        public Builder codeupEnterpriseId(String codeupEnterpriseId) {
            this.codeupEnterpriseId = codeupEnterpriseId;
            return this;
        }

        /**
         * codeupNamespaceId.
         */
        public Builder codeupNamespaceId(Long codeupNamespaceId) {
            this.codeupNamespaceId = codeupNamespaceId;
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
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public BucEnterprise build() {
            return new BucEnterprise(this);
        } 

    } 

}
