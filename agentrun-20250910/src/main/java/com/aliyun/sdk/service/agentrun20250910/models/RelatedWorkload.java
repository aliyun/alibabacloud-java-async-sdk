// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link RelatedWorkload} extends {@link TeaModel}
 *
 * <p>RelatedWorkload</p>
 */
public class RelatedWorkload extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("workloadId")
    private String workloadId;

    @com.aliyun.core.annotation.NameInMap("workloadName")
    private String workloadName;

    @com.aliyun.core.annotation.NameInMap("workloadType")
    private String workloadType;

    private RelatedWorkload(Builder builder) {
        this.workloadId = builder.workloadId;
        this.workloadName = builder.workloadName;
        this.workloadType = builder.workloadType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RelatedWorkload create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workloadId
     */
    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @return workloadName
     */
    public String getWorkloadName() {
        return this.workloadName;
    }

    /**
     * @return workloadType
     */
    public String getWorkloadType() {
        return this.workloadType;
    }

    public static final class Builder {
        private String workloadId; 
        private String workloadName; 
        private String workloadType; 

        private Builder() {
        } 

        private Builder(RelatedWorkload model) {
            this.workloadId = model.workloadId;
            this.workloadName = model.workloadName;
            this.workloadType = model.workloadType;
        } 

        /**
         * workloadId.
         */
        public Builder workloadId(String workloadId) {
            this.workloadId = workloadId;
            return this;
        }

        /**
         * workloadName.
         */
        public Builder workloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }

        /**
         * workloadType.
         */
        public Builder workloadType(String workloadType) {
            this.workloadType = workloadType;
            return this;
        }

        public RelatedWorkload build() {
            return new RelatedWorkload(this);
        } 

    } 

}
