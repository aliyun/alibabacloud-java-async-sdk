// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeDrdsSqlAuditStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsSqlAuditStatusResponseBody</p>
 */
public class DescribeDrdsSqlAuditStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The returned data set.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DC3ABA3E-0F8A-4596-9104-F5155C******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDrdsSqlAuditStatusResponseBody build() {
            return new DescribeDrdsSqlAuditStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsSqlAuditStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsSqlAuditStatusResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("Detailed")
        private String detailed;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private String enabled;

        @com.aliyun.core.annotation.NameInMap("ExtraAliUid")
        private Long extraAliUid;

        @com.aliyun.core.annotation.NameInMap("ExtraSlsLogStore")
        private String extraSlsLogStore;

        @com.aliyun.core.annotation.NameInMap("ExtraSlsProject")
        private String extraSlsProject;

        @com.aliyun.core.annotation.NameInMap("ExtraWriteEnabled")
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
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>Indicates whether the complete report of the SQL audit is supported. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder detailed(String detailed) {
                this.detailed = detailed;
                return this;
            }

            /**
             * <p>Indicates whether the SQL audit feature is enabled for the database. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(String enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The UID of the external delivery.</p>
             * <blockquote>
             * <p>This parameter is returned only if external log delivery is enabled.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder extraAliUid(Long extraAliUid) {
                this.extraAliUid = extraAliUid;
                return this;
            }

            /**
             * <p>The Log Service Logstore from which logs are delivered.</p>
             * <blockquote>
             * <p>This parameter is returned only if external log delivery is enabled.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder extraSlsLogStore(String extraSlsLogStore) {
                this.extraSlsLogStore = extraSlsLogStore;
                return this;
            }

            /**
             * <p>The Log Service project from which logs are delivered.</p>
             * <blockquote>
             * <p>This parameter is returned only if external log delivery is enabled.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder extraSlsProject(String extraSlsProject) {
                this.extraSlsProject = extraSlsProject;
                return this;
            }

            /**
             * <p>Indicates whether external log delivery is enabled. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeDrdsSqlAuditStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsSqlAuditStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<DataData> data;

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
        public java.util.List<DataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<DataData> data; 

            /**
             * <p>The returned data set.</p>
             */
            public Builder data(java.util.List<DataData> data) {
                this.data = data;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
