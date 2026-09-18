// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link QuerySkillGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySkillGroupsResponseBody</p>
 */
public class QuerySkillGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("OnePageSize")
    private Integer onePageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    @com.aliyun.core.annotation.NameInMap("TotalResults")
    private Integer totalResults;

    private QuerySkillGroupsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.onePageSize = builder.onePageSize;
        this.requestId = builder.requestId;
        this.totalPage = builder.totalPage;
        this.totalResults = builder.totalResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySkillGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return onePageSize
     */
    public Integer getOnePageSize() {
        return this.onePageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    /**
     * @return totalResults
     */
    public Integer getTotalResults() {
        return this.totalResults;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Data> data; 
        private Integer onePageSize; 
        private String requestId; 
        private Integer totalPage; 
        private Integer totalResults; 

        private Builder() {
        } 

        private Builder(QuerySkillGroupsResponseBody model) {
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.onePageSize = model.onePageSize;
            this.requestId = model.requestId;
            this.totalPage = model.totalPage;
            this.totalResults = model.totalResults;
        } 

        /**
         * <p>Current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Number of items per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder onePageSize(Integer onePageSize) {
            this.onePageSize = onePageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>76</p>
         */
        public Builder totalResults(Integer totalResults) {
            this.totalResults = totalResults;
            return this;
        }

        public QuerySkillGroupsResponseBody build() {
            return new QuerySkillGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySkillGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySkillGroupsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelType")
        private Integer channelType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private Long skillGroupId;

        @com.aliyun.core.annotation.NameInMap("SkillGroupName")
        private String skillGroupName;

        private Data(Builder builder) {
            this.channelType = builder.channelType;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.skillGroupId = builder.skillGroupId;
            this.skillGroupName = builder.skillGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return channelType
         */
        public Integer getChannelType() {
            return this.channelType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return skillGroupId
         */
        public Long getSkillGroupId() {
            return this.skillGroupId;
        }

        /**
         * @return skillGroupName
         */
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public static final class Builder {
            private Integer channelType; 
            private String description; 
            private String displayName; 
            private Long skillGroupId; 
            private String skillGroupName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.channelType = model.channelType;
                this.description = model.description;
                this.displayName = model.displayName;
                this.skillGroupId = model.skillGroupId;
                this.skillGroupName = model.skillGroupName;
            } 

            /**
             * <p>Skill group channel type.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder channelType(Integer channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>Skill group description.</p>
             * 
             * <strong>example:</strong>
             * <p>自动化技能组</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Skill group display name.</p>
             * 
             * <strong>example:</strong>
             * <p>自动化技能组</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Skill group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder skillGroupId(Long skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * <p>Skill group name.</p>
             * 
             * <strong>example:</strong>
             * <p>自动化技能组</p>
             */
            public Builder skillGroupName(String skillGroupName) {
                this.skillGroupName = skillGroupName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
