// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link ListSampleResponseBody} extends {@link TeaModel}
 *
 * <p>ListSampleResponseBody</p>
 */
public class ListSampleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private java.util.List<ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("TotalItem")
    private Integer totalItem;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private ListSampleResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSampleResponseBody create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    /**
     * @return totalItem
     */
    public Integer getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private String httpStatusCode; 
        private String message; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 
        private Integer totalItem; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(ListSampleResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.totalItem = model.totalItem;
            this.totalPage = model.totalPage;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * ResultObject.
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * TotalItem.
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListSampleResponseBody build() {
            return new ListSampleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSampleResponseBody} extends {@link TeaModel}
     *
     * <p>ListSampleResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Integer fileSize;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RowCount")
        private Integer rowCount;

        @com.aliyun.core.annotation.NameInMap("SampleId")
        private Integer sampleId;

        @com.aliyun.core.annotation.NameInMap("SampleName")
        private String sampleName;

        @com.aliyun.core.annotation.NameInMap("Tab")
        private String tab;

        @com.aliyun.core.annotation.NameInMap("UploadTime")
        private String uploadTime;

        @com.aliyun.core.annotation.NameInMap("UploadUserName")
        private String uploadUserName;

        private ResultObject(Builder builder) {
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.remark = builder.remark;
            this.rowCount = builder.rowCount;
            this.sampleId = builder.sampleId;
            this.sampleName = builder.sampleName;
            this.tab = builder.tab;
            this.uploadTime = builder.uploadTime;
            this.uploadUserName = builder.uploadUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
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
        public Integer getFileSize() {
            return this.fileSize;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return rowCount
         */
        public Integer getRowCount() {
            return this.rowCount;
        }

        /**
         * @return sampleId
         */
        public Integer getSampleId() {
            return this.sampleId;
        }

        /**
         * @return sampleName
         */
        public String getSampleName() {
            return this.sampleName;
        }

        /**
         * @return tab
         */
        public String getTab() {
            return this.tab;
        }

        /**
         * @return uploadTime
         */
        public String getUploadTime() {
            return this.uploadTime;
        }

        /**
         * @return uploadUserName
         */
        public String getUploadUserName() {
            return this.uploadUserName;
        }

        public static final class Builder {
            private String fileName; 
            private Integer fileSize; 
            private String remark; 
            private Integer rowCount; 
            private Integer sampleId; 
            private String sampleName; 
            private String tab; 
            private String uploadTime; 
            private String uploadUserName; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.remark = model.remark;
                this.rowCount = model.rowCount;
                this.sampleId = model.sampleId;
                this.sampleName = model.sampleName;
                this.tab = model.tab;
                this.uploadTime = model.uploadTime;
                this.uploadUserName = model.uploadUserName;
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
            public Builder fileSize(Integer fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * RowCount.
             */
            public Builder rowCount(Integer rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * SampleId.
             */
            public Builder sampleId(Integer sampleId) {
                this.sampleId = sampleId;
                return this;
            }

            /**
             * SampleName.
             */
            public Builder sampleName(String sampleName) {
                this.sampleName = sampleName;
                return this;
            }

            /**
             * Tab.
             */
            public Builder tab(String tab) {
                this.tab = tab;
                return this;
            }

            /**
             * UploadTime.
             */
            public Builder uploadTime(String uploadTime) {
                this.uploadTime = uploadTime;
                return this;
            }

            /**
             * UploadUserName.
             */
            public Builder uploadUserName(String uploadUserName) {
                this.uploadUserName = uploadUserName;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
