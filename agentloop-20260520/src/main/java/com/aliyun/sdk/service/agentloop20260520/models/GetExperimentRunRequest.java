// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link GetExperimentRunRequest} extends {@link RequestModel}
 *
 * <p>GetExperimentRunRequest</p>
 */
public class GetExperimentRunRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("recordId")
    private String recordId;

    private GetExperimentRunRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.recordId = builder.recordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentRunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    public static final class Builder extends Request.Builder<GetExperimentRunRequest, Builder> {
        private String agentSpace; 
        private String recordId; 

        private Builder() {
            super();
        } 

        private Builder(GetExperimentRunRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.recordId = request.recordId;
        } 

        /**
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * recordId.
         */
        public Builder recordId(String recordId) {
            this.putPathParameter("recordId", recordId);
            this.recordId = recordId;
            return this;
        }

        @Override
        public GetExperimentRunRequest build() {
            return new GetExperimentRunRequest(this);
        } 

    } 

}
