// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDirectoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDirectoriesResponseBody</p>
 */
public class ListDirectoriesResponseBody extends TeaModel {
    @NameInMap("Directories")
    private java.util.List < Directories> directories;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCounts")
    private Integer totalCounts;

    private ListDirectoriesResponseBody(Builder builder) {
        this.directories = builder.directories;
        this.requestId = builder.requestId;
        this.totalCounts = builder.totalCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDirectoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return directories
     */
    public java.util.List < Directories> getDirectories() {
        return this.directories;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCounts
     */
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static final class Builder {
        private java.util.List < Directories> directories; 
        private String requestId; 
        private Integer totalCounts; 

        /**
         * The directories.
         */
        public Builder directories(java.util.List < Directories> directories) {
            this.directories = directories;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of directories.
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public ListDirectoriesResponseBody build() {
            return new ListDirectoriesResponseBody(this);
        } 

    } 

    public static class Directories extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("DirectoryName")
        private String directoryName;

        @NameInMap("Region")
        private String region;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Directories(Builder builder) {
            this.createTime = builder.createTime;
            this.directoryId = builder.directoryId;
            this.directoryName = builder.directoryName;
            this.region = builder.region;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Directories create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return directoryName
         */
        public String getDirectoryName() {
            return this.directoryName;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String directoryId; 
            private String directoryName; 
            private String region; 
            private String updateTime; 

            /**
             * The time when the directory was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the directory.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * The name of the directory.
             */
            public Builder directoryName(String directoryName) {
                this.directoryName = directoryName;
                return this;
            }

            /**
             * The region ID of the directory.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The time when the directory was modified.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Directories build() {
                return new Directories(this);
            } 

        } 

    }
}
