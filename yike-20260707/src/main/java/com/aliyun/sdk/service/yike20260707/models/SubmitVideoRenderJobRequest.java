// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link SubmitVideoRenderJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitVideoRenderJobRequest</p>
 */
public class SubmitVideoRenderJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Script")
    private String script;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Settings")
    private String settings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitVideoRenderJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.script = builder.script;
        this.settings = builder.settings;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitVideoRenderJobRequest create() {
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
     * @return script
     */
    public String getScript() {
        return this.script;
    }

    /**
     * @return settings
     */
    public String getSettings() {
        return this.settings;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitVideoRenderJobRequest, Builder> {
        private String regionId; 
        private String script; 
        private String settings; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitVideoRenderJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.script = request.script;
            this.settings = request.settings;
            this.userData = request.userData;
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
         * Script.
         */
        public Builder script(String script) {
            this.putQueryParameter("Script", script);
            this.script = script;
            return this;
        }

        /**
         * Settings.
         */
        public Builder settings(String settings) {
            this.putQueryParameter("Settings", settings);
            this.settings = settings;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitVideoRenderJobRequest build() {
            return new SubmitVideoRenderJobRequest(this);
        } 

    } 

}
