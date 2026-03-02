// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PbcReview} extends {@link TeaModel}
 *
 * <p>PbcReview</p>
 */
public class PbcReview extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("developerId")
    private Long developerId;

    @com.aliyun.core.annotation.NameInMap("developerName")
    private String developerName;

    @com.aliyun.core.annotation.NameInMap("feedbackPbcApi")
    private String feedbackPbcApi;

    @com.aliyun.core.annotation.NameInMap("feedbackPbcInstruction")
    private String feedbackPbcInstruction;

    @com.aliyun.core.annotation.NameInMap("feedbackPbcSchema")
    private String feedbackPbcSchema;

    @com.aliyun.core.annotation.NameInMap("feedbackSecurity")
    private String feedbackSecurity;

    @com.aliyun.core.annotation.NameInMap("feedbackServiceAvailable")
    private String feedbackServiceAvailable;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("marketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long marketId;

    @com.aliyun.core.annotation.NameInMap("marketName")
    private String marketName;

    @com.aliyun.core.annotation.NameInMap("pbcName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pbcName;

    @com.aliyun.core.annotation.NameInMap("pbcUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pbcUrl;

    @com.aliyun.core.annotation.NameInMap("pbcVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pbcVersion;

    @com.aliyun.core.annotation.NameInMap("remainTime")
    private String remainTime;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("reviewerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reviewerId;

    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private PbcReview(Builder builder) {
        this.developerId = builder.developerId;
        this.developerName = builder.developerName;
        this.feedbackPbcApi = builder.feedbackPbcApi;
        this.feedbackPbcInstruction = builder.feedbackPbcInstruction;
        this.feedbackPbcSchema = builder.feedbackPbcSchema;
        this.feedbackSecurity = builder.feedbackSecurity;
        this.feedbackServiceAvailable = builder.feedbackServiceAvailable;
        this.id = builder.id;
        this.marketId = builder.marketId;
        this.marketName = builder.marketName;
        this.pbcName = builder.pbcName;
        this.pbcUrl = builder.pbcUrl;
        this.pbcVersion = builder.pbcVersion;
        this.remainTime = builder.remainTime;
        this.requestId = builder.requestId;
        this.reviewerId = builder.reviewerId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcReview create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return developerId
     */
    public Long getDeveloperId() {
        return this.developerId;
    }

    /**
     * @return developerName
     */
    public String getDeveloperName() {
        return this.developerName;
    }

    /**
     * @return feedbackPbcApi
     */
    public String getFeedbackPbcApi() {
        return this.feedbackPbcApi;
    }

    /**
     * @return feedbackPbcInstruction
     */
    public String getFeedbackPbcInstruction() {
        return this.feedbackPbcInstruction;
    }

    /**
     * @return feedbackPbcSchema
     */
    public String getFeedbackPbcSchema() {
        return this.feedbackPbcSchema;
    }

    /**
     * @return feedbackSecurity
     */
    public String getFeedbackSecurity() {
        return this.feedbackSecurity;
    }

    /**
     * @return feedbackServiceAvailable
     */
    public String getFeedbackServiceAvailable() {
        return this.feedbackServiceAvailable;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    /**
     * @return marketName
     */
    public String getMarketName() {
        return this.marketName;
    }

    /**
     * @return pbcName
     */
    public String getPbcName() {
        return this.pbcName;
    }

    /**
     * @return pbcUrl
     */
    public String getPbcUrl() {
        return this.pbcUrl;
    }

    /**
     * @return pbcVersion
     */
    public String getPbcVersion() {
        return this.pbcVersion;
    }

    /**
     * @return remainTime
     */
    public String getRemainTime() {
        return this.remainTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reviewerId
     */
    public Long getReviewerId() {
        return this.reviewerId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Long developerId; 
        private String developerName; 
        private String feedbackPbcApi; 
        private String feedbackPbcInstruction; 
        private String feedbackPbcSchema; 
        private String feedbackSecurity; 
        private String feedbackServiceAvailable; 
        private Long id; 
        private Long marketId; 
        private String marketName; 
        private String pbcName; 
        private String pbcUrl; 
        private String pbcVersion; 
        private String remainTime; 
        private String requestId; 
        private Long reviewerId; 
        private String status; 

        private Builder() {
        } 

        private Builder(PbcReview model) {
            this.developerId = model.developerId;
            this.developerName = model.developerName;
            this.feedbackPbcApi = model.feedbackPbcApi;
            this.feedbackPbcInstruction = model.feedbackPbcInstruction;
            this.feedbackPbcSchema = model.feedbackPbcSchema;
            this.feedbackSecurity = model.feedbackSecurity;
            this.feedbackServiceAvailable = model.feedbackServiceAvailable;
            this.id = model.id;
            this.marketId = model.marketId;
            this.marketName = model.marketName;
            this.pbcName = model.pbcName;
            this.pbcUrl = model.pbcUrl;
            this.pbcVersion = model.pbcVersion;
            this.remainTime = model.remainTime;
            this.requestId = model.requestId;
            this.reviewerId = model.reviewerId;
            this.status = model.status;
        } 

        /**
         * developerId.
         */
        public Builder developerId(Long developerId) {
            this.developerId = developerId;
            return this;
        }

        /**
         * developerName.
         */
        public Builder developerName(String developerName) {
            this.developerName = developerName;
            return this;
        }

        /**
         * feedbackPbcApi.
         */
        public Builder feedbackPbcApi(String feedbackPbcApi) {
            this.feedbackPbcApi = feedbackPbcApi;
            return this;
        }

        /**
         * feedbackPbcInstruction.
         */
        public Builder feedbackPbcInstruction(String feedbackPbcInstruction) {
            this.feedbackPbcInstruction = feedbackPbcInstruction;
            return this;
        }

        /**
         * feedbackPbcSchema.
         */
        public Builder feedbackPbcSchema(String feedbackPbcSchema) {
            this.feedbackPbcSchema = feedbackPbcSchema;
            return this;
        }

        /**
         * feedbackSecurity.
         */
        public Builder feedbackSecurity(String feedbackSecurity) {
            this.feedbackSecurity = feedbackSecurity;
            return this;
        }

        /**
         * feedbackServiceAvailable.
         */
        public Builder feedbackServiceAvailable(String feedbackServiceAvailable) {
            this.feedbackServiceAvailable = feedbackServiceAvailable;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder marketId(Long marketId) {
            this.marketId = marketId;
            return this;
        }

        /**
         * marketName.
         */
        public Builder marketName(String marketName) {
            this.marketName = marketName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>基础商品</p>
         */
        public Builder pbcName(String pbcName) {
            this.pbcName = pbcName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://catalog.e2.aliyun.com/pbc/product">https://catalog.e2.aliyun.com/pbc/product</a></p>
         */
        public Builder pbcUrl(String pbcUrl) {
            this.pbcUrl = pbcUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-01T00:00:00.000Z</p>
         */
        public Builder pbcVersion(String pbcVersion) {
            this.pbcVersion = pbcVersion;
            return this;
        }

        /**
         * remainTime.
         */
        public Builder remainTime(String remainTime) {
            this.remainTime = remainTime;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reviewerId(Long reviewerId) {
            this.reviewerId = reviewerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REVIEWING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public PbcReview build() {
            return new PbcReview(this);
        } 

    } 

}
