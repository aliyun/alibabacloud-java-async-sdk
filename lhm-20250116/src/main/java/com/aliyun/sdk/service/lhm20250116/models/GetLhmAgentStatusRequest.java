// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetLhmAgentStatusRequest} extends {@link RequestModel}
 *
 * <p>GetLhmAgentStatusRequest</p>
 */
public class GetLhmAgentStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer agentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("skillName")
    private String skillName;

    private GetLhmAgentStatusRequest(Builder builder) {
        super(builder);
        this.agentType = builder.agentType;
        this.skillName = builder.skillName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLhmAgentStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentType
     */
    public Integer getAgentType() {
        return this.agentType;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    public static final class Builder extends Request.Builder<GetLhmAgentStatusRequest, Builder> {
        private Integer agentType; 
        private String skillName; 

        private Builder() {
            super();
        } 

        private Builder(GetLhmAgentStatusRequest request) {
            super(request);
            this.agentType = request.agentType;
            this.skillName = request.skillName;
        } 

        /**
         * <p>The Agent type. Valid values:</p>
         * <ul>
         * <li>0: data validation (the only type currently supported).</li>
         * <li>1: metadata.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder agentType(Integer agentType) {
            this.putQueryParameter("agentType", agentType);
            this.agentType = agentType;
            return this;
        }

        /**
         * <p>The skill name. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>lhm-data-validation-skill</p>
         */
        public Builder skillName(String skillName) {
            this.putQueryParameter("skillName", skillName);
            this.skillName = skillName;
            return this;
        }

        @Override
        public GetLhmAgentStatusRequest build() {
            return new GetLhmAgentStatusRequest(this);
        } 

    } 

}
