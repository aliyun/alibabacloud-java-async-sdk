// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link QuotaTopo} extends {@link TeaModel}
 *
 * <p>QuotaTopo</p>
 */
public class QuotaTopo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Depth")
    private String depth;

    @com.aliyun.core.annotation.NameInMap("ParentQuotaId")
    private String parentQuotaId;

    @com.aliyun.core.annotation.NameInMap("QuotaDetails")
    private QuotaDetails quotaDetails;

    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.NameInMap("QuotaName")
    private String quotaName;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("WorkloadDetails")
    private WorkloadDetails workloadDetails;

    private QuotaTopo(Builder builder) {
        this.depth = builder.depth;
        this.parentQuotaId = builder.parentQuotaId;
        this.quotaDetails = builder.quotaDetails;
        this.quotaId = builder.quotaId;
        this.quotaName = builder.quotaName;
        this.resourceType = builder.resourceType;
        this.workloadDetails = builder.workloadDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaTopo create() {
        return builder().build();
    }

    /**
     * @return depth
     */
    public String getDepth() {
        return this.depth;
    }

    /**
     * @return parentQuotaId
     */
    public String getParentQuotaId() {
        return this.parentQuotaId;
    }

    /**
     * @return quotaDetails
     */
    public QuotaDetails getQuotaDetails() {
        return this.quotaDetails;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return workloadDetails
     */
    public WorkloadDetails getWorkloadDetails() {
        return this.workloadDetails;
    }

    public static final class Builder {
        private String depth; 
        private String parentQuotaId; 
        private QuotaDetails quotaDetails; 
        private String quotaId; 
        private String quotaName; 
        private String resourceType; 
        private WorkloadDetails workloadDetails; 

        /**
         * Depth.
         */
        public Builder depth(String depth) {
            this.depth = depth;
            return this;
        }

        /**
         * ParentQuotaId.
         */
        public Builder parentQuotaId(String parentQuotaId) {
            this.parentQuotaId = parentQuotaId;
            return this;
        }

        /**
         * QuotaDetails.
         */
        public Builder quotaDetails(QuotaDetails quotaDetails) {
            this.quotaDetails = quotaDetails;
            return this;
        }

        /**
         * QuotaId.
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * QuotaName.
         */
        public Builder quotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * WorkloadDetails.
         */
        public Builder workloadDetails(WorkloadDetails workloadDetails) {
            this.workloadDetails = workloadDetails;
            return this;
        }

        public QuotaTopo build() {
            return new QuotaTopo(this);
        } 

    } 

}
