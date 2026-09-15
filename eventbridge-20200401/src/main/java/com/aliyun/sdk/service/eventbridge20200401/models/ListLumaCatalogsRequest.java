// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link ListLumaCatalogsRequest} extends {@link RequestModel}
 *
 * <p>ListLumaCatalogsRequest</p>
 */
public class ListLumaCatalogsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 2)
    private String agentName;

    private ListLumaCatalogsRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLumaCatalogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    public static final class Builder extends Request.Builder<ListLumaCatalogsRequest, Builder> {
        private String agentName; 

        private Builder() {
            super();
        } 

        private Builder(ListLumaCatalogsRequest request) {
            super(request);
            this.agentName = request.agentName;
        } 

        /**
         * <p>The name of the Agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_agent</p>
         */
        public Builder agentName(String agentName) {
            this.putBodyParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        @Override
        public ListLumaCatalogsRequest build() {
            return new ListLumaCatalogsRequest(this);
        } 

    } 

}
