// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCollectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCollectionsResponseBody</p>
 */
public class ListCollectionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
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
        private java.util.List < Result> result; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCollectionsResponseBody build() {
            return new ListCollectionsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("FavoriteId")
        private Integer favoriteId;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("WorksId")
        private String worksId;

        @NameInMap("WorksName")
        private String worksName;

        @NameInMap("WorksType")
        private String worksType;

        @NameInMap("WorkspaceId")
        private String workspaceId;

        @NameInMap("WorkspaceName")
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
