// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MakeDoubleCallRequest} extends {@link RequestModel}
 *
 * <p>MakeDoubleCallRequest</p>
 */
public class MakeDoubleCallRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("BizData")
    private String bizData;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MemberPhone")
    @Validation(required = true)
    private String memberPhone;

    @Query
    @NameInMap("OutboundCallNumber")
    @Validation(required = true)
    private String outboundCallNumber;

    @Query
    @NameInMap("ServicerPhone")
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
         * 账号名称
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * 业务携带数据（JsonString）
         */
        public Builder bizData(String bizData) {
            this.putQueryParameter("BizData", bizData);
            this.bizData = bizData;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 用户手机号
         */
        public Builder memberPhone(String memberPhone) {
            this.putQueryParameter("MemberPhone", memberPhone);
            this.memberPhone = memberPhone;
            return this;
        }

        /**
         * 外呼主叫号码
         */
        public Builder outboundCallNumber(String outboundCallNumber) {
            this.putQueryParameter("OutboundCallNumber", outboundCallNumber);
            this.outboundCallNumber = outboundCallNumber;
            return this;
        }

        /**
         * 坐席手机号（需要通过坐席手机呼叫才需要填写）
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
