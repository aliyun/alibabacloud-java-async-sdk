// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FinishIncidentRequest} extends {@link RequestModel}
 *
 * <p>FinishIncidentRequest</p>
 */
public class FinishIncidentRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("incidentFinishReason")
    private Integer incidentFinishReason;

    @Body
    @NameInMap("incidentFinishReasonDescription")
    private String incidentFinishReasonDescription;

    @Body
    @NameInMap("incidentFinishSolution")
    private Integer incidentFinishSolution;

    @Body
    @NameInMap("incidentFinishSolutionDescription")
    private String incidentFinishSolutionDescription;

    @Body
    @NameInMap("incidentIds")
    @Validation(required = true)
    private java.util.List < Long > incidentIds;

    private FinishIncidentRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.incidentFinishReason = builder.incidentFinishReason;
        this.incidentFinishReasonDescription = builder.incidentFinishReasonDescription;
        this.incidentFinishSolution = builder.incidentFinishSolution;
        this.incidentFinishSolutionDescription = builder.incidentFinishSolutionDescription;
        this.incidentIds = builder.incidentIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FinishIncidentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return incidentFinishReason
     */
    public Integer getIncidentFinishReason() {
        return this.incidentFinishReason;
    }

    /**
     * @return incidentFinishReasonDescription
     */
    public String getIncidentFinishReasonDescription() {
        return this.incidentFinishReasonDescription;
    }

    /**
     * @return incidentFinishSolution
     */
    public Integer getIncidentFinishSolution() {
        return this.incidentFinishSolution;
    }

    /**
     * @return incidentFinishSolutionDescription
     */
    public String getIncidentFinishSolutionDescription() {
        return this.incidentFinishSolutionDescription;
    }

    /**
     * @return incidentIds
     */
    public java.util.List < Long > getIncidentIds() {
        return this.incidentIds;
    }

    public static final class Builder extends Request.Builder<FinishIncidentRequest, Builder> {
        private String clientToken; 
        private Integer incidentFinishReason; 
        private String incidentFinishReasonDescription; 
        private Integer incidentFinishSolution; 
        private String incidentFinishSolutionDescription; 
        private java.util.List < Long > incidentIds; 

        private Builder() {
            super();
        } 

        private Builder(FinishIncidentRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.incidentFinishReason = response.incidentFinishReason;
            this.incidentFinishReasonDescription = response.incidentFinishReasonDescription;
            this.incidentFinishSolution = response.incidentFinishSolution;
            this.incidentFinishSolutionDescription = response.incidentFinishSolutionDescription;
            this.incidentIds = response.incidentIds;
        } 

        /**
         * 幂等校验Id
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 完结原因
         */
        public Builder incidentFinishReason(Integer incidentFinishReason) {
            this.putBodyParameter("incidentFinishReason", incidentFinishReason);
            this.incidentFinishReason = incidentFinishReason;
            return this;
        }

        /**
         * 原因描述
         */
        public Builder incidentFinishReasonDescription(String incidentFinishReasonDescription) {
            this.putBodyParameter("incidentFinishReasonDescription", incidentFinishReasonDescription);
            this.incidentFinishReasonDescription = incidentFinishReasonDescription;
            return this;
        }

        /**
         * 解决方案
         */
        public Builder incidentFinishSolution(Integer incidentFinishSolution) {
            this.putBodyParameter("incidentFinishSolution", incidentFinishSolution);
            this.incidentFinishSolution = incidentFinishSolution;
            return this;
        }

        /**
         * 解决方案描述
         */
        public Builder incidentFinishSolutionDescription(String incidentFinishSolutionDescription) {
            this.putBodyParameter("incidentFinishSolutionDescription", incidentFinishSolutionDescription);
            this.incidentFinishSolutionDescription = incidentFinishSolutionDescription;
            return this;
        }

        /**
         * 事件ID数组
         */
        public Builder incidentIds(java.util.List < Long > incidentIds) {
            this.putBodyParameter("incidentIds", incidentIds);
            this.incidentIds = incidentIds;
            return this;
        }

        @Override
        public FinishIncidentRequest build() {
            return new FinishIncidentRequest(this);
        } 

    } 

}
