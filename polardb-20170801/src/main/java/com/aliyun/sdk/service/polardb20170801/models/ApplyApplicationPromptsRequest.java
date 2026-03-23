// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ApplyApplicationPromptsRequest} extends {@link RequestModel}
 *
 * <p>ApplyApplicationPromptsRequest</p>
 */
public class ApplyApplicationPromptsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisabledPromptIds")
    private java.util.List<String> disabledPromptIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnabledPromptIds")
    private java.util.List<String> enabledPromptIds;

    private ApplyApplicationPromptsRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.disabledPromptIds = builder.disabledPromptIds;
        this.enabledPromptIds = builder.enabledPromptIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyApplicationPromptsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return disabledPromptIds
     */
    public java.util.List<String> getDisabledPromptIds() {
        return this.disabledPromptIds;
    }

    /**
     * @return enabledPromptIds
     */
    public java.util.List<String> getEnabledPromptIds() {
        return this.enabledPromptIds;
    }

    public static final class Builder extends Request.Builder<ApplyApplicationPromptsRequest, Builder> {
        private String applicationId; 
        private java.util.List<String> disabledPromptIds; 
        private java.util.List<String> enabledPromptIds; 

        private Builder() {
            super();
        } 

        private Builder(ApplyApplicationPromptsRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.disabledPromptIds = request.disabledPromptIds;
            this.enabledPromptIds = request.enabledPromptIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * DisabledPromptIds.
         */
        public Builder disabledPromptIds(java.util.List<String> disabledPromptIds) {
            String disabledPromptIdsShrink = shrink(disabledPromptIds, "DisabledPromptIds", "json");
            this.putQueryParameter("DisabledPromptIds", disabledPromptIdsShrink);
            this.disabledPromptIds = disabledPromptIds;
            return this;
        }

        /**
         * EnabledPromptIds.
         */
        public Builder enabledPromptIds(java.util.List<String> enabledPromptIds) {
            String enabledPromptIdsShrink = shrink(enabledPromptIds, "EnabledPromptIds", "json");
            this.putQueryParameter("EnabledPromptIds", enabledPromptIdsShrink);
            this.enabledPromptIds = enabledPromptIds;
            return this;
        }

        @Override
        public ApplyApplicationPromptsRequest build() {
            return new ApplyApplicationPromptsRequest(this);
        } 

    } 

}
