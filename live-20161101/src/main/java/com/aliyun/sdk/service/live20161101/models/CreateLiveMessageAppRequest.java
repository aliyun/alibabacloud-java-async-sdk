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
 * {@link CreateLiveMessageAppRequest} extends {@link RequestModel}
 *
 * <p>CreateLiveMessageAppRequest</p>
 */
public class CreateLiveMessageAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditType")
    private Integer auditType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditUrl")
    private String auditUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventCallbackUrl")
    private String eventCallbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MsgLifeCycle")
    private Integer msgLifeCycle;

    private CreateLiveMessageAppRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.auditType = builder.auditType;
        this.auditUrl = builder.auditUrl;
        this.dataCenter = builder.dataCenter;
        this.eventCallbackUrl = builder.eventCallbackUrl;
        this.msgLifeCycle = builder.msgLifeCycle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveMessageAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
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
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return eventCallbackUrl
     */
    public String getEventCallbackUrl() {
        return this.eventCallbackUrl;
    }

    /**
     * @return msgLifeCycle
     */
    public Integer getMsgLifeCycle() {
        return this.msgLifeCycle;
    }

    public static final class Builder extends Request.Builder<CreateLiveMessageAppRequest, Builder> {
        private String appName; 
        private Integer auditType; 
        private String auditUrl; 
        private String dataCenter; 
        private String eventCallbackUrl; 
        private Integer msgLifeCycle; 

        private Builder() {
            super();
        } 

        private Builder(CreateLiveMessageAppRequest request) {
            super(request);
            this.appName = request.appName;
            this.auditType = request.auditType;
            this.auditUrl = request.auditUrl;
            this.dataCenter = request.dataCenter;
            this.eventCallbackUrl = request.eventCallbackUrl;
            this.msgLifeCycle = request.msgLifeCycle;
        } 

        /**
         * <p>The name of the application. The name must be 2 to 16 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>testApp</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The content moderation method. Valid values:</p>
         * <ul>
         * <li>0 (default): disables content moderation.</li>
         * <li>1: uses built-in content moderation.</li>
         * <li>2: uses custom content moderation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder auditType(Integer auditType) {
            this.putQueryParameter("AuditType", auditType);
            this.auditType = auditType;
            return this;
        }

        /**
         * <p>The URL for content moderation. If you set AuditType to 2, you must specify this parameter. The URL must start with http:// or https:// and cannot contain a private IP address or a port number. For more information about custom content moderation, see the &quot;Custom content moderation&quot; section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://demo.aliyundoc.com/exampleaudit">http://demo.aliyundoc.com/exampleaudit</a></p>
         */
        public Builder auditUrl(String auditUrl) {
            this.putQueryParameter("AuditUrl", auditUrl);
            this.auditUrl = auditUrl;
            return this;
        }

        /**
         * <p>The data center. Valid values:</p>
         * <ul>
         * <li>cn-shanghai (default)</li>
         * <li>ap-southeast-1: Singapore</li>
         * </ul>
         * <blockquote>
         * <p> When you call other operations to manage the interactive messaging application, you must specify the same data center in which the application is created.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder dataCenter(String dataCenter) {
            this.putQueryParameter("DataCenter", dataCenter);
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * <p>The callback URL for events, such as logon, logoff, and joining and leaving a group. If you leave this parameter empty, event callbacks are disabled. <a href="~~2672836~~"></a>The callback URL must start with http:// or https:// and cannot contain a private IP address or a port number. For information about the callback message format and authentication logic, see the &quot;Event callbacks&quot; and &quot;Callback authentication&quot; sections of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://demo.aliyundoc.com/examplecallback">http://demo.aliyundoc.com/examplecallback</a></p>
         */
        public Builder eventCallbackUrl(String eventCallbackUrl) {
            this.putQueryParameter("EventCallbackUrl", eventCallbackUrl);
            this.eventCallbackUrl = eventCallbackUrl;
            return this;
        }

        /**
         * <p>The retention period of group messages in the application. Valid values:</p>
         * <ul>
         * <li>0 (default): 30 days.</li>
         * <li>1: 90 days.</li>
         * <li>2: 180 days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder msgLifeCycle(Integer msgLifeCycle) {
            this.putQueryParameter("MsgLifeCycle", msgLifeCycle);
            this.msgLifeCycle = msgLifeCycle;
            return this;
        }

        @Override
        public CreateLiveMessageAppRequest build() {
            return new CreateLiveMessageAppRequest(this);
        } 

    } 

}
