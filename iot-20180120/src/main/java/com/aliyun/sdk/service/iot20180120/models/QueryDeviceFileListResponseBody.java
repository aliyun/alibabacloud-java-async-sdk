// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceFileListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceFileListResponseBody</p>
 */
public class QueryDeviceFileListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("PageCount")
    private Integer pageCount;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * PageCount.
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public QueryDeviceFileListResponseBody build() {
            return new QueryDeviceFileListResponseBody(this);
        } 

    } 

    public static class FileSummary extends TeaModel {
        @NameInMap("FileId")
        private String fileId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Size")
        private String size;

        @NameInMap("UtcCreatedOn")
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

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
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
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * UtcCreatedOn.
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
    public static class Data extends TeaModel {
        @NameInMap("FileSummary")
        private java.util.List < FileSummary> fileSummary;

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
        public java.util.List < FileSummary> getFileSummary() {
            return this.fileSummary;
        }

        public static final class Builder {
            private java.util.List < FileSummary> fileSummary; 

            /**
             * FileSummary.
             */
            public Builder fileSummary(java.util.List < FileSummary> fileSummary) {
                this.fileSummary = fileSummary;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
