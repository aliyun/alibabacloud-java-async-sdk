// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryDeviceFileListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceFileListResponseBody</p>
 */
public class QueryDeviceFileListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Integer pageCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private QueryDeviceFileListResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.pageCount = builder.pageCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceFileListResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private Data data; 
        private String errorMessage; 
        private Integer pageCount; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(QueryDeviceFileListResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.pageCount = model.pageCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The file list information returned if the call succeeds.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public QueryDeviceFileListResponseBody build() {
            return new QueryDeviceFileListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceFileListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceFileListResponseBody</p>
     */
    public static class FileSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("UtcCreatedOn")
        private String utcCreatedOn;

        private FileSummary(Builder builder) {
            this.fileId = builder.fileId;
            this.name = builder.name;
            this.size = builder.size;
            this.utcCreatedOn = builder.utcCreatedOn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSummary create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return utcCreatedOn
         */
        public String getUtcCreatedOn() {
            return this.utcCreatedOn;
        }

        public static final class Builder {
            private String fileId; 
            private String name; 
            private String size; 
            private String utcCreatedOn; 

            private Builder() {
            } 

            private Builder(FileSummary model) {
                this.fileId = model.fileId;
                this.name = model.name;
                this.size = model.size;
                this.utcCreatedOn = model.utcCreatedOn;
            } 

            /**
             * <p>The ID of each file. The ID is the unique identifier for the file.</p>
             * 
             * <strong>example:</strong>
             * <p>xL0G67MBLBDtkR7GCfT******</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>testFile2.txt</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The size of the file. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024000</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The time when the file was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-03-21T08:45:42.000Z</p>
             */
            public Builder utcCreatedOn(String utcCreatedOn) {
                this.utcCreatedOn = utcCreatedOn;
                return this;
            }

            public FileSummary build() {
                return new FileSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceFileListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceFileListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSummary")
        private java.util.List<FileSummary> fileSummary;

        private Data(Builder builder) {
            this.fileSummary = builder.fileSummary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fileSummary
         */
        public java.util.List<FileSummary> getFileSummary() {
            return this.fileSummary;
        }

        public static final class Builder {
            private java.util.List<FileSummary> fileSummary; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fileSummary = model.fileSummary;
            } 

            /**
             * FileSummary.
             */
            public Builder fileSummary(java.util.List<FileSummary> fileSummary) {
                this.fileSummary = fileSummary;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
