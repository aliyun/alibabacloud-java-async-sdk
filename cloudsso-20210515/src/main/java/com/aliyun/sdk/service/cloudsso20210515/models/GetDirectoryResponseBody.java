// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetDirectoryResponseBody</p>
 */
public class GetDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Directory")
    private Directory directory;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDirectoryResponseBody(Builder builder) {
        this.directory = builder.directory;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDirectoryResponseBody create() {
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
         * <p>The information about the directory.</p>
         */
        public Builder directory(Directory directory) {
            this.directory = directory;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AA6A9E4B-8A61-59E1-AA87-F61CA18258A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDirectoryResponseBody build() {
            return new GetDirectoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDirectoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetDirectoryResponseBody</p>
     */
    public static class Directory extends TeaModel {
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
             * <p>example</p>
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
             * <p>2021-10-25T07:18:46Z</p>
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
