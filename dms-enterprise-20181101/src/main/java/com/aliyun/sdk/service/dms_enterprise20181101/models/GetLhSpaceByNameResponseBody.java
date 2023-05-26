// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLhSpaceByNameResponseBody} extends {@link TeaModel}
 *
 * <p>GetLhSpaceByNameResponseBody</p>
 */
public class GetLhSpaceByNameResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("LakehouseSpace")
    private LakehouseSpace lakehouseSpace;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetLhSpaceByNameResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.lakehouseSpace = builder.lakehouseSpace;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLhSpaceByNameResponseBody create() {
        return builder().build();
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
     * @return lakehouseSpace
     */
    public LakehouseSpace getLakehouseSpace() {
        return this.lakehouseSpace;
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
        private String errorCode; 
        private String errorMessage; 
        private LakehouseSpace lakehouseSpace; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code returned if the request fails.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request fails.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The workspace for data warehouse development.
         */
        public Builder lakehouseSpace(LakehouseSpace lakehouseSpace) {
            this.lakehouseSpace = lakehouseSpace;
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   **true**: The request is successful.
         * *   **false**: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetLhSpaceByNameResponseBody build() {
            return new GetLhSpaceByNameResponseBody(this);
        } 

    } 

    public static class LakehouseSpace extends TeaModel {
        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("Description")
        private String description;

        @NameInMap("DevDbId")
        private Integer devDbId;

        @NameInMap("DwDbType")
        private String dwDbType;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IsDeleted")
        private Boolean isDeleted;

        @NameInMap("Mode")
        private Integer mode;

        @NameInMap("ProdDbId")
        private Integer prodDbId;

        @NameInMap("SpaceConfig")
        private String spaceConfig;

        @NameInMap("SpaceName")
        private String spaceName;

        @NameInMap("TenantId")
        private String tenantId;

        private LakehouseSpace(Builder builder) {
            this.creatorId = builder.creatorId;
            this.description = builder.description;
            this.devDbId = builder.devDbId;
            this.dwDbType = builder.dwDbType;
            this.id = builder.id;
            this.isDeleted = builder.isDeleted;
            this.mode = builder.mode;
            this.prodDbId = builder.prodDbId;
            this.spaceConfig = builder.spaceConfig;
            this.spaceName = builder.spaceName;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LakehouseSpace create() {
            return builder().build();
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return devDbId
         */
        public Integer getDevDbId() {
            return this.devDbId;
        }

        /**
         * @return dwDbType
         */
        public String getDwDbType() {
            return this.dwDbType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isDeleted
         */
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        /**
         * @return prodDbId
         */
        public Integer getProdDbId() {
            return this.prodDbId;
        }

        /**
         * @return spaceConfig
         */
        public String getSpaceConfig() {
            return this.spaceConfig;
        }

        /**
         * @return spaceName
         */
        public String getSpaceName() {
            return this.spaceName;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String creatorId; 
            private String description; 
            private Integer devDbId; 
            private String dwDbType; 
            private Long id; 
            private Boolean isDeleted; 
            private Integer mode; 
            private Integer prodDbId; 
            private String spaceConfig; 
            private String spaceName; 
            private String tenantId; 

            /**
             * The ID of the user who creates the workspace.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The description of the workspace.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the development database.
             */
            public Builder devDbId(Integer devDbId) {
                this.devDbId = devDbId;
                return this;
            }

            /**
             * The type of the database. Valid values:
             * <p>
             * 
             * *   **14**: AnalyticDB for MySQL
             * *   **18**: AnalyticDB for PostgreSQL
             */
            public Builder dwDbType(String dwDbType) {
                this.dwDbType = dwDbType;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether the workspace is deleted. Valid values:
             * <p>
             * 
             * *   **true**: The workspace is deleted.
             * *   **false**: The workspace is not deleted.
             */
            public Builder isDeleted(Boolean isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * The mode in which the workspace runs. Valid values:
             * <p>
             * 
             * *   **0**: basic mode
             * *   **1**: standard mode
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The ID of the production database.
             */
            public Builder prodDbId(Integer prodDbId) {
                this.prodDbId = prodDbId;
                return this;
            }

            /**
             * The configuration of the workspace. Valid values:
             * <p>
             * 
             * *   **skipManualRunCheck**: No security rule check is required in the trial run phase.
             * *   **skipPublishApprove**: No approval is required for publishing and O\&M.
             */
            public Builder spaceConfig(String spaceConfig) {
                this.spaceConfig = spaceConfig;
                return this;
            }

            /**
             * The name of the workspace.
             */
            public Builder spaceName(String spaceName) {
                this.spaceName = spaceName;
                return this;
            }

            /**
             * The ID of the tenant to which the workspace belongs.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public LakehouseSpace build() {
                return new LakehouseSpace(this);
            } 

        } 

    }
}
