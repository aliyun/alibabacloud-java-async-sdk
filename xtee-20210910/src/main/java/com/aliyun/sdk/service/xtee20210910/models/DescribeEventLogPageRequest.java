// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
         * <p>Set the language type for request and response messages, default value is <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Account ID (request_param.accountId), up to 50 characters, supports “*” and “?” wildcards.</p>
         * 
         * <strong>example:</strong>
         * <p>180650758xxxxxxx</p>
         */
        public Builder accountIdPRP(String accountIdPRP) {
            this.putQueryParameter("accountIdPRP", accountIdPRP);
            this.accountIdPRP = accountIdPRP;
            return this;
        }

        /**
         * <p>Start timestamp of the log. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1737101348000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("beginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>Full-text match 1, cannot exceed 30 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>rm0102</p>
         */
        public Builder condition1AL(String condition1AL) {
            this.putQueryParameter("condition1AL", condition1AL);
            this.condition1AL = condition1AL;
            return this;
        }

        /**
         * <p>Full-text match 2, cannot exceed 30 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>rm0102</p>
         */
        public Builder condition2AL(String condition2AL) {
            this.putQueryParameter("condition2AL", condition2AL);
            this.condition2AL = condition2AL;
            return this;
        }

        /**
         * <p>Full-text match 3, cannot exceed 30 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>rm0102</p>
         */
        public Builder condition3AL(String condition3AL) {
            this.putQueryParameter("condition3AL", condition3AL);
            this.condition3AL = condition3AL;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Device type (request_param.deviceType), examples: 1. PC, 2. MOBILE.</p>
         * 
         * <strong>example:</strong>
         * <p>PC</p>
         */
        public Builder deviceTypeLRP(String deviceTypeLRP) {
            this.putQueryParameter("deviceTypeLRP", deviceTypeLRP);
            this.deviceTypeLRP = deviceTypeLRP;
            return this;
        }

        /**
         * <p>Email (request_param.email), up to 100 characters, supports “*” and “?” wildcards.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxxx@123.com">xxxx@123.com</a></p>
         */
        public Builder emailPRP(String emailPRP) {
            this.putQueryParameter("emailPRP", emailPRP);
            this.emailPRP = emailPRP;
            return this;
        }

        /**
         * <p>End time, accurate to milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>1746669075000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Login failure reason (-request_param.failReason).</p>
         * 
         * <strong>example:</strong>
         * <p>wrongPassword</p>
         */
        public Builder failReasonLRP(String failReasonLRP) {
            this.putQueryParameter("failReasonLRP", failReasonLRP);
            this.failReasonLRP = failReasonLRP;
            return this;
        }

        /**
         * <p>IP (request_param.ip), up to 20 characters, supports “*” and “?” wildcards.</p>
         * 
         * <strong>example:</strong>
         * <p>168.168.168.168</p>
         */
        public Builder ipPRP(String ipPRP) {
            this.putQueryParameter("ipPRP", ipPRP);
            this.ipPRP = ipPRP;
            return this;
        }

        /**
         * <p>Login success indicator (request_param.loginResult).</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder loginResultARP(String loginResultARP) {
            this.putQueryParameter("loginResultARP", loginResultARP);
            this.loginResultARP = loginResultARP;
            return this;
        }

        /**
         * <p>Login verification method (-request_param.loginType).</p>
         * 
         * <strong>example:</strong>
         * <p>PASSWORD</p>
         */
        public Builder loginTypeLRP(String loginTypeLRP) {
            this.putQueryParameter("loginTypeLRP", loginTypeLRP);
            this.loginTypeLRP = loginTypeLRP;
            return this;
        }

        /**
         * <p>Device MAC address (-request_param.mac), up to 30 characters, supports “*” and “?” wildcards.</p>
         * 
         * <strong>example:</strong>
         * <p>00-1C-F0-1D-A7-81</p>
         */
        public Builder macPRP(String macPRP) {
            this.putQueryParameter("macPRP", macPRP);
            this.macPRP = macPRP;
            return this;
        }

        /**
         * <p>Phone number (supports MD5 request_param.mobile/request_param.mobileMd5), up to 30 characters, supports “*” and “?” wildcards, searchable by mobile and mobileMd5 fields.</p>
         * 
         * <strong>example:</strong>
         * <p>17600000000</p>
         */
        public Builder mobilePRP(String mobilePRP) {
            this.putQueryParameter("mobilePRP", mobilePRP);
            this.mobilePRP = mobilePRP;
            return this;
        }

        /**
         * <p>Account nickname (request_param.nickName), up to 50 characters, supports “*” and “?” wildcards.</p>
         * 
         * <strong>example:</strong>
         * <p>测试xx</p>
         */
        public Builder nickNamePRP(String nickNamePRP) {
            this.putQueryParameter("nickNamePRP", nickNamePRP);
            this.nickNamePRP = nickNamePRP;
            return this;
        }

        /**
         * <p>Operation source (request_param.operateSource), examples: 1. PC, 2. H5, 3. App.</p>
         * 
         * <strong>example:</strong>
         * <p>PC</p>
         */
        public Builder operateSourceLRP(String operateSourceLRP) {
            this.putQueryParameter("operateSourceLRP", operateSourceLRP);
            this.operateSourceLRP = operateSourceLRP;
            return this;
        }

        /**
         * <p>Number of items per page, default value is 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Referer (-request_param.refer), up to 50 characters, supports “*” and “?” wildcards.</p>
         * 
         * <strong>example:</strong>
         * <p>refer</p>
         */
        public Builder referPRP(String referPRP) {
            this.putQueryParameter("referPRP", referPRP);
            this.referPRP = referPRP;
            return this;
        }

        /**
         * <p>Region code.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Account registration IP (request_param.registerIp), up to 20 characters, supports “*” and “?” wildcards.</p>
         * 
         * <strong>example:</strong>
         * <p>168.168.168.168</p>
         */
        public Builder registerIpPRP(String registerIpPRP) {
            this.putQueryParameter("registerIpPRP", registerIpPRP);
            this.registerIpPRP = registerIpPRP;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BD6B08EC-1B44-5378-8838-C76A36415C55</p>
         */
        public Builder reqIdPBS(String reqIdPBS) {
            this.putQueryParameter("reqIdPBS", reqIdPBS);
            this.reqIdPBS = reqIdPBS;
            return this;
        }

        /**
         * <p>End value of the score range (score), only non-negative integers are allowed, and the right interval must be greater than the left interval, with both intervals being closed.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder scoreEBS(Integer scoreEBS) {
            this.putQueryParameter("scoreEBS", scoreEBS);
            this.scoreEBS = scoreEBS;
            return this;
        }

        /**
         * <p>Starting value of the score range (score), only non-negative integers are allowed, the right interval must be greater than the left interval, both intervals are inclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scoreSBS(Integer scoreSBS) {
            this.putQueryParameter("scoreSBS", scoreSBS);
            this.scoreSBS = scoreSBS;
            return this;
        }

        /**
         * <p>Event name (instance_id).</p>
         * 
         * <strong>example:</strong>
         * <p>de_afghcf6411</p>
         */
        public Builder serviceABS(String serviceABS) {
            this.putQueryParameter("serviceABS", serviceABS);
            this.serviceABS = serviceABS;
            return this;
        }

        /**
         * <p>Risk tags (tags), data source DescribeTagsList.</p>
         * 
         * <strong>example:</strong>
         * <p>rg0001</p>
         */
        public Builder tagsLBS(String tagsLBS) {
            this.putQueryParameter("tagsLBS", tagsLBS);
            this.tagsLBS = tagsLBS;
            return this;
        }

        /**
         * <p>Device ID (device_info.umid).</p>
         * 
         * <strong>example:</strong>
         * <p>设备ID</p>
         */
        public Builder umidPDI(String umidPDI) {
            this.putQueryParameter("umidPDI", umidPDI);
            this.umidPDI = umidPDI;
            return this;
        }

        /**
         * <p>User agent (-request_param.userAgent), up to 50 characters, supports “*” and “?” wildcards.</p>
         * 
         * <strong>example:</strong>
         * <p>00-1C-F0-1D-A7-81</p>
         */
        public Builder userAgentPRP(String userAgentPRP) {
            this.putQueryParameter("userAgentPRP", userAgentPRP);
            this.userAgentPRP = userAgentPRP;
            return this;
        }

        /**
         * <p>Username type, login scenario (-request_param.userNameType).</p>
         * 
         * <strong>example:</strong>
         * <p>type</p>
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
