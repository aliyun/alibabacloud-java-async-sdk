// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProblemPreviewRequest} extends {@link RequestModel}
 *
 * <p>GetProblemPreviewRequest</p>
 */
public class GetProblemPreviewRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("effectServiceIds")
    private java.util.List < Long > effectServiceIds;

    @Body
    @NameInMap("incidentId")
    private Long incidentId;

    @Body
    @NameInMap("problemId")
    private Long problemId;

    @Body
    @NameInMap("problemLevel")
    private String problemLevel;

    @Body
    @NameInMap("problemNotifyType")
    private String problemNotifyType;

    @Body
    @NameInMap("relatedServiceId")
    private Long relatedServiceId;

    @Body
    @NameInMap("serviceGroupIds")
    private java.util.List < Long > serviceGroupIds;

    private GetProblemPreviewRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.effectServiceIds = builder.effectServiceIds;
        this.incidentId = builder.incidentId;
        this.problemId = builder.problemId;
        this.problemLevel = builder.problemLevel;
        this.problemNotifyType = builder.problemNotifyType;
        this.relatedServiceId = builder.relatedServiceId;
        this.serviceGroupIds = builder.serviceGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProblemPreviewRequest create() {
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
     * @return effectServiceIds
     */
    public java.util.List < Long > getEffectServiceIds() {
        return this.effectServiceIds;
    }

    /**
     * @return incidentId
     */
    public Long getIncidentId() {
        return this.incidentId;
    }

    /**
     * @return problemId
     */
    public Long getProblemId() {
        return this.problemId;
    }

    /**
     * @return problemLevel
     */
    public String getProblemLevel() {
        return this.problemLevel;
    }

    /**
     * @return problemNotifyType
     */
    public String getProblemNotifyType() {
        return this.problemNotifyType;
    }

    /**
     * @return relatedServiceId
     */
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    /**
     * @return serviceGroupIds
     */
    public java.util.List < Long > getServiceGroupIds() {
        return this.serviceGroupIds;
    }

    public static final class Builder extends Request.Builder<GetProblemPreviewRequest, Builder> {
        private String clientToken; 
        private java.util.List < Long > effectServiceIds; 
        private Long incidentId; 
        private Long problemId; 
        private String problemLevel; 
        private String problemNotifyType; 
        private Long relatedServiceId; 
        private java.util.List < Long > serviceGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(GetProblemPreviewRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.effectServiceIds = request.effectServiceIds;
            this.incidentId = request.incidentId;
            this.problemId = request.problemId;
            this.problemLevel = request.problemLevel;
            this.problemNotifyType = request.problemNotifyType;
            this.relatedServiceId = request.relatedServiceId;
            this.serviceGroupIds = request.serviceGroupIds;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * effectServiceIds.
         */
        public Builder effectServiceIds(java.util.List < Long > effectServiceIds) {
            this.putBodyParameter("effectServiceIds", effectServiceIds);
            this.effectServiceIds = effectServiceIds;
            return this;
        }

        /**
         * incidentId.
         */
        public Builder incidentId(Long incidentId) {
            this.putBodyParameter("incidentId", incidentId);
            this.incidentId = incidentId;
            return this;
        }

        /**
         * problemId.
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        /**
         * problemLevel.
         */
        public Builder problemLevel(String problemLevel) {
            this.putBodyParameter("problemLevel", problemLevel);
            this.problemLevel = problemLevel;
            return this;
        }

        /**
         * problemNotifyType.
         */
        public Builder problemNotifyType(String problemNotifyType) {
            this.putBodyParameter("problemNotifyType", problemNotifyType);
            this.problemNotifyType = problemNotifyType;
            return this;
        }

        /**
         * relatedServiceId.
         */
        public Builder relatedServiceId(Long relatedServiceId) {
            this.putBodyParameter("relatedServiceId", relatedServiceId);
            this.relatedServiceId = relatedServiceId;
            return this;
        }

        /**
         * serviceGroupIds.
         */
        public Builder serviceGroupIds(java.util.List < Long > serviceGroupIds) {
            this.putBodyParameter("serviceGroupIds", serviceGroupIds);
            this.serviceGroupIds = serviceGroupIds;
            return this;
        }

        @Override
        public GetProblemPreviewRequest build() {
            return new GetProblemPreviewRequest(this);
        } 

    } 

}
