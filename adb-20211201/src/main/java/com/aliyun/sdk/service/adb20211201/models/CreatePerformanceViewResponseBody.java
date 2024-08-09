// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePerformanceViewResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePerformanceViewResponseBody</p>
 */
public class CreatePerformanceViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("CreateStatus")
    private String createStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePerformanceViewResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.createStatus = builder.createStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePerformanceViewResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return createStatus
     */
    public String getCreateStatus() {
        return this.createStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String createStatus; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * The creation result. Valid values:
         * <p>
         * 
         * *   **SUCCESS**
         * *   **FAILED**
         */
        public Builder createStatus(String createStatus) {
            this.createStatus = createStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePerformanceViewResponseBody build() {
            return new CreatePerformanceViewResponseBody(this);
        } 

    } 

}
