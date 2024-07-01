// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPerformanceViewResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyPerformanceViewResponseBody</p>
 */
public class ModifyPerformanceViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("ModifyStatus")
    private String modifyStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyPerformanceViewResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.modifyStatus = builder.modifyStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPerformanceViewResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return modifyStatus
     */
    public String getModifyStatus() {
        return this.modifyStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String modifyStatus; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * ModifyStatus.
         */
        public Builder modifyStatus(String modifyStatus) {
            this.modifyStatus = modifyStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyPerformanceViewResponseBody build() {
            return new ModifyPerformanceViewResponseBody(this);
        } 

    } 

}
