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
 * {@link UpsertQualityArchiveTableRequest} extends {@link RequestModel}
 *
 * <p>UpsertQualityArchiveTableRequest</p>
 */
public class UpsertQualityArchiveTableRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpsertCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpsertCommand upsertCommand;

    private UpsertQualityArchiveTableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.upsertCommand = builder.upsertCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertQualityArchiveTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return upsertCommand
     */
    public UpsertCommand getUpsertCommand() {
        return this.upsertCommand;
    }

    public static final class Builder extends Request.Builder<UpsertQualityArchiveTableRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private UpsertCommand upsertCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpsertQualityArchiveTableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.upsertCommand = request.upsertCommand;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>The upsert command.</p>
         * <p>This parameter is required.</p>
         */
        public Builder upsertCommand(UpsertCommand upsertCommand) {
            String upsertCommandShrink = shrink(upsertCommand, "UpsertCommand", "json");
            this.putBodyParameter("UpsertCommand", upsertCommandShrink);
            this.upsertCommand = upsertCommand;
            return this;
        }

        @Override
        public UpsertQualityArchiveTableRequest build() {
            return new UpsertQualityArchiveTableRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpsertQualityArchiveTableRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityArchiveTableRequest</p>
     */
    public static class UpsertCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddMode")
        private String addMode;

        @com.aliyun.core.annotation.NameInMap("ArchiveTableId")
        private Long archiveTableId;

        @com.aliyun.core.annotation.NameInMap("ExistTableName")
        private String existTableName;

        @com.aliyun.core.annotation.NameInMap("Lifecycle")
        private Integer lifecycle;

        @com.aliyun.core.annotation.NameInMap("MaxArchiveCount")
        private Long maxArchiveCount;

        @com.aliyun.core.annotation.NameInMap("NewTableNamePrefix")
        private String newTableNamePrefix;

        @com.aliyun.core.annotation.NameInMap("SetActive")
        private Boolean setActive;

        @com.aliyun.core.annotation.NameInMap("WatchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long watchId;

        private UpsertCommand(Builder builder) {
            this.addMode = builder.addMode;
            this.archiveTableId = builder.archiveTableId;
            this.existTableName = builder.existTableName;
            this.lifecycle = builder.lifecycle;
            this.maxArchiveCount = builder.maxArchiveCount;
            this.newTableNamePrefix = builder.newTableNamePrefix;
            this.setActive = builder.setActive;
            this.watchId = builder.watchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpsertCommand create() {
            return builder().build();
        }

        /**
         * @return addMode
         */
        public String getAddMode() {
            return this.addMode;
        }

        /**
         * @return archiveTableId
         */
        public Long getArchiveTableId() {
            return this.archiveTableId;
        }

        /**
         * @return existTableName
         */
        public String getExistTableName() {
            return this.existTableName;
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

        /**
         * @return newTableNamePrefix
         */
        public String getNewTableNamePrefix() {
            return this.newTableNamePrefix;
        }

        /**
         * @return setActive
         */
        public Boolean getSetActive() {
            return this.setActive;
        }

        /**
         * @return watchId
         */
        public Long getWatchId() {
            return this.watchId;
        }

        public static final class Builder {
            private String addMode; 
            private Long archiveTableId; 
            private String existTableName; 
            private Integer lifecycle; 
            private Long maxArchiveCount; 
            private String newTableNamePrefix; 
            private Boolean setActive; 
            private Long watchId; 

            private Builder() {
            } 

            private Builder(UpsertCommand model) {
                this.addMode = model.addMode;
                this.archiveTableId = model.archiveTableId;
                this.existTableName = model.existTableName;
                this.lifecycle = model.lifecycle;
                this.maxArchiveCount = model.maxArchiveCount;
                this.newTableNamePrefix = model.newTableNamePrefix;
                this.setActive = model.setActive;
                this.watchId = model.watchId;
            } 

            /**
             * <p>The mode for adding the archived table. Valid values:</p>
             * <ul>
             * <li>CREATE_NEW_TABLE: creates a new table.</li>
             * <li>BIND_EXIST_TABLE: binds an existing table.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATE_NEW_TABLE</p>
             */
            public Builder addMode(String addMode) {
                this.addMode = addMode;
                return this;
            }

            /**
             * <p>The ID of the archived table. If this parameter is specified, the operation runs in update mode, and you cannot specify AddMode or NewTableNamePrefix. If this parameter is not specified, the operation runs in create mode.</p>
             * 
             * <strong>example:</strong>
             * <p>88012</p>
             */
            public Builder archiveTableId(Long archiveTableId) {
                this.archiveTableId = archiveTableId;
                return this;
            }

            /**
             * <p>The name of the existing table. This parameter is required when AddMode is set to BIND_EXIST_TABLE. For Dataphin tables, use the format &quot;project_name.table_name&quot; (for example, dataphin03.ads_region_order_summary). For datasource tables, use the format &quot;database/schema.table_name&quot; (for example, order_db.order_exception_data). The table must belong to the same project or datasource as the monitored object, and the table schema must contain system fields with the dataphin_quality_ prefix.</p>
             * 
             * <strong>example:</strong>
             * <p>dataphin03.ads_region_order_summary</p>
             */
            public Builder existTableName(String existTableName) {
                this.existTableName = existTableName;
                return this;
            }

            /**
             * <p>The lifecycle of the table, in days. The value must be a positive integer. If this parameter is not specified, no lifecycle is set. This parameter is valid only when creating a new table or in edit pattern, and only when the table belongs to MaxCompute, Hadoop series, or Hive. This parameter cannot be specified when AddMode is set to BIND_EXIST_TABLE.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder lifecycle(Integer lifecycle) {
                this.lifecycle = lifecycle;
                return this;
            }

            /**
             * <p>The maximum number of archived rows. A positive integer specifies the limit on the number of archived rows. The console provides options of 10,000, 100,000, and 500,000. A value of -1 indicates full archiving. Default value: 10000. This parameter is supported only for MaxCompute, Hadoop series, or Hive.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder maxArchiveCount(Long maxArchiveCount) {
                this.maxArchiveCount = maxArchiveCount;
                return this;
            }

            /**
             * <p>The table name prefix for the new archived table. This parameter is required when AddMode is set to CREATE_NEW_TABLE. The system automatically appends the _exception_data suffix. For example, if you specify vip_user_tips112, the actual table name is vip_user_tips112_exception_data.</p>
             * 
             * <strong>example:</strong>
             * <p>vip_user_tips112</p>
             */
            public Builder newTableNamePrefix(String newTableNamePrefix) {
                this.newTableNamePrefix = newTableNamePrefix;
                return this;
            }

            /**
             * <p>Specifies whether to set the archived table as the active table. Only the value true is supported. After the table is set as active, the previously active table under the same monitored object is automatically deactivated (only one active table is allowed at a time). If you set this parameter to false, an InvalidParameter error is returned. If this parameter is not specified, the default value true is used. If this parameter is left empty, the active status remains unchanged.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder setActive(Boolean setActive) {
                this.setActive = setActive;
                return this;
            }

            /**
             * <p>The ID of the monitored object to which the archived table belongs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder watchId(Long watchId) {
                this.watchId = watchId;
                return this;
            }

            public UpsertCommand build() {
                return new UpsertCommand(this);
            } 

        } 

    }
}
