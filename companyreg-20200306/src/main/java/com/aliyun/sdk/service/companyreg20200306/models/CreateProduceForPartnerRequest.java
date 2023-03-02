// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProduceForPartnerRequest} extends {@link RequestModel}
 *
 * <p>CreateProduceForPartnerRequest</p>
 */
public class CreateProduceForPartnerRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("ExtInfo")
    private String extInfo;

    private CreateProduceForPartnerRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.extInfo = builder.extInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProduceForPartnerRequest create() {
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
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    public static final class Builder extends Request.Builder<CreateProduceForPartnerRequest, Builder> {
        private String bizId; 
        private String bizType; 
        private String extInfo; 

        private Builder() {
            super();
        } 

        private Builder(CreateProduceForPartnerRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.extInfo = request.extInfo;
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
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putQueryParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
            return this;
        }

        @Override
        public CreateProduceForPartnerRequest build() {
            return new CreateProduceForPartnerRequest(this);
        } 

    } 

}
