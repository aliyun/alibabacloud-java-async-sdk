// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link MLLabelParam} extends {@link TeaModel}
 *
 * <p>MLLabelParam</p>
 */
public class MLLabelParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("labelId")
    private String labelId;

    @com.aliyun.core.annotation.NameInMap("lastModifyTime")
    private Long lastModifyTime;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("settings")
    private java.util.List<Settings> settings;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private MLLabelParam(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.labelId = builder.labelId;
        this.lastModifyTime = builder.lastModifyTime;
        this.name = builder.name;
        this.settings = builder.settings;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MLLabelParam create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return labelId
     */
    public String getLabelId() {
        return this.labelId;
    }

    /**
     * @return lastModifyTime
     */
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return settings
     */
    public java.util.List<Settings> getSettings() {
        return this.settings;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long createTime; 
        private String description; 
        private String labelId; 
        private Long lastModifyTime; 
        private String name; 
        private java.util.List<Settings> settings; 
        private String type; 

        /**
         * createTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
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
         * labelId.
         */
        public Builder labelId(String labelId) {
            this.labelId = labelId;
            return this;
        }

        /**
         * lastModifyTime.
         */
        public Builder lastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * settings.
         */
        public Builder settings(java.util.List<Settings> settings) {
            this.settings = settings;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public MLLabelParam build() {
            return new MLLabelParam(this);
        } 

    } 

    /**
     * 
     * {@link MLLabelParam} extends {@link TeaModel}
     *
     * <p>MLLabelParam</p>
     */
    public static class Settings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Settings(Builder builder) {
            this.config = builder.config;
            this.mode = builder.mode;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Settings create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String config; 
            private String mode; 
            private String type; 
            private String version; 

            /**
             * config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Settings build() {
                return new Settings(this);
            } 

        } 

    }
}
