// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RefreshObjectCachesResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshObjectCachesResponseBody</p>
 */
public class RefreshObjectCachesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RefreshTaskId")
    private String refreshTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RefreshObjectCachesResponseBody(Builder builder) {
        this.refreshTaskId = builder.refreshTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshObjectCachesResponseBody create() {
        return builder().build();
    }

    /**
     * @return refreshTaskId
     */
    public String getRefreshTaskId() {
        return this.refreshTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String refreshTaskId; 
        private String requestId; 

        /**
         * <p>The ID of the refresh task. If multiple tasks are returned, the task IDs are separated by commas (,). The task IDs are merged based on the following rules:</p>
         * <ul>
         * <li>If the tasks are specified for the same accelerated domain name, submitted within the same second, and run to refresh content based on URLs instead of directories, the task IDs are merged into one task ID (RefreshTaskId).</li>
         * <li>If the number of tasks that are specified for the same accelerated domain name, submitted within the same second, and run to refresh content based on URLs instead of directories exceeds 2,000, every 2,000 task IDs are merged into one task ID (RefreshTaskId).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>704222904</p>
         */
        public Builder refreshTaskId(String refreshTaskId) {
            this.refreshTaskId = refreshTaskId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D61E4801-EAFF-4A63-AAE1-FBF6CE1CFD1C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefreshObjectCachesResponseBody build() {
            return new RefreshObjectCachesResponseBody(this);
        } 

    } 

}
