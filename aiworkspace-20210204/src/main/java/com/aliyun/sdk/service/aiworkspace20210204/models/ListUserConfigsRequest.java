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
 * {@link ListUserConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListUserConfigsRequest</p>
 */
public class ListUserConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryNames")
    private String categoryNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigKeys")
    private String configKeys;

    private ListUserConfigsRequest(Builder builder) {
        super(builder);
        this.categoryNames = builder.categoryNames;
        this.configKeys = builder.configKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserConfigsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryNames
     */
    public String getCategoryNames() {
        return this.categoryNames;
    }

    /**
     * @return configKeys
     */
    public String getConfigKeys() {
        return this.configKeys;
    }

    public static final class Builder extends Request.Builder<ListUserConfigsRequest, Builder> {
        private String categoryNames; 
        private String configKeys; 

        private Builder() {
            super();
        } 

        private Builder(ListUserConfigsRequest request) {
            super(request);
            this.categoryNames = request.categoryNames;
            this.configKeys = request.configKeys;
        } 

        /**
         * <p>The category. Currently, only DataPrivacyConfig is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>DataPrivacyConfig</p>
         */
        public Builder categoryNames(String categoryNames) {
            this.putQueryParameter("CategoryNames", categoryNames);
            this.categoryNames = categoryNames;
            return this;
        }

        /**
         * <p>The configuration item keys. Currently, only customizePAIAssumedRole is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>customizePAIAssumedRole</p>
         */
        public Builder configKeys(String configKeys) {
            this.putQueryParameter("ConfigKeys", configKeys);
            this.configKeys = configKeys;
            return this;
        }

        @Override
        public ListUserConfigsRequest build() {
            return new ListUserConfigsRequest(this);
        } 

    } 

}
