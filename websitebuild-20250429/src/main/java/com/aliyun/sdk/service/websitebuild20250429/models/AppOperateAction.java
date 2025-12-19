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
         * <p>用于唯一标识一个操作行为</p>
         */
        public Builder actionKey(String actionKey) {
            this.actionKey = actionKey;
            return this;
        }

        /**
         * <p>用于在界面中展示操作名称</p>
         */
        public Builder actionText(String actionText) {
            this.actionText = actionText;
            return this;
        }

        /**
         * <p>标识该操作是否可用</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>点击操作时跳转的URL地址</p>
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
