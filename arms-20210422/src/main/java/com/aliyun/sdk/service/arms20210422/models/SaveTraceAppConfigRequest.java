// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
         * <p>This parameter is required.</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * Settings.
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

            private Builder() {
            } 

            private Builder(Settings model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
