// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ListResourceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceGroupsResponseBody</p>
 */
public class ListResourceGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroups")
    private java.util.List<ResourceGroup> resourceGroups;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long totalCount;

    private ListResourceGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceGroups = builder.resourceGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupsResponseBody create() {
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
     * @return resourceGroups
     */
    public java.util.List<ResourceGroup> getResourceGroups() {
        return this.resourceGroups;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResourceGroup> resourceGroups; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListResourceGroupsResponseBody model) {
            this.requestId = model.requestId;
            this.resourceGroups = model.resourceGroups;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9CFA2665-1FFE-5929-8468-C14C25890486</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>RG1</p>
         */
        public Builder resourceGroups(java.util.List<ResourceGroup> resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }

        /**
         * <p>The total number of matching resource groups.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourceGroupsResponseBody build() {
            return new ListResourceGroupsResponseBody(this);
        } 

    } 

}
