// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEcsSpecsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEcsSpecsResponseBody</p>
 */
public class ListEcsSpecsResponseBody extends TeaModel {
    @NameInMap("EcsSpecs")
    private java.util.List < EcsSpec > ecsSpecs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListEcsSpecsResponseBody(Builder builder) {
        this.ecsSpecs = builder.ecsSpecs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEcsSpecsResponseBody create() {
        return builder().build();
    }

    /**
     * @return ecsSpecs
     */
    public java.util.List < EcsSpec > getEcsSpecs() {
        return this.ecsSpecs;
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

    public static final class Builder {
        private java.util.List < EcsSpec > ecsSpecs; 
        private String requestId; 
        private Long totalCount; 

        /**
         * EcsSpecs.
         */
        public Builder ecsSpecs(java.util.List < EcsSpec > ecsSpecs) {
            this.ecsSpecs = ecsSpecs;
            return this;
        }

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

        public ListEcsSpecsResponseBody build() {
            return new ListEcsSpecsResponseBody(this);
        } 

    } 

}
