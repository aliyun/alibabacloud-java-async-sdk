// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link GetExperimentRunResponseBody} extends {@link TeaModel}
 *
 * <p>GetExperimentRunResponseBody</p>
 */
public class GetExperimentRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("record")
    private ExperimentRecord record;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetExperimentRunResponseBody(Builder builder) {
        this.record = builder.record;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return record
     */
    public ExperimentRecord getRecord() {
        return this.record;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ExperimentRecord record; 
        private String regionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetExperimentRunResponseBody model) {
            this.record = model.record;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
        } 

        /**
         * record.
         */
        public Builder record(ExperimentRecord record) {
            this.record = record;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetExperimentRunResponseBody build() {
            return new GetExperimentRunResponseBody(this);
        } 

    } 

}
