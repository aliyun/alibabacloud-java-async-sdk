// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMonitorRequest} extends {@link RequestModel}
 *
 * <p>UpdateMonitorRequest</p>
 */
public class UpdateMonitorRequest extends Request {
    @Body
    @NameInMap("AlgorithmVendor")
    @Validation(required = true, maximum = 20, minimum = 1)
    private String algorithmVendor;

    @Body
    @NameInMap("AttributeName")
    @Validation(maximum = 20, minimum = 1)
    private String attributeName;

    @Body
    @NameInMap("AttributeOperateType")
    @Validation(maximum = 20, minimum = 1)
    private String attributeOperateType;

    @Body
    @NameInMap("AttributeValueList")
    @Validation(maximum = 5000, minimum = 1)
    private String attributeValueList;

    @Body
    @NameInMap("CorpId")
    @Validation(maximum = 50, minimum = 1)
    private String corpId;

    @Body
    @NameInMap("Description")
    @Validation(maximum = 100, minimum = 1)
    private String description;

    @Body
    @NameInMap("DeviceList")
    @Validation(maximum = 5000, minimum = 1)
    private String deviceList;

    @Body
    @NameInMap("DeviceOperateType")
    @Validation(maximum = 20, minimum = 1)
    private String deviceOperateType;

    @Body
    @NameInMap("NotifierAppSecret")
    @Validation(maximum = 200, minimum = 1)
    private String notifierAppSecret;

    @Body
    @NameInMap("NotifierExtendValues")
    @Validation(maximum = 200)
    private String notifierExtendValues;

    @Body
    @NameInMap("NotifierTimeOut")
    @Validation(maximum = 3000, minimum = 10)
    private Integer notifierTimeOut;

    @Body
    @NameInMap("NotifierType")
    @Validation(maximum = 20, minimum = 1)
    private String notifierType;

    @Body
    @NameInMap("NotifierUrl")
    @Validation(maximum = 200, minimum = 1)
    private String notifierUrl;

    @Body
    @NameInMap("PicList")
    @Validation(maximum = 5000, minimum = 1)
    private String picList;

    @Body
    @NameInMap("PicOperateType")
    @Validation(maximum = 20, minimum = 1)
    private String picOperateType;

    @Body
    @NameInMap("RuleExpression")
    @Validation(maximum = 200, minimum = 1)
    private String ruleExpression;

    @Body
    @NameInMap("RuleName")
    @Validation(maximum = 20, minimum = 1)
    private String ruleName;

    @Body
    @NameInMap("TaskId")
    @Validation(required = true, maximum = 50, minimum = 1)
    private String taskId;

