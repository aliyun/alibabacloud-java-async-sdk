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
 * {@link GetIssuesResponseBody} extends {@link TeaModel}
 *
 * <p>GetIssuesResponseBody</p>
 */
public class GetIssuesResponseBody extends TeaModel {
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

    private GetIssuesResponseBody(Builder builder) {
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

    public static GetIssuesResponseBody create() {
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

        private Builder(GetIssuesResponseBody model) {
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

        public GetIssuesResponseBody build() {
            return new GetIssuesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIssuesResponseBody} extends {@link TeaModel}
     *
     * <p>GetIssuesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectedUserCount")
        private Integer affectedUserCount;

        @com.aliyun.core.annotation.NameInMap("DigestHash")
        private String digestHash;

        @com.aliyun.core.annotation.NameInMap("DomScore")
        private String domScore;

        @com.aliyun.core.annotation.NameInMap("ErrorColumn")
        private Integer errorColumn;

        @com.aliyun.core.annotation.NameInMap("ErrorCount")
        private Integer errorCount;

        @com.aliyun.core.annotation.NameInMap("ErrorDeviceCount")
        private Integer errorDeviceCount;

        @com.aliyun.core.annotation.NameInMap("ErrorDeviceRate")
        private Double errorDeviceRate;

        @com.aliyun.core.annotation.NameInMap("ErrorFileName")
        private String errorFileName;

        @com.aliyun.core.annotation.NameInMap("ErrorLine")
        private Integer errorLine;

        @com.aliyun.core.annotation.NameInMap("ErrorName")
        private String errorName;

        @com.aliyun.core.annotation.NameInMap("ErrorRate")
        private Double errorRate;

        @com.aliyun.core.annotation.NameInMap("ErrorType")
        private String errorType;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private String eventTime;

        @com.aliyun.core.annotation.NameInMap("FirstVersion")
        private String firstVersion;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Stack")
        private String stack;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Items(Builder builder) {
            this.affectedUserCount = builder.affectedUserCount;
            this.digestHash = builder.digestHash;
            this.domScore = builder.domScore;
            this.errorColumn = builder.errorColumn;
            this.errorCount = builder.errorCount;
            this.errorDeviceCount = builder.errorDeviceCount;
            this.errorDeviceRate = builder.errorDeviceRate;
            this.errorFileName = builder.errorFileName;
            this.errorLine = builder.errorLine;
            this.errorName = builder.errorName;
            this.errorRate = builder.errorRate;
            this.errorType = builder.errorType;
            this.eventTime = builder.eventTime;
            this.firstVersion = builder.firstVersion;
            this.name = builder.name;
            this.stack = builder.stack;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return affectedUserCount
         */
        public Integer getAffectedUserCount() {
            return this.affectedUserCount;
        }

        /**
         * @return digestHash
         */
        public String getDigestHash() {
            return this.digestHash;
        }

        /**
         * @return domScore
         */
        public String getDomScore() {
            return this.domScore;
        }

        /**
         * @return errorColumn
         */
        public Integer getErrorColumn() {
            return this.errorColumn;
        }

        /**
         * @return errorCount
         */
        public Integer getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return errorDeviceCount
         */
        public Integer getErrorDeviceCount() {
            return this.errorDeviceCount;
        }

        /**
         * @return errorDeviceRate
         */
        public Double getErrorDeviceRate() {
            return this.errorDeviceRate;
        }

        /**
         * @return errorFileName
         */
        public String getErrorFileName() {
            return this.errorFileName;
        }

        /**
         * @return errorLine
         */
        public Integer getErrorLine() {
            return this.errorLine;
        }

        /**
         * @return errorName
         */
        public String getErrorName() {
            return this.errorName;
        }

        /**
         * @return errorRate
         */
        public Double getErrorRate() {
            return this.errorRate;
        }

        /**
         * @return errorType
         */
        public String getErrorType() {
            return this.errorType;
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        /**
         * @return firstVersion
         */
        public String getFirstVersion() {
            return this.firstVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return stack
         */
        public String getStack() {
            return this.stack;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer affectedUserCount; 
            private String digestHash; 
            private String domScore; 
            private Integer errorColumn; 
            private Integer errorCount; 
            private Integer errorDeviceCount; 
            private Double errorDeviceRate; 
            private String errorFileName; 
            private Integer errorLine; 
            private String errorName; 
            private Double errorRate; 
            private String errorType; 
            private String eventTime; 
            private String firstVersion; 
            private String name; 
            private String stack; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.affectedUserCount = model.affectedUserCount;
                this.digestHash = model.digestHash;
                this.domScore = model.domScore;
                this.errorColumn = model.errorColumn;
                this.errorCount = model.errorCount;
                this.errorDeviceCount = model.errorDeviceCount;
                this.errorDeviceRate = model.errorDeviceRate;
                this.errorFileName = model.errorFileName;
                this.errorLine = model.errorLine;
                this.errorName = model.errorName;
                this.errorRate = model.errorRate;
                this.errorType = model.errorType;
                this.eventTime = model.eventTime;
                this.firstVersion = model.firstVersion;
                this.name = model.name;
                this.stack = model.stack;
                this.status = model.status;
            } 

            /**
             * AffectedUserCount.
             */
            public Builder affectedUserCount(Integer affectedUserCount) {
                this.affectedUserCount = affectedUserCount;
                return this;
            }

            /**
             * DigestHash.
             */
            public Builder digestHash(String digestHash) {
                this.digestHash = digestHash;
                return this;
            }

            /**
             * DomScore.
             */
            public Builder domScore(String domScore) {
                this.domScore = domScore;
                return this;
            }

            /**
             * ErrorColumn.
             */
            public Builder errorColumn(Integer errorColumn) {
                this.errorColumn = errorColumn;
                return this;
            }

            /**
             * ErrorCount.
             */
            public Builder errorCount(Integer errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * ErrorDeviceCount.
             */
            public Builder errorDeviceCount(Integer errorDeviceCount) {
                this.errorDeviceCount = errorDeviceCount;
                return this;
            }

            /**
             * ErrorDeviceRate.
             */
            public Builder errorDeviceRate(Double errorDeviceRate) {
                this.errorDeviceRate = errorDeviceRate;
                return this;
            }

            /**
             * ErrorFileName.
             */
            public Builder errorFileName(String errorFileName) {
                this.errorFileName = errorFileName;
                return this;
            }

            /**
             * ErrorLine.
             */
            public Builder errorLine(Integer errorLine) {
                this.errorLine = errorLine;
                return this;
            }

            /**
             * ErrorName.
             */
            public Builder errorName(String errorName) {
                this.errorName = errorName;
                return this;
            }

            /**
             * ErrorRate.
             */
            public Builder errorRate(Double errorRate) {
                this.errorRate = errorRate;
                return this;
            }

            /**
             * ErrorType.
             */
            public Builder errorType(String errorType) {
                this.errorType = errorType;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * FirstVersion.
             */
            public Builder firstVersion(String firstVersion) {
                this.firstVersion = firstVersion;
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
             * Stack.
             */
            public Builder stack(String stack) {
                this.stack = stack;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIssuesResponseBody} extends {@link TeaModel}
     *
     * <p>GetIssuesResponseBody</p>
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
