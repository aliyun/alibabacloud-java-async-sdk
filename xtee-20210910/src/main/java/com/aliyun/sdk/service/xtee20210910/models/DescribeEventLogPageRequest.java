// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventLogPageRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventLogPageRequest</p>
 */
public class DescribeEventLogPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accountIdPRP")
    private String accountIdPRP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("beginTime")
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("condition1AL")
    private String condition1AL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("condition2AL")
    private String condition2AL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("condition3AL")
    private String condition3AL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deviceTypeLRP")
    private String deviceTypeLRP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("emailPRP")
    private String emailPRP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("failReasonLRP")
    private String failReasonLRP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ipPRP")
    private String ipPRP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("loginResultARP")
    private String loginResultARP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("loginTypeLRP")
    private String loginTypeLRP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("macPRP")
    private String macPRP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("mobilePRP")
    private String mobilePRP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nickNamePRP")
    private String nickNamePRP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("operateSourceLRP")
    private String operateSourceLRP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("referPRP")
    private String referPRP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("registerIpPRP")
    private String registerIpPRP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("reqIdPBS")
    private String reqIdPBS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scoreEBS")
    private Integer scoreEBS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scoreSBS")
    private Integer scoreSBS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceABS")
    private String serviceABS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tagsLBS")
    private String tagsLBS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("umidPDI")
    private String umidPDI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userAgentPRP")
    private String userAgentPRP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userNameTypeLRP")
    private String userNameTypeLRP;

    private DescribeEventLogPageRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.accountIdPRP = builder.accountIdPRP;
        this.beginTime = builder.beginTime;
        this.condition1AL = builder.condition1AL;
        this.condition2AL = builder.condition2AL;
        this.condition3AL = builder.condition3AL;
        this.currentPage = builder.currentPage;
        this.deviceTypeLRP = builder.deviceTypeLRP;
        this.emailPRP = builder.emailPRP;
        this.endTime = builder.endTime;
        this.failReasonLRP = builder.failReasonLRP;
        this.ipPRP = builder.ipPRP;
        this.loginResultARP = builder.loginResultARP;
        this.loginTypeLRP = builder.loginTypeLRP;
        this.macPRP = builder.macPRP;
        this.mobilePRP = builder.mobilePRP;
        this.nickNamePRP = builder.nickNamePRP;
        this.operateSourceLRP = builder.operateSourceLRP;
        this.pageSize = builder.pageSize;
        this.referPRP = builder.referPRP;
        this.regId = builder.regId;
        this.registerIpPRP = builder.registerIpPRP;
        this.reqIdPBS = builder.reqIdPBS;
        this.scoreEBS = builder.scoreEBS;
        this.scoreSBS = builder.scoreSBS;
        this.serviceABS = builder.serviceABS;
        this.tagsLBS = builder.tagsLBS;
        this.umidPDI = builder.umidPDI;
        this.userAgentPRP = builder.userAgentPRP;
        this.userNameTypeLRP = builder.userNameTypeLRP;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventLogPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return accountIdPRP
     */
    public String getAccountIdPRP() {
        return this.accountIdPRP;
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return condition1AL
     */
    public String getCondition1AL() {
        return this.condition1AL;
    }

    /**
     * @return condition2AL
     */
    public String getCondition2AL() {
        return this.condition2AL;
    }

    /**
     * @return condition3AL
     */
    public String getCondition3AL() {
        return this.condition3AL;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return deviceTypeLRP
     */
    public String getDeviceTypeLRP() {
        return this.deviceTypeLRP;
    }

    /**
     * @return emailPRP
     */
    public String getEmailPRP() {
        return this.emailPRP;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return failReasonLRP
     */
    public String getFailReasonLRP() {
        return this.failReasonLRP;
    }

    /**
     * @return ipPRP
     */
    public String getIpPRP() {
        return this.ipPRP;
    }

    /**
     * @return loginResultARP
     */
    public String getLoginResultARP() {
        return this.loginResultARP;
    }

    /**
     * @return loginTypeLRP
     */
    public String getLoginTypeLRP() {
        return this.loginTypeLRP;
    }

    /**
     * @return macPRP
     */
    public String getMacPRP() {
        return this.macPRP;
    }

    /**
     * @return mobilePRP
     */
    public String getMobilePRP() {
        return this.mobilePRP;
    }

    /**
     * @return nickNamePRP
     */
    public String getNickNamePRP() {
        return this.nickNamePRP;
    }

    /**
     * @return operateSourceLRP
     */
    public String getOperateSourceLRP() {
        return this.operateSourceLRP;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return referPRP
     */
    public String getReferPRP() {
        return this.referPRP;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return registerIpPRP
     */
    public String getRegisterIpPRP() {
        return this.registerIpPRP;
    }

    /**
     * @return reqIdPBS
     */
    public String getReqIdPBS() {
        return this.reqIdPBS;
    }

    /**
     * @return scoreEBS
     */
    public Integer getScoreEBS() {
        return this.scoreEBS;
    }

    /**
     * @return scoreSBS
     */
    public Integer getScoreSBS() {
        return this.scoreSBS;
    }

    /**
     * @return serviceABS
     */
    public String getServiceABS() {
        return this.serviceABS;
    }

    /**
     * @return tagsLBS
     */
    public String getTagsLBS() {
        return this.tagsLBS;
    }

    /**
     * @return umidPDI
     */
    public String getUmidPDI() {
        return this.umidPDI;
    }

    /**
     * @return userAgentPRP
     */
    public String getUserAgentPRP() {
        return this.userAgentPRP;
    }

    /**
     * @return userNameTypeLRP
     */
    public String getUserNameTypeLRP() {
        return this.userNameTypeLRP;
    }

    public static final class Builder extends Request.Builder<DescribeEventLogPageRequest, Builder> {
        private String lang; 
        private String accountIdPRP; 
        private Long beginTime; 
        private String condition1AL; 
        private String condition2AL; 
        private String condition3AL; 
        private Integer currentPage; 
        private String deviceTypeLRP; 
        private String emailPRP; 
        private Long endTime; 
        private String failReasonLRP; 
        private String ipPRP; 
        private String loginResultARP; 
        private String loginTypeLRP; 
        private String macPRP; 
        private String mobilePRP; 
        private String nickNamePRP; 
        private String operateSourceLRP; 
        private Integer pageSize; 
        private String referPRP; 
        private String regId; 
        private String registerIpPRP; 
        private String reqIdPBS; 
        private Integer scoreEBS; 
        private Integer scoreSBS; 
        private String serviceABS; 
        private String tagsLBS; 
        private String umidPDI; 
        private String userAgentPRP; 
        private String userNameTypeLRP; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventLogPageRequest request) {
            super(request);
            this.lang = request.lang;
            this.accountIdPRP = request.accountIdPRP;
            this.beginTime = request.beginTime;
            this.condition1AL = request.condition1AL;
            this.condition2AL = request.condition2AL;
            this.condition3AL = request.condition3AL;
            this.currentPage = request.currentPage;
            this.deviceTypeLRP = request.deviceTypeLRP;
            this.emailPRP = request.emailPRP;
            this.endTime = request.endTime;
            this.failReasonLRP = request.failReasonLRP;
            this.ipPRP = request.ipPRP;
            this.loginResultARP = request.loginResultARP;
            this.loginTypeLRP = request.loginTypeLRP;
            this.macPRP = request.macPRP;
            this.mobilePRP = request.mobilePRP;
            this.nickNamePRP = request.nickNamePRP;
            this.operateSourceLRP = request.operateSourceLRP;
            this.pageSize = request.pageSize;
            this.referPRP = request.referPRP;
            this.regId = request.regId;
            this.registerIpPRP = request.registerIpPRP;
            this.reqIdPBS = request.reqIdPBS;
            this.scoreEBS = request.scoreEBS;
            this.scoreSBS = request.scoreSBS;
            this.serviceABS = request.serviceABS;
            this.tagsLBS = request.tagsLBS;
            this.umidPDI = request.umidPDI;
            this.userAgentPRP = request.userAgentPRP;
            this.userNameTypeLRP = request.userNameTypeLRP;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * accountIdPRP.
         */
        public Builder accountIdPRP(String accountIdPRP) {
            this.putQueryParameter("accountIdPRP", accountIdPRP);
            this.accountIdPRP = accountIdPRP;
            return this;
        }

        /**
         * beginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("beginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * condition1AL.
         */
        public Builder condition1AL(String condition1AL) {
            this.putQueryParameter("condition1AL", condition1AL);
            this.condition1AL = condition1AL;
            return this;
        }

        /**
         * condition2AL.
         */
        public Builder condition2AL(String condition2AL) {
            this.putQueryParameter("condition2AL", condition2AL);
            this.condition2AL = condition2AL;
            return this;
        }

        /**
         * condition3AL.
         */
        public Builder condition3AL(String condition3AL) {
            this.putQueryParameter("condition3AL", condition3AL);
            this.condition3AL = condition3AL;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * deviceTypeLRP.
         */
        public Builder deviceTypeLRP(String deviceTypeLRP) {
            this.putQueryParameter("deviceTypeLRP", deviceTypeLRP);
            this.deviceTypeLRP = deviceTypeLRP;
            return this;
        }

        /**
         * emailPRP.
         */
        public Builder emailPRP(String emailPRP) {
            this.putQueryParameter("emailPRP", emailPRP);
            this.emailPRP = emailPRP;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * failReasonLRP.
         */
        public Builder failReasonLRP(String failReasonLRP) {
            this.putQueryParameter("failReasonLRP", failReasonLRP);
            this.failReasonLRP = failReasonLRP;
            return this;
        }

        /**
         * ipPRP.
         */
        public Builder ipPRP(String ipPRP) {
            this.putQueryParameter("ipPRP", ipPRP);
            this.ipPRP = ipPRP;
            return this;
        }

        /**
         * loginResultARP.
         */
        public Builder loginResultARP(String loginResultARP) {
            this.putQueryParameter("loginResultARP", loginResultARP);
            this.loginResultARP = loginResultARP;
            return this;
        }

        /**
         * loginTypeLRP.
         */
        public Builder loginTypeLRP(String loginTypeLRP) {
            this.putQueryParameter("loginTypeLRP", loginTypeLRP);
            this.loginTypeLRP = loginTypeLRP;
            return this;
        }

        /**
         * macPRP.
         */
        public Builder macPRP(String macPRP) {
            this.putQueryParameter("macPRP", macPRP);
            this.macPRP = macPRP;
            return this;
        }

        /**
         * mobilePRP.
         */
        public Builder mobilePRP(String mobilePRP) {
            this.putQueryParameter("mobilePRP", mobilePRP);
            this.mobilePRP = mobilePRP;
            return this;
        }

        /**
         * nickNamePRP.
         */
        public Builder nickNamePRP(String nickNamePRP) {
            this.putQueryParameter("nickNamePRP", nickNamePRP);
            this.nickNamePRP = nickNamePRP;
            return this;
        }

        /**
         * operateSourceLRP.
         */
        public Builder operateSourceLRP(String operateSourceLRP) {
            this.putQueryParameter("operateSourceLRP", operateSourceLRP);
            this.operateSourceLRP = operateSourceLRP;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * referPRP.
         */
        public Builder referPRP(String referPRP) {
            this.putQueryParameter("referPRP", referPRP);
            this.referPRP = referPRP;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * registerIpPRP.
         */
        public Builder registerIpPRP(String registerIpPRP) {
            this.putQueryParameter("registerIpPRP", registerIpPRP);
            this.registerIpPRP = registerIpPRP;
            return this;
        }

        /**
         * reqIdPBS.
         */
        public Builder reqIdPBS(String reqIdPBS) {
            this.putQueryParameter("reqIdPBS", reqIdPBS);
            this.reqIdPBS = reqIdPBS;
            return this;
        }

        /**
         * scoreEBS.
         */
        public Builder scoreEBS(Integer scoreEBS) {
            this.putQueryParameter("scoreEBS", scoreEBS);
            this.scoreEBS = scoreEBS;
            return this;
        }

        /**
         * scoreSBS.
         */
        public Builder scoreSBS(Integer scoreSBS) {
            this.putQueryParameter("scoreSBS", scoreSBS);
            this.scoreSBS = scoreSBS;
            return this;
        }

        /**
         * serviceABS.
         */
        public Builder serviceABS(String serviceABS) {
            this.putQueryParameter("serviceABS", serviceABS);
            this.serviceABS = serviceABS;
            return this;
        }

        /**
         * tagsLBS.
         */
        public Builder tagsLBS(String tagsLBS) {
            this.putQueryParameter("tagsLBS", tagsLBS);
            this.tagsLBS = tagsLBS;
            return this;
        }

        /**
         * umidPDI.
         */
        public Builder umidPDI(String umidPDI) {
            this.putQueryParameter("umidPDI", umidPDI);
            this.umidPDI = umidPDI;
            return this;
        }

        /**
         * userAgentPRP.
         */
        public Builder userAgentPRP(String userAgentPRP) {
            this.putQueryParameter("userAgentPRP", userAgentPRP);
            this.userAgentPRP = userAgentPRP;
            return this;
        }

        /**
         * userNameTypeLRP.
         */
        public Builder userNameTypeLRP(String userNameTypeLRP) {
            this.putQueryParameter("userNameTypeLRP", userNameTypeLRP);
            this.userNameTypeLRP = userNameTypeLRP;
            return this;
        }

        @Override
        public DescribeEventLogPageRequest build() {
            return new DescribeEventLogPageRequest(this);
        } 

    } 

}
