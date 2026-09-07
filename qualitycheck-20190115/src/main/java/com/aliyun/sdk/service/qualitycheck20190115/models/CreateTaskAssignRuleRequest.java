// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link CreateTaskAssignRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskAssignRuleRequest</p>
 */
public class CreateTaskAssignRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseMeAgentId")
    private Long baseMeAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JsonStr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jsonStr;

    private CreateTaskAssignRuleRequest(Builder builder) {
        super(builder);
        this.baseMeAgentId = builder.baseMeAgentId;
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskAssignRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseMeAgentId
     */
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    /**
     * @return jsonStr
     */
    public String getJsonStr() {
        return this.jsonStr;
    }

    public static final class Builder extends Request.Builder<CreateTaskAssignRuleRequest, Builder> {
        private Long baseMeAgentId; 
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(CreateTaskAssignRuleRequest request) {
            super(request);
            this.baseMeAgentId = request.baseMeAgentId;
            this.jsonStr = request.jsonStr;
        } 

        /**
         * <p>Workspace ID.</p>
         */
        public Builder baseMeAgentId(Long baseMeAgentId) {
            this.putQueryParameter("BaseMeAgentId", baseMeAgentId);
            this.baseMeAgentId = baseMeAgentId;
            return this;
        }

        /**
         * <p>A complete JSON string. For details, see the parameter descriptions below.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;callType&quot;:&quot;0&quot;,&quot;durationMin&quot;:1,&quot;durationMax&quot;:300,&quot;agents&quot;:[{&quot;agentId&quot;:&quot;202526561358712105&quot;,&quot;agentName&quot;:&quot;agent&quot;}],&quot;rules&quot;:[{&quot;rid&quot;:15659}],&quot;reviewers&quot;:[{&quot;reviewerId&quot;:&quot;255746168704895558&quot;,&quot;reviewerName&quot;:&quot;0917质检员&quot;},{&quot;reviewerId&quot;:&quot;268370362815185444&quot;,&quot;reviewerName&quot;:&quot;0710质检员&quot;}],&quot;skillGroups&quot;:[{&quot;skillName&quot;:&quot;客服组&quot;}],&quot;priority&quot;:5}</p>
         */
        public Builder jsonStr(String jsonStr) {
            this.putQueryParameter("JsonStr", jsonStr);
            this.jsonStr = jsonStr;
            return this;
        }

        @Override
        public CreateTaskAssignRuleRequest build() {
            return new CreateTaskAssignRuleRequest(this);
        } 

    } 

}
