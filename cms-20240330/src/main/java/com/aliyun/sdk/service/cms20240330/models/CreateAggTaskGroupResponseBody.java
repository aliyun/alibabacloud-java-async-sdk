// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateAggTaskGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAggTaskGroupResponseBody</p>
 */
public class CreateAggTaskGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aggTaskGroupConfigHash")
    private String aggTaskGroupConfigHash;

    @com.aliyun.core.annotation.NameInMap("aggTaskGroupId")
    private String aggTaskGroupId;

    @com.aliyun.core.annotation.NameInMap("aggTaskGroupName")
    private String aggTaskGroupName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sourcePrometheusId")
    private String sourcePrometheusId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private CreateAggTaskGroupResponseBody(Builder builder) {
        this.aggTaskGroupConfigHash = builder.aggTaskGroupConfigHash;
        this.aggTaskGroupId = builder.aggTaskGroupId;
        this.aggTaskGroupName = builder.aggTaskGroupName;
        this.requestId = builder.requestId;
        this.sourcePrometheusId = builder.sourcePrometheusId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAggTaskGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggTaskGroupConfigHash
     */
    public String getAggTaskGroupConfigHash() {
        return this.aggTaskGroupConfigHash;
    }

    /**
     * @return aggTaskGroupId
     */
    public String getAggTaskGroupId() {
        return this.aggTaskGroupId;
    }

    /**
     * @return aggTaskGroupName
     */
    public String getAggTaskGroupName() {
        return this.aggTaskGroupName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourcePrometheusId
     */
    public String getSourcePrometheusId() {
        return this.sourcePrometheusId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String aggTaskGroupConfigHash; 
        private String aggTaskGroupId; 
        private String aggTaskGroupName; 
        private String requestId; 
        private String sourcePrometheusId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateAggTaskGroupResponseBody model) {
            this.aggTaskGroupConfigHash = model.aggTaskGroupConfigHash;
            this.aggTaskGroupId = model.aggTaskGroupId;
            this.aggTaskGroupName = model.aggTaskGroupName;
            this.requestId = model.requestId;
            this.sourcePrometheusId = model.sourcePrometheusId;
            this.status = model.status;
        } 

        /**
         * <p>Summary of the aggregation task group configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>a54136014dc386a92c83a6ef1e97ff22</p>
         */
        public Builder aggTaskGroupConfigHash(String aggTaskGroupConfigHash) {
            this.aggTaskGroupConfigHash = aggTaskGroupConfigHash;
            return this;
        }

        /**
         * <p>Aggregation task group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aggTaskGroup-f4b8e50525cf41c894488c0c71ec483f</p>
         */
        public Builder aggTaskGroupId(String aggTaskGroupId) {
            this.aggTaskGroupId = aggTaskGroupId;
            return this;
        }

        /**
         * <p>Aggregation task group name.</p>
         * 
         * <strong>example:</strong>
         * <p>pipeline-aggtask-group</p>
         */
        public Builder aggTaskGroupName(String aggTaskGroupName) {
            this.aggTaskGroupName = aggTaskGroupName;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16C0A6D6-C3E7-511D-A60B-A87FD85F5BA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Source Prometheus instance ID of the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-ecc04af14729b1a16e40a0d10068</p>
         */
        public Builder sourcePrometheusId(String sourcePrometheusId) {
            this.sourcePrometheusId = sourcePrometheusId;
            return this;
        }

        /**
         * <p>Current status of the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>Pending2Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateAggTaskGroupResponseBody build() {
            return new CreateAggTaskGroupResponseBody(this);
        } 

    } 

}
