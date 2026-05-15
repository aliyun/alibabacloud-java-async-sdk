// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link SubmitYikePromptExpansionVoiceFixJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitYikePromptExpansionVoiceFixJobRequest</p>
 */
public class SubmitYikePromptExpansionVoiceFixJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitYikePromptExpansionVoiceFixJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobParams = builder.jobParams;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitYikePromptExpansionVoiceFixJobRequest create() {
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
     * @return jobParams
     */
    public String getJobParams() {
        return this.jobParams;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitYikePromptExpansionVoiceFixJobRequest, Builder> {
        private String regionId; 
        private String jobParams; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitYikePromptExpansionVoiceFixJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobParams = request.jobParams;
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
         * <p>This parameter is required.</p>
         */
        public Builder jobParams(String jobParams) {
            this.putBodyParameter("JobParams", jobParams);
            this.jobParams = jobParams;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putBodyParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitYikePromptExpansionVoiceFixJobRequest build() {
            return new SubmitYikePromptExpansionVoiceFixJobRequest(this);
        } 

    } 

}
