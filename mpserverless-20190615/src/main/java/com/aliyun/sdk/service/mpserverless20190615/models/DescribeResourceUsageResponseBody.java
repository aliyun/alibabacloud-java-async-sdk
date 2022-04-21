// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceUsageResponseBody</p>
 */
public class DescribeResourceUsageResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    private String httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("Paginator")
    private Paginator paginator;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeResourceUsageResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataList = builder.dataList;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.paginator = builder.paginator;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dataList
     */
    public java.util.List < DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return paginator
     */
    public Paginator getPaginator() {
        return this.paginator;
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
        private java.util.List < DataList> dataList; 
        private String httpStatusCode; 
        private String message; 
        private Paginator paginator; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DataList.
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
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
         * Paginator.
         */
        public Builder paginator(Paginator paginator) {
            this.paginator = paginator;
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

        public DescribeResourceUsageResponseBody build() {
            return new DescribeResourceUsageResponseBody(this);
        } 

    } 

    public static class CloudDB extends TeaModel {
        @NameInMap("DataSize")
        private Long dataSize;

        @NameInMap("Read")
        private Long read;

        @NameInMap("Write")
        private Long write;

        private CloudDB(Builder builder) {
            this.dataSize = builder.dataSize;
            this.read = builder.read;
            this.write = builder.write;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudDB create() {
            return builder().build();
        }

        /**
         * @return dataSize
         */
        public Long getDataSize() {
            return this.dataSize;
        }

        /**
         * @return read
         */
        public Long getRead() {
            return this.read;
        }

        /**
         * @return write
         */
        public Long getWrite() {
            return this.write;
        }

        public static final class Builder {
            private Long dataSize; 
            private Long read; 
            private Long write; 

            /**
             * DataSize.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * Read.
             */
            public Builder read(Long read) {
                this.read = read;
                return this;
            }

            /**
             * Write.
             */
            public Builder write(Long write) {
                this.write = write;
                return this;
            }

            public CloudDB build() {
                return new CloudDB(this);
            } 

        } 

    }
    public static class CloudFunction extends TeaModel {
        @NameInMap("Compute")
        private Long compute;

        @NameInMap("Count")
        private Long count;

        @NameInMap("Traffic")
        private Long traffic;

        private CloudFunction(Builder builder) {
            this.compute = builder.compute;
            this.count = builder.count;
            this.traffic = builder.traffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudFunction create() {
            return builder().build();
        }

        /**
         * @return compute
         */
        public Long getCompute() {
            return this.compute;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return traffic
         */
        public Long getTraffic() {
            return this.traffic;
        }

        public static final class Builder {
            private Long compute; 
            private Long count; 
            private Long traffic; 

            /**
             * Compute.
             */
            public Builder compute(Long compute) {
                this.compute = compute;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Traffic.
             */
            public Builder traffic(Long traffic) {
                this.traffic = traffic;
                return this;
            }

            public CloudFunction build() {
                return new CloudFunction(this);
            } 

        } 

    }
    public static class CloudStorage extends TeaModel {
        @NameInMap("DataSize")
        private Long dataSize;

        @NameInMap("Download")
        private Long download;

        @NameInMap("Traffic")
        private Long traffic;

        @NameInMap("Upload")
        private Long upload;

        private CloudStorage(Builder builder) {
            this.dataSize = builder.dataSize;
            this.download = builder.download;
            this.traffic = builder.traffic;
            this.upload = builder.upload;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudStorage create() {
            return builder().build();
        }

        /**
         * @return dataSize
         */
        public Long getDataSize() {
            return this.dataSize;
        }

        /**
         * @return download
         */
        public Long getDownload() {
            return this.download;
        }

        /**
         * @return traffic
         */
        public Long getTraffic() {
            return this.traffic;
        }

        /**
         * @return upload
         */
        public Long getUpload() {
            return this.upload;
        }

        public static final class Builder {
            private Long dataSize; 
            private Long download; 
            private Long traffic; 
            private Long upload; 

            /**
             * DataSize.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * Download.
             */
            public Builder download(Long download) {
                this.download = download;
                return this;
            }

            /**
             * Traffic.
             */
            public Builder traffic(Long traffic) {
                this.traffic = traffic;
                return this;
            }

            /**
             * Upload.
             */
            public Builder upload(Long upload) {
                this.upload = upload;
                return this;
            }

            public CloudStorage build() {
                return new CloudStorage(this);
            } 

        } 

    }
    public static class StaticWeb extends TeaModel {
        @NameInMap("DataSize")
        private Long dataSize;

        @NameInMap("Traffic")
        private Long traffic;

        private StaticWeb(Builder builder) {
            this.dataSize = builder.dataSize;
            this.traffic = builder.traffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StaticWeb create() {
            return builder().build();
        }

        /**
         * @return dataSize
         */
        public Long getDataSize() {
            return this.dataSize;
        }

        /**
         * @return traffic
         */
        public Long getTraffic() {
            return this.traffic;
        }

        public static final class Builder {
            private Long dataSize; 
            private Long traffic; 

            /**
             * DataSize.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * Traffic.
             */
            public Builder traffic(Long traffic) {
                this.traffic = traffic;
                return this;
            }

            public StaticWeb build() {
                return new StaticWeb(this);
            } 

        } 

    }
    public static class DataList extends TeaModel {
        @NameInMap("CloudDB")
        private CloudDB cloudDB;

        @NameInMap("CloudFunction")
        private CloudFunction cloudFunction;

        @NameInMap("CloudStorage")
        private CloudStorage cloudStorage;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StaticWeb")
        private StaticWeb staticWeb;

        private DataList(Builder builder) {
            this.cloudDB = builder.cloudDB;
            this.cloudFunction = builder.cloudFunction;
            this.cloudStorage = builder.cloudStorage;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.staticWeb = builder.staticWeb;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return cloudDB
         */
        public CloudDB getCloudDB() {
            return this.cloudDB;
        }

        /**
         * @return cloudFunction
         */
        public CloudFunction getCloudFunction() {
            return this.cloudFunction;
        }

        /**
         * @return cloudStorage
         */
        public CloudStorage getCloudStorage() {
            return this.cloudStorage;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return staticWeb
         */
        public StaticWeb getStaticWeb() {
            return this.staticWeb;
        }

        public static final class Builder {
            private CloudDB cloudDB; 
            private CloudFunction cloudFunction; 
            private CloudStorage cloudStorage; 
            private String endTime; 
            private String startTime; 
            private StaticWeb staticWeb; 

            /**
             * CloudDB.
             */
            public Builder cloudDB(CloudDB cloudDB) {
                this.cloudDB = cloudDB;
                return this;
            }

            /**
             * CloudFunction.
             */
            public Builder cloudFunction(CloudFunction cloudFunction) {
                this.cloudFunction = cloudFunction;
                return this;
            }

            /**
             * CloudStorage.
             */
            public Builder cloudStorage(CloudStorage cloudStorage) {
                this.cloudStorage = cloudStorage;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StaticWeb.
             */
            public Builder staticWeb(StaticWeb staticWeb) {
                this.staticWeb = staticWeb;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    public static class Paginator extends TeaModel {
        @NameInMap("PageCount")
        private Long pageCount;

        @NameInMap("PageNum")
        private Long pageNum;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Total")
        private Long total;

        private Paginator(Builder builder) {
            this.pageCount = builder.pageCount;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paginator create() {
            return builder().build();
        }

        /**
         * @return pageCount
         */
        public Long getPageCount() {
            return this.pageCount;
        }

        /**
         * @return pageNum
         */
        public Long getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long pageCount; 
            private Long pageNum; 
            private Long pageSize; 
            private Long total; 

            /**
             * PageCount.
             */
            public Builder pageCount(Long pageCount) {
                this.pageCount = pageCount;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Long pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Paginator build() {
                return new Paginator(this);
            } 

        } 

    }
}
