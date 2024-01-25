// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FeedbackAlertAlgorithmRequest} extends {@link RequestModel}
 *
 * <p>FeedbackAlertAlgorithmRequest</p>
 */
public class FeedbackAlertAlgorithmRequest extends Request {
    @Query
    @NameInMap("AlertId")
    private Long alertId;

    @Query
    @NameInMap("AlgorithmAccurateDescribe")
    private String algorithmAccurateDescribe;

    @Query
    @NameInMap("AlgorithmAccurateState")
    private Integer algorithmAccurateState;

    @Query
    @NameInMap("FeedbackType")
    private Integer feedbackType;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private FeedbackAlertAlgorithmRequest(Builder builder) {
        super(builder);
        this.alertId = builder.alertId;
        this.algorithmAccurateDescribe = builder.algorithmAccurateDescribe;
        this.algorithmAccurateState = builder.algorithmAccurateState;
        this.feedbackType = builder.feedbackType;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FeedbackAlertAlgorithmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertId
     */
    public Long getAlertId() {
        return this.alertId;
    }

    /**
     * @return algorithmAccurateDescribe
     */
    public String getAlgorithmAccurateDescribe() {
        return this.algorithmAccurateDescribe;
    }

    /**
     * @return algorithmAccurateState
     */
    public Integer getAlgorithmAccurateState() {
        return this.algorithmAccurateState;
    }

    /**
     * @return feedbackType
     */
    public Integer getFeedbackType() {
        return this.feedbackType;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<FeedbackAlertAlgorithmRequest, Builder> {
        private Long alertId; 
        private String algorithmAccurateDescribe; 
        private Integer algorithmAccurateState; 
        private Integer feedbackType; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(FeedbackAlertAlgorithmRequest request) {
            super(request);
            this.alertId = request.alertId;
            this.algorithmAccurateDescribe = request.algorithmAccurateDescribe;
            this.algorithmAccurateState = request.algorithmAccurateState;
            this.feedbackType = request.feedbackType;
            this.operaUid = request.operaUid;
        } 

        /**
         * AlertId.
         */
        public Builder alertId(Long alertId) {
            this.putQueryParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
        }

        /**
         * AlgorithmAccurateDescribe.
         */
        public Builder algorithmAccurateDescribe(String algorithmAccurateDescribe) {
            this.putQueryParameter("AlgorithmAccurateDescribe", algorithmAccurateDescribe);
            this.algorithmAccurateDescribe = algorithmAccurateDescribe;
            return this;
        }

        /**
         * AlgorithmAccurateState.
         */
        public Builder algorithmAccurateState(Integer algorithmAccurateState) {
            this.putQueryParameter("AlgorithmAccurateState", algorithmAccurateState);
            this.algorithmAccurateState = algorithmAccurateState;
            return this;
        }

        /**
         * FeedbackType.
         */
        public Builder feedbackType(Integer feedbackType) {
            this.putQueryParameter("FeedbackType", feedbackType);
            this.feedbackType = feedbackType;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public FeedbackAlertAlgorithmRequest build() {
            return new FeedbackAlertAlgorithmRequest(this);
        } 

    } 

}
