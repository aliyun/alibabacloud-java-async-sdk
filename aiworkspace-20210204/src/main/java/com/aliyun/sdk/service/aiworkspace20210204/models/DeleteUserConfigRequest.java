// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link DeleteUserConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserConfigRequest</p>
 */
public class DeleteUserConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("CategoryName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigKey")
    private String configKey;

    private DeleteUserConfigRequest(Builder builder) {
        super(builder);
        this.categoryName = builder.categoryName;
        this.configKey = builder.configKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * @return configKey
     */
    public String getConfigKey() {
        return this.configKey;
    }

    public static final class Builder extends Request.Builder<DeleteUserConfigRequest, Builder> {
        private String categoryName; 
        private String configKey; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserConfigRequest request) {
            super(request);
            this.categoryName = request.categoryName;
            this.configKey = request.configKey;
        } 

        /**
         * <p>The category. Currently, only DataPrivacyConfig is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DataPrivacyConfig</p>
         */
        public Builder categoryName(String categoryName) {
            this.putPathParameter("CategoryName", categoryName);
            this.categoryName = categoryName;
            return this;
        }

        /**
         * <p>The configuration item keys. Currently, only customizePAIAssumedRole.</p>
         * 
         * <strong>example:</strong>
         * <p>tempStoragePath</p>
         */
        public Builder configKey(String configKey) {
            this.putQueryParameter("ConfigKey", configKey);
            this.configKey = configKey;
            return this;
        }

        @Override
        public DeleteUserConfigRequest build() {
            return new DeleteUserConfigRequest(this);
        } 

    } 

}
