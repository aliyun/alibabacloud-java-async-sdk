// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMigrationJobDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeMigrationJobDetailRequest</p>
 */
public class DescribeMigrationJobDetailRequest extends Request {
    @Query
    @NameInMap("MigrationMode")
    private MigrationMode migrationMode;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("MigrationJobId")
    @Validation(required = true)
    private String migrationJobId;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    private DescribeMigrationJobDetailRequest(Builder builder) {
        super(builder);
        this.migrationMode = builder.migrationMode;
        this.clientToken = builder.clientToken;
        this.migrationJobId = builder.migrationJobId;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrationJobDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return migrationMode
     */
    public MigrationMode getMigrationMode() {
        return this.migrationMode;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return migrationJobId
     */
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeMigrationJobDetailRequest, Builder> {
        private MigrationMode migrationMode; 
        private String clientToken; 
        private String migrationJobId; 
        private String ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMigrationJobDetailRequest request) {
            super(request);
            this.migrationMode = request.migrationMode;
            this.clientToken = request.clientToken;
            this.migrationJobId = request.migrationJobId;
            this.ownerId = request.ownerId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * MigrationMode.
         */
        public Builder migrationMode(MigrationMode migrationMode) {
            this.putQueryParameter("MigrationMode", migrationMode);
            this.migrationMode = migrationMode;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * MigrationJobId.
         */
        public Builder migrationJobId(String migrationJobId) {
            this.putQueryParameter("MigrationJobId", migrationJobId);
            this.migrationJobId = migrationJobId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeMigrationJobDetailRequest build() {
            return new DescribeMigrationJobDetailRequest(this);
        } 

    } 

    public static class MigrationMode extends TeaModel {
        @NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private MigrationMode(Builder builder) {
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.structureInitialization = builder.structureInitialization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationMode create() {
            return builder().build();
        }

        /**
         * @return dataInitialization
         */
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        /**
         * @return dataSynchronization
         */
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        /**
         * @return structureInitialization
         */
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

        public static final class Builder {
            private Boolean dataInitialization; 
            private Boolean dataSynchronization; 
            private Boolean structureInitialization; 

            /**
             * DataInitialization.
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * DataSynchronization.
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * StructureInitialization.
             */
            public Builder structureInitialization(Boolean structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            public MigrationMode build() {
                return new MigrationMode(this);
            } 

        } 

    }
}
