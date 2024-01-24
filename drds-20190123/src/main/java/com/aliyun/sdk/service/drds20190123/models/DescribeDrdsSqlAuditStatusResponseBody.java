// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsSqlAuditStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsSqlAuditStatusResponseBody</p>
 */
public class DescribeDrdsSqlAuditStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeDrdsSqlAuditStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsSqlAuditStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String requestId; 
        private Boolean success; 

        /**
         * The returned data set.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * The result of the request.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDrdsSqlAuditStatusResponseBody build() {
            return new DescribeDrdsSqlAuditStatusResponseBody(this);
        } 

    } 

    public static class DataData extends TeaModel {
        @NameInMap("DbName")
        private String dbName;

        @NameInMap("Detailed")
        private String detailed;

        @NameInMap("Enabled")
        private String enabled;

        @NameInMap("ExtraAliUid")
        private Long extraAliUid;

        @NameInMap("ExtraSlsLogStore")
        private String extraSlsLogStore;

        @NameInMap("ExtraSlsProject")
        private String extraSlsProject;

        @NameInMap("ExtraWriteEnabled")
        private Boolean extraWriteEnabled;

        private DataData(Builder builder) {
            this.dbName = builder.dbName;
            this.detailed = builder.detailed;
            this.enabled = builder.enabled;
            this.extraAliUid = builder.extraAliUid;
            this.extraSlsLogStore = builder.extraSlsLogStore;
            this.extraSlsProject = builder.extraSlsProject;
            this.extraWriteEnabled = builder.extraWriteEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return detailed
         */
        public String getDetailed() {
            return this.detailed;
        }

        /**
         * @return enabled
         */
        public String getEnabled() {
            return this.enabled;
        }

        /**
         * @return extraAliUid
         */
        public Long getExtraAliUid() {
            return this.extraAliUid;
        }

        /**
         * @return extraSlsLogStore
         */
        public String getExtraSlsLogStore() {
            return this.extraSlsLogStore;
        }

        /**
         * @return extraSlsProject
         */
        public String getExtraSlsProject() {
            return this.extraSlsProject;
        }

        /**
         * @return extraWriteEnabled
         */
        public Boolean getExtraWriteEnabled() {
            return this.extraWriteEnabled;
        }

        public static final class Builder {
            private String dbName; 
            private String detailed; 
            private String enabled; 
            private Long extraAliUid; 
            private String extraSlsLogStore; 
            private String extraSlsProject; 
            private Boolean extraWriteEnabled; 

            /**
             * The name of the database.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * Indicates whether the complete report of the SQL audit is supported. Valid values: true and false.
             */
            public Builder detailed(String detailed) {
                this.detailed = detailed;
                return this;
            }

            /**
             * Indicates whether the SQL audit feature is enabled for the database. Valid values: true and false.
             */
            public Builder enabled(String enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The UID of the external delivery.
             * <p>
             * 
             * > This parameter is returned only if external log delivery is enabled.
             */
            public Builder extraAliUid(Long extraAliUid) {
                this.extraAliUid = extraAliUid;
                return this;
            }

            /**
             * The Log Service Logstore from which logs are delivered.
             * <p>
             * 
             * > This parameter is returned only if external log delivery is enabled.
             */
            public Builder extraSlsLogStore(String extraSlsLogStore) {
                this.extraSlsLogStore = extraSlsLogStore;
                return this;
            }

            /**
             * The Log Service project from which logs are delivered.
             * <p>
             * 
             * > This parameter is returned only if external log delivery is enabled.
             */
            public Builder extraSlsProject(String extraSlsProject) {
                this.extraSlsProject = extraSlsProject;
                return this;
            }

            /**
             * Indicates whether external log delivery is enabled. Valid values: true and false.
             */
            public Builder extraWriteEnabled(Boolean extraWriteEnabled) {
                this.extraWriteEnabled = extraWriteEnabled;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Data")
        private java.util.List < DataData> data;

        private Data(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < DataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List < DataData> data; 

            /**
             * The returned data set.
             */
            public Builder data(java.util.List < DataData> data) {
                this.data = data;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
