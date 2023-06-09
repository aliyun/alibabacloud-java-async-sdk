// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceListPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceListPageResponseBody</p>
 */
public class GetServiceListPageResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetServiceListPageResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceListPageResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 请求响应数据。
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 请求信息。
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求id。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 请求是否成功。
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetServiceListPageResponseBody build() {
            return new GetServiceListPageResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("GmtModifyTime")
        private String gmtModifyTime;

        @NameInMap("Group")
        private String group;

        @NameInMap("InstanceNum")
        private Integer instanceNum;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("Version")
        private String version;

        private Result(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.gmtModifyTime = builder.gmtModifyTime;
            this.group = builder.group;
            this.instanceNum = builder.instanceNum;
            this.serviceName = builder.serviceName;
            this.version = builder.version;
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
         * @return gmtModifyTime
         */
        public String getGmtModifyTime() {
            return this.gmtModifyTime;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return instanceNum
         */
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String gmtModifyTime; 
            private String group; 
            private Integer instanceNum; 
            private String serviceName; 
            private String version; 

            /**
             * 应用id。
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * 应用名。
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * 服务最后的更新时间。
             */
            public Builder gmtModifyTime(String gmtModifyTime) {
                this.gmtModifyTime = gmtModifyTime;
                return this;
            }

            /**
             * 服务分组。
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * 服务对应的节点数。
             */
            public Builder instanceNum(Integer instanceNum) {
                this.instanceNum = instanceNum;
                return this;
            }

            /**
             * 服务名。
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * 服务版本。
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private String pageNumber;

        @NameInMap("PageSize")
        private String pageSize;

        @NameInMap("Result")
        private java.util.List < Result> result;

        @NameInMap("TotalSize")
        private String totalSize;

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
        public String getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
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
        public String getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private String pageNumber; 
            private String pageSize; 
            private java.util.List < Result> result; 
            private String totalSize; 

            /**
             * 当前页码。
             */
            public Builder pageNumber(String pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * 页面大小。
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * 当前页面数据。
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * 数据总数。
             */
            public Builder totalSize(String totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
