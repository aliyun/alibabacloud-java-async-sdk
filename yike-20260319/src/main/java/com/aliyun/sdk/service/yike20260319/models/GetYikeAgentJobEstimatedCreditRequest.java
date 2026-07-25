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
 * {@link GetYikeAgentJobEstimatedCreditRequest} extends {@link RequestModel}
 *
 * <p>GetYikeAgentJobEstimatedCreditRequest</p>
 */
public class GetYikeAgentJobEstimatedCreditRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobParams;

    private GetYikeAgentJobEstimatedCreditRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobAction = builder.jobAction;
        this.jobParams = builder.jobParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetYikeAgentJobEstimatedCreditRequest create() {
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
     * @return jobAction
     */
    public String getJobAction() {
        return this.jobAction;
    }

    /**
     * @return jobParams
     */
    public String getJobParams() {
        return this.jobParams;
    }

    public static final class Builder extends Request.Builder<GetYikeAgentJobEstimatedCreditRequest, Builder> {
        private String regionId; 
        private String jobAction; 
        private String jobParams; 

        private Builder() {
            super();
        } 

        private Builder(GetYikeAgentJobEstimatedCreditRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobAction = request.jobAction;
            this.jobParams = request.jobParams;
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
         * <p>SubmitYikeAvatarNarratorJob</p>
         */
        public Builder jobAction(String jobAction) {
            this.putBodyParameter("JobAction", jobAction);
            this.jobAction = jobAction;
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

        @Override
        public GetYikeAgentJobEstimatedCreditRequest build() {
            return new GetYikeAgentJobEstimatedCreditRequest(this);
        } 

    } 

}
