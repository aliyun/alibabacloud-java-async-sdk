// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataValue} extends {@link TeaModel}
 *
 * <p>DataValue</p>
 */
public class DataValue extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("description")
    private String description;

    @NameInMap("configDescription")
    private String configDescription;

    @NameInMap("configCode")
    private String configCode;

    @NameInMap("parentCode")
    private String parentCode;

    @NameInMap("configKey")
    private String configKey;

    @NameInMap("configValue")
    private String configValue;

    @NameInMap("requirement")
    private Boolean requirement;

    private DataValue(Builder builder) {
        this.code = builder.code;
        this.description = builder.description;
        this.configDescription = builder.configDescription;
        this.configCode = builder.configCode;
        this.parentCode = builder.parentCode;
        this.configKey = builder.configKey;
        this.configValue = builder.configValue;
        this.requirement = builder.requirement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataValue create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return configDescription
     */
    public String getConfigDescription() {
        return this.configDescription;
    }

    /**
     * @return configCode
     */
    public String getConfigCode() {
        return this.configCode;
    }

    /**
     * @return parentCode
     */
    public String getParentCode() {
        return this.parentCode;
    }

    /**
     * @return configKey
     */
    public String getConfigKey() {
        return this.configKey;
    }

    /**
     * @return configValue
     */
    public String getConfigValue() {
        return this.configValue;
    }

    /**
     * @return requirement
     */
    public Boolean getRequirement() {
        return this.requirement;
    }

    public static final class Builder {
        private String code; 
        private String description; 
        private String configDescription; 
        private String configCode; 
        private String parentCode; 
        private String configKey; 
        private String configValue; 
        private Boolean requirement; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * configDescription.
         */
        public Builder configDescription(String configDescription) {
            this.configDescription = configDescription;
            return this;
        }

        /**
         * configCode.
         */
        public Builder configCode(String configCode) {
            this.configCode = configCode;
            return this;
        }

        /**
         * parentCode.
         */
        public Builder parentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }

        /**
         * configKey.
         */
        public Builder configKey(String configKey) {
            this.configKey = configKey;
            return this;
        }

        /**
         * configValue.
         */
        public Builder configValue(String configValue) {
            this.configValue = configValue;
            return this;
        }

        /**
         * requirement.
         */
        public Builder requirement(Boolean requirement) {
            this.requirement = requirement;
            return this;
        }

        public DataValue build() {
            return new DataValue(this);
        } 

    } 

}
