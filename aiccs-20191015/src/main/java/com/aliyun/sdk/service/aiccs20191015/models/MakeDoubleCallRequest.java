// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link MakeDoubleCallRequest} extends {@link RequestModel}
 *
 * <p>MakeDoubleCallRequest</p>
 */
public class MakeDoubleCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizData")
    private String bizData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberPhone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memberPhone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutboundCallNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outboundCallNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServicerPhone")
    private String servicerPhone;

    private MakeDoubleCallRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.bizData = builder.bizData;
        this.instanceId = builder.instanceId;
        this.memberPhone = builder.memberPhone;
        this.outboundCallNumber = builder.outboundCallNumber;
        this.servicerPhone = builder.servicerPhone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MakeDoubleCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return bizData
     */
    public String getBizData() {
        return this.bizData;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return memberPhone
     */
    public String getMemberPhone() {
        return this.memberPhone;
    }

    /**
     * @return outboundCallNumber
     */
    public String getOutboundCallNumber() {
        return this.outboundCallNumber;
    }

    /**
     * @return servicerPhone
     */
    public String getServicerPhone() {
        return this.servicerPhone;
    }

    public static final class Builder extends Request.Builder<MakeDoubleCallRequest, Builder> {
        private String accountName; 
        private String bizData; 
        private String instanceId; 
        private String memberPhone; 
        private String outboundCallNumber; 
        private String servicerPhone; 

        private Builder() {
            super();
        } 

        private Builder(MakeDoubleCallRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.bizData = request.bizData;
            this.instanceId = request.instanceId;
            this.memberPhone = request.memberPhone;
            this.outboundCallNumber = request.outboundCallNumber;
            this.servicerPhone = request.servicerPhone;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * BizData.
         */
        public Builder bizData(String bizData) {
            this.putQueryParameter("BizData", bizData);
            this.bizData = bizData;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1502123****</p>
         */
        public Builder memberPhone(String memberPhone) {
            this.putQueryParameter("MemberPhone", memberPhone);
            this.memberPhone = memberPhone;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0571000****</p>
         */
        public Builder outboundCallNumber(String outboundCallNumber) {
            this.putQueryParameter("OutboundCallNumber", outboundCallNumber);
            this.outboundCallNumber = outboundCallNumber;
            return this;
        }

        /**
         * ServicerPhone.
         */
        public Builder servicerPhone(String servicerPhone) {
            this.putQueryParameter("ServicerPhone", servicerPhone);
            this.servicerPhone = servicerPhone;
            return this;
        }

        @Override
        public MakeDoubleCallRequest build() {
            return new MakeDoubleCallRequest(this);
        } 

    } 

}
