// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeDefenseGroupValidResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseGroupValidResourcesResponseBody</p>
 */
public class DescribeDefenseGroupValidResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<String> resources;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDefenseGroupValidResourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseGroupValidResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.List<String> getResources() {
        return this.resources;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> resources; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDefenseGroupValidResourcesResponseBody model) {
            this.requestId = model.requestId;
            this.resources = model.resources;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A57BA089-3B28-5C82-8331-7B94****4978</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The names of the protected objects.</p>
         */
        public Builder resources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDefenseGroupValidResourcesResponseBody build() {
            return new DescribeDefenseGroupValidResourcesResponseBody(this);
        } 

    } 

}
