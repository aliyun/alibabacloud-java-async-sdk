// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDirectoryResponseBody</p>
 */
public class UpdateDirectoryResponseBody extends TeaModel {
    @NameInMap("Directory")
    private Directory directory;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateDirectoryResponseBody(Builder builder) {
        this.directory = builder.directory;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDirectoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return directory
     */
    public Directory getDirectory() {
        return this.directory;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Directory directory; 
        private String requestId; 

        /**
         * The information about the directory.
         */
        public Builder directory(Directory directory) {
            this.directory = directory;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateDirectoryResponseBody build() {
            return new UpdateDirectoryResponseBody(this);
        } 

    } 

    public static class Directory extends TeaModel {
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

        private Directory(Builder builder) {
            this.createTime = builder.createTime;
            this.directoryId = builder.directoryId;
            this.directoryName = builder.directoryName;
            this.region = builder.region;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Directory create() {
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

            public Directory build() {
                return new Directory(this);
            } 

        } 

    }
}
