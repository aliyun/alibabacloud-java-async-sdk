// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
    private java.util.List<Settings> settings;

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
    public java.util.List<Settings> getSettings() {
        return this.settings;
    }

    public static final class Builder extends Request.Builder<SaveTraceAppConfigRequest, Builder> {
        private String regionId; 
        private String pid; 
        private java.util.List<Settings> settings; 

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
         * <p>The process ID (PID) of the application.</p>
         * <p>Log on to the ARMS console. In the left-side navigation pane, choose <strong>Application Monitoring</strong> &gt; <strong>Application List</strong>. On the Application List page, click the name of an application. The URL in the address bar contains the PID of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is xxx%4074xxx, you must replace %40 with an at sign (@) to obtain xxx@74xxx.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a2n80plglh@745eddxxx</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>The settings of Application Monitoring.</p>
         */
        public Builder settings(java.util.List<Settings> settings) {
            this.putQueryParameter("Settings", settings);
            this.settings = settings;
            return this;
        }

        @Override
        public SaveTraceAppConfigRequest build() {
            return new SaveTraceAppConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link SaveTraceAppConfigRequest} extends {@link TeaModel}
     *
     * <p>SaveTraceAppConfigRequest</p>
     */
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
             * <p>The key of the settings that you want to modify. For more information about the supported settings, see the following sections.</p>
             * <ul>
             * <li>Trace sampling settings</li>
             * <li>Agent switch settings</li>
             * <li>Threshold settings</li>
             * <li>Advanced settings</li>
             * <li>Thread settings</li>
             * <li>Memory snapshot settings</li>
             * <li>URL convergence settings</li>
             * <li>Business log association settings</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sampling.enable</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the settings that you want to modify. For more information about the supported settings, see the following sections.</p>
             * <ul>
             * <li>Trace sampling settings</li>
             * <li>Agent switch settings</li>
             * <li>Threshold settings</li>
             * <li>Advanced settings</li>
             * <li>Thread settings</li>
             * <li>Memory snapshot settings</li>
             * <li>URL convergence settings</li>
             * <li>Business log association settings</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
