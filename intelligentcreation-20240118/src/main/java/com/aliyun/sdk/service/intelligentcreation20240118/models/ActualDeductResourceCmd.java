// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActualDeductResourceCmd} extends {@link TeaModel}
 *
 * <p>ActualDeductResourceCmd</p>
 */
public class ActualDeductResourceCmd extends TeaModel {
    @NameInMap("cost")
    @Validation(required = true)
    private Long cost;

    @NameInMap("extraInfo")
    private String extraInfo;

    @NameInMap("idempotentId")
    private String idempotentId;

    @NameInMap("taskId")
    @Validation(required = true)
    private String taskId;

    private ActualDeductResourceCmd(Builder builder) {
        this.cost = builder.cost;
        this.extraInfo = builder.extraInfo;
        this.idempotentId = builder.idempotentId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActualDeductResourceCmd create() {
        return builder().build();
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return this.cost;
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return idempotentId
     */
    public String getIdempotentId() {
        return this.idempotentId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private Long cost; 
        private String extraInfo; 
        private String idempotentId; 
        private String taskId; 

        /**
         * cost.
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * extraInfo.
         */
        public Builder extraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * idempotentId.
         */
        public Builder idempotentId(String idempotentId) {
            this.idempotentId = idempotentId;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public ActualDeductResourceCmd build() {
            return new ActualDeductResourceCmd(this);
        } 

    } 

}
