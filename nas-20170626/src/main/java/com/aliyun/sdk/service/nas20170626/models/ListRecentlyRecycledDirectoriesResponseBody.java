// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRecentlyRecycledDirectoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecentlyRecycledDirectoriesResponseBody</p>
 */
public class ListRecentlyRecycledDirectoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Entries")
    private java.util.List < Entries> entries;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListRecentlyRecycledDirectoriesResponseBody(Builder builder) {
        this.entries = builder.entries;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecentlyRecycledDirectoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return entries
     */
    public java.util.List < Entries> getEntries() {
        return this.entries;
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

    public static final class Builder {
        private java.util.List < Entries> entries; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>The information about the directories that are recently deleted.</p>
         */
        public Builder entries(java.util.List < Entries> entries) {
            this.entries = entries;
            return this;
        }

        /**
         * <p>A pagination token.</p>
         * <p>If not all directories are returned in a query, the return value of the NextToken parameter is not empty. In this case, you can specify a valid value for the NextToken parameter to continue the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1256****25</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9E15E394-38A6-457A-A62A-D9797C9A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRecentlyRecycledDirectoriesResponseBody build() {
            return new ListRecentlyRecycledDirectoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecentlyRecycledDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecentlyRecycledDirectoriesResponseBody</p>
     */
    public static class Entries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("LastDeleteTime")
        private String lastDeleteTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private Entries(Builder builder) {
            this.fileId = builder.fileId;
            this.lastDeleteTime = builder.lastDeleteTime;
            this.name = builder.name;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entries create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return lastDeleteTime
         */
        public String getLastDeleteTime() {
            return this.lastDeleteTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String fileId; 
            private String lastDeleteTime; 
            private String name; 
            private String path; 

            /**
             * <p>The ID of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>04***08</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The time when the directory was last deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-30T10:08:08Z</p>
             */
            public Builder lastDeleteTime(String lastDeleteTime) {
                this.lastDeleteTime = lastDeleteTime;
                return this;
            }

            /**
             * <p>The name of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>b</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The absolute path to the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/a/b</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Entries build() {
                return new Entries(this);
            } 

        } 

    }
}
