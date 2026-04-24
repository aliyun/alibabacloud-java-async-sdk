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
 * {@link SubmitYikeVoiceNarratorJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitYikeVoiceNarratorJobRequest</p>
 */
public class SubmitYikeVoiceNarratorJobRequest extends Request {
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

    private SubmitYikeVoiceNarratorJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobParams = builder.jobParams;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitYikeVoiceNarratorJobRequest create() {
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

    public static final class Builder extends Request.Builder<SubmitYikeVoiceNarratorJobRequest, Builder> {
        private String regionId; 
        private String jobParams; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitYikeVoiceNarratorJobRequest request) {
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
         * 
         * <strong>example:</strong>
         * <p>{&quot;TextType&quot;:2,&quot;TextContent&quot;:&quot;Today, Beijing held a press conference to announce plans to further optimize the city&quot;s transportation network, including adding three new subway lines within the next three years....&quot;,&quot;AspectRatio&quot;:&quot;16:9&quot;, &quot;Resolution&quot;:&quot;720P&quot;, &quot;OutputLanguages&quot;:[&quot;CN&quot;,&quot;YUE&quot;]&quot;}</p>
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
        public SubmitYikeVoiceNarratorJobRequest build() {
            return new SubmitYikeVoiceNarratorJobRequest(this);
        } 

    } 

}
