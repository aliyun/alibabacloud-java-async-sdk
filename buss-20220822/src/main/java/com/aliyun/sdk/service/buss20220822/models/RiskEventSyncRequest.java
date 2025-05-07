// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822.models;

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
 * {@link RiskEventSyncRequest} extends {@link RequestModel}
 *
 * <p>RiskEventSyncRequest</p>
 */
public class RiskEventSyncRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Deleted")
    private Boolean deleted;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiscoveryTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long discoveryTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventNumber")
    private String eventNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RelevanceBu")
    private String relevanceBu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskDetail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String riskDetail;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskEffectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String riskEffectType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String riskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Source")
    @com.aliyun.core.annotation.Validation(required = true)
    private String source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Submitter")
    @com.aliyun.core.annotation.Validation(required = true)
    private String submitter;

    private RiskEventSyncRequest(Builder builder) {
        super(builder);
        this.deleted = builder.deleted;
        this.discoveryTime = builder.discoveryTime;
        this.eventName = builder.eventName;
        this.eventNumber = builder.eventNumber;
        this.relevanceBu = builder.relevanceBu;
        this.riskDetail = builder.riskDetail;
        this.riskEffectType = builder.riskEffectType;
        this.riskLevel = builder.riskLevel;
        this.riskType = builder.riskType;
        this.source = builder.source;
        this.submitter = builder.submitter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RiskEventSyncRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleted
     */
    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * @return discoveryTime
     */
    public Long getDiscoveryTime() {
        return this.discoveryTime;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventNumber
     */
    public String getEventNumber() {
        return this.eventNumber;
    }

    /**
     * @return relevanceBu
     */
    public String getRelevanceBu() {
        return this.relevanceBu;
    }

    /**
     * @return riskDetail
     */
    public String getRiskDetail() {
        return this.riskDetail;
    }

    /**
     * @return riskEffectType
     */
    public String getRiskEffectType() {
        return this.riskEffectType;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return riskType
     */
    public String getRiskType() {
        return this.riskType;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return submitter
     */
    public String getSubmitter() {
        return this.submitter;
    }

    public static final class Builder extends Request.Builder<RiskEventSyncRequest, Builder> {
        private Boolean deleted; 
        private Long discoveryTime; 
        private String eventName; 
        private String eventNumber; 
        private String relevanceBu; 
        private String riskDetail; 
        private String riskEffectType; 
        private String riskLevel; 
        private String riskType; 
        private String source; 
        private String submitter; 

        private Builder() {
            super();
        } 

        private Builder(RiskEventSyncRequest request) {
            super(request);
            this.deleted = request.deleted;
            this.discoveryTime = request.discoveryTime;
            this.eventName = request.eventName;
            this.eventNumber = request.eventNumber;
            this.relevanceBu = request.relevanceBu;
            this.riskDetail = request.riskDetail;
            this.riskEffectType = request.riskEffectType;
            this.riskLevel = request.riskLevel;
            this.riskType = request.riskType;
            this.source = request.source;
            this.submitter = request.submitter;
        } 

        /**
         * Deleted.
         */
        public Builder deleted(Boolean deleted) {
            this.putBodyParameter("Deleted", deleted);
            this.deleted = deleted;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder discoveryTime(Long discoveryTime) {
            this.putBodyParameter("DiscoveryTime", discoveryTime);
            this.discoveryTime = discoveryTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder eventName(String eventName) {
            this.putBodyParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * EventNumber.
         */
        public Builder eventNumber(String eventNumber) {
            this.putBodyParameter("EventNumber", eventNumber);
            this.eventNumber = eventNumber;
            return this;
        }

        /**
         * RelevanceBu.
         */
        public Builder relevanceBu(String relevanceBu) {
            this.putBodyParameter("RelevanceBu", relevanceBu);
            this.relevanceBu = relevanceBu;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder riskDetail(String riskDetail) {
            this.putBodyParameter("RiskDetail", riskDetail);
            this.riskDetail = riskDetail;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder riskEffectType(String riskEffectType) {
            this.putBodyParameter("RiskEffectType", riskEffectType);
            this.riskEffectType = riskEffectType;
            return this;
        }

        /**
         * RiskLevel.
         */
        public Builder riskLevel(String riskLevel) {
            this.putBodyParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder riskType(String riskType) {
            this.putBodyParameter("RiskType", riskType);
            this.riskType = riskType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder source(String source) {
            this.putBodyParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder submitter(String submitter) {
            this.putBodyParameter("Submitter", submitter);
            this.submitter = submitter;
            return this;
        }

        @Override
        public RiskEventSyncRequest build() {
            return new RiskEventSyncRequest(this);
        } 

    } 

}
