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
 * {@link DescribeDefenseResourceGroupNamesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseResourceGroupNamesResponseBody</p>
 */
public class DescribeDefenseResourceGroupNamesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupNames")
    private java.util.List<String> groupNames;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDefenseResourceGroupNamesResponseBody(Builder builder) {
        this.groupNames = builder.groupNames;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseResourceGroupNamesResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupNames
     */
    public java.util.List<String> getGroupNames() {
        return this.groupNames;
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
        private java.util.List<String> groupNames; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The names of the protected object groups.</p>
         */
        public Builder groupNames(java.util.List<String> groupNames) {
            this.groupNames = groupNames;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>59DA4258-2F32-5095-B283-57AC****70B3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDefenseResourceGroupNamesResponseBody build() {
            return new DescribeDefenseResourceGroupNamesResponseBody(this);
        } 

    } 

}
