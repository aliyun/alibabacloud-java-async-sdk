// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecentlyRecycledDirectoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecentlyRecycledDirectoriesResponseBody</p>
 */
public class ListRecentlyRecycledDirectoriesResponseBody extends TeaModel {
    @NameInMap("Entries")
    private java.util.List < Entries> entries;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
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
         * Entries.
         */
        public Builder entries(java.util.List < Entries> entries) {
            this.entries = entries;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRecentlyRecycledDirectoriesResponseBody build() {
            return new ListRecentlyRecycledDirectoriesResponseBody(this);
        } 

    } 

    public static class Entries extends TeaModel {
        @NameInMap("FileId")
        private String fileId;

        @NameInMap("LastDeleteTime")
        private String lastDeleteTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("Path")
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
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * LastDeleteTime.
             */
            public Builder lastDeleteTime(String lastDeleteTime) {
                this.lastDeleteTime = lastDeleteTime;
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
             * Path.
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
