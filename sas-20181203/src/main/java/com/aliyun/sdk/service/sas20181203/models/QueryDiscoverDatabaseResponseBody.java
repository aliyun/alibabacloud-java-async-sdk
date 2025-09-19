// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link QueryDiscoverDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDiscoverDatabaseResponseBody</p>
 */
public class QueryDiscoverDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskProgress")
    private Integer taskProgress;

    private QueryDiscoverDatabaseResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskProgress = builder.taskProgress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDiscoverDatabaseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskProgress
     */
    public Integer getTaskProgress() {
        return this.taskProgress;
    }

    public static final class Builder {
        private String requestId; 
        private Integer taskProgress; 

        private Builder() {
        } 

        private Builder(QueryDiscoverDatabaseResponseBody model) {
            this.requestId = model.requestId;
            this.taskProgress = model.taskProgress;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The progress of the database scan task in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        public Builder taskProgress(Integer taskProgress) {
            this.taskProgress = taskProgress;
            return this;
        }

        public QueryDiscoverDatabaseResponseBody build() {
            return new QueryDiscoverDatabaseResponseBody(this);
        } 

    } 

}
