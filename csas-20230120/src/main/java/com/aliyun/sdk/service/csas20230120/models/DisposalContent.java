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

    @com.aliyun.core.annotation.NameInMap("AlertTitle")
    private String alertTitle;

    @com.aliyun.core.annotation.NameInMap("NotifyActions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> notifyActions;

    @com.aliyun.core.annotation.NameInMap("ProhibitActions")
    private java.util.List<String> prohibitActions;

    private DisposalContent(Builder builder) {
        this.alertContent = builder.alertContent;
        this.alertTitle = builder.alertTitle;
        this.notifyActions = builder.notifyActions;
        this.prohibitActions = builder.prohibitActions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisposalContent create() {
        return builder().build();
    }

    /**
     * @return alertContent
     */
    public String getAlertContent() {
        return this.alertContent;
    }

    /**
     * @return alertTitle
     */
    public String getAlertTitle() {
        return this.alertTitle;
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
        private String alertTitle; 
        private java.util.List<String> notifyActions; 
        private java.util.List<String> prohibitActions; 

        /**
         * AlertContent.
         */
        public Builder alertContent(String alertContent) {
            this.alertContent = alertContent;
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
