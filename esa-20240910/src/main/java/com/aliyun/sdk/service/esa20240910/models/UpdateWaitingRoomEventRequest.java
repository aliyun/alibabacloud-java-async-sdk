// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateWaitingRoomEventRequest} extends {@link RequestModel}
 *
 * <p>UpdateWaitingRoomEventRequest</p>
 */
public class UpdateWaitingRoomEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPageHtml")
    private String customPageHtml;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableSessionRenewalEnable")
    private String disableSessionRenewalEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JsonResponseEnable")
    private String jsonResponseEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewUsersPerMinute")
    private String newUsersPerMinute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreQueueEnable")
    private String preQueueEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreQueueStartTime")
    private String preQueueStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueuingMethod")
    private String queuingMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueuingStatusCode")
    private String queuingStatusCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RandomPreQueueEnable")
    private String randomPreQueueEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionDuration")
    private String sessionDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalActiveUsers")
    private String totalActiveUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomEventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long waitingRoomEventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomType")
    private String waitingRoomType;

    private UpdateWaitingRoomEventRequest(Builder builder) {
        super(builder);
        this.customPageHtml = builder.customPageHtml;
        this.description = builder.description;
        this.disableSessionRenewalEnable = builder.disableSessionRenewalEnable;
        this.enable = builder.enable;
        this.endTime = builder.endTime;
        this.jsonResponseEnable = builder.jsonResponseEnable;
        this.language = builder.language;
        this.name = builder.name;
        this.newUsersPerMinute = builder.newUsersPerMinute;
        this.preQueueEnable = builder.preQueueEnable;
        this.preQueueStartTime = builder.preQueueStartTime;
        this.queuingMethod = builder.queuingMethod;
        this.queuingStatusCode = builder.queuingStatusCode;
        this.randomPreQueueEnable = builder.randomPreQueueEnable;
        this.sessionDuration = builder.sessionDuration;
        this.siteId = builder.siteId;
        this.startTime = builder.startTime;
        this.totalActiveUsers = builder.totalActiveUsers;
        this.waitingRoomEventId = builder.waitingRoomEventId;
        this.waitingRoomType = builder.waitingRoomType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWaitingRoomEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customPageHtml
     */
    public String getCustomPageHtml() {
        return this.customPageHtml;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return disableSessionRenewalEnable
     */
    public String getDisableSessionRenewalEnable() {
        return this.disableSessionRenewalEnable;
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return jsonResponseEnable
     */
    public String getJsonResponseEnable() {
        return this.jsonResponseEnable;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return newUsersPerMinute
     */
    public String getNewUsersPerMinute() {
        return this.newUsersPerMinute;
    }

    /**
     * @return preQueueEnable
     */
    public String getPreQueueEnable() {
        return this.preQueueEnable;
    }

    /**
     * @return preQueueStartTime
     */
    public String getPreQueueStartTime() {
        return this.preQueueStartTime;
    }

    /**
     * @return queuingMethod
     */
    public String getQueuingMethod() {
        return this.queuingMethod;
    }

    /**
     * @return queuingStatusCode
     */
    public String getQueuingStatusCode() {
        return this.queuingStatusCode;
    }

    /**
     * @return randomPreQueueEnable
     */
    public String getRandomPreQueueEnable() {
        return this.randomPreQueueEnable;
    }

    /**
     * @return sessionDuration
     */
    public String getSessionDuration() {
        return this.sessionDuration;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return totalActiveUsers
     */
    public String getTotalActiveUsers() {
        return this.totalActiveUsers;
    }

    /**
     * @return waitingRoomEventId
     */
    public Long getWaitingRoomEventId() {
        return this.waitingRoomEventId;
    }

    /**
     * @return waitingRoomType
     */
    public String getWaitingRoomType() {
        return this.waitingRoomType;
    }

    public static final class Builder extends Request.Builder<UpdateWaitingRoomEventRequest, Builder> {
        private String customPageHtml; 
        private String description; 
        private String disableSessionRenewalEnable; 
        private String enable; 
        private String endTime; 
        private String jsonResponseEnable; 
        private String language; 
        private String name; 
        private String newUsersPerMinute; 
        private String preQueueEnable; 
        private String preQueueStartTime; 
        private String queuingMethod; 
        private String queuingStatusCode; 
        private String randomPreQueueEnable; 
        private String sessionDuration; 
        private Long siteId; 
        private String startTime; 
        private String totalActiveUsers; 
        private Long waitingRoomEventId; 
        private String waitingRoomType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWaitingRoomEventRequest request) {
            super(request);
            this.customPageHtml = request.customPageHtml;
            this.description = request.description;
            this.disableSessionRenewalEnable = request.disableSessionRenewalEnable;
            this.enable = request.enable;
            this.endTime = request.endTime;
            this.jsonResponseEnable = request.jsonResponseEnable;
            this.language = request.language;
            this.name = request.name;
            this.newUsersPerMinute = request.newUsersPerMinute;
            this.preQueueEnable = request.preQueueEnable;
            this.preQueueStartTime = request.preQueueStartTime;
            this.queuingMethod = request.queuingMethod;
            this.queuingStatusCode = request.queuingStatusCode;
            this.randomPreQueueEnable = request.randomPreQueueEnable;
            this.sessionDuration = request.sessionDuration;
            this.siteId = request.siteId;
            this.startTime = request.startTime;
            this.totalActiveUsers = request.totalActiveUsers;
            this.waitingRoomEventId = request.waitingRoomEventId;
            this.waitingRoomType = request.waitingRoomType;
        } 

        /**
         * <p>The content of the custom waiting room page. You must specify this parameter if you set WaitingRoomType to custom. The content must be Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>html-yets-maqi1111</p>
         */
        public Builder customPageHtml(String customPageHtml) {
            this.putQueryParameter("CustomPageHtml", customPageHtml);
            this.customPageHtml = customPageHtml;
            return this;
        }

        /**
         * <p>The description of the waiting room.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://yywyyw.com">http://yywyyw.com</a></p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to disable session renewal. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder disableSessionRenewalEnable(String disableSessionRenewalEnable) {
            this.putQueryParameter("DisableSessionRenewalEnable", disableSessionRenewalEnable);
            this.disableSessionRenewalEnable = disableSessionRenewalEnable;
            return this;
        }

        /**
         * <p>Specifies whether to enable the waiting room event. Valid values:</p>
         * <ul>
         * <li><code>on</code></li>
         * <li><code>off</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The end time of the event. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719849600</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether to enable JSON response. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder jsonResponseEnable(String jsonResponseEnable) {
            this.putQueryParameter("JsonResponseEnable", jsonResponseEnable);
            this.jsonResponseEnable = jsonResponseEnable;
            return this;
        }

        /**
         * <p>The default language. Valid values:</p>
         * <ul>
         * <li><code>enus</code>: English.</li>
         * <li><code>zhcn</code>: Simplified Chinese.</li>
         * <li><code>zhhk</code>: Traditional Chinese.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enus</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The name of the waiting room event.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The maximum number of new users per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder newUsersPerMinute(String newUsersPerMinute) {
            this.putQueryParameter("NewUsersPerMinute", newUsersPerMinute);
            this.newUsersPerMinute = newUsersPerMinute;
            return this;
        }

        /**
         * <p>Specifies whether to enable pre-queuing.</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder preQueueEnable(String preQueueEnable) {
            this.putQueryParameter("PreQueueEnable", preQueueEnable);
            this.preQueueEnable = preQueueEnable;
            return this;
        }

        /**
         * <p>The start time for pre-queuing.</p>
         * 
         * <strong>example:</strong>
         * <p>1719763200</p>
         */
        public Builder preQueueStartTime(String preQueueStartTime) {
            this.putQueryParameter("PreQueueStartTime", preQueueStartTime);
            this.preQueueStartTime = preQueueStartTime;
            return this;
        }

        /**
         * <p>The queuing method. Valid values:</p>
         * <ul>
         * <li>random: Users gain access to the origin randomly, regardless of the arrival time.</li>
         * <li>fifo: Users gain access to the origin in order of arrival.</li>
         * <li>passthrough: Users pass through the waiting room and go straight to the origin.</li>
         * <li>reject-all: All requests are blocked from accessing the origin.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fifo</p>
         */
        public Builder queuingMethod(String queuingMethod) {
            this.putQueryParameter("QueuingMethod", queuingMethod);
            this.queuingMethod = queuingMethod;
            return this;
        }

        /**
         * <p>The HTTP status code to return while a user is in the queue. Valid values:</p>
         * <ul>
         * <li>200</li>
         * <li>202</li>
         * <li>429</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder queuingStatusCode(String queuingStatusCode) {
            this.putQueryParameter("QueuingStatusCode", queuingStatusCode);
            this.queuingStatusCode = queuingStatusCode;
            return this;
        }

        /**
         * <p>Specifies whether to enable random queuing.</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder randomPreQueueEnable(String randomPreQueueEnable) {
            this.putQueryParameter("RandomPreQueueEnable", randomPreQueueEnable);
            this.randomPreQueueEnable = randomPreQueueEnable;
            return this;
        }

        /**
         * <p>The maximum duration for which a session remains valid after a user leaves the origin. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder sessionDuration(String sessionDuration) {
            this.putQueryParameter("SessionDuration", sessionDuration);
            this.sessionDuration = sessionDuration;
            return this;
        }

        /**
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The start time of the event. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719763200</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The maximum number of active users.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalActiveUsers(String totalActiveUsers) {
            this.putQueryParameter("TotalActiveUsers", totalActiveUsers);
            this.totalActiveUsers = totalActiveUsers;
            return this;
        }

        /**
         * <p>The ID of the waiting room event, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850279.html">ListWaitingRoomEvents</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>89677721098****</p>
         */
        public Builder waitingRoomEventId(Long waitingRoomEventId) {
            this.putQueryParameter("WaitingRoomEventId", waitingRoomEventId);
            this.waitingRoomEventId = waitingRoomEventId;
            return this;
        }

        /**
         * <p>The type of the waiting room. Valid values:</p>
         * <ul>
         * <li>default</li>
         * <li>custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder waitingRoomType(String waitingRoomType) {
            this.putQueryParameter("WaitingRoomType", waitingRoomType);
            this.waitingRoomType = waitingRoomType;
            return this;
        }

        @Override
        public UpdateWaitingRoomEventRequest build() {
            return new UpdateWaitingRoomEventRequest(this);
        } 

    } 

}
