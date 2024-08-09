// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePerformanceViewResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePerformanceViewResponseBody</p>
 */
public class DeletePerformanceViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("DeleteStatus")
    private Boolean deleteStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeletePerformanceViewResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.deleteStatus = builder.deleteStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePerformanceViewResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return deleteStatus
     */
    public Boolean getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Boolean deleteStatus; 
        private String requestId; 

        /**
         * The details about the access denial.
         * <p>
         * 
         * >  This parameter is returned only if Resource Access Management (RAM) permission verification failed.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * DeleteStatus.
         */
        public Builder deleteStatus(Boolean deleteStatus) {
            this.deleteStatus = deleteStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeletePerformanceViewResponseBody build() {
            return new DeletePerformanceViewResponseBody(this);
        } 

    } 

}
