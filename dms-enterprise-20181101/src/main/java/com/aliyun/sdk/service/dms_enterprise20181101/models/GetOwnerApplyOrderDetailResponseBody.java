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
 * {@link GetOwnerApplyOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetOwnerApplyOrderDetailResponseBody</p>
 */
public class GetOwnerApplyOrderDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("OwnerApplyOrderDetail")
    private OwnerApplyOrderDetail ownerApplyOrderDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The details of the ticket.</p>
         */
        public Builder ownerApplyOrderDetail(OwnerApplyOrderDetail ownerApplyOrderDetail) {
            this.ownerApplyOrderDetail = ownerApplyOrderDetail;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CB784055-E8CB-4461-AB0B-483A1DA32BB5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOwnerApplyOrderDetailResponseBody build() {
            return new GetOwnerApplyOrderDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOwnerApplyOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOwnerApplyOrderDetailResponseBody</p>
     */
    public static class ResourceDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("OwnerIds")
        private java.util.List<Long> ownerIds;

        @com.aliyun.core.annotation.NameInMap("OwnerNickNames")
        private java.util.List<String> ownerNickNames;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        @com.aliyun.core.annotation.NameInMap("TableName")
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
        public java.util.List<Long> getOwnerIds() {
            return this.ownerIds;
        }

        /**
         * @return ownerNickNames
         */
        public java.util.List<String> getOwnerNickNames() {
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
            private java.util.List<Long> ownerIds; 
            private java.util.List<String> ownerNickNames; 
            private String searchName; 
            private String tableName; 

            /**
             * <p>The type of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>MYSQL</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The type of the environment to which the instance belongs. For more information, see <a href="https://help.aliyun.com/document_detail/163309.html">Change the environment type of an instance</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>PRODUCT</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The IDs of the original owners.</p>
             */
            public Builder ownerIds(java.util.List<Long> ownerIds) {
                this.ownerIds = ownerIds;
                return this;
            }

            /**
             * <p>The nicknames of the owners.</p>
             */
            public Builder ownerNickNames(java.util.List<String> ownerNickNames) {
                this.ownerNickNames = ownerNickNames;
                return this;
            }

            /**
             * <p>The search name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>yuyang【test】</p>
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * <blockquote>
             * <p>: This parameter is returned when you submit a Database-OWNER ticket.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link GetOwnerApplyOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOwnerApplyOrderDetailResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("ResourceDetail")
        private ResourceDetail resourceDetail;

        @com.aliyun.core.annotation.NameInMap("TargetId")
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
             * <p>Indicates whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The instance is a logical database.</li>
             * <li><strong>false</strong>: The instance is not a logical database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * <p>The details of the resource.</p>
             */
            public Builder resourceDetail(ResourceDetail resourceDetail) {
                this.resourceDetail = resourceDetail;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
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
    /**
     * 
     * {@link GetOwnerApplyOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOwnerApplyOrderDetailResponseBody</p>
     */
    public static class OwnerApplyOrderDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyType")
        private String applyType;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private java.util.List<Resources> resources;

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
        public java.util.List<Resources> getResources() {
            return this.resources;
        }

        public static final class Builder {
            private String applyType; 
            private java.util.List<Resources> resources; 

            /**
             * <p>The type of the submitted ticket. Valid values:</p>
             * <ul>
             * <li><strong>INSTANCE</strong>: the ticket that applies for the permissions to be an instance owner</li>
             * <li><strong>DB</strong>: the ticket that applies for the permissions to be a database owner</li>
             * <li><strong>TABLE</strong>: the ticket that applies for the permissions to be a table owner</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DB</p>
             */
            public Builder applyType(String applyType) {
                this.applyType = applyType;
                return this;
            }

            /**
             * <p>The details of the requested resource.</p>
             */
            public Builder resources(java.util.List<Resources> resources) {
                this.resources = resources;
                return this;
            }

            public OwnerApplyOrderDetail build() {
                return new OwnerApplyOrderDetail(this);
            } 

        } 

    }
}
