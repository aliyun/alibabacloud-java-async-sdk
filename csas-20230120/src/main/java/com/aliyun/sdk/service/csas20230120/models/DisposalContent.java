// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link DisposalContent} extends {@link TeaModel}
 *
 * <p>DisposalContent</p>
 */
public class DisposalContent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertContent")
    private String alertContent;

    @com.aliyun.core.annotation.NameInMap("AlertContentEn")
    private String alertContentEn;

    @com.aliyun.core.annotation.NameInMap("AlertTitle")
    private String alertTitle;

    @com.aliyun.core.annotation.NameInMap("AlertTitleEn")
    private String alertTitleEn;

    @com.aliyun.core.annotation.NameInMap("NoticeContent")
    private String noticeContent;

    @com.aliyun.core.annotation.NameInMap("NoticeContentEn")
    private String noticeContentEn;

    @com.aliyun.core.annotation.NameInMap("NotifyActions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> notifyActions;

    @com.aliyun.core.annotation.NameInMap("ProhibitActions")
    private java.util.List<String> prohibitActions;

    private DisposalContent(Builder builder) {
        this.alertContent = builder.alertContent;
        this.alertContentEn = builder.alertContentEn;
        this.alertTitle = builder.alertTitle;
        this.alertTitleEn = builder.alertTitleEn;
        this.noticeContent = builder.noticeContent;
        this.noticeContentEn = builder.noticeContentEn;
        this.notifyActions = builder.notifyActions;
        this.prohibitActions = builder.prohibitActions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisposalContent create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertContent
     */
    public String getAlertContent() {
        return this.alertContent;
    }

    /**
     * @return alertContentEn
     */
    public String getAlertContentEn() {
        return this.alertContentEn;
    }

    /**
     * @return alertTitle
     */
    public String getAlertTitle() {
        return this.alertTitle;
    }

    /**
     * @return alertTitleEn
     */
    public String getAlertTitleEn() {
        return this.alertTitleEn;
    }

    /**
     * @return noticeContent
     */
    public String getNoticeContent() {
        return this.noticeContent;
    }

    /**
     * @return noticeContentEn
     */
    public String getNoticeContentEn() {
        return this.noticeContentEn;
    }

    /**
     * @return notifyActions
     */
    public java.util.List<String> getNotifyActions() {
        return this.notifyActions;
    }

    /**
     * @return prohibitActions
     */
    public java.util.List<String> getProhibitActions() {
        return this.prohibitActions;
    }

    public static final class Builder {
        private String alertContent; 
        private String alertContentEn; 
        private String alertTitle; 
        private String alertTitleEn; 
        private String noticeContent; 
        private String noticeContentEn; 
        private java.util.List<String> notifyActions; 
        private java.util.List<String> prohibitActions; 

        private Builder() {
        } 

        private Builder(DisposalContent model) {
            this.alertContent = model.alertContent;
            this.alertContentEn = model.alertContentEn;
            this.alertTitle = model.alertTitle;
            this.alertTitleEn = model.alertTitleEn;
            this.noticeContent = model.noticeContent;
            this.noticeContentEn = model.noticeContentEn;
            this.notifyActions = model.notifyActions;
            this.prohibitActions = model.prohibitActions;
        } 

        /**
         * AlertContent.
         */
        public Builder alertContent(String alertContent) {
            this.alertContent = alertContent;
            return this;
        }

        /**
         * AlertContentEn.
         */
        public Builder alertContentEn(String alertContentEn) {
            this.alertContentEn = alertContentEn;
            return this;
        }

        /**
         * AlertTitle.
         */
        public Builder alertTitle(String alertTitle) {
            this.alertTitle = alertTitle;
            return this;
        }

        /**
         * AlertTitleEn.
         */
        public Builder alertTitleEn(String alertTitleEn) {
            this.alertTitleEn = alertTitleEn;
            return this;
        }

        /**
         * NoticeContent.
         */
        public Builder noticeContent(String noticeContent) {
            this.noticeContent = noticeContent;
            return this;
        }

        /**
         * NoticeContentEn.
         */
        public Builder noticeContentEn(String noticeContentEn) {
            this.noticeContentEn = noticeContentEn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder notifyActions(java.util.List<String> notifyActions) {
            this.notifyActions = notifyActions;
            return this;
        }

        /**
         * ProhibitActions.
         */
        public Builder prohibitActions(java.util.List<String> prohibitActions) {
            this.prohibitActions = prohibitActions;
            return this;
        }

        public DisposalContent build() {
            return new DisposalContent(this);
        } 

    } 

}
