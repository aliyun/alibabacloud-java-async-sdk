// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDasProServiceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetDasProServiceUsageResponseBody</p>
 */
public class GetDasProServiceUsageResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDasProServiceUsageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDasProServiceUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
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
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDasProServiceUsageResponseBody build() {
            return new GetDasProServiceUsageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("commodityInstanceId")
        private String commodityInstanceId;

        @NameInMap("engine")
        private String engine;

        @NameInMap("expireTime")
        private Long expireTime;

        @NameInMap("instanceAlias")
        private String instanceAlias;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("ip")
        private String ip;

        @NameInMap("isSpare")
        private Boolean isSpare;

        @NameInMap("migrationPredictRemainingTime")
        private Long migrationPredictRemainingTime;

        @NameInMap("port")
        private Integer port;

        @NameInMap("region")
        private String region;

        @NameInMap("serviceUnitId")
        private String serviceUnitId;

        @NameInMap("sqlRetention")
        private String sqlRetention;

        @NameInMap("startTime")
        private Long startTime;

        @NameInMap("storageFreeQuotaInMB")
        private Double storageFreeQuotaInMB;

        @NameInMap("storageUsed")
        private Long storageUsed;

        @NameInMap("userId")
        private String userId;

        @NameInMap("vpcId")
        private String vpcId;

        private Data(Builder builder) {
            this.commodityInstanceId = builder.commodityInstanceId;
            this.engine = builder.engine;
            this.expireTime = builder.expireTime;
            this.instanceAlias = builder.instanceAlias;
            this.instanceId = builder.instanceId;
            this.ip = builder.ip;
            this.isSpare = builder.isSpare;
            this.migrationPredictRemainingTime = builder.migrationPredictRemainingTime;
            this.port = builder.port;
            this.region = builder.region;
            this.serviceUnitId = builder.serviceUnitId;
            this.sqlRetention = builder.sqlRetention;
            this.startTime = builder.startTime;
            this.storageFreeQuotaInMB = builder.storageFreeQuotaInMB;
            this.storageUsed = builder.storageUsed;
            this.userId = builder.userId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return commodityInstanceId
         */
        public String getCommodityInstanceId() {
            return this.commodityInstanceId;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceAlias
         */
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return isSpare
         */
        public Boolean getIsSpare() {
            return this.isSpare;
        }

        /**
         * @return migrationPredictRemainingTime
         */
        public Long getMigrationPredictRemainingTime() {
            return this.migrationPredictRemainingTime;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return serviceUnitId
         */
        public String getServiceUnitId() {
            return this.serviceUnitId;
        }

        /**
         * @return sqlRetention
         */
        public String getSqlRetention() {
            return this.sqlRetention;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return storageFreeQuotaInMB
         */
        public Double getStorageFreeQuotaInMB() {
            return this.storageFreeQuotaInMB;
        }

        /**
         * @return storageUsed
         */
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String commodityInstanceId; 
            private String engine; 
            private Long expireTime; 
            private String instanceAlias; 
            private String instanceId; 
            private String ip; 
            private Boolean isSpare; 
            private Long migrationPredictRemainingTime; 
            private Integer port; 
            private String region; 
            private String serviceUnitId; 
            private String sqlRetention; 
            private Long startTime; 
            private Double storageFreeQuotaInMB; 
            private Long storageUsed; 
            private String userId; 
            private String vpcId; 

            /**
             * The ID of the DAS Professional Edition instance.
             */
            public Builder commodityInstanceId(String commodityInstanceId) {
                this.commodityInstanceId = commodityInstanceId;
                return this;
            }

            /**
             * The type of the database engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The point of time when DAS Professional Edition for the database instance expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The name of the database instance.
             */
            public Builder instanceAlias(String instanceAlias) {
                this.instanceAlias = instanceAlias;
                return this;
            }

            /**
             * The database instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The endpoint of the database instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Indicates whether DAS Professional Edition for the database instance has expired. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isSpare(Boolean isSpare) {
                this.isSpare = isSpare;
                return this;
            }

            /**
             * The estimated remaining time for migrating the data generated by the SQL Explorer and Audit feature from the previous version to the new version. Unit: milliseconds.
             * <p>
             * 
             * >  This parameter is returned only when the SQL Explorer and Audit feature is migrated from the previous version to the new version.
             */
            public Builder migrationPredictRemainingTime(Long migrationPredictRemainingTime) {
                this.migrationPredictRemainingTime = migrationPredictRemainingTime;
                return this;
            }

            /**
             * The port number that is used to connect to the database instance.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The region in which the database instance resides.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The service unit ID.
             */
            public Builder serviceUnitId(String serviceUnitId) {
                this.serviceUnitId = serviceUnitId;
                return this;
            }

            /**
             * The storage duration of SQL Explorer data. Unit: days.
             */
            public Builder sqlRetention(String sqlRetention) {
                this.sqlRetention = sqlRetention;
                return this;
            }

            /**
             * The time when DAS Professional Edition was enabled for the database instance. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The SQL Explorer storage space that is offered free-of-charge. Unit: MB.
             */
            public Builder storageFreeQuotaInMB(Double storageFreeQuotaInMB) {
                this.storageFreeQuotaInMB = storageFreeQuotaInMB;
                return this;
            }

            /**
             * The storage usage of SQL Explorer of the database instance. Unit: bytes.
             */
            public Builder storageUsed(Long storageUsed) {
                this.storageUsed = storageUsed;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to create the database instance.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The virtual private cloud (VPC) ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
