// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveTraceAppConfigRequest} extends {@link RequestModel}
 *
 * <p>SaveTraceAppConfigRequest</p>
 */
public class SaveTraceAppConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Settings")
    private java.util.List < Settings> settings;

    private SaveTraceAppConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.pid = builder.pid;
        this.settings = builder.settings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveTraceAppConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return settings
     */
    public java.util.List < Settings> getSettings() {
        return this.settings;
    }

    public static final class Builder extends Request.Builder<SaveTraceAppConfigRequest, Builder> {
        private String regionId; 
        private String pid; 
        private java.util.List < Settings> settings; 

        private Builder() {
            super();
        } 

        private Builder(SaveTraceAppConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.pid = request.pid;
            this.settings = request.settings;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The process ID (PID) of the application.
         * <p>
         * 
         * Log on to the ARMS console. In the left-side navigation pane, choose **Application Monitoring** > **Application List**. On the Application List page, click the name of an application. The URL in the address bar contains the PID of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is xxx%4074xxx, you must replace %40 with an at sign (@) to obtain xxx@74xxx.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * The settings of Application Monitoring.
         */
        public Builder settings(java.util.List < Settings> settings) {
            this.putQueryParameter("Settings", settings);
            this.settings = settings;
            return this;
        }

        @Override
        public SaveTraceAppConfigRequest build() {
            return new SaveTraceAppConfigRequest(this);
        } 

    } 

    public static class Settings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Settings(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Settings create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the settings that you want to modify. For more information about the supported settings, see the following sections.
             * <p>
             * 
             * *   Trace sampling settings
             * *   Agent switch settings
             * *   Threshold settings
             * *   Advanced settings
             * *   Thread settings
             * *   Memory snapshot settings
             * *   URL convergence settings
             * *   Business log association settings
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the settings that you want to modify. For more information about the supported settings, see the following sections.
             * <p>
             * 
             * *   Trace sampling settings
             * *   Agent switch settings
             * *   Threshold settings
             * *   Advanced settings
             * *   Thread settings
             * *   Memory snapshot settings
             * *   URL convergence settings
             * *   Business log association settings
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Settings build() {
                return new Settings(this);
            } 

        } 

    }
}
