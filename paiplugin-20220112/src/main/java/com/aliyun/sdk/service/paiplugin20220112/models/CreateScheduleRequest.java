// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScheduleRequest} extends {@link RequestModel}
 *
 * <p>CreateScheduleRequest</p>
 */
public class CreateScheduleRequest extends Request {
    @Body
    @NameInMap("EndTime")
    private Integer endTime;

    @Body
    @NameInMap("ExecuteTime")
    private String executeTime;

    @Body
    @NameInMap("GroupId")
    private String groupId;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("RepeatCycle")
    private Integer repeatCycle;

    @Body
    @NameInMap("RepeatCycleUnit")
    private Integer repeatCycleUnit;

    @Body
    @NameInMap("RepeatTimes")
    private Integer repeatTimes;

    @Body
    @NameInMap("SignName")
    private String signName;

    @Body
    @NameInMap("SignatureId")
    private String signatureId;

    @Body
    @NameInMap("TemplateCode")
    private String templateCode;

    @Body
    @NameInMap("TemplateId")
    private String templateId;

    private CreateScheduleRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.executeTime = builder.executeTime;
        this.groupId = builder.groupId;
        this.name = builder.name;
        this.repeatCycle = builder.repeatCycle;
        this.repeatCycleUnit = builder.repeatCycleUnit;
        this.repeatTimes = builder.repeatTimes;
        this.signName = builder.signName;
        this.signatureId = builder.signatureId;
        this.templateCode = builder.templateCode;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScheduleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return executeTime
     */
    public String getExecuteTime() {
        return this.executeTime;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return repeatCycle
     */
    public Integer getRepeatCycle() {
        return this.repeatCycle;
    }

    /**
     * @return repeatCycleUnit
     */
    public Integer getRepeatCycleUnit() {
        return this.repeatCycleUnit;
    }

    /**
     * @return repeatTimes
     */
    public Integer getRepeatTimes() {
        return this.repeatTimes;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return signatureId
     */
    public String getSignatureId() {
        return this.signatureId;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<CreateScheduleRequest, Builder> {
        private Integer endTime; 
        private String executeTime; 
        private String groupId; 
        private String name; 
        private Integer repeatCycle; 
        private Integer repeatCycleUnit; 
        private Integer repeatTimes; 
        private String signName; 
        private String signatureId; 
        private String templateCode; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateScheduleRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.executeTime = request.executeTime;
            this.groupId = request.groupId;
            this.name = request.name;
            this.repeatCycle = request.repeatCycle;
            this.repeatCycleUnit = request.repeatCycleUnit;
            this.repeatTimes = request.repeatTimes;
            this.signName = request.signName;
            this.signatureId = request.signatureId;
            this.templateCode = request.templateCode;
            this.templateId = request.templateId;
        } 

        /**
         * ???????????????UTC+8??????
         */
        public Builder endTime(Integer endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ???????????? (UTC+8)????????????????????????
         */
        public Builder executeTime(String executeTime) {
            this.putBodyParameter("ExecuteTime", executeTime);
            this.executeTime = executeTime;
            return this;
        }

        /**
         * ??????Id???
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * ?????????????????????
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ????????????????????????????????????????????????????????????
         */
        public Builder repeatCycle(Integer repeatCycle) {
            this.putBodyParameter("RepeatCycle", repeatCycle);
            this.repeatCycle = repeatCycle;
            return this;
        }

        /**
         * ?????????????????????????????????????????????????????????????????????
         * <p>
         * - 0: ?????????????????????
         * - 1: ?????????
         * - 2: ??????
         * - 3: ??????
         * - 4: ??????
         */
        public Builder repeatCycleUnit(Integer repeatCycleUnit) {
            this.putBodyParameter("RepeatCycleUnit", repeatCycleUnit);
            this.repeatCycleUnit = repeatCycleUnit;
            return this;
        }

        /**
         * ???????????????
         * <p>
         * - -1: ?????????????????????????????????
         * - 0: ????????????
         * - N: ??????N???????????????
         */
        public Builder repeatTimes(Integer repeatTimes) {
            this.putBodyParameter("RepeatTimes", repeatTimes);
            this.repeatTimes = repeatTimes;
            return this;
        }

        /**
         * ?????????
         */
        public Builder signName(String signName) {
            this.putBodyParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * ??????Id?????????????????????
         */
        public Builder signatureId(String signatureId) {
            this.putBodyParameter("SignatureId", signatureId);
            this.signatureId = signatureId;
            return this;
        }

        /**
         * ??????Code???
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * ??????Id??????????????????Code???
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public CreateScheduleRequest build() {
            return new CreateScheduleRequest(this);
        } 

    } 

}
