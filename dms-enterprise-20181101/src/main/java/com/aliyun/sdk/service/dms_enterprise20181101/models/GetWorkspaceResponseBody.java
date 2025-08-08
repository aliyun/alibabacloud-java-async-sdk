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
 * {@link GetWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkspaceResponseBody</p>
 */
public class GetWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetWorkspaceResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetWorkspaceResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetWorkspaceResponseBody build() {
            return new GetWorkspaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspaceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ServiceAccountId")
        private String serviceAccountId;

        @com.aliyun.core.annotation.NameInMap("Tid")
        private Long tid;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private Long workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        private Data(Builder builder) {
            this.description = builder.description;
            this.ownerId = builder.ownerId;
            this.regionId = builder.regionId;
            this.serviceAccountId = builder.serviceAccountId;
            this.tid = builder.tid;
            this.vpcId = builder.vpcId;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serviceAccountId
         */
        public String getServiceAccountId() {
            return this.serviceAccountId;
        }

        /**
         * @return tid
         */
        public Long getTid() {
            return this.tid;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return workspaceId
         */
        public Long getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private String description; 
            private String ownerId; 
            private String regionId; 
            private String serviceAccountId; 
            private Long tid; 
            private String vpcId; 
            private Long workspaceId; 
            private String workspaceName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.description = model.description;
                this.ownerId = model.ownerId;
                this.regionId = model.regionId;
                this.serviceAccountId = model.serviceAccountId;
                this.tid = model.tid;
                this.vpcId = model.vpcId;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ServiceAccountId.
             */
            public Builder serviceAccountId(String serviceAccountId) {
                this.serviceAccountId = serviceAccountId;
                return this;
            }

            /**
             * Tid.
             */
            public Builder tid(Long tid) {
                this.tid = tid;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(Long workspaceId) {
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
