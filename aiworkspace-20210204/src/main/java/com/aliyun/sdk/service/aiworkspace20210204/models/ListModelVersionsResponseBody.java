// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModelVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelVersionsResponseBody</p>
 */
public class ListModelVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("Versions")
    private java.util.List < ModelVersion > versions;

    private ListModelVersionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return versions
     */
    public java.util.List < ModelVersion > getVersions() {
        return this.versions;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 
        private java.util.List < ModelVersion > versions; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Versions.
         */
        public Builder versions(java.util.List < ModelVersion > versions) {
            this.versions = versions;
            return this;
        }

        public ListModelVersionsResponseBody build() {
            return new ListModelVersionsResponseBody(this);
        } 

    } 

}
