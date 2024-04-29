// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The progress of the database scan task in percentage.
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
