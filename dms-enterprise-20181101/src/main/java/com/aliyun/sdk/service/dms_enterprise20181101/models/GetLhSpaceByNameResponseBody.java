// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetLhSpaceByNameResponseBody} extends {@link TeaModel}
 *
 * <p>GetLhSpaceByNameResponseBody</p>
 */
public class GetLhSpaceByNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("LakehouseSpace")
    private LakehouseSpace lakehouseSpace;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetLhSpaceByNameResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.lakehouseSpace = model.lakehouseSpace;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The workspace for data warehouse development.</p>
         */
        public Builder lakehouseSpace(LakehouseSpace lakehouseSpace) {
            this.lakehouseSpace = lakehouseSpace;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FE8CA4A8-AB2D-55B7-BD30-01A4609F40D8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetLhSpaceByNameResponseBody build() {
            return new GetLhSpaceByNameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLhSpaceByNameResponseBody} extends {@link TeaModel}
     *
     * <p>GetLhSpaceByNameResponseBody</p>
     */
    public static class LakehouseSpace extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DevDbId")
        private Integer devDbId;

        @com.aliyun.core.annotation.NameInMap("DwDbType")
        private String dwDbType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsDeleted")
        private Boolean isDeleted;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("ProdDbId")
        private Integer prodDbId;

        @com.aliyun.core.annotation.NameInMap("SpaceConfig")
        private String spaceConfig;

        @com.aliyun.core.annotation.NameInMap("SpaceName")
        private String spaceName;

        @com.aliyun.core.annotation.NameInMap("TenantId")
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

            private Builder() {
            } 

            private Builder(LakehouseSpace model) {
                this.creatorId = model.creatorId;
                this.description = model.description;
                this.devDbId = model.devDbId;
                this.dwDbType = model.dwDbType;
                this.id = model.id;
                this.isDeleted = model.isDeleted;
                this.mode = model.mode;
                this.prodDbId = model.prodDbId;
                this.spaceConfig = model.spaceConfig;
                this.spaceName = model.spaceName;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>The ID of the user who creates the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>51***</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The description of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the development database.</p>
             * 
             * <strong>example:</strong>
             * <p>2435****</p>
             */
            public Builder devDbId(Integer devDbId) {
                this.devDbId = devDbId;
                return this;
            }

            /**
             * <p>The type of the database. Valid values:</p>
             * <ul>
             * <li><strong>14</strong>: AnalyticDB for MySQL</li>
             * <li><strong>18</strong>: AnalyticDB for PostgreSQL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder dwDbType(String dwDbType) {
                this.dwDbType = dwDbType;
                return this;
            }

            /**
             * <p>The ID of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the workspace is deleted. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The workspace is deleted.</li>
             * <li><strong>false</strong>: The workspace is not deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDeleted(Boolean isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * <p>The mode in which the workspace runs. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: basic mode</li>
             * <li><strong>1</strong>: standard mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The ID of the production database.</p>
             * 
             * <strong>example:</strong>
             * <p>2442****</p>
             */
            public Builder prodDbId(Integer prodDbId) {
                this.prodDbId = prodDbId;
                return this;
            }

            /**
             * <p>The configuration of the workspace. Valid values:</p>
             * <ul>
             * <li><strong>skipManualRunCheck</strong>: No security rule check is required in the trial run phase.</li>
             * <li><strong>skipPublishApprove</strong>: No approval is required for publishing and O&amp;M.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;skipManualRunCheck&quot;:true,&quot;skipPublishApprove&quot;:true}</p>
             */
            public Builder spaceConfig(String spaceConfig) {
                this.spaceConfig = spaceConfig;
                return this;
            }

            /**
             * <p>The name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>test_space</p>
             */
            public Builder spaceName(String spaceName) {
                this.spaceName = spaceName;
                return this;
            }

            /**
             * <p>The ID of the tenant to which the workspace belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>3***</p>
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
