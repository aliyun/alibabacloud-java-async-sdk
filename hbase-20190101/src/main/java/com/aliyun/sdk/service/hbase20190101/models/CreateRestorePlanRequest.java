// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link CreateRestorePlanRequest} extends {@link RequestModel}
 *
 * <p>CreateRestorePlanRequest</p>
 */
public class CreateRestorePlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreAllTable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean restoreAllTable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreByCopy")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean restoreByCopy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreToDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String restoreToDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tables")
    private String tables;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetClusterId;

    private CreateRestorePlanRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.restoreAllTable = builder.restoreAllTable;
        this.restoreByCopy = builder.restoreByCopy;
        this.restoreToDate = builder.restoreToDate;
        this.tables = builder.tables;
        this.targetClusterId = builder.targetClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRestorePlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return restoreAllTable
     */
    public Boolean getRestoreAllTable() {
        return this.restoreAllTable;
    }

    /**
     * @return restoreByCopy
     */
    public Boolean getRestoreByCopy() {
        return this.restoreByCopy;
    }

    /**
     * @return restoreToDate
     */
    public String getRestoreToDate() {
        return this.restoreToDate;
    }

    /**
     * @return tables
     */
    public String getTables() {
        return this.tables;
    }

    /**
     * @return targetClusterId
     */
    public String getTargetClusterId() {
        return this.targetClusterId;
    }

    public static final class Builder extends Request.Builder<CreateRestorePlanRequest, Builder> {
        private String clusterId; 
        private Boolean restoreAllTable; 
        private Boolean restoreByCopy; 
        private String restoreToDate; 
        private String tables; 
        private String targetClusterId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRestorePlanRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.restoreAllTable = request.restoreAllTable;
            this.restoreByCopy = request.restoreByCopy;
            this.restoreToDate = request.restoreToDate;
            this.tables = request.tables;
            this.targetClusterId = request.targetClusterId;
        } 

        /**
         * <p>The ID of the ApsaraDB for HBase Performance-enhanced Edition cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp150tns0sjxs****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to restore all tables. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Restores all tables in the ApsaraDB for HBase Performance-enhanced Edition cluster.</li>
         * <li><strong>false</strong>: Does not restore all tables in the ApsaraDB for HBase Performance-enhanced Edition cluster.</li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is set to <strong>true</strong>, the <strong>Tables</strong> parameter is invalid. If this parameter is set to <strong>false</strong>, the <strong>Tables</strong> parameter is required.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder restoreAllTable(Boolean restoreAllTable) {
            this.putQueryParameter("RestoreAllTable", restoreAllTable);
            this.restoreAllTable = restoreAllTable;
            return this;
        }

        /**
         * <p>Specifies whether to restore data by using the copy method. Set the value to <strong>true</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder restoreByCopy(Boolean restoreByCopy) {
            this.putQueryParameter("RestoreByCopy", restoreByCopy);
            this.restoreByCopy = restoreByCopy;
            return this;
        }

        /**
         * <p>The point in time to which you want to restore data. The point in time must be within the recoverable time range. You can call the <a href="https://help.aliyun.com/document_detail/188365.html">DescribeRecoverableTimeRange</a> operation to query the recoverable time range.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-05T05:49:42Z</p>
         */
        public Builder restoreToDate(String restoreToDate) {
            this.putQueryParameter("RestoreToDate", restoreToDate);
            this.restoreToDate = restoreToDate;
            return this;
        }

        /**
         * <p>The table names. Specify one table name per line. Wildcards (*) are not supported.</p>
         * <ul>
         * <li>To restore to the current table, use the format: <code>namespace:table</code>. Example: <code>default:testTable</code>.</li>
         * <li>To restore to a different table, use the format: <code>namespace:table/namespace:table2</code>. Example: <code>default:testTable/default:testTable2</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test_ns:test_table/test_ns:test_table2</p>
         */
        public Builder tables(String tables) {
            this.putQueryParameter("Tables", tables);
            this.tables = tables;
            return this;
        }

        /**
         * <p>The ID of the ApsaraDB for HBase Performance-enhanced Edition cluster to which data is restored. You can also restore data to the cluster that is currently backed up.</p>
         * <blockquote>
         * <p>The specified ApsaraDB for HBase Performance-enhanced Edition cluster and the backed-up ApsaraDB for HBase Performance-enhanced Edition cluster must meet the following requirements:<ul></p>
         * </blockquote>
         * <li>They are of the same version.</li>
         * <li>They are in the same region.</li>
         * <li>They are associated with the BDS cluster.</li></ul>.
         * 
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp169l540vc6c****</p>
         */
        public Builder targetClusterId(String targetClusterId) {
            this.putQueryParameter("TargetClusterId", targetClusterId);
            this.targetClusterId = targetClusterId;
            return this;
        }

        @Override
        public CreateRestorePlanRequest build() {
            return new CreateRestorePlanRequest(this);
        } 

    } 

}
