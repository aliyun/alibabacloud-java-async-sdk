// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetAgentRequest} extends {@link RequestModel}
 *
 * <p>GetAgentRequest</p>
 */
public class GetAgentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentVersion")
    private Integer agentVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private GetAgentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentVersion = builder.agentVersion;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentRequest create() {
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
     * @return agentVersion
     */
    public Integer getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<GetAgentRequest, Builder> {
        private String regionId; 
        private Integer agentVersion; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentVersion = request.agentVersion;
            this.name = request.name;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>If omitted, the current definition is retrieved. If a published version is specified, the corresponding snapshot and the fixed versions of official skills and suite artifacts are retrieved. If the current unpublished version is specified, the draft is returned without fixed artifact versions. This is not the POP system parameter Version.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder agentVersion(Integer agentVersion) {
            this.putBodyParameter("AgentVersion", agentVersion);
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * <p>The name of the skill to retrieve.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-skill</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public GetAgentRequest build() {
            return new GetAgentRequest(this);
        } 

    } 

}
