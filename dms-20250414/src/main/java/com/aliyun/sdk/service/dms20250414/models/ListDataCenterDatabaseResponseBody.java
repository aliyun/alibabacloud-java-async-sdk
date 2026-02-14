// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListDataCenterDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataCenterDatabaseResponseBody</p>
 */
public class ListDataCenterDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataCenterDatabaseResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataCenterDatabaseResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDataCenterDatabaseResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
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

        public ListDataCenterDatabaseResponseBody build() {
            return new ListDataCenterDatabaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataCenterDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataCenterDatabaseResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseDesc")
        private String databaseDesc;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private String dbId;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("DescUpdateTime")
        private String descUpdateTime;

        @com.aliyun.core.annotation.NameInMap("DmsDbId")
        private Long dmsDbId;

        @com.aliyun.core.annotation.NameInMap("DmsInstanceId")
        private Long dmsInstanceId;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("ImportType")
        private String importType;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("IsInternal")
        private String isInternal;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private Data(Builder builder) {
            this.databaseDesc = builder.databaseDesc;
            this.databaseName = builder.databaseName;
            this.dbId = builder.dbId;
            this.dbType = builder.dbType;
            this.descUpdateTime = builder.descUpdateTime;
            this.dmsDbId = builder.dmsDbId;
            this.dmsInstanceId = builder.dmsInstanceId;
            this.gmtCreated = builder.gmtCreated;
            this.importType = builder.importType;
            this.instanceName = builder.instanceName;
            this.isInternal = builder.isInternal;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return databaseDesc
         */
        public String getDatabaseDesc() {
            return this.databaseDesc;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return dbId
         */
        public String getDbId() {
            return this.dbId;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return descUpdateTime
         */
        public String getDescUpdateTime() {
            return this.descUpdateTime;
        }

        /**
         * @return dmsDbId
         */
        public Long getDmsDbId() {
            return this.dmsDbId;
        }

        /**
         * @return dmsInstanceId
         */
        public Long getDmsInstanceId() {
            return this.dmsInstanceId;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return importType
         */
        public String getImportType() {
            return this.importType;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return isInternal
         */
        public String getIsInternal() {
            return this.isInternal;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String databaseDesc; 
            private String databaseName; 
            private String dbId; 
            private String dbType; 
            private String descUpdateTime; 
            private Long dmsDbId; 
            private Long dmsInstanceId; 
            private String gmtCreated; 
            private String importType; 
            private String instanceName; 
            private String isInternal; 
            private Long size; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.databaseDesc = model.databaseDesc;
                this.databaseName = model.databaseName;
                this.dbId = model.dbId;
                this.dbType = model.dbType;
                this.descUpdateTime = model.descUpdateTime;
                this.dmsDbId = model.dmsDbId;
                this.dmsInstanceId = model.dmsInstanceId;
                this.gmtCreated = model.gmtCreated;
                this.importType = model.importType;
                this.instanceName = model.instanceName;
                this.isInternal = model.isInternal;
                this.size = model.size;
            } 

            /**
             * DatabaseDesc.
             */
            public Builder databaseDesc(String databaseDesc) {
                this.databaseDesc = databaseDesc;
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
             * DbId.
             */
            public Builder dbId(String dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * DescUpdateTime.
             */
            public Builder descUpdateTime(String descUpdateTime) {
                this.descUpdateTime = descUpdateTime;
                return this;
            }

            /**
             * DmsDbId.
             */
            public Builder dmsDbId(Long dmsDbId) {
                this.dmsDbId = dmsDbId;
                return this;
            }

            /**
             * DmsInstanceId.
             */
            public Builder dmsInstanceId(Long dmsInstanceId) {
                this.dmsInstanceId = dmsInstanceId;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * ImportType.
             */
            public Builder importType(String importType) {
                this.importType = importType;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * IsInternal.
             */
            public Builder isInternal(String isInternal) {
                this.isInternal = isInternal;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
