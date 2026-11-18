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
 * {@link PublicWarmPoolConfig} extends {@link TeaModel}
 *
 * <p>PublicWarmPoolConfig</p>
 */
public class PublicWarmPoolConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("capacityPolicy")
    private WarmPoolCapacityPolicy capacityPolicy;

    @com.aliyun.core.annotation.NameInMap("deleting")
    private Boolean deleting;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    private PublicWarmPoolConfig(Builder builder) {
        this.capacityPolicy = builder.capacityPolicy;
        this.deleting = builder.deleting;
        this.teamID = builder.teamID;
        this.templateID = builder.templateID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicWarmPoolConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capacityPolicy
     */
    public WarmPoolCapacityPolicy getCapacityPolicy() {
        return this.capacityPolicy;
    }

    /**
     * @return deleting
     */
    public Boolean getDeleting() {
        return this.deleting;
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
        private WarmPoolCapacityPolicy capacityPolicy; 
        private Boolean deleting; 
        private String teamID; 
        private String templateID; 

        private Builder() {
        } 

        private Builder(PublicWarmPoolConfig model) {
            this.capacityPolicy = model.capacityPolicy;
            this.deleting = model.deleting;
            this.teamID = model.teamID;
            this.templateID = model.templateID;
        } 

        /**
         * <p>The warm pool capacity policy, which includes the base target capacity and optional scheduling rules.</p>
         */
        public Builder capacityPolicy(WarmPoolCapacityPolicy capacityPolicy) {
            this.capacityPolicy = capacityPolicy;
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

        public PublicWarmPoolConfig build() {
            return new PublicWarmPoolConfig(this);
        } 

    } 

}
