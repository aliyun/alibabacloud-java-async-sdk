// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudWebcallRequest} extends {@link RequestModel}
 *
 * <p>CloudWebcallRequest</p>
 */
public class CloudWebcallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amd")
    private Long amd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Clid")
    private String clid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClidAreaCode")
    private String clidAreaCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClidGroup")
    private String clidGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClidList")
    private String clidList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrnId")
    private String crnId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Delay")
    private Long delay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpirTime")
    private String expirTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IvrId")
    private Long ivrId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiTelDelay")
    private Long multiTelDelay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiTelPush")
    private Long multiTelPush;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestUniqueId")
    private String requestUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Retry")
    private Long retry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryInterval")
    private Long retryInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Long timeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserField")
    private String userField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vid")
    private String vid;

    private CloudWebcallRequest(Builder builder) {
        super(builder);
        this.amd = builder.amd;
        this.clid = builder.clid;
        this.clidAreaCode = builder.clidAreaCode;
        this.clidGroup = builder.clidGroup;
        this.clidList = builder.clidList;
        this.crnId = builder.crnId;
        this.delay = builder.delay;
        this.enterpriseId = builder.enterpriseId;
        this.expirTime = builder.expirTime;
        this.ivrId = builder.ivrId;
        this.multiTelDelay = builder.multiTelDelay;
        this.multiTelPush = builder.multiTelPush;
        this.requestUniqueId = builder.requestUniqueId;
        this.retry = builder.retry;
        this.retryInterval = builder.retryInterval;
        this.tel = builder.tel;
        this.timeout = builder.timeout;
        this.userField = builder.userField;
        this.vid = builder.vid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudWebcallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amd
     */
    public Long getAmd() {
        return this.amd;
    }

    /**
     * @return clid
     */
    public String getClid() {
        return this.clid;
    }

    /**
     * @return clidAreaCode
     */
    public String getClidAreaCode() {
        return this.clidAreaCode;
    }

    /**
     * @return clidGroup
     */
    public String getClidGroup() {
        return this.clidGroup;
    }

    /**
     * @return clidList
     */
    public String getClidList() {
        return this.clidList;
    }

    /**
     * @return crnId
     */
    public String getCrnId() {
        return this.crnId;
    }

    /**
     * @return delay
     */
    public Long getDelay() {
        return this.delay;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return expirTime
     */
    public String getExpirTime() {
        return this.expirTime;
    }

    /**
     * @return ivrId
     */
    public Long getIvrId() {
        return this.ivrId;
    }

    /**
     * @return multiTelDelay
     */
    public Long getMultiTelDelay() {
        return this.multiTelDelay;
    }

    /**
     * @return multiTelPush
     */
    public Long getMultiTelPush() {
        return this.multiTelPush;
    }

    /**
     * @return requestUniqueId
     */
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    /**
     * @return retry
     */
    public Long getRetry() {
        return this.retry;
    }

    /**
     * @return retryInterval
     */
    public Long getRetryInterval() {
        return this.retryInterval;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return this.tel;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    /**
     * @return userField
     */
    public String getUserField() {
        return this.userField;
    }

    /**
     * @return vid
     */
    public String getVid() {
        return this.vid;
    }

    public static final class Builder extends Request.Builder<CloudWebcallRequest, Builder> {
        private Long amd; 
        private String clid; 
        private String clidAreaCode; 
        private String clidGroup; 
        private String clidList; 
        private String crnId; 
        private Long delay; 
        private Long enterpriseId; 
        private String expirTime; 
        private Long ivrId; 
        private Long multiTelDelay; 
        private Long multiTelPush; 
        private String requestUniqueId; 
        private Long retry; 
        private Long retryInterval; 
        private String tel; 
        private Long timeout; 
        private String userField; 
        private String vid; 

        private Builder() {
            super();
        } 

        private Builder(CloudWebcallRequest request) {
            super(request);
            this.amd = request.amd;
            this.clid = request.clid;
            this.clidAreaCode = request.clidAreaCode;
            this.clidGroup = request.clidGroup;
            this.clidList = request.clidList;
            this.crnId = request.crnId;
            this.delay = request.delay;
            this.enterpriseId = request.enterpriseId;
            this.expirTime = request.expirTime;
            this.ivrId = request.ivrId;
            this.multiTelDelay = request.multiTelDelay;
            this.multiTelPush = request.multiTelPush;
            this.requestUniqueId = request.requestUniqueId;
            this.retry = request.retry;
            this.retryInterval = request.retryInterval;
            this.tel = request.tel;
            this.timeout = request.timeout;
            this.userField = request.userField;
            this.vid = request.vid;
        } 

        /**
         * <p>是否开启amd；自动应答检查（传真机等），1.开启 0.不开启 默认为0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder amd(Long amd) {
            this.putQueryParameter("Amd", amd);
            this.amd = amd;
            return this;
        }

        /**
         * <p>可传入企业中继号码或设置好的客户侧外显号码</p>
         * 
         * <strong>example:</strong>
         * <p>41008502</p>
         */
        public Builder clid(String clid) {
            this.putQueryParameter("Clid", clid);
            this.clid = clid;
            return this;
        }

        /**
         * <p>客户侧外显指定地区号码，优先级低于clid</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        public Builder clidAreaCode(String clidAreaCode) {
            this.putQueryParameter("ClidAreaCode", clidAreaCode);
            this.clidAreaCode = clidAreaCode;
            return this;
        }

        /**
         * <p>客户侧外显号码组；使用clidGroup需要账号支持按标识路由，优先级低于clid</p>
         * 
         * <strong>example:</strong>
         * <p>clidGroup</p>
         */
        public Builder clidGroup(String clidGroup) {
            this.putQueryParameter("ClidGroup", clidGroup);
            this.clidGroup = clidGroup;
            return this;
        }

        /**
         * <p>指定本次外呼使用的客户侧外显号码集合，系统将根据号码调度策略选择可用号码进行外呼</p>
         * 
         * <strong>example:</strong>
         * <p>41008502</p>
         */
        public Builder clidList(String clidList) {
            this.putQueryParameter("ClidList", clidList);
            this.clidList = clidList;
            return this;
        }

        /**
         * <p>外显导航标识</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        public Builder crnId(String crnId) {
            this.putQueryParameter("CrnId", crnId);
            this.crnId = crnId;
            return this;
        }

        /**
         * <p>延迟时长；秒数，延迟多少秒呼叫 参数取值范围：0&lt;=delay&lt;=60 默认为0</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder delay(Long delay) {
            this.putQueryParameter("Delay", delay);
            this.delay = delay;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>过期时间，精确到s，yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 10:00:00</p>
         */
        public Builder expirTime(String expirTime) {
            this.putQueryParameter("ExpirTime", expirTime);
            this.expirTime = expirTime;
            return this;
        }

        /**
         * <p>回呼接通后进入的ivrId；如果不传此参数，使用后台配置的ivr</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        public Builder ivrId(Long ivrId) {
            this.putQueryParameter("IvrId", ivrId);
            this.ivrId = ivrId;
            return this;
        }

        /**
         * <p>多号码时呼叫延时；tel多个号码时，号码之间的呼叫延迟，最大120秒，默认0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder multiTelDelay(Long multiTelDelay) {
            this.putQueryParameter("MultiTelDelay", multiTelDelay);
            this.multiTelDelay = multiTelDelay;
            return this;
        }

        /**
         * <p>多号码，是否每个号码呼叫都挂机推送；取值说明 0：只挂机推送一次； 1：每次呼叫都触发挂机推送；默认0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder multiTelPush(Long multiTelPush) {
            this.putQueryParameter("MultiTelPush", multiTelPush);
            this.multiTelPush = multiTelPush;
            return this;
        }

        /**
         * <p>请求唯一标识；说明：长度不超过300个字节。1个汉字是3字节。此字段保存到通话记录requestUniqueId字段，后续接口查询使用。一次接口请求造成的多次呼叫requestUniqueId相同；如果是加密的号码，需要URLEncode后传入</p>
         * 
         * <strong>example:</strong>
         * <p>requset12345</p>
         */
        public Builder requestUniqueId(String requestUniqueId) {
            this.putQueryParameter("RequestUniqueId", requestUniqueId);
            this.requestUniqueId = requestUniqueId;
            return this;
        }

        /**
         * <p>重试次数；最大5次，使用的企业需要开启webcall自动重试开关</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder retry(Long retry) {
            this.putQueryParameter("Retry", retry);
            this.retry = retry;
            return this;
        }

        /**
         * <p>重试间隔，单位分钟，最小0分钟，最大59分钟</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder retryInterval(Long retryInterval) {
            this.putQueryParameter("RetryInterval", retryInterval);
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * <p>电话号码；固话带区号，手机不加0；固话带分机的以&quot;-&quot;分隔；支持多个号码，多个直接用英文逗号’,’分隔；传多个号码时，若前面的号码没接通则会呼叫后面的号码，若接通则不会呼叫；<a href="../%E5%AD%97%E6%AE%B5%E5%AE%9A%E4%B9%89/%E6%8E%A5%E5%8F%A3%E9%83%A8%E5%88%86/%E5%8A%A0%E5%AF%86%E5%A4%96%E5%91%BC%E5%8F%B7%E7%A0%81%E5%8A%A0%E5%AF%86%E8%A7%84%E5%88%99.md">加密外呼</a>；如果是加密的号码，需要URLEncode后传入</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13312345678</p>
         */
        public Builder tel(String tel) {
            this.putQueryParameter("Tel", tel);
            this.tel = tel;
            return this;
        }

        /**
         * <p>呼叫客户超时时间；说明：参数取值范围 0&lt;=timeout&lt;=60；不传入，默认30(单位:s)</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>用户自定义字段；说明：长度不超过250个字节。1个汉字是3字节。此字段保存到通话记录userField字段，后续接口查询使用。该字段需“动态附带参数”paramNames有值时方可生效。</p>
         * 
         * <strong>example:</strong>
         * <p>UserField</p>
         */
        public Builder userField(String userField) {
            this.putQueryParameter("UserField", userField);
            this.userField = userField;
            return this;
        }

        /**
         * <p>用哪种语言播放ivr提示音；1.普通话 2.粤语 4.标贝TTS 5.普通话-甜美女音 默认为1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder vid(String vid) {
            this.putQueryParameter("Vid", vid);
            this.vid = vid;
            return this;
        }

        @Override
        public CloudWebcallRequest build() {
            return new CloudWebcallRequest(this);
        } 

    } 

}
