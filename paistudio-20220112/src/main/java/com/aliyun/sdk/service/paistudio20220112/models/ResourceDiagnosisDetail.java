// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResourceDiagnosisDetail} extends {@link TeaModel}
 *
 * <p>ResourceDiagnosisDetail</p>
 */
public class ResourceDiagnosisDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExceedResources")
    private java.util.List < String > exceedResources;

    @com.aliyun.core.annotation.NameInMap("Limit")
    private ResourceAmount limit;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Used")
    private ResourceAmount used;

    @com.aliyun.core.annotation.NameInMap("WorkloadIds")
    private java.util.List < String > workloadIds;

    private ResourceDiagnosisDetail(Builder builder) {
        this.exceedResources = builder.exceedResources;
        this.limit = builder.limit;
        this.status = builder.status;
        this.used = builder.used;
        this.workloadIds = builder.workloadIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceDiagnosisDetail create() {
        return builder().build();
    }

    /**
     * @return exceedResources
     */
    public java.util.List < String > getExceedResources() {
        return this.exceedResources;
    }

    /**
     * @return limit
     */
    public ResourceAmount getLimit() {
        return this.limit;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return used
     */
    public ResourceAmount getUsed() {
        return this.used;
    }

    /**
     * @return workloadIds
     */
    public java.util.List < String > getWorkloadIds() {
        return this.workloadIds;
    }

    public static final class Builder {
        private java.util.List < String > exceedResources; 
        private ResourceAmount limit; 
        private String status; 
        private ResourceAmount used; 
        private java.util.List < String > workloadIds; 

        /**
         * ExceedResources.
         */
        public Builder exceedResources(java.util.List < String > exceedResources) {
            this.exceedResources = exceedResources;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(ResourceAmount limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Used.
         */
        public Builder used(ResourceAmount used) {
            this.used = used;
            return this;
        }

        /**
         * WorkloadIds.
         */
        public Builder workloadIds(java.util.List < String > workloadIds) {
            this.workloadIds = workloadIds;
            return this;
        }

        public ResourceDiagnosisDetail build() {
            return new ResourceDiagnosisDetail(this);
        } 

    } 

}
