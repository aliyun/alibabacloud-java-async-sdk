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
 * {@link OperateProduceForPartnerRequest} extends {@link RequestModel}
 *
 * <p>OperateProduceForPartnerRequest</p>
 */
public class OperateProduceForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private String extInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    private String operateType;

    private OperateProduceForPartnerRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.extInfo = builder.extInfo;
        this.operateType = builder.operateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateProduceForPartnerRequest create() {
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

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    public static final class Builder extends Request.Builder<OperateProduceForPartnerRequest, Builder> {
        private String bizId; 
        private String bizType; 
        private String extInfo; 
        private String operateType; 

        private Builder() {
            super();
        } 

        private Builder(OperateProduceForPartnerRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.extInfo = request.extInfo;
            this.operateType = request.operateType;
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

        /**
         * OperateType.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        @Override
        public OperateProduceForPartnerRequest build() {
            return new OperateProduceForPartnerRequest(this);
        } 

    } 

}
