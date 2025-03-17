// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link ListCustomGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomGroupsResponseBody</p>
 */
public class ListCustomGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomGroups")
    private CustomGroups customGroups;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCustomGroupsResponseBody(Builder builder) {
        this.customGroups = builder.customGroups;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customGroups
     */
    public CustomGroups getCustomGroups() {
        return this.customGroups;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private CustomGroups customGroups; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCustomGroupsResponseBody model) {
            this.customGroups = model.customGroups;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CustomGroups.
         */
        public Builder customGroups(CustomGroups customGroups) {
            this.customGroups = customGroups;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        public ListCustomGroupsResponseBody build() {
            return new ListCustomGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomGroupsResponseBody</p>
     */
    public static class CustomGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomGroupDescription")
        private String customGroupDescription;

        @com.aliyun.core.annotation.NameInMap("CustomGroupId")
        private String customGroupId;

        @com.aliyun.core.annotation.NameInMap("CustomGroupName")
        private String customGroupName;

        private CustomGroup(Builder builder) {
            this.customGroupDescription = builder.customGroupDescription;
            this.customGroupId = builder.customGroupId;
            this.customGroupName = builder.customGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomGroup create() {
            return builder().build();
        }

        /**
         * @return customGroupDescription
         */
        public String getCustomGroupDescription() {
            return this.customGroupDescription;
        }

        /**
         * @return customGroupId
         */
        public String getCustomGroupId() {
            return this.customGroupId;
        }

        /**
         * @return customGroupName
         */
        public String getCustomGroupName() {
            return this.customGroupName;
        }

        public static final class Builder {
            private String customGroupDescription; 
            private String customGroupId; 
            private String customGroupName; 

            private Builder() {
            } 

            private Builder(CustomGroup model) {
                this.customGroupDescription = model.customGroupDescription;
                this.customGroupId = model.customGroupId;
                this.customGroupName = model.customGroupName;
            } 

            /**
             * CustomGroupDescription.
             */
            public Builder customGroupDescription(String customGroupDescription) {
                this.customGroupDescription = customGroupDescription;
                return this;
            }

            /**
             * CustomGroupId.
             */
            public Builder customGroupId(String customGroupId) {
                this.customGroupId = customGroupId;
                return this;
            }

            /**
             * CustomGroupName.
             */
            public Builder customGroupName(String customGroupName) {
                this.customGroupName = customGroupName;
                return this;
            }

            public CustomGroup build() {
                return new CustomGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCustomGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomGroupsResponseBody</p>
     */
    public static class CustomGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomGroup")
        private java.util.List<CustomGroup> customGroup;

        private CustomGroups(Builder builder) {
            this.customGroup = builder.customGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomGroups create() {
            return builder().build();
        }

        /**
         * @return customGroup
         */
        public java.util.List<CustomGroup> getCustomGroup() {
            return this.customGroup;
        }

        public static final class Builder {
            private java.util.List<CustomGroup> customGroup; 

            private Builder() {
            } 

            private Builder(CustomGroups model) {
                this.customGroup = model.customGroup;
            } 

            /**
             * CustomGroup.
             */
            public Builder customGroup(java.util.List<CustomGroup> customGroup) {
                this.customGroup = customGroup;
                return this;
            }

            public CustomGroups build() {
                return new CustomGroups(this);
            } 

        } 

    }
}
