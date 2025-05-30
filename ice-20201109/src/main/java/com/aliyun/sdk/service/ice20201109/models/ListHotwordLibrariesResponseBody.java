// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListHotwordLibrariesResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotwordLibrariesResponseBody</p>
 */
public class ListHotwordLibrariesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HotwordLibraryList")
    private java.util.List<HotwordLibraryList> hotwordLibraryList;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListHotwordLibrariesResponseBody(Builder builder) {
        this.hotwordLibraryList = builder.hotwordLibraryList;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotwordLibrariesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotwordLibraryList
     */
    public java.util.List<HotwordLibraryList> getHotwordLibraryList() {
        return this.hotwordLibraryList;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<HotwordLibraryList> hotwordLibraryList; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListHotwordLibrariesResponseBody model) {
            this.hotwordLibraryList = model.hotwordLibraryList;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * HotwordLibraryList.
         */
        public Builder hotwordLibraryList(java.util.List<HotwordLibraryList> hotwordLibraryList) {
            this.hotwordLibraryList = hotwordLibraryList;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHotwordLibrariesResponseBody build() {
            return new ListHotwordLibrariesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHotwordLibrariesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotwordLibrariesResponseBody</p>
     */
    public static class HotwordLibraryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HotwordLibraryId")
        private String hotwordLibraryId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UsageScenario")
        private String usageScenario;

        private HotwordLibraryList(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.hotwordLibraryId = builder.hotwordLibraryId;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.usageScenario = builder.usageScenario;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotwordLibraryList create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hotwordLibraryId
         */
        public String getHotwordLibraryId() {
            return this.hotwordLibraryId;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return usageScenario
         */
        public String getUsageScenario() {
            return this.usageScenario;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String hotwordLibraryId; 
            private String modifiedTime; 
            private String name; 
            private String usageScenario; 

            private Builder() {
            } 

            private Builder(HotwordLibraryList model) {
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.hotwordLibraryId = model.hotwordLibraryId;
                this.modifiedTime = model.modifiedTime;
                this.name = model.name;
                this.usageScenario = model.usageScenario;
            } 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * HotwordLibraryId.
             */
            public Builder hotwordLibraryId(String hotwordLibraryId) {
                this.hotwordLibraryId = hotwordLibraryId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * UsageScenario.
             */
            public Builder usageScenario(String usageScenario) {
                this.usageScenario = usageScenario;
                return this;
            }

            public HotwordLibraryList build() {
                return new HotwordLibraryList(this);
            } 

        } 

    }
}
