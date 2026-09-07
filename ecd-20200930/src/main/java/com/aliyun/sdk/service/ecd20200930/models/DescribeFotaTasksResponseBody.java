// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeFotaTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFotaTasksResponseBody</p>
 */
public class DescribeFotaTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("FotaTasks")
    private java.util.List<FotaTasks> fotaTasks;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFotaTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.fotaTasks = builder.fotaTasks;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFotaTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return fotaTasks
     */
    public java.util.List<FotaTasks> getFotaTasks() {
        return this.fotaTasks;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private java.util.List<FotaTasks> fotaTasks; 
        private String message; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeFotaTasksResponseBody model) {
            this.code = model.code;
            this.fotaTasks = model.fotaTasks;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The result of the operation. A value of <code>success</code> indicates success. Otherwise, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The image upgrade task information.</p>
         */
        public Builder fotaTasks(java.util.List<FotaTasks> fotaTasks) {
            this.fotaTasks = fotaTasks;
            return this;
        }

        /**
         * <p>The error message. This parameter is not returned when Code is <code>success</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>The parameter is not specified.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination token for the next query. An empty value indicates that there are no more results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFotaTasksResponseBody build() {
            return new DescribeFotaTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFotaTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFotaTasksResponseBody</p>
     */
    public static class FotaTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("FotaProject")
        private String fotaProject;

        @com.aliyun.core.annotation.NameInMap("PendingCustomImageCount")
        private Integer pendingCustomImageCount;

        @com.aliyun.core.annotation.NameInMap("PendingDesktopCount")
        private Integer pendingDesktopCount;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private String publishTime;

        @com.aliyun.core.annotation.NameInMap("ReleaseNote")
        private String releaseNote;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskUid")
        private String taskUid;

        private FotaTasks(Builder builder) {
            this.appVersion = builder.appVersion;
            this.fotaProject = builder.fotaProject;
            this.pendingCustomImageCount = builder.pendingCustomImageCount;
            this.pendingDesktopCount = builder.pendingDesktopCount;
            this.publishTime = builder.publishTime;
            this.releaseNote = builder.releaseNote;
            this.size = builder.size;
            this.status = builder.status;
            this.taskUid = builder.taskUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FotaTasks create() {
            return builder().build();
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return fotaProject
         */
        public String getFotaProject() {
            return this.fotaProject;
        }

        /**
         * @return pendingCustomImageCount
         */
        public Integer getPendingCustomImageCount() {
            return this.pendingCustomImageCount;
        }

        /**
         * @return pendingDesktopCount
         */
        public Integer getPendingDesktopCount() {
            return this.pendingDesktopCount;
        }

        /**
         * @return publishTime
         */
        public String getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return releaseNote
         */
        public String getReleaseNote() {
            return this.releaseNote;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskUid
         */
        public String getTaskUid() {
            return this.taskUid;
        }

        public static final class Builder {
            private String appVersion; 
            private String fotaProject; 
            private Integer pendingCustomImageCount; 
            private Integer pendingDesktopCount; 
            private String publishTime; 
            private String releaseNote; 
            private Integer size; 
            private String status; 
            private String taskUid; 

            private Builder() {
            } 

            private Builder(FotaTasks model) {
                this.appVersion = model.appVersion;
                this.fotaProject = model.fotaProject;
                this.pendingCustomImageCount = model.pendingCustomImageCount;
                this.pendingDesktopCount = model.pendingDesktopCount;
                this.publishTime = model.publishTime;
                this.releaseNote = model.releaseNote;
                this.size = model.size;
                this.status = model.status;
                this.taskUid = model.taskUid;
            } 

            /**
             * <p>The image version. You can call <a href="https://help.aliyun.com/document_detail/188895.html">DescribeImages</a> to obtain this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.1-D-20220513.143129</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>To be hidden.</p>
             */
            public Builder fotaProject(String fotaProject) {
                this.fotaProject = fotaProject;
                return this;
            }

            /**
             * <p>The number of custom images that can be upgraded to this version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pendingCustomImageCount(Integer pendingCustomImageCount) {
                this.pendingCustomImageCount = pendingCustomImageCount;
                return this;
            }

            /**
             * <p>The number of cloud desktops that can be upgraded to this version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pendingDesktopCount(Integer pendingDesktopCount) {
                this.pendingDesktopCount = pendingDesktopCount;
                return this;
            }

            /**
             * <p>The release time of the upgrade version. The time is in the ISO 8601 standard in UTC: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-31T04:28:48Z</p>
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * <p>The upgrade version description.</p>
             * 
             * <strong>example:</strong>
             * <p>Fixed known issues and improved system stability</p>
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * <p>The size of the upgrade package, in KB.</p>
             * 
             * <strong>example:</strong>
             * <p>568533470</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>Indicates whether the image upgrade task is automatically pushed.</p>
             * 
             * <strong>example:</strong>
             * <p>valid</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the image upgrade task.</p>
             * 
             * <strong>example:</strong>
             * <p>aot-c4khwrp9ocml4****</p>
             */
            public Builder taskUid(String taskUid) {
                this.taskUid = taskUid;
                return this;
            }

            public FotaTasks build() {
                return new FotaTasks(this);
            } 

        } 

    }
}
