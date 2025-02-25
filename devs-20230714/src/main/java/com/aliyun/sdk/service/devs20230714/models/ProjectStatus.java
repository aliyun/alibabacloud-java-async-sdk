// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProjectStatus} extends {@link TeaModel}
 *
 * <p>ProjectStatus</p>
 */
public class ProjectStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latestReleaseDetail")
    private ReleaseDetail latestReleaseDetail;

    @com.aliyun.core.annotation.NameInMap("observedGeneration")
    private Long observedGeneration;

    @com.aliyun.core.annotation.NameInMap("observedTime")
    private String observedTime;

    private ProjectStatus(Builder builder) {
        this.latestReleaseDetail = builder.latestReleaseDetail;
        this.observedGeneration = builder.observedGeneration;
        this.observedTime = builder.observedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProjectStatus create() {
        return builder().build();
    }

    /**
     * @return latestReleaseDetail
     */
    public ReleaseDetail getLatestReleaseDetail() {
        return this.latestReleaseDetail;
    }

    /**
     * @return observedGeneration
     */
    public Long getObservedGeneration() {
        return this.observedGeneration;
    }

    /**
     * @return observedTime
     */
    public String getObservedTime() {
        return this.observedTime;
    }

    public static final class Builder {
        private ReleaseDetail latestReleaseDetail; 
        private Long observedGeneration; 
        private String observedTime; 

        /**
         * latestReleaseDetail.
         */
        public Builder latestReleaseDetail(ReleaseDetail latestReleaseDetail) {
            this.latestReleaseDetail = latestReleaseDetail;
            return this;
        }

        /**
         * observedGeneration.
         */
        public Builder observedGeneration(Long observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        /**
         * observedTime.
         */
        public Builder observedTime(String observedTime) {
            this.observedTime = observedTime;
            return this;
        }

        public ProjectStatus build() {
            return new ProjectStatus(this);
        } 

    } 

}
