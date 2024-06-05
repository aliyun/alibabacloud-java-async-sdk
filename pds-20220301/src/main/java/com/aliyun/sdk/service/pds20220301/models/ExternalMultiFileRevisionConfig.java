// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExternalMultiFileRevisionConfig} extends {@link TeaModel}
 *
 * <p>ExternalMultiFileRevisionConfig</p>
 */
public class ExternalMultiFileRevisionConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("revision_count")
    private Long revisionCount;

    @com.aliyun.core.annotation.NameInMap("revision_merge_enabled")
    private Boolean revisionMergeEnabled;

    @com.aliyun.core.annotation.NameInMap("revision_recycle_period")
    private Long revisionRecyclePeriod;

    private ExternalMultiFileRevisionConfig(Builder builder) {
        this.revisionCount = builder.revisionCount;
        this.revisionMergeEnabled = builder.revisionMergeEnabled;
        this.revisionRecyclePeriod = builder.revisionRecyclePeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExternalMultiFileRevisionConfig create() {
        return builder().build();
    }

    /**
     * @return revisionCount
     */
    public Long getRevisionCount() {
        return this.revisionCount;
    }

    /**
     * @return revisionMergeEnabled
     */
    public Boolean getRevisionMergeEnabled() {
        return this.revisionMergeEnabled;
    }

    /**
     * @return revisionRecyclePeriod
     */
    public Long getRevisionRecyclePeriod() {
        return this.revisionRecyclePeriod;
    }

    public static final class Builder {
        private Long revisionCount; 
        private Boolean revisionMergeEnabled; 
        private Long revisionRecyclePeriod; 

        /**
         * revision_count.
         */
        public Builder revisionCount(Long revisionCount) {
            this.revisionCount = revisionCount;
            return this;
        }

        /**
         * revision_merge_enabled.
         */
        public Builder revisionMergeEnabled(Boolean revisionMergeEnabled) {
            this.revisionMergeEnabled = revisionMergeEnabled;
            return this;
        }

        /**
         * revision_recycle_period.
         */
        public Builder revisionRecyclePeriod(Long revisionRecyclePeriod) {
            this.revisionRecyclePeriod = revisionRecyclePeriod;
            return this;
        }

        public ExternalMultiFileRevisionConfig build() {
            return new ExternalMultiFileRevisionConfig(this);
        } 

    } 

}
