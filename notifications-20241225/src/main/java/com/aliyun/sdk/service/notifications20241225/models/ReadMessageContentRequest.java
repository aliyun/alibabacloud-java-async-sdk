// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.notifications20241225.models;

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
 * {@link ReadMessageContentRequest} extends {@link RequestModel}
 *
 * <p>ReadMessageContentRequest</p>
 */
public class ReadMessageContentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizName")
    private String bizName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallerProtocol")
    private String callerProtocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClassId")
    private Long classId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientSource")
    private String clientSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cookies")
    private String cookies;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupCode")
    private String groupCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("History")
    private Boolean history;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MsgId")
    private String msgId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SrcUrl")
    private String srcUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantCode")
    private String tenantCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UidType")
    private String uidType;

    private ReadMessageContentRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appName = builder.appName;
        this.bizName = builder.bizName;
        this.callerProtocol = builder.callerProtocol;
        this.classId = builder.classId;
        this.clientSource = builder.clientSource;
        this.cookies = builder.cookies;
        this.groupCode = builder.groupCode;
        this.history = builder.history;
        this.msgId = builder.msgId;
        this.srcUrl = builder.srcUrl;
        this.status = builder.status;
        this.tenantCode = builder.tenantCode;
        this.uidType = builder.uidType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadMessageContentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return bizName
     */
    public String getBizName() {
        return this.bizName;
    }

    /**
     * @return callerProtocol
     */
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    /**
     * @return classId
     */
    public Long getClassId() {
        return this.classId;
    }

    /**
     * @return clientSource
     */
    public String getClientSource() {
        return this.clientSource;
    }

    /**
     * @return cookies
     */
    public String getCookies() {
        return this.cookies;
    }

    /**
     * @return groupCode
     */
    public String getGroupCode() {
        return this.groupCode;
    }

    /**
     * @return history
     */
    public Boolean getHistory() {
        return this.history;
    }

    /**
     * @return msgId
     */
    public String getMsgId() {
        return this.msgId;
    }

    /**
     * @return srcUrl
     */
    public String getSrcUrl() {
        return this.srcUrl;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return tenantCode
     */
    public String getTenantCode() {
        return this.tenantCode;
    }

    /**
     * @return uidType
     */
    public String getUidType() {
        return this.uidType;
    }

    public static final class Builder extends Request.Builder<ReadMessageContentRequest, Builder> {
        private String acceptLanguage; 
        private String appName; 
        private String bizName; 
        private String callerProtocol; 
        private Long classId; 
        private String clientSource; 
        private String cookies; 
        private String groupCode; 
        private Boolean history; 
        private String msgId; 
        private String srcUrl; 
        private Integer status; 
        private String tenantCode; 
        private String uidType; 

        private Builder() {
            super();
        } 

        private Builder(ReadMessageContentRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appName = request.appName;
            this.bizName = request.bizName;
            this.callerProtocol = request.callerProtocol;
            this.classId = request.classId;
            this.clientSource = request.clientSource;
            this.cookies = request.cookies;
            this.groupCode = request.groupCode;
            this.history = request.history;
            this.msgId = request.msgId;
            this.srcUrl = request.srcUrl;
            this.status = request.status;
            this.tenantCode = request.tenantCode;
            this.uidType = request.uidType;
        } 

        /**
         * <p>The language. Default value: Simplified Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putBodyParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>A system parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>A system parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder bizName(String bizName) {
            this.putBodyParameter("BizName", bizName);
            this.bizName = bizName;
            return this;
        }

        /**
         * <p>A system parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder callerProtocol(String callerProtocol) {
            this.putBodyParameter("CallerProtocol", callerProtocol);
            this.callerProtocol = callerProtocol;
            return this;
        }

        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder classId(Long classId) {
            this.putBodyParameter("ClassId", classId);
            this.classId = classId;
            return this;
        }

        /**
         * <p>A system parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder clientSource(String clientSource) {
            this.putBodyParameter("ClientSource", clientSource);
            this.clientSource = clientSource;
            return this;
        }

        /**
         * <p>A system parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder cookies(String cookies) {
            this.putBodyParameter("Cookies", cookies);
            this.cookies = cookies;
            return this;
        }

        /**
         * <p>The group code.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder groupCode(String groupCode) {
            this.putBodyParameter("GroupCode", groupCode);
            this.groupCode = groupCode;
            return this;
        }

        /**
         * <p>Specifies whether the message is a historical message.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder history(Boolean history) {
            this.putBodyParameter("History", history);
            this.history = history;
            return this;
        }

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3727683838</p>
         */
        public Builder msgId(String msgId) {
            this.putBodyParameter("MsgId", msgId);
            this.msgId = msgId;
            return this;
        }

        /**
         * <p>A system parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder srcUrl(String srcUrl) {
            this.putBodyParameter("SrcUrl", srcUrl);
            this.srcUrl = srcUrl;
            return this;
        }

        /**
         * <p>The read status. Valid values:</p>
         * <ul>
         * <li>0: unread</li>
         * <li>1: read.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>A system parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder tenantCode(String tenantCode) {
            this.putBodyParameter("TenantCode", tenantCode);
            this.tenantCode = tenantCode;
            return this;
        }

        /**
         * <p>A system parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder uidType(String uidType) {
            this.putBodyParameter("UidType", uidType);
            this.uidType = uidType;
            return this;
        }

        @Override
        public ReadMessageContentRequest build() {
            return new ReadMessageContentRequest(this);
        } 

    } 

}
