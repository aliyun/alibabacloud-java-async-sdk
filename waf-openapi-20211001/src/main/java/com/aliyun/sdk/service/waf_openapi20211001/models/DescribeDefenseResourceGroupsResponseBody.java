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
 * {@link DescribeDefenseResourceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseResourceGroupsResponseBody</p>
 */
public class DescribeDefenseResourceGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Groups")
    private java.util.List<Groups> groups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDefenseResourceGroupsResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseResourceGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return groups
     */
    public java.util.List<Groups> getGroups() {
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
        private java.util.List<Groups> groups; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The list of protected object groups.</p>
         */
        public Builder groups(java.util.List<Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BFEC5C77-049B-5E88-A5B6-CB0C****B66E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDefenseResourceGroupsResponseBody build() {
            return new DescribeDefenseResourceGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDefenseResourceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDefenseResourceGroupsResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ResourceList")
        private String resourceList;

        private Groups(Builder builder) {
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupName = builder.groupName;
            this.resourceList = builder.resourceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return resourceList
         */
        public String getResourceList() {
            return this.resourceList;
        }

        public static final class Builder {
            private String description; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String groupName; 
            private String resourceList; 

            /**
             * <p>The description of the protected object group.</p>
             * 
             * <strong>example:</strong>
             * <p>This is test description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the protected object group was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1624343180000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The most recent time when the protected object group was modified. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1701656305000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The name of the protected object group.</p>
             * 
             * <strong>example:</strong>
             * <p>apptest</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The names of the protected objects that are added to the protected object group. Separate multiple protected objects with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>example02.aliyun-waf,example01.aliyun-waf</p>
             */
            public Builder resourceList(String resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
