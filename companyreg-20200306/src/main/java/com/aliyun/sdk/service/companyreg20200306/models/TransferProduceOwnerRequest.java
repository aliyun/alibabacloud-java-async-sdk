// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

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
 * {@link TransferProduceOwnerRequest} extends {@link RequestModel}
 *
 * <p>TransferProduceOwnerRequest</p>
 */
public class TransferProduceOwnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PersonId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer personId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private TransferProduceOwnerRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.personId = builder.personId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferProduceOwnerRequest create() {
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

    public static final class Builder extends Request.Builder<TransferProduceOwnerRequest, Builder> {
        private String bizId; 
        private String bizType; 
        private Integer personId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(TransferProduceOwnerRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.personId = request.personId;
            this.remark = request.remark;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>P20210208152920000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esp.companyreg_cloud</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15565</p>
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
        public TransferProduceOwnerRequest build() {
            return new TransferProduceOwnerRequest(this);
        } 

    } 

}
