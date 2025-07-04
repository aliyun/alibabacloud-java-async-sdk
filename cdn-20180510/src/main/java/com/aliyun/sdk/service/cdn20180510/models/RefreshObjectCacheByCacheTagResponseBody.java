// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link RefreshObjectCacheByCacheTagResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshObjectCacheByCacheTagResponseBody</p>
 */
public class RefreshObjectCacheByCacheTagResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RefreshTaskId")
    private String refreshTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RefreshObjectCacheByCacheTagResponseBody(Builder builder) {
        this.refreshTaskId = builder.refreshTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshObjectCacheByCacheTagResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RefreshObjectCacheByCacheTagResponseBody model) {
            this.refreshTaskId = model.refreshTaskId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the refresh task. If multiple tasks are returned, the task IDs are separated by commas (,). The task IDs are merged based on the following rules:</p>
         * <ul>
         * <li>If the tasks are specified for the same accelerated domain name, submitted within the same second, and run to refresh content based on URLs instead of directories, the task IDs are merged into one task ID (RefreshTaskId).</li>
         * <li>If the number of tasks that are specified for the same accelerated domain name, submitted within the same second, and run to refresh content based on URLs instead of directories exceeds 2,000, every 2,000 task IDs are merged into one task ID (RefreshTaskId).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>17772470184</p>
         */
        public Builder refreshTaskId(String refreshTaskId) {
            this.refreshTaskId = refreshTaskId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2E5AD83F-BD7B-462E-8319-2E30E305519A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefreshObjectCacheByCacheTagResponseBody build() {
            return new RefreshObjectCacheByCacheTagResponseBody(this);
        } 

    } 

}
