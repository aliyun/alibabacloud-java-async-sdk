// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateWaitingRoomEventRequest} extends {@link RequestModel}
 *
 * <p>CreateWaitingRoomEventRequest</p>
 */
public class CreateWaitingRoomEventRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JsonResponseEnable")
    private String jsonResponseEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewUsersPerMinute")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newUsersPerMinute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreQueueEnable")
    private String preQueueEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreQueueStartTime")
    private String preQueueStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueuingMethod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queuingMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueuingStatusCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queuingStatusCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RandomPreQueueEnable")
    private String randomPreQueueEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionDuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalActiveUsers")
    @com.aliyun.core.annotation.Validation(required = true)
    private String totalActiveUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomId")
    private String waitingRoomId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String waitingRoomType;

    private CreateWaitingRoomEventRequest(Builder builder) {
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
        this.waitingRoomId = builder.waitingRoomId;
        this.waitingRoomType = builder.waitingRoomType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWaitingRoomEventRequest create() {
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
     * @return waitingRoomId
     */
    public String getWaitingRoomId() {
        return this.waitingRoomId;
    }

    /**
     * @return waitingRoomType
     */
    public String getWaitingRoomType() {
        return this.waitingRoomType;
    }

    public static final class Builder extends Request.Builder<CreateWaitingRoomEventRequest, Builder> {
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
        private String waitingRoomId; 
        private String waitingRoomType; 

        private Builder() {
            super();
        } 

        private Builder(CreateWaitingRoomEventRequest request) {
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
            this.waitingRoomId = request.waitingRoomId;
            this.waitingRoomType = request.waitingRoomType;
        } 

        /**
         * CustomPageHtml.
         */
        public Builder customPageHtml(String customPageHtml) {
            this.putQueryParameter("CustomPageHtml", customPageHtml);
            this.customPageHtml = customPageHtml;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DisableSessionRenewalEnable.
         */
        public Builder disableSessionRenewalEnable(String disableSessionRenewalEnable) {
            this.putQueryParameter("DisableSessionRenewalEnable", disableSessionRenewalEnable);
            this.disableSessionRenewalEnable = disableSessionRenewalEnable;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * JsonResponseEnable.
         */
        public Builder jsonResponseEnable(String jsonResponseEnable) {
            this.putQueryParameter("JsonResponseEnable", jsonResponseEnable);
            this.jsonResponseEnable = jsonResponseEnable;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waitingroom_example</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder newUsersPerMinute(String newUsersPerMinute) {
            this.putQueryParameter("NewUsersPerMinute", newUsersPerMinute);
            this.newUsersPerMinute = newUsersPerMinute;
            return this;
        }

        /**
         * PreQueueEnable.
         */
        public Builder preQueueEnable(String preQueueEnable) {
            this.putQueryParameter("PreQueueEnable", preQueueEnable);
            this.preQueueEnable = preQueueEnable;
            return this;
        }

        /**
         * PreQueueStartTime.
         */
        public Builder preQueueStartTime(String preQueueStartTime) {
            this.putQueryParameter("PreQueueStartTime", preQueueStartTime);
            this.preQueueStartTime = preQueueStartTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>random</p>
         */
        public Builder queuingMethod(String queuingMethod) {
            this.putQueryParameter("QueuingMethod", queuingMethod);
            this.queuingMethod = queuingMethod;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>202</p>
         */
        public Builder queuingStatusCode(String queuingStatusCode) {
            this.putQueryParameter("QueuingStatusCode", queuingStatusCode);
            this.queuingStatusCode = queuingStatusCode;
            return this;
        }

        /**
         * RandomPreQueueEnable.
         */
        public Builder randomPreQueueEnable(String randomPreQueueEnable) {
            this.putQueryParameter("RandomPreQueueEnable", randomPreQueueEnable);
            this.randomPreQueueEnable = randomPreQueueEnable;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalActiveUsers(String totalActiveUsers) {
            this.putQueryParameter("TotalActiveUsers", totalActiveUsers);
            this.totalActiveUsers = totalActiveUsers;
            return this;
        }

        /**
         * WaitingRoomId.
         */
        public Builder waitingRoomId(String waitingRoomId) {
            this.putQueryParameter("WaitingRoomId", waitingRoomId);
            this.waitingRoomId = waitingRoomId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder waitingRoomType(String waitingRoomType) {
            this.putQueryParameter("WaitingRoomType", waitingRoomType);
            this.waitingRoomType = waitingRoomType;
            return this;
        }

        @Override
        public CreateWaitingRoomEventRequest build() {
            return new CreateWaitingRoomEventRequest(this);
        } 

    } 

}
