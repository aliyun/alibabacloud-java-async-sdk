// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link RefreshVodObjectCachesResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshVodObjectCachesResponseBody</p>
 */
public class RefreshVodObjectCachesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RefreshTaskId")
    private String refreshTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RefreshVodObjectCachesResponseBody(Builder builder) {
        this.refreshTaskId = builder.refreshTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshVodObjectCachesResponseBody create() {
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

        private Builder(RefreshVodObjectCachesResponseBody model) {
            this.refreshTaskId = model.refreshTaskId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the refresh task. Multiple IDs are separated by commas (,). Refresh tasks are merged based on the following rules:</p>
         * <p>If the tasks are set for the same accelerated domain name, submitted within the same second, and refresh content based on URLs instead of directories, the tasks IDs are merged into the same task ID (RefreshTaskId). If the number of these tasks exceeds 2,000, every 2,000 tasks IDs are merged into the same task ID (RefreshTaskId).</p>
         * 
         * <strong>example:</strong>
         * <p>70422*****2904</p>
         */
        public Builder refreshTaskId(String refreshTaskId) {
            this.refreshTaskId = refreshTaskId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D61E4801-EAFF-4A63-****-FBF6CE1CFD1C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefreshVodObjectCachesResponseBody build() {
            return new RefreshVodObjectCachesResponseBody(this);
        } 

    } 

}
