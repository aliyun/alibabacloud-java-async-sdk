// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link CreateSmsSaasTaskNewRequest} extends {@link RequestModel}
 *
 * <p>CreateSmsSaasTaskNewRequest</p>
 */
public class CreateSmsSaasTaskNewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataAbilityTaskId")
    private String dataAbilityTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderTime")
    private String orderTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssFileName")
    private String ossFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneList")
    private String phoneList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleType")
    private String scheduleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsContent")
    private String smsContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsTemplateCode")
    private String smsTemplateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidCount")
    private String validCount;

    private CreateSmsSaasTaskNewRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.dataAbilityTaskId = builder.dataAbilityTaskId;
        this.dataType = builder.dataType;
        this.orderTime = builder.orderTime;
        this.ossFileName = builder.ossFileName;
        this.ownerId = builder.ownerId;
        this.phoneList = builder.phoneList;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scheduleType = builder.scheduleType;
        this.signName = builder.signName;
        this.smsContent = builder.smsContent;
        this.smsTemplateCode = builder.smsTemplateCode;
        this.taskName = builder.taskName;
        this.validCount = builder.validCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmsSaasTaskNewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return dataAbilityTaskId
     */
    public String getDataAbilityTaskId() {
        return this.dataAbilityTaskId;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return orderTime
     */
    public String getOrderTime() {
        return this.orderTime;
    }

    /**
     * @return ossFileName
     */
    public String getOssFileName() {
        return this.ossFileName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneList
     */
    public String getPhoneList() {
        return this.phoneList;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return scheduleType
     */
    public String getScheduleType() {
        return this.scheduleType;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return smsContent
     */
    public String getSmsContent() {
        return this.smsContent;
    }

    /**
     * @return smsTemplateCode
     */
    public String getSmsTemplateCode() {
        return this.smsTemplateCode;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return validCount
     */
    public String getValidCount() {
        return this.validCount;
    }

    public static final class Builder extends Request.Builder<CreateSmsSaasTaskNewRequest, Builder> {
        private String bizType; 
        private String dataAbilityTaskId; 
        private String dataType; 
        private String orderTime; 
        private String ossFileName; 
        private Long ownerId; 
        private String phoneList; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scheduleType; 
        private String signName; 
        private String smsContent; 
        private String smsTemplateCode; 
        private String taskName; 
        private String validCount; 

        private Builder() {
            super();
        } 

        private Builder(CreateSmsSaasTaskNewRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.dataAbilityTaskId = request.dataAbilityTaskId;
            this.dataType = request.dataType;
            this.orderTime = request.orderTime;
            this.ossFileName = request.ossFileName;
            this.ownerId = request.ownerId;
            this.phoneList = request.phoneList;
            this.prodCode = request.prodCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scheduleType = request.scheduleType;
            this.signName = request.signName;
            this.smsContent = request.smsContent;
            this.smsTemplateCode = request.smsTemplateCode;
            this.taskName = request.taskName;
            this.validCount = request.validCount;
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
         * DataAbilityTaskId.
         */
        public Builder dataAbilityTaskId(String dataAbilityTaskId) {
            this.putQueryParameter("DataAbilityTaskId", dataAbilityTaskId);
            this.dataAbilityTaskId = dataAbilityTaskId;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * OrderTime.
         */
        public Builder orderTime(String orderTime) {
            this.putQueryParameter("OrderTime", orderTime);
            this.orderTime = orderTime;
            return this;
        }

        /**
         * OssFileName.
         */
        public Builder ossFileName(String ossFileName) {
            this.putQueryParameter("OssFileName", ossFileName);
            this.ossFileName = ossFileName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PhoneList.
         */
        public Builder phoneList(String phoneList) {
            this.putQueryParameter("PhoneList", phoneList);
            this.phoneList = phoneList;
            return this;
        }

        /**
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ScheduleType.
         */
        public Builder scheduleType(String scheduleType) {
            this.putQueryParameter("ScheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * SignName.
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * SmsContent.
         */
        public Builder smsContent(String smsContent) {
            this.putQueryParameter("SmsContent", smsContent);
            this.smsContent = smsContent;
            return this;
        }

        /**
         * SmsTemplateCode.
         */
        public Builder smsTemplateCode(String smsTemplateCode) {
            this.putQueryParameter("SmsTemplateCode", smsTemplateCode);
            this.smsTemplateCode = smsTemplateCode;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * ValidCount.
         */
        public Builder validCount(String validCount) {
            this.putQueryParameter("ValidCount", validCount);
            this.validCount = validCount;
            return this;
        }

        @Override
        public CreateSmsSaasTaskNewRequest build() {
            return new CreateSmsSaasTaskNewRequest(this);
        } 

    } 

}
