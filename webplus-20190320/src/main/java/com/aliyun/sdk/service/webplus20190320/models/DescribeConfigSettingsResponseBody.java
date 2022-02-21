// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfigSettingsResponseBody</p>
 */
public class DescribeConfigSettingsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ConfigSettings")
    private ConfigSettings configSettings;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeConfigSettingsResponseBody(Builder builder) {
        this.code = builder.code;
        this.configSettings = builder.configSettings;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigSettingsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return configSettings
     */
    public ConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private ConfigSettings configSettings; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ConfigSettings.
         */
        public Builder configSettings(ConfigSettings configSettings) {
            this.configSettings = configSettings;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeConfigSettingsResponseBody build() {
            return new DescribeConfigSettingsResponseBody(this);
        } 

    } 

    public static class ConfigSetting extends TeaModel {
        @NameInMap("OptionName")
        private String optionName;

        @NameInMap("PathName")
        private String pathName;

        @NameInMap("SettingValue")
        private String settingValue;

        private ConfigSetting(Builder builder) {
            this.optionName = builder.optionName;
            this.pathName = builder.pathName;
            this.settingValue = builder.settingValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigSetting create() {
            return builder().build();
        }

        /**
         * @return optionName
         */
        public String getOptionName() {
            return this.optionName;
        }

        /**
         * @return pathName
         */
        public String getPathName() {
            return this.pathName;
        }

        /**
         * @return settingValue
         */
        public String getSettingValue() {
            return this.settingValue;
        }

        public static final class Builder {
            private String optionName; 
            private String pathName; 
            private String settingValue; 

            /**
             * OptionName.
             */
            public Builder optionName(String optionName) {
                this.optionName = optionName;
                return this;
            }

            /**
             * PathName.
             */
            public Builder pathName(String pathName) {
                this.pathName = pathName;
                return this;
            }

            /**
             * SettingValue.
             */
            public Builder settingValue(String settingValue) {
                this.settingValue = settingValue;
                return this;
            }

            public ConfigSetting build() {
                return new ConfigSetting(this);
            } 

        } 

    }
    public static class ConfigSettings extends TeaModel {
        @NameInMap("ConfigSetting")
        private java.util.List < ConfigSetting> configSetting;

        private ConfigSettings(Builder builder) {
            this.configSetting = builder.configSetting;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigSettings create() {
            return builder().build();
        }

        /**
         * @return configSetting
         */
        public java.util.List < ConfigSetting> getConfigSetting() {
            return this.configSetting;
        }

        public static final class Builder {
            private java.util.List < ConfigSetting> configSetting; 

            /**
             * ConfigSetting.
             */
            public Builder configSetting(java.util.List < ConfigSetting> configSetting) {
                this.configSetting = configSetting;
                return this;
            }

            public ConfigSettings build() {
                return new ConfigSettings(this);
            } 

        } 

    }
}
