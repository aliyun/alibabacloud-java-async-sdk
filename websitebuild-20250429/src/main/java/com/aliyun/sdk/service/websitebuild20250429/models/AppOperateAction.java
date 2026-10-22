// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link AppOperateAction} extends {@link TeaModel}
 *
 * <p>AppOperateAction</p>
 */
public class AppOperateAction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActionKey")
    private String actionKey;

    @com.aliyun.core.annotation.NameInMap("ActionText")
    private String actionText;

    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("Href")
    private String href;

    private AppOperateAction(Builder builder) {
        this.actionKey = builder.actionKey;
        this.actionText = builder.actionText;
        this.enable = builder.enable;
        this.href = builder.href;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppOperateAction create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionKey
     */
    public String getActionKey() {
        return this.actionKey;
    }

    /**
     * @return actionText
     */
    public String getActionText() {
        return this.actionText;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return href
     */
    public String getHref() {
        return this.href;
    }

    public static final class Builder {
        private String actionKey; 
        private String actionText; 
        private Boolean enable; 
        private String href; 

        private Builder() {
        } 

        private Builder(AppOperateAction model) {
            this.actionKey = model.actionKey;
            this.actionText = model.actionText;
            this.enable = model.enable;
            this.href = model.href;
        } 

        /**
         * <p>The key used to uniquely identify an action.</p>
         * 
         * <strong>example:</strong>
         * <p>BeginDialogue</p>
         */
        public Builder actionKey(String actionKey) {
            this.actionKey = actionKey;
            return this;
        }

        /**
         * <p>The text used to display the action name in the user interface.</p>
         * 
         * <strong>example:</strong>
         * <p>Renew</p>
         */
        public Builder actionText(String actionText) {
            this.actionText = actionText;
            return this;
        }

        /**
         * <p>Indicates whether the action is available.</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The URL to redirect to when the action is clicked.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://common-buy.aliyun.com/?orderType=RENEW&commodityCode=domain_website_public_cn&instanceId=12313213">https://common-buy.aliyun.com/?orderType=RENEW&amp;commodityCode=domain_website_public_cn&amp;instanceId=12313213</a></p>
         */
        public Builder href(String href) {
            this.href = href;
            return this;
        }

        public AppOperateAction build() {
            return new AppOperateAction(this);
        } 

    } 

}
