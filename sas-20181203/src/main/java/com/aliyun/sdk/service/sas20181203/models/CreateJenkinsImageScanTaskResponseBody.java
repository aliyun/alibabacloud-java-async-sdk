// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateJenkinsImageScanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateJenkinsImageScanTaskResponseBody</p>
 */
public class CreateJenkinsImageScanTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateJenkinsImageScanTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJenkinsImageScanTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>52870893-48A7-5A9E-9E05-6253E5B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateJenkinsImageScanTaskResponseBody build() {
            return new CreateJenkinsImageScanTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateJenkinsImageScanTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreateJenkinsImageScanTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageScanCapacity")
        private Long imageScanCapacity;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("RepoInstanceId")
        private String repoInstanceId;

        @com.aliyun.core.annotation.NameInMap("RepoRegionId")
        private String repoRegionId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.imageScanCapacity = builder.imageScanCapacity;
            this.repoId = builder.repoId;
            this.repoInstanceId = builder.repoInstanceId;
            this.repoRegionId = builder.repoRegionId;
            this.taskId = builder.taskId;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return imageScanCapacity
         */
        public Long getImageScanCapacity() {
            return this.imageScanCapacity;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return repoInstanceId
         */
        public String getRepoInstanceId() {
            return this.repoInstanceId;
        }

        /**
         * @return repoRegionId
         */
        public String getRepoRegionId() {
            return this.repoRegionId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long imageScanCapacity; 
            private String repoId; 
            private String repoInstanceId; 
            private String repoRegionId; 
            private String taskId; 
            private String uuid; 

            /**
             * <p>The quota for image scan.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder imageScanCapacity(Long imageScanCapacity) {
                this.imageScanCapacity = imageScanCapacity;
                return this;
            }

            /**
             * <p>The ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>crr-upze3gcopm9c****</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The instance ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-0gkaatghnmnt****</p>
             */
            public Builder repoInstanceId(String repoInstanceId) {
                this.repoInstanceId = repoInstanceId;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder repoRegionId(String repoRegionId) {
                this.repoRegionId = repoRegionId;
                return this;
            }

            /**
             * <p>The ID of the scan task.</p>
             * 
             * <strong>example:</strong>
             * <p>fc98d58eb56f699d49bf7ebbd6d7****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The UUID of the image asset.</p>
             * 
             * <strong>example:</strong>
             * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
