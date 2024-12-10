// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PageServiceCustomerResponseBody} extends {@link TeaModel}
 *
 * <p>PageServiceCustomerResponseBody</p>
 */
public class PageServiceCustomerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private PageServiceCustomerResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageServiceCustomerResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
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
        private String code; 
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Interface return code.</p>
         * 
         * <strong>example:</strong>
         * <p>System error or openapi error</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data query results.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Return message. When the request is successful, it returns a success message; when the request fails, it returns the reason for the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>808A307F-9513-5099-AAA5-98D4EF199140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Request return status.</p>
         * <ul>
         * <li>true: Success.</li>
         * <li>false: Failure.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PageServiceCustomerResponseBody build() {
            return new PageServiceCustomerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PageServiceCustomerResponseBody} extends {@link TeaModel}
     *
     * <p>PageServiceCustomerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private String aliuid;

        @com.aliyun.core.annotation.NameInMap("AuthStatus")
        private Integer authStatus;

        @com.aliyun.core.annotation.NameInMap("CmAuthStatus")
        private Integer cmAuthStatus;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("MonitorAuthStatus")
        private Integer monitorAuthStatus;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnId")
        private String ownId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.aliuid = builder.aliuid;
            this.authStatus = builder.authStatus;
            this.cmAuthStatus = builder.cmAuthStatus;
            this.endTime = builder.endTime;
            this.level = builder.level;
            this.monitorAuthStatus = builder.monitorAuthStatus;
            this.name = builder.name;
            this.ownId = builder.ownId;
            this.startTime = builder.startTime;
            this.userId = builder.userId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliuid
         */
        public String getAliuid() {
            return this.aliuid;
        }

        /**
         * @return authStatus
         */
        public Integer getAuthStatus() {
            return this.authStatus;
        }

        /**
         * @return cmAuthStatus
         */
        public Integer getCmAuthStatus() {
            return this.cmAuthStatus;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return monitorAuthStatus
         */
        public Integer getMonitorAuthStatus() {
            return this.monitorAuthStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownId
         */
        public String getOwnId() {
            return this.ownId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String aliuid; 
            private Integer authStatus; 
            private Integer cmAuthStatus; 
            private Long endTime; 
            private String level; 
            private Integer monitorAuthStatus; 
            private String name; 
            private String ownId; 
            private Long startTime; 
            private String userId; 
            private String version; 

            /**
             * <p>Customer UID.</p>
             * 
             * <strong>example:</strong>
             * <p>1667751131382856</p>
             */
            public Builder aliuid(String aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * <p>Authorization status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder authStatus(Integer authStatus) {
                this.authStatus = authStatus;
                return this;
            }

            /**
             * <p>Cloud Monitoring - Alert authorization status.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cmAuthStatus(Integer cmAuthStatus) {
                this.cmAuthStatus = cmAuthStatus;
                return this;
            }

            /**
             * <p>End time. The format is a Unix timestamp, which is the number of milliseconds since January 1, 1970.</p>
             * 
             * <strong>example:</strong>
             * <p>1710123149222</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Customer level.</p>
             * 
             * <strong>example:</strong>
             * <p>GC1</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>Cloud Security - Alert authorization status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder monitorAuthStatus(Integer monitorAuthStatus) {
                this.monitorAuthStatus = monitorAuthStatus;
                return this;
            }

            /**
             * <p>Customer name.</p>
             * 
             * <strong>example:</strong>
             * <p>中国工程院</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Owner name.</p>
             * 
             * <strong>example:</strong>
             * <p>常温</p>
             */
            public Builder ownId(String ownId) {
                this.ownId = ownId;
                return this;
            }

            /**
             * <p>Start time. The format is a Unix timestamp, which is the number of milliseconds since January 1, 1970.</p>
             * 
             * <strong>example:</strong>
             * <p>1710123149000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Customer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1667751131382856</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Version information.</p>
             * 
             * <strong>example:</strong>
             * <p>企业版</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link PageServiceCustomerResponseBody} extends {@link TeaModel}
     *
     * <p>PageServiceCustomerResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The current page number in pagination queries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>Number of items per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of query results.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
