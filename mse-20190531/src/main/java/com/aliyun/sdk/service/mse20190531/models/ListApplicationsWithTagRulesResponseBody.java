// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationsWithTagRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsWithTagRulesResponseBody</p>
 */
public class ListApplicationsWithTagRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListApplicationsWithTagRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsWithTagRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
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
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
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

        public ListApplicationsWithTagRulesResponseBody build() {
            return new ListApplicationsWithTagRulesResponseBody(this);
        } 

    } 

    public static class RouteRules extends TeaModel {
        @NameInMap("CarryData")
        private Boolean carryData;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceNum")
        private Integer instanceNum;

        @NameInMap("Name")
        private String name;

        @NameInMap("Rate")
        private Integer rate;

        @NameInMap("Remove")
        private Boolean remove;

        @NameInMap("Rules")
        private String rules;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Tag")
        private String tag;

        private RouteRules(Builder builder) {
            this.carryData = builder.carryData;
            this.enable = builder.enable;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.instanceNum = builder.instanceNum;
            this.name = builder.name;
            this.rate = builder.rate;
            this.remove = builder.remove;
            this.rules = builder.rules;
            this.status = builder.status;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteRules create() {
            return builder().build();
        }

        /**
         * @return carryData
         */
        public Boolean getCarryData() {
            return this.carryData;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceNum
         */
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rate
         */
        public Integer getRate() {
            return this.rate;
        }

        /**
         * @return remove
         */
        public Boolean getRemove() {
            return this.remove;
        }

        /**
         * @return rules
         */
        public String getRules() {
            return this.rules;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private Boolean carryData; 
            private Boolean enable; 
            private String gmtModified; 
            private Long id; 
            private Integer instanceNum; 
            private String name; 
            private Integer rate; 
            private Boolean remove; 
            private String rules; 
            private Integer status; 
            private String tag; 

            /**
             * CarryData.
             */
            public Builder carryData(Boolean carryData) {
                this.carryData = carryData;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * InstanceNum.
             */
            public Builder instanceNum(Integer instanceNum) {
                this.instanceNum = instanceNum;
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
             * Rate.
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Remove.
             */
            public Builder remove(Boolean remove) {
                this.remove = remove;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(String rules) {
                this.rules = rules;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public RouteRules build() {
                return new RouteRules(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("RouteRules")
        private java.util.List < RouteRules> routeRules;

        @NameInMap("RouteStatus")
        private Long routeStatus;

        private Result(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.routeRules = builder.routeRules;
            this.routeStatus = builder.routeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return routeRules
         */
        public java.util.List < RouteRules> getRouteRules() {
            return this.routeRules;
        }

        /**
         * @return routeStatus
         */
        public Long getRouteStatus() {
            return this.routeStatus;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private java.util.List < RouteRules> routeRules; 
            private Long routeStatus; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * RouteRules.
             */
            public Builder routeRules(java.util.List < RouteRules> routeRules) {
                this.routeRules = routeRules;
                return this;
            }

            /**
             * RouteStatus.
             */
            public Builder routeStatus(Long routeStatus) {
                this.routeStatus = routeStatus;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Result")
        private java.util.List < Result> result;

        @NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < Result> result; 
            private Integer totalSize; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
