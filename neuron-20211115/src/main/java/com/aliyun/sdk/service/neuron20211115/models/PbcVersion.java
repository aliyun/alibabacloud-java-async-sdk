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
 * {@link PbcVersion} extends {@link TeaModel}
 *
 * <p>PbcVersion</p>
 */
public class PbcVersion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("companyName")
    private String companyName;

    @com.aliyun.core.annotation.NameInMap("developerId")
    private Long developerId;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("isWatched")
    private Boolean isWatched;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("pbcId")
    private Long pbcId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("reviewId")
    private Long reviewId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("stepStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stepStatus;

    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    @com.aliyun.core.annotation.NameInMap("visibilityLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String visibilityLevel;

    private PbcVersion(Builder builder) {
        this.companyId = builder.companyId;
        this.companyName = builder.companyName;
        this.developerId = builder.developerId;
        this.id = builder.id;
        this.isWatched = builder.isWatched;
        this.name = builder.name;
        this.pbcId = builder.pbcId;
        this.requestId = builder.requestId;
        this.reviewId = builder.reviewId;
        this.status = builder.status;
        this.stepStatus = builder.stepStatus;
        this.version = builder.version;
        this.visibilityLevel = builder.visibilityLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcVersion create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return companyName
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * @return developerId
     */
    public Long getDeveloperId() {
        return this.developerId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return isWatched
     */
    public Boolean getIsWatched() {
        return this.isWatched;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pbcId
     */
    public Long getPbcId() {
        return this.pbcId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reviewId
     */
    public Long getReviewId() {
        return this.reviewId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return stepStatus
     */
    public String getStepStatus() {
        return this.stepStatus;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return visibilityLevel
     */
    public String getVisibilityLevel() {
        return this.visibilityLevel;
    }

    public static final class Builder {
        private Long companyId; 
        private String companyName; 
        private Long developerId; 
        private Long id; 
        private Boolean isWatched; 
        private String name; 
        private Long pbcId; 
        private String requestId; 
        private Long reviewId; 
        private String status; 
        private String stepStatus; 
        private String version; 
        private String visibilityLevel; 

        private Builder() {
        } 

        private Builder(PbcVersion model) {
            this.companyId = model.companyId;
            this.companyName = model.companyName;
            this.developerId = model.developerId;
            this.id = model.id;
            this.isWatched = model.isWatched;
            this.name = model.name;
            this.pbcId = model.pbcId;
            this.requestId = model.requestId;
            this.reviewId = model.reviewId;
            this.status = model.status;
            this.stepStatus = model.stepStatus;
            this.version = model.version;
            this.visibilityLevel = model.visibilityLevel;
        } 

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * companyName.
         */
        public Builder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        /**
         * developerId.
         */
        public Builder developerId(Long developerId) {
            this.developerId = developerId;
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
         * isWatched.
         */
        public Builder isWatched(Boolean isWatched) {
            this.isWatched = isWatched;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        public Builder name(String name) {
            this.name = name;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * reviewId.
         */
        public Builder reviewId(Long reviewId) {
            this.reviewId = reviewId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SPEC</p>
         */
        public Builder stepStatus(String stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;2022-04-01&quot;</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder visibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }

        public PbcVersion build() {
            return new PbcVersion(this);
        } 

    } 

}
