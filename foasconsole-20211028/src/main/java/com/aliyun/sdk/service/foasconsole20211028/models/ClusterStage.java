// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link ClusterStage} extends {@link TeaModel}
 *
 * <p>ClusterStage</p>
 */
public class ClusterStage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentStage")
    private Integer currentStage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TotalStageWithWeight")
    private java.util.List<StageWithWeight> totalStageWithWeight;

    private ClusterStage(Builder builder) {
        this.currentStage = builder.currentStage;
        this.message = builder.message;
        this.status = builder.status;
        this.totalStageWithWeight = builder.totalStageWithWeight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClusterStage create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentStage
     */
    public Integer getCurrentStage() {
        return this.currentStage;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalStageWithWeight
     */
    public java.util.List<StageWithWeight> getTotalStageWithWeight() {
        return this.totalStageWithWeight;
    }

    public static final class Builder {
        private Integer currentStage; 
        private String message; 
        private String status; 
        private java.util.List<StageWithWeight> totalStageWithWeight; 

        private Builder() {
        } 

        private Builder(ClusterStage model) {
            this.currentStage = model.currentStage;
            this.message = model.message;
            this.status = model.status;
            this.totalStageWithWeight = model.totalStageWithWeight;
        } 

        /**
         * CurrentStage.
         */
        public Builder currentStage(Integer currentStage) {
            this.currentStage = currentStage;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * TotalStageWithWeight.
         */
        public Builder totalStageWithWeight(java.util.List<StageWithWeight> totalStageWithWeight) {
            this.totalStageWithWeight = totalStageWithWeight;
            return this;
        }

        public ClusterStage build() {
            return new ClusterStage(this);
        } 

    } 

}
