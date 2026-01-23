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
 * {@link UpdateSecurityClassifyCatalogRequest} extends {@link RequestModel}
 *
 * <p>UpdateSecurityClassifyCatalogRequest</p>
 */
public class UpdateSecurityClassifyCatalogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateCommand updateCommand;

    private UpdateSecurityClassifyCatalogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSecurityClassifyCatalogRequest create() {
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
     * @return updateCommand
     */
    public UpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static final class Builder extends Request.Builder<UpdateSecurityClassifyCatalogRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSecurityClassifyCatalogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.updateCommand = request.updateCommand;
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
         * <p>This parameter is required.</p>
         */
        public Builder updateCommand(UpdateCommand updateCommand) {
            String updateCommandShrink = shrink(updateCommand, "UpdateCommand", "json");
            this.putBodyParameter("UpdateCommand", updateCommandShrink);
            this.updateCommand = updateCommand;
            return this;
        }

        @Override
        public UpdateSecurityClassifyCatalogRequest build() {
            return new UpdateSecurityClassifyCatalogRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSecurityClassifyCatalogRequest} extends {@link TeaModel}
     *
     * <p>UpdateSecurityClassifyCatalogRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerList")
        private java.util.List<String> ownerList;

        @com.aliyun.core.annotation.NameInMap("ParentPath")
        private String parentPath;

        @com.aliyun.core.annotation.NameInMap("Path")
        @com.aliyun.core.annotation.Validation(required = true)
        private String path;

        @com.aliyun.core.annotation.NameInMap("VisibleType")
        private String visibleType;

        private UpdateCommand(Builder builder) {
            this.name = builder.name;
            this.ownerList = builder.ownerList;
            this.parentPath = builder.parentPath;
            this.path = builder.path;
            this.visibleType = builder.visibleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerList
         */
        public java.util.List<String> getOwnerList() {
            return this.ownerList;
        }

        /**
         * @return parentPath
         */
        public String getParentPath() {
            return this.parentPath;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return visibleType
         */
        public String getVisibleType() {
            return this.visibleType;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> ownerList; 
            private String parentPath; 
            private String path; 
            private String visibleType; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.name = model.name;
                this.ownerList = model.ownerList;
                this.parentPath = model.parentPath;
                this.path = model.path;
                this.visibleType = model.visibleType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OwnerList.
             */
            public Builder ownerList(java.util.List<String> ownerList) {
                this.ownerList = ownerList;
                return this;
            }

            /**
             * ParentPath.
             */
            public Builder parentPath(String parentPath) {
                this.parentPath = parentPath;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/d1/d2/</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * VisibleType.
             */
            public Builder visibleType(String visibleType) {
                this.visibleType = visibleType;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}
