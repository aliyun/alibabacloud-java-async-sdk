// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link SafeChangeCheckRequest} extends {@link RequestModel}
 *
 * <p>SafeChangeCheckRequest</p>
 */
public class SafeChangeCheckRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AffectCustomer")
    private String affectCustomer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApproveFlowParam")
    private ApproveFlowParam approveFlowParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthSign")
    private String authSign;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BgCustomTemplateExtraDTO")
    private BgCustomTemplateExtraDTO bgCustomTemplateExtraDTO;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BlockInfos")
    private java.util.List<BlockInfos> blockInfos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallBackInfo")
    private CallBackInfo callBackInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeDataType")
    private String changeDataType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeDesc")
    private String changeDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeEndTime")
    private Long changeEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeEnv")
    private String changeEnv;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeItems")
    private String changeItems;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeObject")
    private String changeObject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeOptSubType")
    private String changeOptSubType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeOptType")
    private String changeOptType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeReason")
    private String changeReason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeRmarks")
    private String changeRmarks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeSchemes")
    private String changeSchemes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeStartTime")
    private Long changeStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeSubTypeDesc")
    private String changeSubTypeDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeSystem")
    private String changeSystem;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeTimes")
    private java.util.List<ChangeTimes> changeTimes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeTitle")
    private String changeTitle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeValidation")
    private String changeValidation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Checker")
    private java.util.List<String> checker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreatorEmpId")
    private String creatorEmpId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DamagedChangeNotices")
    private java.util.List<DamagedChangeNotices> damagedChangeNotices;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecutorEmpId")
    private String executorEmpId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Follower")
    private java.util.List<String> follower;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GrayStatus")
    private String grayStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmChangeNoticeEnum")
    private String harmChangeNoticeEnum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HarmNoticeCombineParam")
    private HarmNoticeCombineParam harmNoticeCombineParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Incidence")
    private String incidence;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InfluenceInfo")
    private InfluenceInfo influenceInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Instance")
    private Instance instance;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NeedModifyDoc")
    private String needModifyDoc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperateEmpNo")
    private String operateEmpNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Product")
    private java.util.List<Product> product;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReleasePackageInfos")
    private java.util.List<ReleasePackageInfos> releasePackageInfos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReqTimestamp")
    private Long reqTimestamp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReuseSourceOrderId")
    private String reuseSourceOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rollback")
    private String rollback;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceName")
    private String sourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceOrderId")
    private String sourceOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceUrl")
    private String sourceUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("whiteType")
    private Integer whiteType;

    private SafeChangeCheckRequest(Builder builder) {
        super(builder);
        this.affectCustomer = builder.affectCustomer;
        this.approveFlowParam = builder.approveFlowParam;
        this.authKey = builder.authKey;
        this.authSign = builder.authSign;
        this.bgCustomTemplateExtraDTO = builder.bgCustomTemplateExtraDTO;
        this.blockInfos = builder.blockInfos;
        this.callBackInfo = builder.callBackInfo;
        this.changeDataType = builder.changeDataType;
        this.changeDesc = builder.changeDesc;
        this.changeEndTime = builder.changeEndTime;
        this.changeEnv = builder.changeEnv;
        this.changeItems = builder.changeItems;
        this.changeObject = builder.changeObject;
        this.changeOptSubType = builder.changeOptSubType;
        this.changeOptType = builder.changeOptType;
        this.changeReason = builder.changeReason;
        this.changeRmarks = builder.changeRmarks;
        this.changeSchemes = builder.changeSchemes;
        this.changeStartTime = builder.changeStartTime;
        this.changeSubTypeDesc = builder.changeSubTypeDesc;
        this.changeSystem = builder.changeSystem;
        this.changeTimes = builder.changeTimes;
        this.changeTitle = builder.changeTitle;
        this.changeValidation = builder.changeValidation;
        this.checker = builder.checker;
        this.creatorEmpId = builder.creatorEmpId;
        this.damagedChangeNotices = builder.damagedChangeNotices;
        this.executorEmpId = builder.executorEmpId;
        this.extraInfo = builder.extraInfo;
        this.follower = builder.follower;
        this.grayStatus = builder.grayStatus;
        this.harmChangeNoticeEnum = builder.harmChangeNoticeEnum;
        this.harmNoticeCombineParam = builder.harmNoticeCombineParam;
        this.incidence = builder.incidence;
        this.influenceInfo = builder.influenceInfo;
        this.instance = builder.instance;
        this.needModifyDoc = builder.needModifyDoc;
        this.operateEmpNo = builder.operateEmpNo;
        this.product = builder.product;
        this.releasePackageInfos = builder.releasePackageInfos;
        this.reqTimestamp = builder.reqTimestamp;
        this.reuseSourceOrderId = builder.reuseSourceOrderId;
        this.riskLevel = builder.riskLevel;
        this.rollback = builder.rollback;
        this.sourceName = builder.sourceName;
        this.sourceOrderId = builder.sourceOrderId;
        this.sourceUrl = builder.sourceUrl;
        this.whiteType = builder.whiteType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SafeChangeCheckRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return affectCustomer
     */
    public String getAffectCustomer() {
        return this.affectCustomer;
    }

    /**
     * @return approveFlowParam
     */
    public ApproveFlowParam getApproveFlowParam() {
        return this.approveFlowParam;
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return authSign
     */
    public String getAuthSign() {
        return this.authSign;
    }

    /**
     * @return bgCustomTemplateExtraDTO
     */
    public BgCustomTemplateExtraDTO getBgCustomTemplateExtraDTO() {
        return this.bgCustomTemplateExtraDTO;
    }

    /**
     * @return blockInfos
     */
    public java.util.List<BlockInfos> getBlockInfos() {
        return this.blockInfos;
    }

    /**
     * @return callBackInfo
     */
    public CallBackInfo getCallBackInfo() {
        return this.callBackInfo;
    }

    /**
     * @return changeDataType
     */
    public String getChangeDataType() {
        return this.changeDataType;
    }

    /**
     * @return changeDesc
     */
    public String getChangeDesc() {
        return this.changeDesc;
    }

    /**
     * @return changeEndTime
     */
    public Long getChangeEndTime() {
        return this.changeEndTime;
    }

    /**
     * @return changeEnv
     */
    public String getChangeEnv() {
        return this.changeEnv;
    }

    /**
     * @return changeItems
     */
    public String getChangeItems() {
        return this.changeItems;
    }

    /**
     * @return changeObject
     */
    public String getChangeObject() {
        return this.changeObject;
    }

    /**
     * @return changeOptSubType
     */
    public String getChangeOptSubType() {
        return this.changeOptSubType;
    }

    /**
     * @return changeOptType
     */
    public String getChangeOptType() {
        return this.changeOptType;
    }

    /**
     * @return changeReason
     */
    public String getChangeReason() {
        return this.changeReason;
    }

    /**
     * @return changeRmarks
     */
    public String getChangeRmarks() {
        return this.changeRmarks;
    }

    /**
     * @return changeSchemes
     */
    public String getChangeSchemes() {
        return this.changeSchemes;
    }

    /**
     * @return changeStartTime
     */
    public Long getChangeStartTime() {
        return this.changeStartTime;
    }

    /**
     * @return changeSubTypeDesc
     */
    public String getChangeSubTypeDesc() {
        return this.changeSubTypeDesc;
    }

    /**
     * @return changeSystem
     */
    public String getChangeSystem() {
        return this.changeSystem;
    }

    /**
     * @return changeTimes
     */
    public java.util.List<ChangeTimes> getChangeTimes() {
        return this.changeTimes;
    }

    /**
     * @return changeTitle
     */
    public String getChangeTitle() {
        return this.changeTitle;
    }

    /**
     * @return changeValidation
     */
    public String getChangeValidation() {
        return this.changeValidation;
    }

    /**
     * @return checker
     */
    public java.util.List<String> getChecker() {
        return this.checker;
    }

    /**
     * @return creatorEmpId
     */
    public String getCreatorEmpId() {
        return this.creatorEmpId;
    }

    /**
     * @return damagedChangeNotices
     */
    public java.util.List<DamagedChangeNotices> getDamagedChangeNotices() {
        return this.damagedChangeNotices;
    }

    /**
     * @return executorEmpId
     */
    public String getExecutorEmpId() {
        return this.executorEmpId;
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return follower
     */
    public java.util.List<String> getFollower() {
        return this.follower;
    }

    /**
     * @return grayStatus
     */
    public String getGrayStatus() {
        return this.grayStatus;
    }

    /**
     * @return harmChangeNoticeEnum
     */
    public String getHarmChangeNoticeEnum() {
        return this.harmChangeNoticeEnum;
    }

    /**
     * @return harmNoticeCombineParam
     */
    public HarmNoticeCombineParam getHarmNoticeCombineParam() {
        return this.harmNoticeCombineParam;
    }

    /**
     * @return incidence
     */
    public String getIncidence() {
        return this.incidence;
    }

    /**
     * @return influenceInfo
     */
    public InfluenceInfo getInfluenceInfo() {
        return this.influenceInfo;
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
    }

    /**
     * @return needModifyDoc
     */
    public String getNeedModifyDoc() {
        return this.needModifyDoc;
    }

    /**
     * @return operateEmpNo
     */
    public String getOperateEmpNo() {
        return this.operateEmpNo;
    }

    /**
     * @return product
     */
    public java.util.List<Product> getProduct() {
        return this.product;
    }

    /**
     * @return releasePackageInfos
     */
    public java.util.List<ReleasePackageInfos> getReleasePackageInfos() {
        return this.releasePackageInfos;
    }

    /**
     * @return reqTimestamp
     */
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    /**
     * @return reuseSourceOrderId
     */
    public String getReuseSourceOrderId() {
        return this.reuseSourceOrderId;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return rollback
     */
    public String getRollback() {
        return this.rollback;
    }

    /**
     * @return sourceName
     */
    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * @return sourceOrderId
     */
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    /**
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    /**
     * @return whiteType
     */
    public Integer getWhiteType() {
        return this.whiteType;
    }

    public static final class Builder extends Request.Builder<SafeChangeCheckRequest, Builder> {
        private String affectCustomer; 
        private ApproveFlowParam approveFlowParam; 
        private String authKey; 
        private String authSign; 
        private BgCustomTemplateExtraDTO bgCustomTemplateExtraDTO; 
        private java.util.List<BlockInfos> blockInfos; 
        private CallBackInfo callBackInfo; 
        private String changeDataType; 
        private String changeDesc; 
        private Long changeEndTime; 
        private String changeEnv; 
        private String changeItems; 
        private String changeObject; 
        private String changeOptSubType; 
        private String changeOptType; 
        private String changeReason; 
        private String changeRmarks; 
        private String changeSchemes; 
        private Long changeStartTime; 
        private String changeSubTypeDesc; 
        private String changeSystem; 
        private java.util.List<ChangeTimes> changeTimes; 
        private String changeTitle; 
        private String changeValidation; 
        private java.util.List<String> checker; 
        private String creatorEmpId; 
        private java.util.List<DamagedChangeNotices> damagedChangeNotices; 
        private String executorEmpId; 
        private String extraInfo; 
        private java.util.List<String> follower; 
        private String grayStatus; 
        private String harmChangeNoticeEnum; 
        private HarmNoticeCombineParam harmNoticeCombineParam; 
        private String incidence; 
        private InfluenceInfo influenceInfo; 
        private Instance instance; 
        private String needModifyDoc; 
        private String operateEmpNo; 
        private java.util.List<Product> product; 
        private java.util.List<ReleasePackageInfos> releasePackageInfos; 
        private Long reqTimestamp; 
        private String reuseSourceOrderId; 
        private String riskLevel; 
        private String rollback; 
        private String sourceName; 
        private String sourceOrderId; 
        private String sourceUrl; 
        private Integer whiteType; 

        private Builder() {
            super();
        } 

        private Builder(SafeChangeCheckRequest request) {
            super(request);
            this.affectCustomer = request.affectCustomer;
            this.approveFlowParam = request.approveFlowParam;
            this.authKey = request.authKey;
            this.authSign = request.authSign;
            this.bgCustomTemplateExtraDTO = request.bgCustomTemplateExtraDTO;
            this.blockInfos = request.blockInfos;
            this.callBackInfo = request.callBackInfo;
            this.changeDataType = request.changeDataType;
            this.changeDesc = request.changeDesc;
            this.changeEndTime = request.changeEndTime;
            this.changeEnv = request.changeEnv;
            this.changeItems = request.changeItems;
            this.changeObject = request.changeObject;
            this.changeOptSubType = request.changeOptSubType;
            this.changeOptType = request.changeOptType;
            this.changeReason = request.changeReason;
            this.changeRmarks = request.changeRmarks;
            this.changeSchemes = request.changeSchemes;
            this.changeStartTime = request.changeStartTime;
            this.changeSubTypeDesc = request.changeSubTypeDesc;
            this.changeSystem = request.changeSystem;
            this.changeTimes = request.changeTimes;
            this.changeTitle = request.changeTitle;
            this.changeValidation = request.changeValidation;
            this.checker = request.checker;
            this.creatorEmpId = request.creatorEmpId;
            this.damagedChangeNotices = request.damagedChangeNotices;
            this.executorEmpId = request.executorEmpId;
            this.extraInfo = request.extraInfo;
            this.follower = request.follower;
            this.grayStatus = request.grayStatus;
            this.harmChangeNoticeEnum = request.harmChangeNoticeEnum;
            this.harmNoticeCombineParam = request.harmNoticeCombineParam;
            this.incidence = request.incidence;
            this.influenceInfo = request.influenceInfo;
            this.instance = request.instance;
            this.needModifyDoc = request.needModifyDoc;
            this.operateEmpNo = request.operateEmpNo;
            this.product = request.product;
            this.releasePackageInfos = request.releasePackageInfos;
            this.reqTimestamp = request.reqTimestamp;
            this.reuseSourceOrderId = request.reuseSourceOrderId;
            this.riskLevel = request.riskLevel;
            this.rollback = request.rollback;
            this.sourceName = request.sourceName;
            this.sourceOrderId = request.sourceOrderId;
            this.sourceUrl = request.sourceUrl;
            this.whiteType = request.whiteType;
        } 

        /**
         * AffectCustomer.
         */
        public Builder affectCustomer(String affectCustomer) {
            this.putBodyParameter("AffectCustomer", affectCustomer);
            this.affectCustomer = affectCustomer;
            return this;
        }

        /**
         * ApproveFlowParam.
         */
        public Builder approveFlowParam(ApproveFlowParam approveFlowParam) {
            this.putBodyParameter("ApproveFlowParam", approveFlowParam);
            this.approveFlowParam = approveFlowParam;
            return this;
        }

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putBodyParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * AuthSign.
         */
        public Builder authSign(String authSign) {
            this.putBodyParameter("AuthSign", authSign);
            this.authSign = authSign;
            return this;
        }

        /**
         * BgCustomTemplateExtraDTO.
         */
        public Builder bgCustomTemplateExtraDTO(BgCustomTemplateExtraDTO bgCustomTemplateExtraDTO) {
            this.putBodyParameter("BgCustomTemplateExtraDTO", bgCustomTemplateExtraDTO);
            this.bgCustomTemplateExtraDTO = bgCustomTemplateExtraDTO;
            return this;
        }

        /**
         * BlockInfos.
         */
        public Builder blockInfos(java.util.List<BlockInfos> blockInfos) {
            this.putBodyParameter("BlockInfos", blockInfos);
            this.blockInfos = blockInfos;
            return this;
        }

        /**
         * CallBackInfo.
         */
        public Builder callBackInfo(CallBackInfo callBackInfo) {
            this.putBodyParameter("CallBackInfo", callBackInfo);
            this.callBackInfo = callBackInfo;
            return this;
        }

        /**
         * ChangeDataType.
         */
        public Builder changeDataType(String changeDataType) {
            this.putBodyParameter("ChangeDataType", changeDataType);
            this.changeDataType = changeDataType;
            return this;
        }

        /**
         * ChangeDesc.
         */
        public Builder changeDesc(String changeDesc) {
            this.putBodyParameter("ChangeDesc", changeDesc);
            this.changeDesc = changeDesc;
            return this;
        }

        /**
         * ChangeEndTime.
         */
        public Builder changeEndTime(Long changeEndTime) {
            this.putBodyParameter("ChangeEndTime", changeEndTime);
            this.changeEndTime = changeEndTime;
            return this;
        }

        /**
         * ChangeEnv.
         */
        public Builder changeEnv(String changeEnv) {
            this.putBodyParameter("ChangeEnv", changeEnv);
            this.changeEnv = changeEnv;
            return this;
        }

        /**
         * ChangeItems.
         */
        public Builder changeItems(String changeItems) {
            this.putBodyParameter("ChangeItems", changeItems);
            this.changeItems = changeItems;
            return this;
        }

        /**
         * ChangeObject.
         */
        public Builder changeObject(String changeObject) {
            this.putBodyParameter("ChangeObject", changeObject);
            this.changeObject = changeObject;
            return this;
        }

        /**
         * ChangeOptSubType.
         */
        public Builder changeOptSubType(String changeOptSubType) {
            this.putBodyParameter("ChangeOptSubType", changeOptSubType);
            this.changeOptSubType = changeOptSubType;
            return this;
        }

        /**
         * ChangeOptType.
         */
        public Builder changeOptType(String changeOptType) {
            this.putBodyParameter("ChangeOptType", changeOptType);
            this.changeOptType = changeOptType;
            return this;
        }

        /**
         * ChangeReason.
         */
        public Builder changeReason(String changeReason) {
            this.putBodyParameter("ChangeReason", changeReason);
            this.changeReason = changeReason;
            return this;
        }

        /**
         * ChangeRmarks.
         */
        public Builder changeRmarks(String changeRmarks) {
            this.putBodyParameter("ChangeRmarks", changeRmarks);
            this.changeRmarks = changeRmarks;
            return this;
        }

        /**
         * ChangeSchemes.
         */
        public Builder changeSchemes(String changeSchemes) {
            this.putBodyParameter("ChangeSchemes", changeSchemes);
            this.changeSchemes = changeSchemes;
            return this;
        }

        /**
         * ChangeStartTime.
         */
        public Builder changeStartTime(Long changeStartTime) {
            this.putBodyParameter("ChangeStartTime", changeStartTime);
            this.changeStartTime = changeStartTime;
            return this;
        }

        /**
         * ChangeSubTypeDesc.
         */
        public Builder changeSubTypeDesc(String changeSubTypeDesc) {
            this.putBodyParameter("ChangeSubTypeDesc", changeSubTypeDesc);
            this.changeSubTypeDesc = changeSubTypeDesc;
            return this;
        }

        /**
         * ChangeSystem.
         */
        public Builder changeSystem(String changeSystem) {
            this.putBodyParameter("ChangeSystem", changeSystem);
            this.changeSystem = changeSystem;
            return this;
        }

        /**
         * ChangeTimes.
         */
        public Builder changeTimes(java.util.List<ChangeTimes> changeTimes) {
            this.putBodyParameter("ChangeTimes", changeTimes);
            this.changeTimes = changeTimes;
            return this;
        }

        /**
         * ChangeTitle.
         */
        public Builder changeTitle(String changeTitle) {
            this.putBodyParameter("ChangeTitle", changeTitle);
            this.changeTitle = changeTitle;
            return this;
        }

        /**
         * ChangeValidation.
         */
        public Builder changeValidation(String changeValidation) {
            this.putBodyParameter("ChangeValidation", changeValidation);
            this.changeValidation = changeValidation;
            return this;
        }

        /**
         * Checker.
         */
        public Builder checker(java.util.List<String> checker) {
            this.putQueryParameter("Checker", checker);
            this.checker = checker;
            return this;
        }

        /**
         * CreatorEmpId.
         */
        public Builder creatorEmpId(String creatorEmpId) {
            this.putBodyParameter("CreatorEmpId", creatorEmpId);
            this.creatorEmpId = creatorEmpId;
            return this;
        }

        /**
         * DamagedChangeNotices.
         */
        public Builder damagedChangeNotices(java.util.List<DamagedChangeNotices> damagedChangeNotices) {
            this.putBodyParameter("DamagedChangeNotices", damagedChangeNotices);
            this.damagedChangeNotices = damagedChangeNotices;
            return this;
        }

        /**
         * ExecutorEmpId.
         */
        public Builder executorEmpId(String executorEmpId) {
            this.putBodyParameter("ExecutorEmpId", executorEmpId);
            this.executorEmpId = executorEmpId;
            return this;
        }

        /**
         * ExtraInfo.
         */
        public Builder extraInfo(String extraInfo) {
            this.putBodyParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * Follower.
         */
        public Builder follower(java.util.List<String> follower) {
            this.putBodyParameter("Follower", follower);
            this.follower = follower;
            return this;
        }

        /**
         * GrayStatus.
         */
        public Builder grayStatus(String grayStatus) {
            this.putBodyParameter("GrayStatus", grayStatus);
            this.grayStatus = grayStatus;
            return this;
        }

        /**
         * HarmChangeNoticeEnum.
         */
        public Builder harmChangeNoticeEnum(String harmChangeNoticeEnum) {
            this.putQueryParameter("HarmChangeNoticeEnum", harmChangeNoticeEnum);
            this.harmChangeNoticeEnum = harmChangeNoticeEnum;
            return this;
        }

        /**
         * HarmNoticeCombineParam.
         */
        public Builder harmNoticeCombineParam(HarmNoticeCombineParam harmNoticeCombineParam) {
            String harmNoticeCombineParamShrink = shrink(harmNoticeCombineParam, "HarmNoticeCombineParam", "json");
            this.putBodyParameter("HarmNoticeCombineParam", harmNoticeCombineParamShrink);
            this.harmNoticeCombineParam = harmNoticeCombineParam;
            return this;
        }

        /**
         * Incidence.
         */
        public Builder incidence(String incidence) {
            this.putBodyParameter("Incidence", incidence);
            this.incidence = incidence;
            return this;
        }

        /**
         * InfluenceInfo.
         */
        public Builder influenceInfo(InfluenceInfo influenceInfo) {
            this.putBodyParameter("InfluenceInfo", influenceInfo);
            this.influenceInfo = influenceInfo;
            return this;
        }

        /**
         * Instance.
         */
        public Builder instance(Instance instance) {
            this.putBodyParameter("Instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * NeedModifyDoc.
         */
        public Builder needModifyDoc(String needModifyDoc) {
            this.putBodyParameter("NeedModifyDoc", needModifyDoc);
            this.needModifyDoc = needModifyDoc;
            return this;
        }

        /**
         * OperateEmpNo.
         */
        public Builder operateEmpNo(String operateEmpNo) {
            this.putBodyParameter("OperateEmpNo", operateEmpNo);
            this.operateEmpNo = operateEmpNo;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(java.util.List<Product> product) {
            this.putBodyParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * ReleasePackageInfos.
         */
        public Builder releasePackageInfos(java.util.List<ReleasePackageInfos> releasePackageInfos) {
            this.putBodyParameter("ReleasePackageInfos", releasePackageInfos);
            this.releasePackageInfos = releasePackageInfos;
            return this;
        }

        /**
         * ReqTimestamp.
         */
        public Builder reqTimestamp(Long reqTimestamp) {
            this.putBodyParameter("ReqTimestamp", reqTimestamp);
            this.reqTimestamp = reqTimestamp;
            return this;
        }

        /**
         * ReuseSourceOrderId.
         */
        public Builder reuseSourceOrderId(String reuseSourceOrderId) {
            this.putBodyParameter("ReuseSourceOrderId", reuseSourceOrderId);
            this.reuseSourceOrderId = reuseSourceOrderId;
            return this;
        }

        /**
         * RiskLevel.
         */
        public Builder riskLevel(String riskLevel) {
            this.putBodyParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * Rollback.
         */
        public Builder rollback(String rollback) {
            this.putBodyParameter("Rollback", rollback);
            this.rollback = rollback;
            return this;
        }

        /**
         * SourceName.
         */
        public Builder sourceName(String sourceName) {
            this.putBodyParameter("SourceName", sourceName);
            this.sourceName = sourceName;
            return this;
        }

        /**
         * SourceOrderId.
         */
        public Builder sourceOrderId(String sourceOrderId) {
            this.putBodyParameter("SourceOrderId", sourceOrderId);
            this.sourceOrderId = sourceOrderId;
            return this;
        }

        /**
         * SourceUrl.
         */
        public Builder sourceUrl(String sourceUrl) {
            this.putBodyParameter("SourceUrl", sourceUrl);
            this.sourceUrl = sourceUrl;
            return this;
        }

        /**
         * whiteType.
         */
        public Builder whiteType(Integer whiteType) {
            this.putBodyParameter("whiteType", whiteType);
            this.whiteType = whiteType;
            return this;
        }

        @Override
        public SafeChangeCheckRequest build() {
            return new SafeChangeCheckRequest(this);
        } 

    } 

    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class ApproverDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApproveDesc")
        private String approveDesc;

        @com.aliyun.core.annotation.NameInMap("ApproveTime")
        private Long approveTime;

        @com.aliyun.core.annotation.NameInMap("ApproverId")
        private String approverId;

        @com.aliyun.core.annotation.NameInMap("ApproverName")
        private String approverName;

        @com.aliyun.core.annotation.NameInMap("Opinion")
        private Integer opinion;

        private ApproverDTO(Builder builder) {
            this.approveDesc = builder.approveDesc;
            this.approveTime = builder.approveTime;
            this.approverId = builder.approverId;
            this.approverName = builder.approverName;
            this.opinion = builder.opinion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApproverDTO create() {
            return builder().build();
        }

        /**
         * @return approveDesc
         */
        public String getApproveDesc() {
            return this.approveDesc;
        }

        /**
         * @return approveTime
         */
        public Long getApproveTime() {
            return this.approveTime;
        }

        /**
         * @return approverId
         */
        public String getApproverId() {
            return this.approverId;
        }

        /**
         * @return approverName
         */
        public String getApproverName() {
            return this.approverName;
        }

        /**
         * @return opinion
         */
        public Integer getOpinion() {
            return this.opinion;
        }

        public static final class Builder {
            private String approveDesc; 
            private Long approveTime; 
            private String approverId; 
            private String approverName; 
            private Integer opinion; 

            private Builder() {
            } 

            private Builder(ApproverDTO model) {
                this.approveDesc = model.approveDesc;
                this.approveTime = model.approveTime;
                this.approverId = model.approverId;
                this.approverName = model.approverName;
                this.opinion = model.opinion;
            } 

            /**
             * ApproveDesc.
             */
            public Builder approveDesc(String approveDesc) {
                this.approveDesc = approveDesc;
                return this;
            }

            /**
             * ApproveTime.
             */
            public Builder approveTime(Long approveTime) {
                this.approveTime = approveTime;
                return this;
            }

            /**
             * ApproverId.
             */
            public Builder approverId(String approverId) {
                this.approverId = approverId;
                return this;
            }

            /**
             * ApproverName.
             */
            public Builder approverName(String approverName) {
                this.approverName = approverName;
                return this;
            }

            /**
             * Opinion.
             */
            public Builder opinion(Integer opinion) {
                this.opinion = opinion;
                return this;
            }

            public ApproverDTO build() {
                return new ApproverDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class ApproveNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApproverDTO")
        private java.util.List<ApproverDTO> approverDTO;

        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        private Integer nodeStatus;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("ProcessNodeOrder")
        private Integer processNodeOrder;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private Integer strategy;

        private ApproveNodes(Builder builder) {
            this.approverDTO = builder.approverDTO;
            this.nodeStatus = builder.nodeStatus;
            this.processName = builder.processName;
            this.processNodeOrder = builder.processNodeOrder;
            this.strategy = builder.strategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApproveNodes create() {
            return builder().build();
        }

        /**
         * @return approverDTO
         */
        public java.util.List<ApproverDTO> getApproverDTO() {
            return this.approverDTO;
        }

        /**
         * @return nodeStatus
         */
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        /**
         * @return processNodeOrder
         */
        public Integer getProcessNodeOrder() {
            return this.processNodeOrder;
        }

        /**
         * @return strategy
         */
        public Integer getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private java.util.List<ApproverDTO> approverDTO; 
            private Integer nodeStatus; 
            private String processName; 
            private Integer processNodeOrder; 
            private Integer strategy; 

            private Builder() {
            } 

            private Builder(ApproveNodes model) {
                this.approverDTO = model.approverDTO;
                this.nodeStatus = model.nodeStatus;
                this.processName = model.processName;
                this.processNodeOrder = model.processNodeOrder;
                this.strategy = model.strategy;
            } 

            /**
             * ApproverDTO.
             */
            public Builder approverDTO(java.util.List<ApproverDTO> approverDTO) {
                this.approverDTO = approverDTO;
                return this;
            }

            /**
             * NodeStatus.
             */
            public Builder nodeStatus(Integer nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * ProcessName.
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * ProcessNodeOrder.
             */
            public Builder processNodeOrder(Integer processNodeOrder) {
                this.processNodeOrder = processNodeOrder;
                return this;
            }

            /**
             * Strategy.
             */
            public Builder strategy(Integer strategy) {
                this.strategy = strategy;
                return this;
            }

            public ApproveNodes build() {
                return new ApproveNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class ApproveFlowParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApproveNodes")
        private java.util.List<ApproveNodes> approveNodes;

        @com.aliyun.core.annotation.NameInMap("FlowStatus")
        private Integer flowStatus;

        private ApproveFlowParam(Builder builder) {
            this.approveNodes = builder.approveNodes;
            this.flowStatus = builder.flowStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApproveFlowParam create() {
            return builder().build();
        }

        /**
         * @return approveNodes
         */
        public java.util.List<ApproveNodes> getApproveNodes() {
            return this.approveNodes;
        }

        /**
         * @return flowStatus
         */
        public Integer getFlowStatus() {
            return this.flowStatus;
        }

        public static final class Builder {
            private java.util.List<ApproveNodes> approveNodes; 
            private Integer flowStatus; 

            private Builder() {
            } 

            private Builder(ApproveFlowParam model) {
                this.approveNodes = model.approveNodes;
                this.flowStatus = model.flowStatus;
            } 

            /**
             * ApproveNodes.
             */
            public Builder approveNodes(java.util.List<ApproveNodes> approveNodes) {
                this.approveNodes = approveNodes;
                return this;
            }

            /**
             * FlowStatus.
             */
            public Builder flowStatus(Integer flowStatus) {
                this.flowStatus = flowStatus;
                return this;
            }

            public ApproveFlowParam build() {
                return new ApproveFlowParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class BgCustomTemplateExtraDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BgCustomTemplateInfo")
        private String bgCustomTemplateInfo;

        private BgCustomTemplateExtraDTO(Builder builder) {
            this.bgCustomTemplateInfo = builder.bgCustomTemplateInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BgCustomTemplateExtraDTO create() {
            return builder().build();
        }

        /**
         * @return bgCustomTemplateInfo
         */
        public String getBgCustomTemplateInfo() {
            return this.bgCustomTemplateInfo;
        }

        public static final class Builder {
            private String bgCustomTemplateInfo; 

            private Builder() {
            } 

            private Builder(BgCustomTemplateExtraDTO model) {
                this.bgCustomTemplateInfo = model.bgCustomTemplateInfo;
            } 

            /**
             * BgCustomTemplateInfo.
             */
            public Builder bgCustomTemplateInfo(String bgCustomTemplateInfo) {
                this.bgCustomTemplateInfo = bgCustomTemplateInfo;
                return this;
            }

            public BgCustomTemplateExtraDTO build() {
                return new BgCustomTemplateExtraDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class HitInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HitInfo")
        private String hitInfo;

        @com.aliyun.core.annotation.NameInMap("HitObject")
        private String hitObject;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        private HitInfos(Builder builder) {
            this.hitInfo = builder.hitInfo;
            this.hitObject = builder.hitObject;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitInfos create() {
            return builder().build();
        }

        /**
         * @return hitInfo
         */
        public String getHitInfo() {
            return this.hitInfo;
        }

        /**
         * @return hitObject
         */
        public String getHitObject() {
            return this.hitObject;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        public static final class Builder {
            private String hitInfo; 
            private String hitObject; 
            private String scope; 

            private Builder() {
            } 

            private Builder(HitInfos model) {
                this.hitInfo = model.hitInfo;
                this.hitObject = model.hitObject;
                this.scope = model.scope;
            } 

            /**
             * HitInfo.
             */
            public Builder hitInfo(String hitInfo) {
                this.hitInfo = hitInfo;
                return this;
            }

            /**
             * HitObject.
             */
            public Builder hitObject(String hitObject) {
                this.hitObject = hitObject;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            public HitInfos build() {
                return new HitInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class BlockInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HitInfos")
        private java.util.List<HitInfos> hitInfos;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        private BlockInfos(Builder builder) {
            this.hitInfos = builder.hitInfos;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockInfos create() {
            return builder().build();
        }

        /**
         * @return hitInfos
         */
        public java.util.List<HitInfos> getHitInfos() {
            return this.hitInfos;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private java.util.List<HitInfos> hitInfos; 
            private Long id; 

            private Builder() {
            } 

            private Builder(BlockInfos model) {
                this.hitInfos = model.hitInfos;
                this.id = model.id;
            } 

            /**
             * HitInfos.
             */
            public Builder hitInfos(java.util.List<HitInfos> hitInfos) {
                this.hitInfos = hitInfos;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public BlockInfos build() {
                return new BlockInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class CallBackInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Api")
        private String api;

        @com.aliyun.core.annotation.NameInMap("ApiVersion")
        private String apiVersion;

        @com.aliyun.core.annotation.NameInMap("EndPoint")
        private String endPoint;

        @com.aliyun.core.annotation.NameInMap("PopProduct")
        private String popProduct;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private CallBackInfo(Builder builder) {
            this.api = builder.api;
            this.apiVersion = builder.apiVersion;
            this.endPoint = builder.endPoint;
            this.popProduct = builder.popProduct;
            this.regionId = builder.regionId;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallBackInfo create() {
            return builder().build();
        }

        /**
         * @return api
         */
        public String getApi() {
            return this.api;
        }

        /**
         * @return apiVersion
         */
        public String getApiVersion() {
            return this.apiVersion;
        }

        /**
         * @return endPoint
         */
        public String getEndPoint() {
            return this.endPoint;
        }

        /**
         * @return popProduct
         */
        public String getPopProduct() {
            return this.popProduct;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String api; 
            private String apiVersion; 
            private String endPoint; 
            private String popProduct; 
            private String regionId; 
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(CallBackInfo model) {
                this.api = model.api;
                this.apiVersion = model.apiVersion;
                this.endPoint = model.endPoint;
                this.popProduct = model.popProduct;
                this.regionId = model.regionId;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * Api.
             */
            public Builder api(String api) {
                this.api = api;
                return this;
            }

            /**
             * ApiVersion.
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * EndPoint.
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * PopProduct.
             */
            public Builder popProduct(String popProduct) {
                this.popProduct = popProduct;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public CallBackInfo build() {
                return new CallBackInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class ChangeTimes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeEndTime")
        private Long changeEndTime;

        @com.aliyun.core.annotation.NameInMap("ChangeStartTime")
        private Long changeStartTime;

        private ChangeTimes(Builder builder) {
            this.changeEndTime = builder.changeEndTime;
            this.changeStartTime = builder.changeStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeTimes create() {
            return builder().build();
        }

        /**
         * @return changeEndTime
         */
        public Long getChangeEndTime() {
            return this.changeEndTime;
        }

        /**
         * @return changeStartTime
         */
        public Long getChangeStartTime() {
            return this.changeStartTime;
        }

        public static final class Builder {
            private Long changeEndTime; 
            private Long changeStartTime; 

            private Builder() {
            } 

            private Builder(ChangeTimes model) {
                this.changeEndTime = model.changeEndTime;
                this.changeStartTime = model.changeStartTime;
            } 

            /**
             * ChangeEndTime.
             */
            public Builder changeEndTime(Long changeEndTime) {
                this.changeEndTime = changeEndTime;
                return this;
            }

            /**
             * ChangeStartTime.
             */
            public Builder changeStartTime(Long changeStartTime) {
                this.changeStartTime = changeStartTime;
                return this;
            }

            public ChangeTimes build() {
                return new ChangeTimes(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class CustomerInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private java.util.Map<String, ?> extraInfo;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        private CustomerInfo(Builder builder) {
            this.extraInfo = builder.extraInfo;
            this.type = builder.type;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerInfo create() {
            return builder().build();
        }

        /**
         * @return extraInfo
         */
        public java.util.Map<String, ?> getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private java.util.Map<String, ?> extraInfo; 
            private String type; 
            private String uid; 

            private Builder() {
            } 

            private Builder(CustomerInfo model) {
                this.extraInfo = model.extraInfo;
                this.type = model.type;
                this.uid = model.uid;
            } 

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(java.util.Map<String, ?> extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public CustomerInfo build() {
                return new CustomerInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class SensitiveCustomers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerInfo")
        private java.util.List<CustomerInfo> customerInfo;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        private SensitiveCustomers(Builder builder) {
            this.customerInfo = builder.customerInfo;
            this.productCode = builder.productCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveCustomers create() {
            return builder().build();
        }

        /**
         * @return customerInfo
         */
        public java.util.List<CustomerInfo> getCustomerInfo() {
            return this.customerInfo;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        public static final class Builder {
            private java.util.List<CustomerInfo> customerInfo; 
            private String productCode; 

            private Builder() {
            } 

            private Builder(SensitiveCustomers model) {
                this.customerInfo = model.customerInfo;
                this.productCode = model.productCode;
            } 

            /**
             * CustomerInfo.
             */
            public Builder customerInfo(java.util.List<CustomerInfo> customerInfo) {
                this.customerInfo = customerInfo;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            public SensitiveCustomers build() {
                return new SensitiveCustomers(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class DamagedChangeNotices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BgCancelNoticeContent")
        private String bgCancelNoticeContent;

        @com.aliyun.core.annotation.NameInMap("BgCancelNoticeEventId")
        private String bgCancelNoticeEventId;

        @com.aliyun.core.annotation.NameInMap("Channel")
        private java.util.List<String> channel;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("SensitiveCustomers")
        private java.util.List<SensitiveCustomers> sensitiveCustomers;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DamagedChangeNotices(Builder builder) {
            this.bgCancelNoticeContent = builder.bgCancelNoticeContent;
            this.bgCancelNoticeEventId = builder.bgCancelNoticeEventId;
            this.channel = builder.channel;
            this.content = builder.content;
            this.eventId = builder.eventId;
            this.sensitiveCustomers = builder.sensitiveCustomers;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DamagedChangeNotices create() {
            return builder().build();
        }

        /**
         * @return bgCancelNoticeContent
         */
        public String getBgCancelNoticeContent() {
            return this.bgCancelNoticeContent;
        }

        /**
         * @return bgCancelNoticeEventId
         */
        public String getBgCancelNoticeEventId() {
            return this.bgCancelNoticeEventId;
        }

        /**
         * @return channel
         */
        public java.util.List<String> getChannel() {
            return this.channel;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return sensitiveCustomers
         */
        public java.util.List<SensitiveCustomers> getSensitiveCustomers() {
            return this.sensitiveCustomers;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bgCancelNoticeContent; 
            private String bgCancelNoticeEventId; 
            private java.util.List<String> channel; 
            private String content; 
            private String eventId; 
            private java.util.List<SensitiveCustomers> sensitiveCustomers; 
            private String type; 

            private Builder() {
            } 

            private Builder(DamagedChangeNotices model) {
                this.bgCancelNoticeContent = model.bgCancelNoticeContent;
                this.bgCancelNoticeEventId = model.bgCancelNoticeEventId;
                this.channel = model.channel;
                this.content = model.content;
                this.eventId = model.eventId;
                this.sensitiveCustomers = model.sensitiveCustomers;
                this.type = model.type;
            } 

            /**
             * BgCancelNoticeContent.
             */
            public Builder bgCancelNoticeContent(String bgCancelNoticeContent) {
                this.bgCancelNoticeContent = bgCancelNoticeContent;
                return this;
            }

            /**
             * BgCancelNoticeEventId.
             */
            public Builder bgCancelNoticeEventId(String bgCancelNoticeEventId) {
                this.bgCancelNoticeEventId = bgCancelNoticeEventId;
                return this;
            }

            /**
             * Channel.
             */
            public Builder channel(java.util.List<String> channel) {
                this.channel = channel;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * SensitiveCustomers.
             */
            public Builder sensitiveCustomers(java.util.List<SensitiveCustomers> sensitiveCustomers) {
                this.sensitiveCustomers = sensitiveCustomers;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DamagedChangeNotices build() {
                return new DamagedChangeNotices(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class HarmNoticeCombineParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Combine")
        private Boolean combine;

        @com.aliyun.core.annotation.NameInMap("CombineMark")
        private String combineMark;

        @com.aliyun.core.annotation.NameInMap("CombineRule")
        private String combineRule;

        private HarmNoticeCombineParam(Builder builder) {
            this.combine = builder.combine;
            this.combineMark = builder.combineMark;
            this.combineRule = builder.combineRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HarmNoticeCombineParam create() {
            return builder().build();
        }

        /**
         * @return combine
         */
        public Boolean getCombine() {
            return this.combine;
        }

        /**
         * @return combineMark
         */
        public String getCombineMark() {
            return this.combineMark;
        }

        /**
         * @return combineRule
         */
        public String getCombineRule() {
            return this.combineRule;
        }

        public static final class Builder {
            private Boolean combine; 
            private String combineMark; 
            private String combineRule; 

            private Builder() {
            } 

            private Builder(HarmNoticeCombineParam model) {
                this.combine = model.combine;
                this.combineMark = model.combineMark;
                this.combineRule = model.combineRule;
            } 

            /**
             * Combine.
             */
            public Builder combine(Boolean combine) {
                this.combine = combine;
                return this;
            }

            /**
             * CombineMark.
             */
            public Builder combineMark(String combineMark) {
                this.combineMark = combineMark;
                return this;
            }

            /**
             * CombineRule.
             */
            public Builder combineRule(String combineRule) {
                this.combineRule = combineRule;
                return this;
            }

            public HarmNoticeCombineParam build() {
                return new HarmNoticeCombineParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class NoticeInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private java.util.List<String> channel;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        private NoticeInfos(Builder builder) {
            this.channel = builder.channel;
            this.content = builder.content;
            this.eventId = builder.eventId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoticeInfos create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public java.util.List<String> getChannel() {
            return this.channel;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        public static final class Builder {
            private java.util.List<String> channel; 
            private String content; 
            private String eventId; 

            private Builder() {
            } 

            private Builder(NoticeInfos model) {
                this.channel = model.channel;
                this.content = model.content;
                this.eventId = model.eventId;
            } 

            /**
             * Channel.
             */
            public Builder channel(java.util.List<String> channel) {
                this.channel = channel;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            public NoticeInfos build() {
                return new NoticeInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class SensitiveCustomersCustomerInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private java.util.Map<String, ?> extraInfo;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        private SensitiveCustomersCustomerInfo(Builder builder) {
            this.extraInfo = builder.extraInfo;
            this.type = builder.type;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveCustomersCustomerInfo create() {
            return builder().build();
        }

        /**
         * @return extraInfo
         */
        public java.util.Map<String, ?> getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private java.util.Map<String, ?> extraInfo; 
            private String type; 
            private String uid; 

            private Builder() {
            } 

            private Builder(SensitiveCustomersCustomerInfo model) {
                this.extraInfo = model.extraInfo;
                this.type = model.type;
                this.uid = model.uid;
            } 

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(java.util.Map<String, ?> extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public SensitiveCustomersCustomerInfo build() {
                return new SensitiveCustomersCustomerInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class InfluenceInfoSensitiveCustomers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerInfo")
        private java.util.List<SensitiveCustomersCustomerInfo> customerInfo;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        private InfluenceInfoSensitiveCustomers(Builder builder) {
            this.customerInfo = builder.customerInfo;
            this.productCode = builder.productCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InfluenceInfoSensitiveCustomers create() {
            return builder().build();
        }

        /**
         * @return customerInfo
         */
        public java.util.List<SensitiveCustomersCustomerInfo> getCustomerInfo() {
            return this.customerInfo;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        public static final class Builder {
            private java.util.List<SensitiveCustomersCustomerInfo> customerInfo; 
            private String productCode; 

            private Builder() {
            } 

            private Builder(InfluenceInfoSensitiveCustomers model) {
                this.customerInfo = model.customerInfo;
                this.productCode = model.productCode;
            } 

            /**
             * CustomerInfo.
             */
            public Builder customerInfo(java.util.List<SensitiveCustomersCustomerInfo> customerInfo) {
                this.customerInfo = customerInfo;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            public InfluenceInfoSensitiveCustomers build() {
                return new InfluenceInfoSensitiveCustomers(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class InfluenceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NoticeInfos")
        private java.util.List<NoticeInfos> noticeInfos;

        @com.aliyun.core.annotation.NameInMap("SensitiveCustomers")
        private java.util.List<InfluenceInfoSensitiveCustomers> sensitiveCustomers;

        private InfluenceInfo(Builder builder) {
            this.noticeInfos = builder.noticeInfos;
            this.sensitiveCustomers = builder.sensitiveCustomers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InfluenceInfo create() {
            return builder().build();
        }

        /**
         * @return noticeInfos
         */
        public java.util.List<NoticeInfos> getNoticeInfos() {
            return this.noticeInfos;
        }

        /**
         * @return sensitiveCustomers
         */
        public java.util.List<InfluenceInfoSensitiveCustomers> getSensitiveCustomers() {
            return this.sensitiveCustomers;
        }

        public static final class Builder {
            private java.util.List<NoticeInfos> noticeInfos; 
            private java.util.List<InfluenceInfoSensitiveCustomers> sensitiveCustomers; 

            private Builder() {
            } 

            private Builder(InfluenceInfo model) {
                this.noticeInfos = model.noticeInfos;
                this.sensitiveCustomers = model.sensitiveCustomers;
            } 

            /**
             * NoticeInfos.
             */
            public Builder noticeInfos(java.util.List<NoticeInfos> noticeInfos) {
                this.noticeInfos = noticeInfos;
                return this;
            }

            /**
             * SensitiveCustomers.
             */
            public Builder sensitiveCustomers(java.util.List<InfluenceInfoSensitiveCustomers> sensitiveCustomers) {
                this.sensitiveCustomers = sensitiveCustomers;
                return this;
            }

            public InfluenceInfo build() {
                return new InfluenceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nc")
        private java.util.List<String> nc;

        @com.aliyun.core.annotation.NameInMap("Uids")
        private java.util.List<String> uids;

        @com.aliyun.core.annotation.NameInMap("attributionApp")
        private java.util.List<String> attributionApp;

        @com.aliyun.core.annotation.NameInMap("influenceApp")
        private java.util.List<String> influenceApp;

        @com.aliyun.core.annotation.NameInMap("instance")
        private java.util.List<String> instance;

        private Instance(Builder builder) {
            this.nc = builder.nc;
            this.uids = builder.uids;
            this.attributionApp = builder.attributionApp;
            this.influenceApp = builder.influenceApp;
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return nc
         */
        public java.util.List<String> getNc() {
            return this.nc;
        }

        /**
         * @return uids
         */
        public java.util.List<String> getUids() {
            return this.uids;
        }

        /**
         * @return attributionApp
         */
        public java.util.List<String> getAttributionApp() {
            return this.attributionApp;
        }

        /**
         * @return influenceApp
         */
        public java.util.List<String> getInfluenceApp() {
            return this.influenceApp;
        }

        /**
         * @return instance
         */
        public java.util.List<String> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List<String> nc; 
            private java.util.List<String> uids; 
            private java.util.List<String> attributionApp; 
            private java.util.List<String> influenceApp; 
            private java.util.List<String> instance; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.nc = model.nc;
                this.uids = model.uids;
                this.attributionApp = model.attributionApp;
                this.influenceApp = model.influenceApp;
                this.instance = model.instance;
            } 

            /**
             * Nc.
             */
            public Builder nc(java.util.List<String> nc) {
                this.nc = nc;
                return this;
            }

            /**
             * Uids.
             */
            public Builder uids(java.util.List<String> uids) {
                this.uids = uids;
                return this;
            }

            /**
             * attributionApp.
             */
            public Builder attributionApp(java.util.List<String> attributionApp) {
                this.attributionApp = attributionApp;
                return this;
            }

            /**
             * influenceApp.
             */
            public Builder influenceApp(java.util.List<String> influenceApp) {
                this.influenceApp = influenceApp;
                return this;
            }

            /**
             * instance.
             */
            public Builder instance(java.util.List<String> instance) {
                this.instance = instance;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class Product extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Product(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Product create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(Product model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Product build() {
                return new Product(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckRequest} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckRequest</p>
     */
    public static class ReleasePackageInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ReleasePackage")
        private java.util.List<String> releasePackage;

        private ReleasePackageInfos(Builder builder) {
            this.productCode = builder.productCode;
            this.releasePackage = builder.releasePackage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReleasePackageInfos create() {
            return builder().build();
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return releasePackage
         */
        public java.util.List<String> getReleasePackage() {
            return this.releasePackage;
        }

        public static final class Builder {
            private String productCode; 
            private java.util.List<String> releasePackage; 

            private Builder() {
            } 

            private Builder(ReleasePackageInfos model) {
                this.productCode = model.productCode;
                this.releasePackage = model.releasePackage;
            } 

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ReleasePackage.
             */
            public Builder releasePackage(java.util.List<String> releasePackage) {
                this.releasePackage = releasePackage;
                return this;
            }

            public ReleasePackageInfos build() {
                return new ReleasePackageInfos(this);
            } 

        } 

    }
}
