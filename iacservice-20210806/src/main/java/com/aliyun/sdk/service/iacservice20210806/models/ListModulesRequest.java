// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModulesRequest} extends {@link RequestModel}
 *
 * <p>ListModulesRequest</p>
 */
public class ListModulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("excludeModuleIds")
    private java.util.List < String > excludeModuleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tag")
    private java.util.List < Tag> tag;

    private ListModulesRequest(Builder builder) {
        super(builder);
        this.excludeModuleIds = builder.excludeModuleIds;
        this.groupId = builder.groupId;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return excludeModuleIds
     */
    public java.util.List < String > getExcludeModuleIds() {
        return this.excludeModuleIds;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListModulesRequest, Builder> {
        private java.util.List < String > excludeModuleIds; 
        private String groupId; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListModulesRequest request) {
            super(request);
            this.excludeModuleIds = request.excludeModuleIds;
            this.groupId = request.groupId;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.tag = request.tag;
        } 

        /**
         * excludeModuleIds.
         */
        public Builder excludeModuleIds(java.util.List < String > excludeModuleIds) {
            String excludeModuleIdsShrink = shrink(excludeModuleIds, "excludeModuleIds", "simple");
            this.putQueryParameter("excludeModuleIds", excludeModuleIdsShrink);
            this.excludeModuleIds = excludeModuleIds;
            return this;
        }

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            String tagShrink = shrink(tag, "tag", "json");
            this.putQueryParameter("tag", tagShrink);
            this.tag = tag;
            return this;
        }

        @Override
        public ListModulesRequest build() {
            return new ListModulesRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
