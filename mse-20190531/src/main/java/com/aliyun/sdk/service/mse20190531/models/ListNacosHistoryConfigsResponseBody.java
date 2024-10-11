// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The configuration items.</p>
         */
        public Builder historyItems(java.util.List < HistoryItems> historyItems) {
            this.historyItems = historyItems;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request was successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * <p>53338ECA-F880-54D8-A9B3-5606355A1B89</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNacosHistoryConfigsResponseBody build() {
            return new ListNacosHistoryConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNacosHistoryConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNacosHistoryConfigsResponseBody</p>
     */
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
             * <p>The application tag.</p>
             * 
             * <strong>example:</strong>
             * <p>gateway</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The ID of the data.</p>
             * 
             * <strong>example:</strong>
             * <p>test.yaml</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>The name of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The ID of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>23fdsf</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The timestamp when the configuration was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>16434400</p>
             */
            public Builder lastModifiedTime(Long lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * <p>The format of the configuration file.</p>
             * 
             * <strong>example:</strong>
             * <p>yaml</p>
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
