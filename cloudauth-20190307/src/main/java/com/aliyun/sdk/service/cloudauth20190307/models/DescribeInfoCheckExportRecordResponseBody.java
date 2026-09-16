// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeInfoCheckExportRecordResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInfoCheckExportRecordResponseBody</p>
 */
public class DescribeInfoCheckExportRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeInfoCheckExportRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInfoCheckExportRecordResponseBody create() {
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
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
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
        private java.util.List<Items> items; 
        private String message; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeInfoCheckExportRecordResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.message = model.message;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The return code. A value of 200 indicates success. Other values indicate failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The result list.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the response is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeInfoCheckExportRecordResponseBody build() {
            return new DescribeInfoCheckExportRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInfoCheckExportRecordResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInfoCheckExportRecordResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadDate")
        private String downloadDate;

        @com.aliyun.core.annotation.NameInMap("DownloadTaskId")
        private String downloadTaskId;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Items(Builder builder) {
            this.downloadDate = builder.downloadDate;
            this.downloadTaskId = builder.downloadTaskId;
            this.errorCode = builder.errorCode;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.productType = builder.productType;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return downloadDate
         */
        public String getDownloadDate() {
            return this.downloadDate;
        }

        /**
         * @return downloadTaskId
         */
        public String getDownloadTaskId() {
            return this.downloadTaskId;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String downloadDate; 
            private String downloadTaskId; 
            private String errorCode; 
            private String fileName; 
            private String fileType; 
            private String productType; 
            private Integer status; 
            private String url; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.downloadDate = model.downloadDate;
                this.downloadTaskId = model.downloadTaskId;
                this.errorCode = model.errorCode;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.productType = model.productType;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * <p>The download time. The value is a UNIX timestamp in milliseconds (ms), for example, 1758250979000.</p>
             * 
             * <strong>example:</strong>
             * <p>1758250979000</p>
             */
            public Builder downloadDate(String downloadDate) {
                this.downloadDate = downloadDate;
                return this;
            }

            /**
             * <p>The ID of the download task.</p>
             * 
             * <strong>example:</strong>
             * <p>202510189017278</p>
             */
            public Builder downloadTaskId(String downloadTaskId) {
                this.downloadTaskId = downloadTaskId;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>手机号二要素统计202509013975081.csv</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The file type.</p>
             * 
             * <strong>example:</strong>
             * <p>CSV</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The product type name. Valid values:</p>
             * <ul>
             * <li><strong>ID_CARD_2_META</strong>: ID card two-element verification.</li>
             * <li><strong>ID_PERIOD</strong>: ID card validity period verification.</li>
             * <li><strong>MOBILE_ONLINE_LENGTH</strong>: Mobile number online duration.</li>
             * <li><strong>MOBILE_ONLINE_STATUS</strong>: Mobile number online status.</li>
             * <li><strong>MOBILE_3_META_SIMPLE</strong>: Mobile number three-element verification (simple edition).</li>
             * <li><strong>MOBILE_3_META</strong>: Mobile number three-element verification (detailed edition).</li>
             * <li><strong>MOBILE_2_META</strong>: Mobile number two-element verification.</li>
             * <li><strong>BANK_CARD_N_META</strong>: Bank card verification (detailed edition).</li>
             * <li><strong>MOBILE_DETECT</strong>: Number detection.</li>
             * <li><strong>VEHICLE_N_META</strong>: Vehicle element verification (enhanced edition).</li>
             * <li><strong>VEHICLE_PENTA_INFO</strong>: Vehicle five-element information recognition.</li>
             * <li><strong>VEHICLE_LICENSE_INFO</strong>: Vehicle information recognition.</li>
             * <li><strong>VEHICLE_INSURE_DATE</strong>: Vehicle insurance date query.</li>
             * <li><strong>VEHICLE_CHECK</strong>: Vehicle element verification.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ID_CARD_2_META</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: File is being generated.</li>
             * <li><strong>2</strong>: File generation is complete.</li>
             * <li><strong>3</strong>: File generation failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cn-shanghai-aliyun-cloudauth.oss-cn-shanghai.aliyuncs.com/console/xxxxxxxx.xlsx">https://cn-shanghai-aliyun-cloudauth.oss-cn-shanghai.aliyuncs.com/console/xxxxxxxx.xlsx</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
