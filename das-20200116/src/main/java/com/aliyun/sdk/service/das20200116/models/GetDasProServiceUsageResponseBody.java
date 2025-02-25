// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetDasProServiceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetDasProServiceUsageResponseBody</p>
 */
public class GetDasProServiceUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{         &quot;storageFreeQuotaInMB&quot;: 5120,         &quot;ip&quot;: &quot;rm-2ze8g2am97624****.mysql.<strong><strong>.com&quot;,         &quot;custinsId&quot;: 12448331,         &quot;userId&quot;: &quot;196278346919</strong></strong>&quot;,         &quot;uuid&quot;: &quot;hdm_b0ae36343407609bf3e8df8709d8****&quot;,         &quot;expireTime&quot;: 1924963200000,         &quot;instanceId&quot;: &quot;rm-2ze8g2am97624****&quot;,         &quot;storageUsed&quot;: 10773752667393,         &quot;engine&quot;: &quot;MySQL&quot;,         &quot;instanceAlias&quot;: &quot;TESTDB01_PROD&quot;,         &quot;port&quot;: 3310,         &quot;vpcId&quot;: &quot;hdm_****&quot;,         &quot;commodityInstanceId&quot;: &quot;daspro-****&quot;,         &quot;startTime&quot;: 1606381940000,         &quot;isSpare&quot;: false,         &quot;region&quot;: &quot;cn-shanghai&quot;,         &quot;serviceUnitId&quot;: &quot;5&quot;,         &quot;sqlRetention&quot;: 30     }</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7172BECE-588A-5961-8126-C216E16B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDasProServiceUsageResponseBody build() {
            return new GetDasProServiceUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDasProServiceUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDasProServiceUsageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("commodityInstanceId")
        private String commodityInstanceId;

        @com.aliyun.core.annotation.NameInMap("engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("expireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("instanceAlias")
        private String instanceAlias;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("isSpare")
        private Boolean isSpare;

        @com.aliyun.core.annotation.NameInMap("migrationPredictRemainingTime")
        private Long migrationPredictRemainingTime;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("serviceUnitId")
        private String serviceUnitId;

        @com.aliyun.core.annotation.NameInMap("sqlRetention")
        private String sqlRetention;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("storageFreeQuotaInMB")
        private Double storageFreeQuotaInMB;

        @com.aliyun.core.annotation.NameInMap("storageUsed")
        private Long storageUsed;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("vpcId")
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
             * <p>The ID of the DAS Enterprise Edition instance.</p>
             * 
             * <strong>example:</strong>
             * <p>daspro-cn-v0h1l6i****</p>
             */
            public Builder commodityInstanceId(String commodityInstanceId) {
                this.commodityInstanceId = commodityInstanceId;
                return this;
            }

            /**
             * <p>The type of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The point of time when DAS Enterprise Edition for the database instance expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1648742400000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The name of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>TESTDB01</p>
             */
            public Builder instanceAlias(String instanceAlias) {
                this.instanceAlias = instanceAlias;
                return this;
            }

            /**
             * <p>The database instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze8g2am97624****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The endpoint of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze8g2am97624****.mysql.****.com</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>Indicates whether DAS Enterprise Edition for the database instance has expired. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isSpare(Boolean isSpare) {
                this.isSpare = isSpare;
                return this;
            }

            /**
             * <p>The estimated remaining time for migrating the data generated by the SQL Explorer and Audit feature from the previous version to the new version. Unit: milliseconds.</p>
             * <blockquote>
             * <p> This parameter is returned only when the SQL Explorer and Audit feature is migrated from the previous version to the new version.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>60000</p>
             */
            public Builder migrationPredictRemainingTime(Long migrationPredictRemainingTime) {
                this.migrationPredictRemainingTime = migrationPredictRemainingTime;
                return this;
            }

            /**
             * <p>The port number that is used to connect to the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The region in which the database instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The service unit ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder serviceUnitId(String serviceUnitId) {
                this.serviceUnitId = serviceUnitId;
                return this;
            }

            /**
             * <p>The storage duration of SQL Explorer data. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder sqlRetention(String sqlRetention) {
                this.sqlRetention = sqlRetention;
                return this;
            }

            /**
             * <p>The time when DAS Enterprise Edition was enabled for the database instance. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1646100892000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The SQL Explorer storage space that is offered free-of-charge. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>5120</p>
             */
            public Builder storageFreeQuotaInMB(Double storageFreeQuotaInMB) {
                this.storageFreeQuotaInMB = storageFreeQuotaInMB;
                return this;
            }

            /**
             * <p>The storage usage of SQL Explorer of the database instance. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>35903498</p>
             */
            public Builder storageUsed(Long storageUsed) {
                this.storageUsed = storageUsed;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to create the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>196278346919****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zentqj1sk4qmolci****</p>
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
