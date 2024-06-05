// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WatermarkConfig} extends {@link TeaModel}
 *
 * <p>WatermarkConfig</p>
 */
public class WatermarkConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("display_access_user_name")
    private Boolean displayAccessUserName;

    @com.aliyun.core.annotation.NameInMap("display_shareLink_creator_name")
    private Boolean displayShareLinkCreatorName;

    @com.aliyun.core.annotation.NameInMap("enable_doc_preview")
    private Boolean enableDocPreview;

    @com.aliyun.core.annotation.NameInMap("enable_on_preview")
    private Boolean enableOnPreview;

    private WatermarkConfig(Builder builder) {
        this.displayAccessUserName = builder.displayAccessUserName;
        this.displayShareLinkCreatorName = builder.displayShareLinkCreatorName;
        this.enableDocPreview = builder.enableDocPreview;
        this.enableOnPreview = builder.enableOnPreview;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WatermarkConfig create() {
        return builder().build();
    }

    /**
     * @return displayAccessUserName
     */
    public Boolean getDisplayAccessUserName() {
        return this.displayAccessUserName;
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

    /**
     * @return enableOnPreview
     */
    public Boolean getEnableOnPreview() {
        return this.enableOnPreview;
    }

    public static final class Builder {
        private Boolean displayAccessUserName; 
        private Boolean displayShareLinkCreatorName; 
        private Boolean enableDocPreview; 
        private Boolean enableOnPreview; 

        /**
         * display_access_user_name.
         */
        public Builder displayAccessUserName(Boolean displayAccessUserName) {
            this.displayAccessUserName = displayAccessUserName;
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

        /**
         * enable_on_preview.
         */
        public Builder enableOnPreview(Boolean enableOnPreview) {
            this.enableOnPreview = enableOnPreview;
            return this;
        }

        public WatermarkConfig build() {
            return new WatermarkConfig(this);
        } 

    } 

}
