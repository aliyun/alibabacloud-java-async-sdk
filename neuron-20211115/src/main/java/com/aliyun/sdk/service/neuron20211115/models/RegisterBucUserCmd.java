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
 * {@link RegisterBucUserCmd} extends {@link TeaModel}
 *
 * <p>RegisterBucUserCmd</p>
 */
public class RegisterBucUserCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    @com.aliyun.core.annotation.NameInMap("enterpriseName")
    private String enterpriseName;

    private RegisterBucUserCmd(Builder builder) {
        this.enterpriseId = builder.enterpriseId;
        this.enterpriseName = builder.enterpriseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterBucUserCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return enterpriseName
     */
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public static final class Builder {
        private Long enterpriseId; 
        private String enterpriseName; 

        private Builder() {
        } 

        private Builder(RegisterBucUserCmd model) {
            this.enterpriseId = model.enterpriseId;
            this.enterpriseName = model.enterpriseName;
        } 

        /**
         * enterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * enterpriseName.
         */
        public Builder enterpriseName(String enterpriseName) {
            this.enterpriseName = enterpriseName;
            return this;
        }

        public RegisterBucUserCmd build() {
            return new RegisterBucUserCmd(this);
        } 

    } 

}
