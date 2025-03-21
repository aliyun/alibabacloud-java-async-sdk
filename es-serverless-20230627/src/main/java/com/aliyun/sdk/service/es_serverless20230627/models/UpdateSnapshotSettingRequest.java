// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

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
 * {@link UpdateSnapshotSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateSnapshotSettingRequest</p>
 */
public class UpdateSnapshotSettingRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("quartzRegex")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quartzRegex;

    private UpdateSnapshotSettingRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.enable = builder.enable;
        this.quartzRegex = builder.quartzRegex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSnapshotSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return quartzRegex
     */
    public String getQuartzRegex() {
        return this.quartzRegex;
    }

    public static final class Builder extends Request.Builder<UpdateSnapshotSettingRequest, Builder> {
        private String appName; 
        private Boolean enable; 
        private String quartzRegex; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSnapshotSettingRequest request) {
            super(request);
            this.appName = request.appName;
            this.enable = request.enable;
            this.quartzRegex = request.quartzRegex;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 01 ? * * *</p>
         */
        public Builder quartzRegex(String quartzRegex) {
            this.putBodyParameter("quartzRegex", quartzRegex);
            this.quartzRegex = quartzRegex;
            return this;
        }

        @Override
        public UpdateSnapshotSettingRequest build() {
            return new UpdateSnapshotSettingRequest(this);
        } 

    } 

}
