// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOwnerApplyOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetOwnerApplyOrderDetailResponseBody</p>
 */
public class GetOwnerApplyOrderDetailResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("OwnerApplyOrderDetail")
    private OwnerApplyOrderDetail ownerApplyOrderDetail;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetOwnerApplyOrderDetailResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.ownerApplyOrderDetail = builder.ownerApplyOrderDetail;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOwnerApplyOrderDetailResponseBody create() {
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
     * @return ownerApplyOrderDetail
     */
    public OwnerApplyOrderDetail getOwnerApplyOrderDetail() {
        return this.ownerApplyOrderDetail;
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
        private OwnerApplyOrderDetail ownerApplyOrderDetail; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The details of the ticket.
         */
        public Builder ownerApplyOrderDetail(OwnerApplyOrderDetail ownerApplyOrderDetail) {
            this.ownerApplyOrderDetail = ownerApplyOrderDetail;
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
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOwnerApplyOrderDetailResponseBody build() {
            return new GetOwnerApplyOrderDetailResponseBody(this);
        } 

    } 

    public static class ResourceDetail extends TeaModel {
        @NameInMap("DbType")
        private String dbType;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("OwnerIds")
        private java.util.List < Long > ownerIds;

        @NameInMap("OwnerNickNames")
        private java.util.List < String > ownerNickNames;

        @NameInMap("SearchName")
        private String searchName;

        @NameInMap("TableName")
        private String tableName;

        private ResourceDetail(Builder builder) {
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.ownerIds = builder.ownerIds;
            this.ownerNickNames = builder.ownerNickNames;
            this.searchName = builder.searchName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDetail create() {
            return builder().build();
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return ownerIds
         */
        public java.util.List < Long > getOwnerIds() {
            return this.ownerIds;
        }

        /**
         * @return ownerNickNames
         */
        public java.util.List < String > getOwnerNickNames() {
            return this.ownerNickNames;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String dbType; 
            private String envType; 
            private java.util.List < Long > ownerIds; 
            private java.util.List < String > ownerNickNames; 
            private String searchName; 
            private String tableName; 

            /**
             * The type of the database engine.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The type of the environment to which the instance belongs. For more information, see [Change the environment type of an instance](~~163309~~).
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * The IDs of the original owners.
             */
            public Builder ownerIds(java.util.List < Long > ownerIds) {
                this.ownerIds = ownerIds;
                return this;
            }

            /**
             * The nicknames of the owners.
             */
            public Builder ownerNickNames(java.util.List < String > ownerNickNames) {
                this.ownerNickNames = ownerNickNames;
                return this;
            }

            /**
             * The search name of the resource.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * The name of the table.
             * <p>
             * 
             * > : This parameter is returned when you submit a Database-OWNER ticket.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public ResourceDetail build() {
                return new ResourceDetail(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("ResourceDetail")
        private ResourceDetail resourceDetail;

        @NameInMap("TargetId")
        private String targetId;

        private Resources(Builder builder) {
            this.logic = builder.logic;
            this.resourceDetail = builder.resourceDetail;
            this.targetId = builder.targetId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return resourceDetail
         */
        public ResourceDetail getResourceDetail() {
            return this.resourceDetail;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        public static final class Builder {
            private Boolean logic; 
            private ResourceDetail resourceDetail; 
            private String targetId; 

            /**
             * Indicates whether the database is a logical database. Valid values:
             * <p>
             * 
             * *   **true**: The instance is a logical database.
             * *   **false**: The instance is not a logical database.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The details of the resource.
             */
            public Builder resourceDetail(ResourceDetail resourceDetail) {
                this.resourceDetail = resourceDetail;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    public static class OwnerApplyOrderDetail extends TeaModel {
        @NameInMap("ApplyType")
        private String applyType;

        @NameInMap("Resources")
        private java.util.List < Resources> resources;

        private OwnerApplyOrderDetail(Builder builder) {
            this.applyType = builder.applyType;
            this.resources = builder.resources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OwnerApplyOrderDetail create() {
            return builder().build();
        }

        /**
         * @return applyType
         */
        public String getApplyType() {
            return this.applyType;
        }

        /**
         * @return resources
         */
        public java.util.List < Resources> getResources() {
            return this.resources;
        }

        public static final class Builder {
            private String applyType; 
            private java.util.List < Resources> resources; 

            /**
             * The type of the submitted ticket. Valid values:
             * <p>
             * 
             * *   **INSTANCE**: the ticket that applies for the permissions to be an instance owner
             * *   **DB**: the ticket that applies for the permissions to be a database owner
             * *   **TABLE**: the ticket that applies for the permissions to be a table owner
             */
            public Builder applyType(String applyType) {
                this.applyType = applyType;
                return this;
            }

            /**
             * The details of the requested resource.
             */
            public Builder resources(java.util.List < Resources> resources) {
                this.resources = resources;
                return this;
            }

            public OwnerApplyOrderDetail build() {
                return new OwnerApplyOrderDetail(this);
            } 

        } 

    }
}
