// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDiscoverDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDiscoverDatabaseResponseBody</p>
 */
public class QueryDiscoverDatabaseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskProgress")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskProgress.
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
