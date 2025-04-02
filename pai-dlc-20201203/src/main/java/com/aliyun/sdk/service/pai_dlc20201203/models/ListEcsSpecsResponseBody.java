// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ListEcsSpecsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEcsSpecsResponseBody</p>
 */
public class ListEcsSpecsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EcsSpecs")
    private java.util.List<EcsSpec> ecsSpecs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ecsSpecs
     */
    public java.util.List<EcsSpec> getEcsSpecs() {
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
        private java.util.List<EcsSpec> ecsSpecs; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListEcsSpecsResponseBody model) {
            this.ecsSpecs = model.ecsSpecs;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of ECS specifications.</p>
         */
        public Builder ecsSpecs(java.util.List<EcsSpec> ecsSpecs) {
            this.ecsSpecs = ecsSpecs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of types that meet the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
