// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link MaxComputeExportConfigurationSink} extends {@link TeaModel}
 *
 * <p>MaxComputeExportConfigurationSink</p>
 */
public class MaxComputeExportConfigurationSink extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bufferInterval")
    private String bufferInterval;

    @com.aliyun.core.annotation.NameInMap("fields")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> fields;

    @com.aliyun.core.annotation.NameInMap("filterInvalid")
    private Boolean filterInvalid;

    @com.aliyun.core.annotation.NameInMap("odpsAccessKeyId")
    @Deprecated
    private String odpsAccessKeyId;

    @com.aliyun.core.annotation.NameInMap("odpsAccessSecret")
    @Deprecated
    private String odpsAccessSecret;

    @com.aliyun.core.annotation.NameInMap("odpsEndpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String odpsEndpoint;

    @com.aliyun.core.annotation.NameInMap("odpsProject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String odpsProject;

    @com.aliyun.core.annotation.NameInMap("odpsRolearn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String odpsRolearn;

    @com.aliyun.core.annotation.NameInMap("odpsTable")
    @com.aliyun.core.annotation.Validation(required = true)
    private String odpsTable;

    @com.aliyun.core.annotation.NameInMap("odpsTunnelEndpoint")
    private String odpsTunnelEndpoint;

    @com.aliyun.core.annotation.NameInMap("partitionColumn")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> partitionColumn;

    @com.aliyun.core.annotation.NameInMap("partitionTimeFormat")
    @com.aliyun.core.annotation.Validation(required = true)
    private String partitionTimeFormat;

    @com.aliyun.core.annotation.NameInMap("timeFormatType")
    private String timeFormatType;

    @com.aliyun.core.annotation.NameInMap("timeZone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String timeZone;

    private MaxComputeExportConfigurationSink(Builder builder) {
        this.bufferInterval = builder.bufferInterval;
        this.fields = builder.fields;
        this.filterInvalid = builder.filterInvalid;
        this.odpsAccessKeyId = builder.odpsAccessKeyId;
        this.odpsAccessSecret = builder.odpsAccessSecret;
        this.odpsEndpoint = builder.odpsEndpoint;
        this.odpsProject = builder.odpsProject;
        this.odpsRolearn = builder.odpsRolearn;
        this.odpsTable = builder.odpsTable;
        this.odpsTunnelEndpoint = builder.odpsTunnelEndpoint;
        this.partitionColumn = builder.partitionColumn;
        this.partitionTimeFormat = builder.partitionTimeFormat;
        this.timeFormatType = builder.timeFormatType;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MaxComputeExportConfigurationSink create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bufferInterval
     */
    public String getBufferInterval() {
        return this.bufferInterval;
    }

    /**
     * @return fields
     */
    public java.util.List<String> getFields() {
        return this.fields;
    }

    /**
     * @return filterInvalid
     */
    public Boolean getFilterInvalid() {
        return this.filterInvalid;
    }

    /**
     * @return odpsAccessKeyId
     */
    public String getOdpsAccessKeyId() {
        return this.odpsAccessKeyId;
    }

    /**
     * @return odpsAccessSecret
     */
    public String getOdpsAccessSecret() {
        return this.odpsAccessSecret;
    }

    /**
     * @return odpsEndpoint
     */
    public String getOdpsEndpoint() {
        return this.odpsEndpoint;
    }

    /**
     * @return odpsProject
     */
    public String getOdpsProject() {
        return this.odpsProject;
    }

    /**
     * @return odpsRolearn
     */
    public String getOdpsRolearn() {
        return this.odpsRolearn;
    }

    /**
     * @return odpsTable
     */
    public String getOdpsTable() {
        return this.odpsTable;
    }

    /**
     * @return odpsTunnelEndpoint
     */
    public String getOdpsTunnelEndpoint() {
        return this.odpsTunnelEndpoint;
    }

    /**
     * @return partitionColumn
     */
    public java.util.List<String> getPartitionColumn() {
        return this.partitionColumn;
    }

    /**
     * @return partitionTimeFormat
     */
    public String getPartitionTimeFormat() {
        return this.partitionTimeFormat;
    }

    /**
     * @return timeFormatType
     */
    public String getTimeFormatType() {
        return this.timeFormatType;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder {
        private String bufferInterval; 
        private java.util.List<String> fields; 
        private Boolean filterInvalid; 
        private String odpsAccessKeyId; 
        private String odpsAccessSecret; 
        private String odpsEndpoint; 
        private String odpsProject; 
        private String odpsRolearn; 
        private String odpsTable; 
        private String odpsTunnelEndpoint; 
        private java.util.List<String> partitionColumn; 
        private String partitionTimeFormat; 
        private String timeFormatType; 
        private String timeZone; 

        private Builder() {
        } 

        private Builder(MaxComputeExportConfigurationSink model) {
            this.bufferInterval = model.bufferInterval;
            this.fields = model.fields;
            this.filterInvalid = model.filterInvalid;
            this.odpsAccessKeyId = model.odpsAccessKeyId;
            this.odpsAccessSecret = model.odpsAccessSecret;
            this.odpsEndpoint = model.odpsEndpoint;
            this.odpsProject = model.odpsProject;
            this.odpsRolearn = model.odpsRolearn;
            this.odpsTable = model.odpsTable;
            this.odpsTunnelEndpoint = model.odpsTunnelEndpoint;
            this.partitionColumn = model.partitionColumn;
            this.partitionTimeFormat = model.partitionTimeFormat;
            this.timeFormatType = model.timeFormatType;
            this.timeZone = model.timeZone;
        } 

        /**
         * bufferInterval.
         */
        public Builder bufferInterval(String bufferInterval) {
            this.bufferInterval = bufferInterval;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * filterInvalid.
         */
        public Builder filterInvalid(Boolean filterInvalid) {
            this.filterInvalid = filterInvalid;
            return this;
        }

        /**
         * odpsAccessKeyId.
         */
        public Builder odpsAccessKeyId(String odpsAccessKeyId) {
            this.odpsAccessKeyId = odpsAccessKeyId;
            return this;
        }

        /**
         * odpsAccessSecret.
         */
        public Builder odpsAccessSecret(String odpsAccessSecret) {
            this.odpsAccessSecret = odpsAccessSecret;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api">http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api</a></p>
         */
        public Builder odpsEndpoint(String odpsEndpoint) {
            this.odpsEndpoint = odpsEndpoint;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_project</p>
         */
        public Builder odpsProject(String odpsProject) {
            this.odpsProject = odpsProject;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789:role/aliyunlogdefaultrole</p>
         */
        public Builder odpsRolearn(String odpsRolearn) {
            this.odpsRolearn = odpsRolearn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_table</p>
         */
        public Builder odpsTable(String odpsTable) {
            this.odpsTable = odpsTable;
            return this;
        }

        /**
         * odpsTunnelEndpoint.
         */
        public Builder odpsTunnelEndpoint(String odpsTunnelEndpoint) {
            this.odpsTunnelEndpoint = odpsTunnelEndpoint;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder partitionColumn(java.util.List<String> partitionColumn) {
            this.partitionColumn = partitionColumn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>%Y_%m_%d</p>
         */
        public Builder partitionTimeFormat(String partitionTimeFormat) {
            this.partitionTimeFormat = partitionTimeFormat;
            return this;
        }

        /**
         * timeFormatType.
         */
        public Builder timeFormatType(String timeFormatType) {
            this.timeFormatType = timeFormatType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>+0800</p>
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public MaxComputeExportConfigurationSink build() {
            return new MaxComputeExportConfigurationSink(this);
        } 

    } 

}
