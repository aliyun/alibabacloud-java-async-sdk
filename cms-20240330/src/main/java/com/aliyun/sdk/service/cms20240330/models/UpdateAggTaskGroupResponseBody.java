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
 * {@link UpdateAggTaskGroupResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAggTaskGroupResponseBody</p>
 */
public class UpdateAggTaskGroupResponseBody extends TeaModel {
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

    private UpdateAggTaskGroupResponseBody(Builder builder) {
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

    public static UpdateAggTaskGroupResponseBody create() {
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

        private Builder(UpdateAggTaskGroupResponseBody model) {
            this.aggTaskGroupConfigHash = model.aggTaskGroupConfigHash;
            this.aggTaskGroupId = model.aggTaskGroupId;
            this.aggTaskGroupName = model.aggTaskGroupName;
            this.requestId = model.requestId;
            this.sourcePrometheusId = model.sourcePrometheusId;
            this.status = model.status;
        } 

        /**
         * aggTaskGroupConfigHash.
         */
        public Builder aggTaskGroupConfigHash(String aggTaskGroupConfigHash) {
            this.aggTaskGroupConfigHash = aggTaskGroupConfigHash;
            return this;
        }

        /**
         * aggTaskGroupId.
         */
        public Builder aggTaskGroupId(String aggTaskGroupId) {
            this.aggTaskGroupId = aggTaskGroupId;
            return this;
        }

        /**
         * aggTaskGroupName.
         */
        public Builder aggTaskGroupName(String aggTaskGroupName) {
            this.aggTaskGroupName = aggTaskGroupName;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * sourcePrometheusId.
         */
        public Builder sourcePrometheusId(String sourcePrometheusId) {
            this.sourcePrometheusId = sourcePrometheusId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public UpdateAggTaskGroupResponseBody build() {
            return new UpdateAggTaskGroupResponseBody(this);
        } 

    } 

}
