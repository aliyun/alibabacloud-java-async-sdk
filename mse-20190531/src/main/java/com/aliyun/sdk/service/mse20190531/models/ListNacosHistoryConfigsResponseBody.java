// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNacosHistoryConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNacosHistoryConfigsResponseBody</p>
 */
public class ListNacosHistoryConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HistoryItems")
    private java.util.List < HistoryItems> historyItems;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListNacosHistoryConfigsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.historyItems = builder.historyItems;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNacosHistoryConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return historyItems
     */
    public java.util.List < HistoryItems> getHistoryItems() {
        return this.historyItems;
    }

    /**
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public static final class Builder {
        private String errorCode; 
        private java.util.List < HistoryItems> historyItems; 
        private String httpCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The configuration items.
         */
        public Builder historyItems(java.util.List < HistoryItems> historyItems) {
            this.historyItems = historyItems;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNacosHistoryConfigsResponseBody build() {
            return new ListNacosHistoryConfigsResponseBody(this);
        } 

    } 

    public static class HistoryItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
        private Long lastModifiedTime;

        @com.aliyun.core.annotation.NameInMap("OpType")
        private String opType;

        @com.aliyun.core.annotation.NameInMap("SrcUser")
        private String srcUser;

        private HistoryItems(Builder builder) {
            this.appName = builder.appName;
            this.dataId = builder.dataId;
            this.group = builder.group;
            this.id = builder.id;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.opType = builder.opType;
            this.srcUser = builder.srcUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryItems create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastModifiedTime
         */
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return opType
         */
        public String getOpType() {
            return this.opType;
        }

        /**
         * @return srcUser
         */
        public String getSrcUser() {
            return this.srcUser;
        }

        public static final class Builder {
            private String appName; 
            private String dataId; 
            private String group; 
            private Long id; 
            private Long lastModifiedTime; 
            private String opType; 
            private String srcUser; 

            /**
             * The application tag.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The ID of the data.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * The name of the group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * The ID of the configuration.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The timestamp when the configuration was last modified.
             */
            public Builder lastModifiedTime(Long lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * The format of the configuration file.
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * SrcUser.
             */
            public Builder srcUser(String srcUser) {
                this.srcUser = srcUser;
                return this;
            }

            public HistoryItems build() {
                return new HistoryItems(this);
            } 

        } 

    }
}
