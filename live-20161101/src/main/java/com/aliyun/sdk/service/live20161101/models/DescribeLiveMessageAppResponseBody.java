// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveMessageAppResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveMessageAppResponseBody</p>
 */
public class DescribeLiveMessageAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("AppSign")
    private String appSign;

    @com.aliyun.core.annotation.NameInMap("AuditType")
    private Integer auditType;

    @com.aliyun.core.annotation.NameInMap("AuditUrl")
    private String auditUrl;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.NameInMap("Disable")
    private Boolean disable;

    @com.aliyun.core.annotation.NameInMap("EventCallbackUrl")
    private String eventCallbackUrl;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("MsgLifeCycle")
    private Integer msgLifeCycle;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveMessageAppResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.appKey = builder.appKey;
        this.appName = builder.appName;
        this.appSign = builder.appSign;
        this.auditType = builder.auditType;
        this.auditUrl = builder.auditUrl;
        this.createTime = builder.createTime;
        this.dataCenter = builder.dataCenter;
        this.disable = builder.disable;
        this.eventCallbackUrl = builder.eventCallbackUrl;
        this.modifyTime = builder.modifyTime;
        this.msgLifeCycle = builder.msgLifeCycle;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveMessageAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appSign
     */
    public String getAppSign() {
        return this.appSign;
    }

    /**
     * @return auditType
     */
    public Integer getAuditType() {
        return this.auditType;
    }

    /**
     * @return auditUrl
     */
    public String getAuditUrl() {
        return this.auditUrl;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return disable
     */
    public Boolean getDisable() {
        return this.disable;
    }

    /**
     * @return eventCallbackUrl
     */
    public String getEventCallbackUrl() {
        return this.eventCallbackUrl;
    }

    /**
     * @return modifyTime
     */
    public Long getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return msgLifeCycle
     */
    public Integer getMsgLifeCycle() {
        return this.msgLifeCycle;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appId; 
        private String appKey; 
        private String appName; 
        private String appSign; 
        private Integer auditType; 
        private String auditUrl; 
        private Long createTime; 
        private String dataCenter; 
        private Boolean disable; 
        private String eventCallbackUrl; 
        private Long modifyTime; 
        private Integer msgLifeCycle; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveMessageAppResponseBody model) {
            this.appId = model.appId;
            this.appKey = model.appKey;
            this.appName = model.appName;
            this.appSign = model.appSign;
            this.auditType = model.auditType;
            this.auditUrl = model.auditUrl;
            this.createTime = model.createTime;
            this.dataCenter = model.dataCenter;
            this.disable = model.disable;
            this.eventCallbackUrl = model.eventCallbackUrl;
            this.modifyTime = model.modifyTime;
            this.msgLifeCycle = model.msgLifeCycle;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the interactive messaging application.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The AppKey of the interactive messaging application. It is used to authorize operations related to the application ID.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder appKey(String appKey) {
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>The name of the interactive messaging application.</p>
         * 
         * <strong>example:</strong>
         * <p>testApp</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The signature of the interactive messaging application. It is required by the interactive messaging SDK.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder appSign(String appSign) {
            this.appSign = appSign;
            return this;
        }

        /**
         * <p>The content moderation method. Valid values:</p>
         * <ul>
         * <li>0: Content moderation is disabled.</li>
         * <li>1: Built-in content moderation is used.</li>
         * <li>2: Custom content moderation is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder auditType(Integer auditType) {
            this.auditType = auditType;
            return this;
        }

        /**
         * <p>The URL for content moderation. This parameter is returned when the value of AuditType is 2.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.aliyundoc.com/exampleaudit">http://example.aliyundoc.com/exampleaudit</a></p>
         */
        public Builder auditUrl(String auditUrl) {
            this.auditUrl = auditUrl;
            return this;
        }

        /**
         * <p>The time when the interactive messaging application was created. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1698305471</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The data center.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder dataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * <p>Indicates whether the interactive messaging application is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disable(Boolean disable) {
            this.disable = disable;
            return this;
        }

        /**
         * <p>The callback URL for events such as user logon, logoff, joining a group, and leaving a group. An empty value indicates that callbacks are disabled.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.aliyundoc.com/examplecallback">http://example.aliyundoc.com/examplecallback</a></p>
         */
        public Builder eventCallbackUrl(String eventCallbackUrl) {
            this.eventCallbackUrl = eventCallbackUrl;
            return this;
        }

        /**
         * <p>The time when the interactive messaging application was modified. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1698305471</p>
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The retention period of group messages in the application. Valid values:</p>
         * <ul>
         * <li>0 (default): 30 days</li>
         * <li>1: 90 days</li>
         * <li>2: 180 days</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder msgLifeCycle(Integer msgLifeCycle) {
            this.msgLifeCycle = msgLifeCycle;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9FB68B5B-ED07-18F0-A3CF-083F4E74****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveMessageAppResponseBody build() {
            return new DescribeLiveMessageAppResponseBody(this);
        } 

    } 

}
