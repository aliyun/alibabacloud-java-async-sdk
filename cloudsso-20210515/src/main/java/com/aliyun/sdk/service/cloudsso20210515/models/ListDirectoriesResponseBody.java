// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDirectoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDirectoriesResponseBody</p>
 */
public class ListDirectoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Directories")
    private java.util.List < Directories> directories;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCounts")
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
         * <p>The directories.</p>
         */
        public Builder directories(java.util.List < Directories> directories) {
            this.directories = directories;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9A504392-F06D-5029-AB64-6654CB9F1DC1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of directories.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public ListDirectoriesResponseBody build() {
            return new ListDirectoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDirectoriesResponseBody</p>
     */
    public static class Directories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("DirectoryName")
        private String directoryName;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The time when the directory was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-30T08:35:26Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>d-00fc2p61****</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The name of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>new-example</p>
             */
            public Builder directoryName(String directoryName) {
                this.directoryName = directoryName;
                return this;
            }

            /**
             * <p>The region ID of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The time when the directory was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-25T09:13:24Z</p>
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