    private UpdateMonitorRequest(Builder builder) {
        super(builder);
        this.algorithmVendor = builder.algorithmVendor;
        this.attributeName = builder.attributeName;
        this.attributeOperateType = builder.attributeOperateType;
        this.attributeValueList = builder.attributeValueList;
        this.corpId = builder.corpId;
        this.description = builder.description;
        this.deviceList = builder.deviceList;
        this.deviceOperateType = builder.deviceOperateType;
        this.notifierAppSecret = builder.notifierAppSecret;
        this.notifierExtendValues = builder.notifierExtendValues;
        this.notifierTimeOut = builder.notifierTimeOut;
        this.notifierType = builder.notifierType;
        this.notifierUrl = builder.notifierUrl;
        this.picList = builder.picList;
        this.picOperateType = builder.picOperateType;
        this.ruleExpression = builder.ruleExpression;
        this.ruleName = builder.ruleName;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmVendor
     */
    public String getAlgorithmVendor() {
        return this.algorithmVendor;
    }

    /**
     * @return attributeName
     */
    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * @return attributeOperateType
     */
    public String getAttributeOperateType() {
        return this.attributeOperateType;
    }

    /**
     * @return attributeValueList
     */
    public String getAttributeValueList() {
        return this.attributeValueList;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return deviceList
     */
    public String getDeviceList() {
        return this.deviceList;
    }

    /**
     * @return deviceOperateType
     */
    public String getDeviceOperateType() {
        return this.deviceOperateType;
    }

    /**
     * @return notifierAppSecret
     */
    public String getNotifierAppSecret() {
        return this.notifierAppSecret;
    }

    /**
     * @return notifierExtendValues
     */
    public String getNotifierExtendValues() {
        return this.notifierExtendValues;
    }

    /**
     * @return notifierTimeOut
     */
    public Integer getNotifierTimeOut() {
        return this.notifierTimeOut;
    }

    /**
     * @return notifierType
     */
    public String getNotifierType() {
        return this.notifierType;
    }

    /**
     * @return notifierUrl
     */
    public String getNotifierUrl() {
        return this.notifierUrl;
    }

    /**
     * @return picList
     */
    public String getPicList() {
        return this.picList;
    }

    /**
     * @return picOperateType
     */
    public String getPicOperateType() {
        return this.picOperateType;
    }

    /**
     * @return ruleExpression
     */
    public String getRuleExpression() {
        return this.ruleExpression;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<UpdateMonitorRequest, Builder> {
        private String algorithmVendor; 
        private String attributeName; 
        private String attributeOperateType; 
        private String attributeValueList; 
        private String corpId; 
        private String description; 
        private String deviceList; 
        private String deviceOperateType; 
        private String notifierAppSecret; 
        private String notifierExtendValues; 
        private Integer notifierTimeOut; 
        private String notifierType; 
        private String notifierUrl; 
        private String picList; 
        private String picOperateType; 
        private String ruleExpression; 
        private String ruleName; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMonitorRequest response) {
            super(response);
            this.algorithmVendor = response.algorithmVendor;
            this.attributeName = response.attributeName;
            this.attributeOperateType = response.attributeOperateType;
            this.attributeValueList = response.attributeValueList;
            this.corpId = response.corpId;
            this.description = response.description;
            this.deviceList = response.deviceList;
            this.deviceOperateType = response.deviceOperateType;
            this.notifierAppSecret = response.notifierAppSecret;
            this.notifierExtendValues = response.notifierExtendValues;
            this.notifierTimeOut = response.notifierTimeOut;
            this.notifierType = response.notifierType;
            this.notifierUrl = response.notifierUrl;
            this.picList = response.picList;
            this.picOperateType = response.picOperateType;
            this.ruleExpression = response.ruleExpression;
            this.ruleName = response.ruleName;
            this.taskId = response.taskId;
        } 

        /**
         * AlgorithmVendor.
         */
        public Builder algorithmVendor(String algorithmVendor) {
            this.putBodyParameter("AlgorithmVendor", algorithmVendor);
            this.algorithmVendor = algorithmVendor;
            return this;
        }

        /**
         * AttributeName.
         */
        public Builder attributeName(String attributeName) {
            this.putBodyParameter("AttributeName", attributeName);
            this.attributeName = attributeName;
            return this;
        }

        /**
         * AttributeOperateType.
         */
        public Builder attributeOperateType(String attributeOperateType) {
            this.putBodyParameter("AttributeOperateType", attributeOperateType);
            this.attributeOperateType = attributeOperateType;
            return this;
        }

        /**
         * AttributeValueList.
         */
        public Builder attributeValueList(String attributeValueList) {
            this.putBodyParameter("AttributeValueList", attributeValueList);
            this.attributeValueList = attributeValueList;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DeviceList.
         */
        public Builder deviceList(String deviceList) {
            this.putBodyParameter("DeviceList", deviceList);
            this.deviceList = deviceList;
            return this;
        }

        /**
         * DeviceOperateType.
         */
        public Builder deviceOperateType(String deviceOperateType) {
            this.putBodyParameter("DeviceOperateType", deviceOperateType);
            this.deviceOperateType = deviceOperateType;
            return this;
        }

        /**
         * NotifierAppSecret.
         */
        public Builder notifierAppSecret(String notifierAppSecret) {
            this.putBodyParameter("NotifierAppSecret", notifierAppSecret);
            this.notifierAppSecret = notifierAppSecret;
            return this;
        }

        /**
         * NotifierExtendValues.
         */
        public Builder notifierExtendValues(String notifierExtendValues) {
            this.putBodyParameter("NotifierExtendValues", notifierExtendValues);
            this.notifierExtendValues = notifierExtendValues;
            return this;
        }

        /**
         * NotifierTimeOut.
         */
        public Builder notifierTimeOut(Integer notifierTimeOut) {
            this.putBodyParameter("NotifierTimeOut", notifierTimeOut);
            this.notifierTimeOut = notifierTimeOut;
            return this;
        }

        /**
         * NotifierType.
         */
        public Builder notifierType(String notifierType) {
            this.putBodyParameter("NotifierType", notifierType);
            this.notifierType = notifierType;
            return this;
        }

        /**
         * NotifierUrl.
         */
        public Builder notifierUrl(String notifierUrl) {
            this.putBodyParameter("NotifierUrl", notifierUrl);
            this.notifierUrl = notifierUrl;
            return this;
        }

        /**
         * PicList.
         */
        public Builder picList(String picList) {
            this.putBodyParameter("PicList", picList);
            this.picList = picList;
            return this;
        }

        /**
         * PicOperateType.
         */
        public Builder picOperateType(String picOperateType) {
            this.putBodyParameter("PicOperateType", picOperateType);
            this.picOperateType = picOperateType;
            return this;
        }

        /**
         * RuleExpression.
         */
        public Builder ruleExpression(String ruleExpression) {
            this.putBodyParameter("RuleExpression", ruleExpression);
            this.ruleExpression = ruleExpression;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public UpdateMonitorRequest build() {
            return new UpdateMonitorRequest(this);
        } 

    } 

}
