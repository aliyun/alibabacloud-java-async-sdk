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
 * {@link DescribeDefenseTemplateValidGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseTemplateValidGroupsResponseBody</p>
 */
public class DescribeDefenseTemplateValidGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Groups")
    private java.util.List<String> groups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDefenseTemplateValidGroupsResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseTemplateValidGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return groups
     */
    public java.util.List<String> getGroups() {
        return this.groups;
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
        private java.util.List<String> groups; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The names of the protected object groups.</p>
         */
        public Builder groups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6EA4B39A-9C0C-5E57-993E-30B6****3AD0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDefenseTemplateValidGroupsResponseBody build() {
            return new DescribeDefenseTemplateValidGroupsResponseBody(this);
        } 

    } 

}
