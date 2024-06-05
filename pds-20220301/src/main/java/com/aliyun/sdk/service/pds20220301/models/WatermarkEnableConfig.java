// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WatermarkEnableConfig} extends {@link TeaModel}
 *
 * <p>WatermarkEnableConfig</p>
 */
public class WatermarkEnableConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("display_access_user_name")
    private Boolean displayAccessUserName;

    @com.aliyun.core.annotation.NameInMap("display_custom_text")
    private String displayCustomText;

    @com.aliyun.core.annotation.NameInMap("display_shareLink_creator_name")
    private Boolean displayShareLinkCreatorName;

    @com.aliyun.core.annotation.NameInMap("enable_doc_preview")
    private Boolean enableDocPreview;

    private WatermarkEnableConfig(Builder builder) {
        this.displayAccessUserName = builder.displayAccessUserName;
        this.displayCustomText = builder.displayCustomText;
        this.displayShareLinkCreatorName = builder.displayShareLinkCreatorName;
        this.enableDocPreview = builder.enableDocPreview;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WatermarkEnableConfig create() {
        return builder().build();
    }

    /**
     * @return displayAccessUserName
     */
    public Boolean getDisplayAccessUserName() {
        return this.displayAccessUserName;
    }

    /**
     * @return displayCustomText
     */
    public String getDisplayCustomText() {
        return this.displayCustomText;
    }

    /**
     * @return displayShareLinkCreatorName
     */
    public Boolean getDisplayShareLinkCreatorName() {
        return this.displayShareLinkCreatorName;
    }

    /**
     * @return enableDocPreview
     */
    public Boolean getEnableDocPreview() {
        return this.enableDocPreview;
    }

    public static final class Builder {
        private Boolean displayAccessUserName; 
        private String displayCustomText; 
        private Boolean displayShareLinkCreatorName; 
        private Boolean enableDocPreview; 

        /**
         * display_access_user_name.
         */
        public Builder displayAccessUserName(Boolean displayAccessUserName) {
            this.displayAccessUserName = displayAccessUserName;
            return this;
        }

        /**
         * display_custom_text.
         */
        public Builder displayCustomText(String displayCustomText) {
            this.displayCustomText = displayCustomText;
            return this;
        }

        /**
         * display_shareLink_creator_name.
         */
        public Builder displayShareLinkCreatorName(Boolean displayShareLinkCreatorName) {
            this.displayShareLinkCreatorName = displayShareLinkCreatorName;
            return this;
        }

        /**
         * enable_doc_preview.
         */
        public Builder enableDocPreview(Boolean enableDocPreview) {
            this.enableDocPreview = enableDocPreview;
            return this;
        }

        public WatermarkEnableConfig build() {
            return new WatermarkEnableConfig(this);
        } 

    } 

}
