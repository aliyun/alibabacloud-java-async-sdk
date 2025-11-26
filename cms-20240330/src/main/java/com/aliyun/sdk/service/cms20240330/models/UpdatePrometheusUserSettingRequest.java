// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link UpdatePrometheusUserSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrometheusUserSettingRequest</p>
 */
public class UpdatePrometheusUserSettingRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("settingKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String settingKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("settingValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String settingValue;

    private UpdatePrometheusUserSettingRequest(Builder builder) {
        super(builder);
        this.settingKey = builder.settingKey;
        this.settingValue = builder.settingValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrometheusUserSettingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return settingKey
     */
    public String getSettingKey() {
        return this.settingKey;
    }

    /**
     * @return settingValue
     */
    public String getSettingValue() {
        return this.settingValue;
    }

    public static final class Builder extends Request.Builder<UpdatePrometheusUserSettingRequest, Builder> {
        private String settingKey; 
        private String settingValue; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrometheusUserSettingRequest request) {
            super(request);
            this.settingKey = request.settingKey;
            this.settingValue = request.settingValue;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        public Builder settingKey(String settingKey) {
            this.putPathParameter("settingKey", settingKey);
            this.settingKey = settingKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder settingValue(String settingValue) {
            this.putQueryParameter("settingValue", settingValue);
            this.settingValue = settingValue;
            return this;
        }

        @Override
        public UpdatePrometheusUserSettingRequest build() {
            return new UpdatePrometheusUserSettingRequest(this);
        } 

    } 

}
