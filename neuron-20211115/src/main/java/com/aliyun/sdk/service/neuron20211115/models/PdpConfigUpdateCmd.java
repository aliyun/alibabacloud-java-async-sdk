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
 * {@link PdpConfigUpdateCmd} extends {@link TeaModel}
 *
 * <p>PdpConfigUpdateCmd</p>
 */
public class PdpConfigUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("context")
    @com.aliyun.core.annotation.Validation(required = true)
    private String context;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private PdpConfigUpdateCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.context = builder.context;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpConfigUpdateCmd create() {
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
     * @return context
     */
    public String getContext() {
        return this.context;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder {
        private String accountId; 
        private String context; 
        private Long id; 

        private Builder() {
        } 

        private Builder(PdpConfigUpdateCmd model) {
            this.accountId = model.accountId;
            this.context = model.context;
            this.id = model.id;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        public Builder context(String context) {
            this.context = context;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public PdpConfigUpdateCmd build() {
            return new PdpConfigUpdateCmd(this);
        } 

    } 

}
