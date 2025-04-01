// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeSqlAuditStatResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSqlAuditStatResponseBody</p>
 */
public class DescribeSqlAuditStatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSqlAuditStatResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlAuditStatResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSqlAuditStatResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSqlAuditStatResponseBody build() {
            return new DescribeSqlAuditStatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSqlAuditStatResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlAuditStatResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectRows")
        private Double affectRows;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private Double executeTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OperatorType")
        private String operatorType;

        @com.aliyun.core.annotation.NameInMap("ReturnRows")
        private Double returnRows;

        @com.aliyun.core.annotation.NameInMap("ScanRows")
        private Double scanRows;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlStatement")
        private String sqlStatement;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TotalAffectRows")
        private Long totalAffectRows;

        @com.aliyun.core.annotation.NameInMap("TotalFailed")
        private Long totalFailed;

        @com.aliyun.core.annotation.NameInMap("TotalReturnRows")
        private Long totalReturnRows;

        @com.aliyun.core.annotation.NameInMap("TotalScanRows")
        private Long totalScanRows;

        @com.aliyun.core.annotation.NameInMap("TotalSucceed")
        private Long totalSucceed;

        @com.aliyun.core.annotation.NameInMap("UserClientIp")
        private String userClientIp;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Data(Builder builder) {
            this.affectRows = builder.affectRows;
            this.databaseName = builder.databaseName;
            this.executeTime = builder.executeTime;
            this.instanceId = builder.instanceId;
            this.operatorType = builder.operatorType;
            this.returnRows = builder.returnRows;
            this.scanRows = builder.scanRows;
            this.sqlId = builder.sqlId;
            this.sqlStatement = builder.sqlStatement;
            this.tenantId = builder.tenantId;
            this.totalAffectRows = builder.totalAffectRows;
            this.totalFailed = builder.totalFailed;
            this.totalReturnRows = builder.totalReturnRows;
            this.totalScanRows = builder.totalScanRows;
            this.totalSucceed = builder.totalSucceed;
            this.userClientIp = builder.userClientIp;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return affectRows
         */
        public Double getAffectRows() {
            return this.affectRows;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return executeTime
         */
        public Double getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return operatorType
         */
        public String getOperatorType() {
            return this.operatorType;
        }

        /**
         * @return returnRows
         */
        public Double getReturnRows() {
            return this.returnRows;
        }

        /**
         * @return scanRows
         */
        public Double getScanRows() {
            return this.scanRows;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlStatement
         */
        public String getSqlStatement() {
            return this.sqlStatement;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return totalAffectRows
         */
        public Long getTotalAffectRows() {
            return this.totalAffectRows;
        }

        /**
         * @return totalFailed
         */
        public Long getTotalFailed() {
            return this.totalFailed;
        }

        /**
         * @return totalReturnRows
         */
        public Long getTotalReturnRows() {
            return this.totalReturnRows;
        }

        /**
         * @return totalScanRows
         */
        public Long getTotalScanRows() {
            return this.totalScanRows;
        }

        /**
         * @return totalSucceed
         */
        public Long getTotalSucceed() {
            return this.totalSucceed;
        }

        /**
         * @return userClientIp
         */
        public String getUserClientIp() {
            return this.userClientIp;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Double affectRows; 
            private String databaseName; 
            private Double executeTime; 
            private String instanceId; 
            private String operatorType; 
            private Double returnRows; 
            private Double scanRows; 
            private String sqlId; 
            private String sqlStatement; 
            private String tenantId; 
            private Long totalAffectRows; 
            private Long totalFailed; 
            private Long totalReturnRows; 
            private Long totalScanRows; 
            private Long totalSucceed; 
            private String userClientIp; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.affectRows = model.affectRows;
                this.databaseName = model.databaseName;
                this.executeTime = model.executeTime;
                this.instanceId = model.instanceId;
                this.operatorType = model.operatorType;
                this.returnRows = model.returnRows;
                this.scanRows = model.scanRows;
                this.sqlId = model.sqlId;
                this.sqlStatement = model.sqlStatement;
                this.tenantId = model.tenantId;
                this.totalAffectRows = model.totalAffectRows;
                this.totalFailed = model.totalFailed;
                this.totalReturnRows = model.totalReturnRows;
                this.totalScanRows = model.totalScanRows;
                this.totalSucceed = model.totalSucceed;
                this.userClientIp = model.userClientIp;
                this.userName = model.userName;
            } 

            /**
             * AffectRows.
             */
            public Builder affectRows(Double affectRows) {
                this.affectRows = affectRows;
                return this;
            }

            /**
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * ExecuteTime.
             */
            public Builder executeTime(Double executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * OperatorType.
             */
            public Builder operatorType(String operatorType) {
                this.operatorType = operatorType;
                return this;
            }

            /**
             * ReturnRows.
             */
            public Builder returnRows(Double returnRows) {
                this.returnRows = returnRows;
                return this;
            }

            /**
             * ScanRows.
             */
            public Builder scanRows(Double scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * <p>Sql ID</p>
             * 
             * <strong>example:</strong>
             * <p>8D6E84<strong><strong>0B8FB1823D199E2CA1</strong></strong></p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * SqlStatement.
             */
            public Builder sqlStatement(String sqlStatement) {
                this.sqlStatement = sqlStatement;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * TotalAffectRows.
             */
            public Builder totalAffectRows(Long totalAffectRows) {
                this.totalAffectRows = totalAffectRows;
                return this;
            }

            /**
             * TotalFailed.
             */
            public Builder totalFailed(Long totalFailed) {
                this.totalFailed = totalFailed;
                return this;
            }

            /**
             * TotalReturnRows.
             */
            public Builder totalReturnRows(Long totalReturnRows) {
                this.totalReturnRows = totalReturnRows;
                return this;
            }

            /**
             * TotalScanRows.
             */
            public Builder totalScanRows(Long totalScanRows) {
                this.totalScanRows = totalScanRows;
                return this;
            }

            /**
             * TotalSucceed.
             */
            public Builder totalSucceed(Long totalSucceed) {
                this.totalSucceed = totalSucceed;
                return this;
            }

            /**
             * UserClientIp.
             */
            public Builder userClientIp(String userClientIp) {
                this.userClientIp = userClientIp;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
