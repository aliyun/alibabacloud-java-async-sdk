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
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
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
             * AddMode.
             */
            public Builder addMode(String addMode) {
                this.addMode = addMode;
                return this;
            }

            /**
             * ArchiveTableId.
             */
            public Builder archiveTableId(Long archiveTableId) {
                this.archiveTableId = archiveTableId;
                return this;
            }

            /**
             * ExistTableName.
             */
            public Builder existTableName(String existTableName) {
                this.existTableName = existTableName;
                return this;
            }

            /**
             * Lifecycle.
             */
            public Builder lifecycle(Integer lifecycle) {
                this.lifecycle = lifecycle;
                return this;
            }

            /**
             * MaxArchiveCount.
             */
            public Builder maxArchiveCount(Long maxArchiveCount) {
                this.maxArchiveCount = maxArchiveCount;
                return this;
            }

            /**
             * NewTableNamePrefix.
             */
            public Builder newTableNamePrefix(String newTableNamePrefix) {
                this.newTableNamePrefix = newTableNamePrefix;
                return this;
            }

            /**
             * SetActive.
             */
            public Builder setActive(Boolean setActive) {
                this.setActive = setActive;
                return this;
            }

            /**
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
