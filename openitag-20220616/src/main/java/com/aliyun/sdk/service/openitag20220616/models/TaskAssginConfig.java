// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskAssginConfig} extends {@link TeaModel}
 *
 * <p>TaskAssginConfig</p>
 */
public class TaskAssginConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssignCount")
    private Long assignCount;

    @com.aliyun.core.annotation.NameInMap("AssignField")
    private String assignField;

    @com.aliyun.core.annotation.NameInMap("AssignSubTaskCount")
    private String assignSubTaskCount;

    @com.aliyun.core.annotation.NameInMap("AssignType")
    private String assignType;

    private TaskAssginConfig(Builder builder) {
        this.assignCount = builder.assignCount;
        this.assignField = builder.assignField;
        this.assignSubTaskCount = builder.assignSubTaskCount;
        this.assignType = builder.assignType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskAssginConfig create() {
        return builder().build();
    }

    /**
     * @return assignCount
     */
    public Long getAssignCount() {
        return this.assignCount;
    }

    /**
     * @return assignField
     */
    public String getAssignField() {
        return this.assignField;
    }

    /**
     * @return assignSubTaskCount
     */
    public String getAssignSubTaskCount() {
        return this.assignSubTaskCount;
    }

    /**
     * @return assignType
     */
    public String getAssignType() {
        return this.assignType;
    }

    public static final class Builder {
        private Long assignCount; 
        private String assignField; 
        private String assignSubTaskCount; 
        private String assignType; 

        /**
         * AssignCount.
         */
        public Builder assignCount(Long assignCount) {
            this.assignCount = assignCount;
            return this;
        }

        /**
         * AssignField.
         */
        public Builder assignField(String assignField) {
            this.assignField = assignField;
            return this;
        }

        /**
         * AssignSubTaskCount.
         */
        public Builder assignSubTaskCount(String assignSubTaskCount) {
            this.assignSubTaskCount = assignSubTaskCount;
            return this;
        }

        /**
         * AssignType.
         */
        public Builder assignType(String assignType) {
            this.assignType = assignType;
            return this;
        }

        public TaskAssginConfig build() {
            return new TaskAssginConfig(this);
        } 

    } 

}
