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
 * {@link PbcInvokeReview} extends {@link TeaModel}
 *
 * <p>PbcInvokeReview</p>
 */
public class PbcInvokeReview extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("applicant")
    private String applicant;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("invokeId")
    private Long invokeId;

    @com.aliyun.core.annotation.NameInMap("invokePbcId")
    private Long invokePbcId;

    @com.aliyun.core.annotation.NameInMap("invokePbcName")
    private String invokePbcName;

    @com.aliyun.core.annotation.NameInMap("pbcId")
    private Long pbcId;

    @com.aliyun.core.annotation.NameInMap("pbcName")
    private String pbcName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("reviewer")
    private String reviewer;

    @com.aliyun.core.annotation.NameInMap("reviewerId")
    private String reviewerId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("usage")
    private String usage;

    private PbcInvokeReview(Builder builder) {
        this.applicant = builder.applicant;
        this.gmtCreate = builder.gmtCreate;
        this.id = builder.id;
        this.invokeId = builder.invokeId;
        this.invokePbcId = builder.invokePbcId;
        this.invokePbcName = builder.invokePbcName;
        this.pbcId = builder.pbcId;
        this.pbcName = builder.pbcName;
        this.requestId = builder.requestId;
        this.reviewer = builder.reviewer;
        this.reviewerId = builder.reviewerId;
        this.status = builder.status;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcInvokeReview create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicant
     */
    public String getApplicant() {
        return this.applicant;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return invokeId
     */
    public Long getInvokeId() {
        return this.invokeId;
    }

    /**
     * @return invokePbcId
     */
    public Long getInvokePbcId() {
        return this.invokePbcId;
    }

    /**
     * @return invokePbcName
     */
    public String getInvokePbcName() {
        return this.invokePbcName;
    }

    /**
     * @return pbcId
     */
    public Long getPbcId() {
        return this.pbcId;
    }

    /**
     * @return pbcName
     */
    public String getPbcName() {
        return this.pbcName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reviewer
     */
    public String getReviewer() {
        return this.reviewer;
    }

    /**
     * @return reviewerId
     */
    public String getReviewerId() {
        return this.reviewerId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private String applicant; 
        private String gmtCreate; 
        private Long id; 
        private Long invokeId; 
        private Long invokePbcId; 
        private String invokePbcName; 
        private Long pbcId; 
        private String pbcName; 
        private String requestId; 
        private String reviewer; 
        private String reviewerId; 
        private String status; 
        private String usage; 

        private Builder() {
        } 

        private Builder(PbcInvokeReview model) {
            this.applicant = model.applicant;
            this.gmtCreate = model.gmtCreate;
            this.id = model.id;
            this.invokeId = model.invokeId;
            this.invokePbcId = model.invokePbcId;
            this.invokePbcName = model.invokePbcName;
            this.pbcId = model.pbcId;
            this.pbcName = model.pbcName;
            this.requestId = model.requestId;
            this.reviewer = model.reviewer;
            this.reviewerId = model.reviewerId;
            this.status = model.status;
            this.usage = model.usage;
        } 

        /**
         * applicant.
         */
        public Builder applicant(String applicant) {
            this.applicant = applicant;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
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
         * invokeId.
         */
        public Builder invokeId(Long invokeId) {
            this.invokeId = invokeId;
            return this;
        }

        /**
         * invokePbcId.
         */
        public Builder invokePbcId(Long invokePbcId) {
            this.invokePbcId = invokePbcId;
            return this;
        }

        /**
         * invokePbcName.
         */
        public Builder invokePbcName(String invokePbcName) {
            this.invokePbcName = invokePbcName;
            return this;
        }

        /**
         * pbcId.
         */
        public Builder pbcId(Long pbcId) {
            this.pbcId = pbcId;
            return this;
        }

        /**
         * pbcName.
         */
        public Builder pbcName(String pbcName) {
            this.pbcName = pbcName;
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
         * reviewer.
         */
        public Builder reviewer(String reviewer) {
            this.reviewer = reviewer;
            return this;
        }

        /**
         * reviewerId.
         */
        public Builder reviewerId(String reviewerId) {
            this.reviewerId = reviewerId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(String usage) {
            this.usage = usage;
            return this;
        }

        public PbcInvokeReview build() {
            return new PbcInvokeReview(this);
        } 

    } 

}
