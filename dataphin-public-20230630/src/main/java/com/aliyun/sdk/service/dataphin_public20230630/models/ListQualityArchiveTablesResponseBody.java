// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListQualityArchiveTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListQualityArchiveTablesResponseBody</p>
 */
public class ListQualityArchiveTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListQualityArchiveTablesResponseBody(Builder builder) {
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

    public static ListQualityArchiveTablesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListQualityArchiveTablesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result of querying the anomaly archived table list.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The backend exception details.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListQualityArchiveTablesResponseBody build() {
            return new ListQualityArchiveTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQualityArchiveTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityArchiveTablesResponseBody</p>
     */
    public static class ArchiveTableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchiveTableId")
        private Long archiveTableId;

        @com.aliyun.core.annotation.NameInMap("ArchiveTableName")
        private String archiveTableName;

        @com.aliyun.core.annotation.NameInMap("Ddl")
        private String ddl;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Lifecycle")
        private Integer lifecycle;

        @com.aliyun.core.annotation.NameInMap("MaxArchiveCount")
        private Long maxArchiveCount;

        private ArchiveTableList(Builder builder) {
            this.archiveTableId = builder.archiveTableId;
            this.archiveTableName = builder.archiveTableName;
            this.ddl = builder.ddl;
            this.isDefault = builder.isDefault;
            this.lifecycle = builder.lifecycle;
            this.maxArchiveCount = builder.maxArchiveCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArchiveTableList create() {
            return builder().build();
        }

        /**
         * @return archiveTableId
         */
        public Long getArchiveTableId() {
            return this.archiveTableId;
        }

        /**
         * @return archiveTableName
         */
        public String getArchiveTableName() {
            return this.archiveTableName;
        }

        /**
         * @return ddl
         */
        public String getDdl() {
            return this.ddl;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return lifecycle
         */
        public Integer getLifecycle() {
            return this.lifecycle;
        }

        /**
         * @return maxArchiveCount
         */
        public Long getMaxArchiveCount() {
            return this.maxArchiveCount;
        }

        public static final class Builder {
            private Long archiveTableId; 
            private String archiveTableName; 
            private String ddl; 
            private Boolean isDefault; 
            private Integer lifecycle; 
            private Long maxArchiveCount; 

            private Builder() {
            } 

            private Builder(ArchiveTableList model) {
                this.archiveTableId = model.archiveTableId;
                this.archiveTableName = model.archiveTableName;
                this.ddl = model.ddl;
                this.isDefault = model.isDefault;
                this.lifecycle = model.lifecycle;
                this.maxArchiveCount = model.maxArchiveCount;
            } 

            /**
             * <p>The ID of the archived table. This ID is used when you update, switch to active, or delete the archived table.</p>
             * 
             * <strong>example:</strong>
             * <p>7673533</p>
             */
            public Builder archiveTableId(Long archiveTableId) {
                this.archiveTableId = archiveTableId;
                return this;
            }

            /**
             * <p>The full table name in the format of project_name.table_name.</p>
             * 
             * <strong>example:</strong>
             * <p>Train.a01_reanme_exception_data</p>
             */
            public Builder archiveTableName(String archiveTableName) {
                this.archiveTableName = archiveTableName;
                return this;
            }

            /**
             * <p>The DDL statement for creating the archived table, which includes dataphin_quality_* system fields and the dataphin_quality_validate_date partition field definition.</p>
             * 
             * <strong>example:</strong>
             * <p>create table mfg_fin_cdm.a_shixin_b_exception_data\n         (  \n            dataphin_quality_tenant_id varchar(64) comment \&quot;Tenant ID\&quot;\n         , \n            dataphin_quality_rule_id varchar(64) comment \&quot;Quality rule ID\&quot;\n         , \n            dataphin_quality_rule_name string comment \&quot;Quality rule name\&quot;\n         , \n            dataphin_quality_column_name varchar(1024) comment \&quot;Validation field name\&quot;\n         , \n            dataphin_quality_watch_task_id varchar(128) comment \&quot;Monitored object task ID\&quot;\n         , \n            dataphin_quality_rule_task_id varchar(64) comment \&quot;Rule task ID\&quot;\n         , \n            dataphin_quality_validate_time varchar(64) comment \&quot;Quality validation time\&quot;\n         , \n            dataphin_quality_archive_mode varchar(32) comment \&quot;Anomaly archiving mode, ONLY_ERROR_FIELD/FULL_RECORD\&quot;\n         , \n            dataphin_quality_error_data string comment \&quot;Anomaly data\&quot;\n         , \n            执行依据文号 string comment \&quot;\&quot;\n         , \n            立案时间 string comment \&quot;\&quot;\n         , \n            案号 string comment \&quot;\&quot;\n         , \n            执行法院 string comment \&quot;\&quot;\n         , \n            性别 string comment \&quot;\&quot;\n         , \n            省份 string comment \&quot;\&quot;\n         , \n            被执行人的履行情况 string comment \&quot;\&quot;\n         , \n            发布时间 string comment \&quot;\&quot;\n         , \n            姓名 string comment \&quot;\&quot;\n         , \n            身份证号 string comment \&quot;\&quot;\n         , \n            失信被执行人行为具体情形 string comment \&quot;\&quot;\n         ) \n        partitioned by (dataphin_quality_validate_date string comment \&quot;Validation date (partition field)\&quot;)</p>
             */
            public Builder ddl(String ddl) {
                this.ddl = ddl;
                return this;
            }

            /**
             * <p>Indicates whether this is the active archived table. At least one active archived table must exist under the same monitored object.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The lifecycle in days. An empty value indicates no lifecycle is configured.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder lifecycle(Integer lifecycle) {
                this.lifecycle = lifecycle;
                return this;
            }

            /**
             * <p>The maximum number of records to archive per validation. A value of -1 indicates full archiving.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder maxArchiveCount(Long maxArchiveCount) {
                this.maxArchiveCount = maxArchiveCount;
                return this;
            }

            public ArchiveTableList build() {
                return new ArchiveTableList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQualityArchiveTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityArchiveTablesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchiveTableList")
        private java.util.List<ArchiveTableList> archiveTableList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.archiveTableList = builder.archiveTableList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return archiveTableList
         */
        public java.util.List<ArchiveTableList> getArchiveTableList() {
            return this.archiveTableList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<ArchiveTableList> archiveTableList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.archiveTableList = model.archiveTableList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of anomaly archived tables.</p>
             */
            public Builder archiveTableList(java.util.List<ArchiveTableList> archiveTableList) {
                this.archiveTableList = archiveTableList;
                return this;
            }

            /**
             * <p>The number of custom anomaly archived tables.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
