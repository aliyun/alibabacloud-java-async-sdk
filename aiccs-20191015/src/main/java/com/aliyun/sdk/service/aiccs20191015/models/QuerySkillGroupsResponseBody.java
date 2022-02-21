// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySkillGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySkillGroupsResponseBody</p>
 */
public class QuerySkillGroupsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("OnePageSize")
    private Integer onePageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalPage")
    private Integer totalPage;

    @NameInMap("TotalResults")
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

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private Integer onePageSize; 
        private String requestId; 
        private Integer totalPage; 
        private Integer totalResults; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * OnePageSize.
         */
        public Builder onePageSize(Integer onePageSize) {
            this.onePageSize = onePageSize;
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
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        /**
         * TotalResults.
         */
        public Builder totalResults(Integer totalResults) {
            this.totalResults = totalResults;
            return this;
        }

        public QuerySkillGroupsResponseBody build() {
            return new QuerySkillGroupsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ChannelType")
        private Integer channelType;

        @NameInMap("Description")
        private String description;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("SkillGroupId")
        private Long skillGroupId;

        @NameInMap("SkillGroupName")
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

            /**
             * ChannelType.
             */
            public Builder channelType(Integer channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * SkillGroupId.
             */
            public Builder skillGroupId(Long skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * SkillGroupName.
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
