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
 * {@link CreateSecurityClassifyCatalogRequest} extends {@link RequestModel}
 *
 * <p>CreateSecurityClassifyCatalogRequest</p>
 */
public class CreateSecurityClassifyCatalogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateCommand createCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private CreateSecurityClassifyCatalogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityClassifyCatalogRequest create() {
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
     * @return createCommand
     */
    public CreateCommand getCreateCommand() {
        return this.createCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<CreateSecurityClassifyCatalogRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecurityClassifyCatalogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
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
         */
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
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

        @Override
        public CreateSecurityClassifyCatalogRequest build() {
            return new CreateSecurityClassifyCatalogRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSecurityClassifyCatalogRequest} extends {@link TeaModel}
     *
     * <p>CreateSecurityClassifyCatalogRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerList")
        private java.util.List<String> ownerList;

        @com.aliyun.core.annotation.NameInMap("ParentPath")
        private String parentPath;

        @com.aliyun.core.annotation.NameInMap("VisibleType")
        private String visibleType;

        private CreateCommand(Builder builder) {
            this.name = builder.name;
            this.ownerList = builder.ownerList;
            this.parentPath = builder.parentPath;
            this.visibleType = builder.visibleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
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
         * @return visibleType
         */
        public String getVisibleType() {
            return this.visibleType;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> ownerList; 
            private String parentPath; 
            private String visibleType; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.name = model.name;
                this.ownerList = model.ownerList;
                this.parentPath = model.parentPath;
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
             * VisibleType.
             */
            public Builder visibleType(String visibleType) {
                this.visibleType = visibleType;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
