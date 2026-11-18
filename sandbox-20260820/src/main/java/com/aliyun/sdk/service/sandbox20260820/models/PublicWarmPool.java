// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link PublicWarmPool} extends {@link TeaModel}
 *
 * <p>PublicWarmPool</p>
 */
public class PublicWarmPool extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("capacityObservedTime")
    private String capacityObservedTime;

    @com.aliyun.core.annotation.NameInMap("capacityPolicy")
    private WarmPoolCapacityPolicy capacityPolicy;

    @com.aliyun.core.annotation.NameInMap("currentError")
    private String currentError;

    @com.aliyun.core.annotation.NameInMap("deleting")
    private Boolean deleting;

    @com.aliyun.core.annotation.NameInMap("preparing")
    private Long preparing;

    @com.aliyun.core.annotation.NameInMap("ready")
    private Long ready;

    @com.aliyun.core.annotation.NameInMap("releasing")
    private Long releasing;

    @com.aliyun.core.annotation.NameInMap("sourceUnavailable")
    private Boolean sourceUnavailable;

    @com.aliyun.core.annotation.NameInMap("targetCapacity")
    private Long targetCapacity;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    private PublicWarmPool(Builder builder) {
        this.capacityObservedTime = builder.capacityObservedTime;
        this.capacityPolicy = builder.capacityPolicy;
        this.currentError = builder.currentError;
        this.deleting = builder.deleting;
        this.preparing = builder.preparing;
        this.ready = builder.ready;
        this.releasing = builder.releasing;
        this.sourceUnavailable = builder.sourceUnavailable;
        this.targetCapacity = builder.targetCapacity;
        this.teamID = builder.teamID;
        this.templateID = builder.templateID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicWarmPool create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capacityObservedTime
     */
    public String getCapacityObservedTime() {
        return this.capacityObservedTime;
    }

    /**
     * @return capacityPolicy
     */
    public WarmPoolCapacityPolicy getCapacityPolicy() {
        return this.capacityPolicy;
    }

    /**
     * @return currentError
     */
    public String getCurrentError() {
        return this.currentError;
    }

    /**
     * @return deleting
     */
    public Boolean getDeleting() {
        return this.deleting;
    }

    /**
     * @return preparing
     */
    public Long getPreparing() {
        return this.preparing;
    }

    /**
     * @return ready
     */
    public Long getReady() {
        return this.ready;
    }

    /**
     * @return releasing
     */
    public Long getReleasing() {
        return this.releasing;
    }

    /**
     * @return sourceUnavailable
     */
    public Boolean getSourceUnavailable() {
        return this.sourceUnavailable;
    }

    /**
     * @return targetCapacity
     */
    public Long getTargetCapacity() {
        return this.targetCapacity;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    public static final class Builder {
        private String capacityObservedTime; 
        private WarmPoolCapacityPolicy capacityPolicy; 
        private String currentError; 
        private Boolean deleting; 
        private Long preparing; 
        private Long ready; 
        private Long releasing; 
        private Boolean sourceUnavailable; 
        private Long targetCapacity; 
        private String teamID; 
        private String templateID; 

        private Builder() {
        } 

        private Builder(PublicWarmPool model) {
            this.capacityObservedTime = model.capacityObservedTime;
            this.capacityPolicy = model.capacityPolicy;
            this.currentError = model.currentError;
            this.deleting = model.deleting;
            this.preparing = model.preparing;
            this.ready = model.ready;
            this.releasing = model.releasing;
            this.sourceUnavailable = model.sourceUnavailable;
            this.targetCapacity = model.targetCapacity;
            this.teamID = model.teamID;
            this.templateID = model.templateID;
        } 

        /**
         * <p>The most recent observation time of the capacity status.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-01T00:00:00Z</p>
         */
        public Builder capacityObservedTime(String capacityObservedTime) {
            this.capacityObservedTime = capacityObservedTime;
            return this;
        }

        /**
         * <p>The capacity policy of the warm pool, which includes the base target capacity and optional scheduled rules.</p>
         */
        public Builder capacityPolicy(WarmPoolCapacityPolicy capacityPolicy) {
            this.capacityPolicy = capacityPolicy;
            return this;
        }

        /**
         * <p>The masked text of the current background error. This value is null if no error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>SourceNotFound: source template does not exist</p>
         */
        public Builder currentError(String currentError) {
            this.currentError = currentError;
            return this;
        }

        /**
         * <p>Indicates whether the warm pool is being deleted.</p>
         */
        public Builder deleting(Boolean deleting) {
            this.deleting = deleting;
            return this;
        }

        /**
         * <p>The number of sandboxes that are currently being prepared.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder preparing(Long preparing) {
            this.preparing = preparing;
            return this;
        }

        /**
         * <p>The number of sandboxes that are currently ready.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ready(Long ready) {
            this.ready = ready;
            return this;
        }

        /**
         * <p>The number of sandboxes that are currently being released.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder releasing(Long releasing) {
            this.releasing = releasing;
            return this;
        }

        /**
         * <p>Indicates whether the source of the associated template is unavailable.</p>
         */
        public Builder sourceUnavailable(Boolean sourceUnavailable) {
            this.sourceUnavailable = sourceUnavailable;
            return this;
        }

        /**
         * <p>The current target capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder targetCapacity(Long targetCapacity) {
            this.targetCapacity = targetCapacity;
            return this;
        }

        /**
         * <p>The team ID.</p>
         * 
         * <strong>example:</strong>
         * <p>team-example1234567890</p>
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The template ID, which specifies the template associated with the warm pool.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl-example1234567890</p>
         */
        public Builder templateID(String templateID) {
            this.templateID = templateID;
            return this;
        }

        public PublicWarmPool build() {
            return new PublicWarmPool(this);
        } 

    } 

}
