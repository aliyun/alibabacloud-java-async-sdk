// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListFileUploadResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileUploadResponseBody</p>
 */
public class ListFileUploadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListFileUploadResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileUploadResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListFileUploadResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListFileUploadResponseBody build() {
            return new ListFileUploadResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFileUploadResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileUploadResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunParentUid")
        private String aliyunParentUid;

        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("DownloadLink")
        private String downloadLink;

        @com.aliyun.core.annotation.NameInMap("FileCategory")
        private String fileCategory;

        @com.aliyun.core.annotation.NameInMap("FileFrom")
        private String fileFrom;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("IntranetDownloadLink")
        private String intranetDownloadLink;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("UploadLocation")
        private String uploadLocation;

        private Data(Builder builder) {
            this.aliyunParentUid = builder.aliyunParentUid;
            this.aliyunUid = builder.aliyunUid;
            this.downloadLink = builder.downloadLink;
            this.fileCategory = builder.fileCategory;
            this.fileFrom = builder.fileFrom;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.fileType = builder.fileType;
            this.gmtCreated = builder.gmtCreated;
            this.intranetDownloadLink = builder.intranetDownloadLink;
            this.region = builder.region;
            this.sessionId = builder.sessionId;
            this.uploadLocation = builder.uploadLocation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunParentUid
         */
        public String getAliyunParentUid() {
            return this.aliyunParentUid;
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return downloadLink
         */
        public String getDownloadLink() {
            return this.downloadLink;
        }

        /**
         * @return fileCategory
         */
        public String getFileCategory() {
            return this.fileCategory;
        }

        /**
         * @return fileFrom
         */
        public String getFileFrom() {
            return this.fileFrom;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return intranetDownloadLink
         */
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return uploadLocation
         */
        public String getUploadLocation() {
            return this.uploadLocation;
        }

        public static final class Builder {
            private String aliyunParentUid; 
            private String aliyunUid; 
            private String downloadLink; 
            private String fileCategory; 
            private String fileFrom; 
            private String fileId; 
            private String fileName; 
            private Long fileSize; 
            private String fileType; 
            private String gmtCreated; 
            private String intranetDownloadLink; 
            private String region; 
            private String sessionId; 
            private String uploadLocation; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliyunParentUid = model.aliyunParentUid;
                this.aliyunUid = model.aliyunUid;
                this.downloadLink = model.downloadLink;
                this.fileCategory = model.fileCategory;
                this.fileFrom = model.fileFrom;
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.fileType = model.fileType;
                this.gmtCreated = model.gmtCreated;
                this.intranetDownloadLink = model.intranetDownloadLink;
                this.region = model.region;
                this.sessionId = model.sessionId;
                this.uploadLocation = model.uploadLocation;
            } 

            /**
             * AliyunParentUid.
             */
            public Builder aliyunParentUid(String aliyunParentUid) {
                this.aliyunParentUid = aliyunParentUid;
                return this;
            }

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * DownloadLink.
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * FileCategory.
             */
            public Builder fileCategory(String fileCategory) {
                this.fileCategory = fileCategory;
                return this;
            }

            /**
             * FileFrom.
             */
            public Builder fileFrom(String fileFrom) {
                this.fileFrom = fileFrom;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * FileType.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * IntranetDownloadLink.
             */
            public Builder intranetDownloadLink(String intranetDownloadLink) {
                this.intranetDownloadLink = intranetDownloadLink;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * UploadLocation.
             */
            public Builder uploadLocation(String uploadLocation) {
                this.uploadLocation = uploadLocation;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
