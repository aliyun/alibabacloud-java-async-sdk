// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferIntentionOwnerRequest} extends {@link RequestModel}
 *
 * <p>TransferIntentionOwnerRequest</p>
 */
public class TransferIntentionOwnerRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("PersonId")
    @Validation(required = true)
    private Integer personId;

    @Query
    @NameInMap("Remark")
    private String remark;

    private TransferIntentionOwnerRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.personId = builder.personId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferIntentionOwnerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return personId
     */
    public Integer getPersonId() {
        return this.personId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<TransferIntentionOwnerRequest, Builder> {
        private String bizId; 
        private String bizType; 
        private Integer personId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(TransferIntentionOwnerRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.personId = request.personId;
            this.remark = request.remark;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * PersonId.
         */
        public Builder personId(Integer personId) {
            this.putQueryParameter("PersonId", personId);
            this.personId = personId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public TransferIntentionOwnerRequest build() {
            return new TransferIntentionOwnerRequest(this);
        } 

    } 

}
