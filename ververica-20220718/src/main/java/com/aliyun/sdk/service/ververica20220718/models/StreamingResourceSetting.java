// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StreamingResourceSetting} extends {@link TeaModel}
 *
 * <p>StreamingResourceSetting</p>
 */
public class StreamingResourceSetting extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("basicResourceSetting")
    private BasicResourceSetting basicResourceSetting;

    @com.aliyun.core.annotation.NameInMap("expertResourceSetting")
    private ExpertResourceSetting expertResourceSetting;

    @com.aliyun.core.annotation.NameInMap("resourceSettingMode")
    private String resourceSettingMode;

    private StreamingResourceSetting(Builder builder) {
        this.basicResourceSetting = builder.basicResourceSetting;
        this.expertResourceSetting = builder.expertResourceSetting;
        this.resourceSettingMode = builder.resourceSettingMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StreamingResourceSetting create() {
        return builder().build();
    }

    /**
     * @return basicResourceSetting
     */
    public BasicResourceSetting getBasicResourceSetting() {
        return this.basicResourceSetting;
    }

    /**
     * @return expertResourceSetting
     */
    public ExpertResourceSetting getExpertResourceSetting() {
        return this.expertResourceSetting;
    }

    /**
     * @return resourceSettingMode
     */
    public String getResourceSettingMode() {
        return this.resourceSettingMode;
    }

    public static final class Builder {
        private BasicResourceSetting basicResourceSetting; 
        private ExpertResourceSetting expertResourceSetting; 
        private String resourceSettingMode; 

        /**
         * basicResourceSetting.
         */
        public Builder basicResourceSetting(BasicResourceSetting basicResourceSetting) {
            this.basicResourceSetting = basicResourceSetting;
            return this;
        }

        /**
         * expertResourceSetting.
         */
        public Builder expertResourceSetting(ExpertResourceSetting expertResourceSetting) {
            this.expertResourceSetting = expertResourceSetting;
            return this;
        }

        /**
         * resourceSettingMode.
         */
        public Builder resourceSettingMode(String resourceSettingMode) {
            this.resourceSettingMode = resourceSettingMode;
            return this;
        }

        public StreamingResourceSetting build() {
            return new StreamingResourceSetting(this);
        } 

    } 

}
