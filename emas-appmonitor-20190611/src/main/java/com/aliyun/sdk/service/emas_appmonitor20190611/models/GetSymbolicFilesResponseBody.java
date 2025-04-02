// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link GetSymbolicFilesResponseBody} extends {@link TeaModel}
 *
 * <p>GetSymbolicFilesResponseBody</p>
 */
public class GetSymbolicFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Args")
    private java.util.Map<String, ?> args;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSymbolicFilesResponseBody(Builder builder) {
        this.args = builder.args;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSymbolicFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return args
     */
    public java.util.Map<String, ?> getArgs() {
        return this.args;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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
        private java.util.Map<String, ?> args; 
        private Integer errorCode; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSymbolicFilesResponseBody model) {
            this.args = model.args;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Args</p>
         */
        public Builder args(java.util.Map<String, ?> args) {
            this.args = args;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>B3AD0FE4-36EF-1641-90B1-77618166F2ff</p>
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

        public GetSymbolicFilesResponseBody build() {
            return new GetSymbolicFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSymbolicFilesResponseBody} extends {@link TeaModel}
     *
     * <p>GetSymbolicFilesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("BuildId")
        private String buildId;

        @com.aliyun.core.annotation.NameInMap("ExportStatus")
        private String exportStatus;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Items(Builder builder) {
            this.appVersion = builder.appVersion;
            this.buildId = builder.buildId;
            this.exportStatus = builder.exportStatus;
            this.fileName = builder.fileName;
            this.filePath = builder.filePath;
            this.fileType = builder.fileType;
            this.gmtCreate = builder.gmtCreate;
            this.id = builder.id;
            this.status = builder.status;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return buildId
         */
        public String getBuildId() {
            return this.buildId;
        }

        /**
         * @return exportStatus
         */
        public String getExportStatus() {
            return this.exportStatus;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String appVersion; 
            private String buildId; 
            private String exportStatus; 
            private String fileName; 
            private String filePath; 
            private String fileType; 
            private Long gmtCreate; 
            private Long id; 
            private String status; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.appVersion = model.appVersion;
                this.buildId = model.buildId;
                this.exportStatus = model.exportStatus;
                this.fileName = model.fileName;
                this.filePath = model.filePath;
                this.fileType = model.fileType;
                this.gmtCreate = model.gmtCreate;
                this.id = model.id;
                this.status = model.status;
                this.uuid = model.uuid;
            } 

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * BuildId.
             */
            public Builder buildId(String buildId) {
                this.buildId = buildId;
                return this;
            }

            /**
             * ExportStatus.
             */
            public Builder exportStatus(String exportStatus) {
                this.exportStatus = exportStatus;
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
             * FilePath.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
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
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>uuid</p>
             * 
             * <strong>example:</strong>
             * <p>9634758587856312DEV</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSymbolicFilesResponseBody} extends {@link TeaModel}
     *
     * <p>GetSymbolicFilesResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Pages")
        private Integer pages;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Model(Builder builder) {
            this.items = builder.items;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.pages = builder.pages;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pages
         */
        public Integer getPages() {
            return this.pages;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer pages; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.items = model.items;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.pages = model.pages;
                this.total = model.total;
            } 

            /**
             * Items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
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
             * Pages.
             */
            public Builder pages(Integer pages) {
                this.pages = pages;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
