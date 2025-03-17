// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListCollectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCollectionsResponseBody</p>
 */
public class ListCollectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCollectionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCollectionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCollectionsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>162A632E-0A88-51CF-98F8-94FDEE82DB7D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The primary key ID of the favorite record.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCollectionsResponseBody build() {
            return new ListCollectionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCollectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCollectionsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FavoriteId")
        private Integer favoriteId;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("WorksId")
        private String worksId;

        @com.aliyun.core.annotation.NameInMap("WorksName")
        private String worksName;

        @com.aliyun.core.annotation.NameInMap("WorksType")
        private String worksType;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        private Result(Builder builder) {
            this.favoriteId = builder.favoriteId;
            this.ownerId = builder.ownerId;
            this.worksId = builder.worksId;
            this.worksName = builder.worksName;
            this.worksType = builder.worksType;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return favoriteId
         */
        public Integer getFavoriteId() {
            return this.favoriteId;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return worksId
         */
        public String getWorksId() {
            return this.worksId;
        }

        /**
         * @return worksName
         */
        public String getWorksName() {
            return this.worksName;
        }

        /**
         * @return worksType
         */
        public String getWorksType() {
            return this.worksType;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private Integer favoriteId; 
            private String ownerId; 
            private String worksId; 
            private String worksName; 
            private String worksType; 
            private String workspaceId; 
            private String workspaceName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.favoriteId = model.favoriteId;
                this.ownerId = model.ownerId;
                this.worksId = model.worksId;
                this.worksName = model.worksName;
                this.worksType = model.worksType;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * FavoriteId.
             */
            public Builder favoriteId(Integer favoriteId) {
                this.favoriteId = favoriteId;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * WorksId.
             */
            public Builder worksId(String worksId) {
                this.worksId = worksId;
                return this;
            }

            /**
             * WorksName.
             */
            public Builder worksName(String worksName) {
                this.worksName = worksName;
                return this;
            }

            /**
             * WorksType.
             */
            public Builder worksType(String worksType) {
                this.worksType = worksType;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * WorkspaceName.
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
