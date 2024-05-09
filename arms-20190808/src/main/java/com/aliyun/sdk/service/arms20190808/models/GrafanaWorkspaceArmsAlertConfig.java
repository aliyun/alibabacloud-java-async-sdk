// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrafanaWorkspaceArmsAlertConfig} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceArmsAlertConfig</p>
 */
public class GrafanaWorkspaceArmsAlertConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("armsAlertsEnable")
    private String armsAlertsEnable;

    @com.aliyun.core.annotation.NameInMap("armsAlertsWebhookUrl")
    private String armsAlertsWebhookUrl;

    private GrafanaWorkspaceArmsAlertConfig(Builder builder) {
        this.armsAlertsEnable = builder.armsAlertsEnable;
        this.armsAlertsWebhookUrl = builder.armsAlertsWebhookUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceArmsAlertConfig create() {
        return builder().build();
    }

    /**
     * @return armsAlertsEnable
     */
    public String getArmsAlertsEnable() {
        return this.armsAlertsEnable;
    }

    /**
     * @return armsAlertsWebhookUrl
     */
    public String getArmsAlertsWebhookUrl() {
        return this.armsAlertsWebhookUrl;
    }

    public static final class Builder {
        private String armsAlertsEnable; 
        private String armsAlertsWebhookUrl; 

        /**
         * armsAlertsEnable.
         */
        public Builder armsAlertsEnable(String armsAlertsEnable) {
            this.armsAlertsEnable = armsAlertsEnable;
            return this;
        }

        /**
         * armsAlertsWebhookUrl.
         */
        public Builder armsAlertsWebhookUrl(String armsAlertsWebhookUrl) {
            this.armsAlertsWebhookUrl = armsAlertsWebhookUrl;
            return this;
        }

        public GrafanaWorkspaceArmsAlertConfig build() {
            return new GrafanaWorkspaceArmsAlertConfig(this);
        } 

    } 

}
