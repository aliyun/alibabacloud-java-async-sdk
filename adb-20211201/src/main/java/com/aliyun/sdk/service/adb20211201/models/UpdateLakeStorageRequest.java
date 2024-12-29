// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link UpdateLakeStorageRequest} extends {@link RequestModel}
 *
 * <p>UpdateLakeStorageRequest</p>
 */
public class UpdateLakeStorageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LakeStorageId")
    private String lakeStorageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Permissions")
    private java.util.List<Permissions> permissions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private UpdateLakeStorageRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.description = builder.description;
        this.lakeStorageId = builder.lakeStorageId;
        this.permissions = builder.permissions;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLakeStorageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return lakeStorageId
     */
    public String getLakeStorageId() {
        return this.lakeStorageId;
    }

    /**
     * @return permissions
     */
    public java.util.List<Permissions> getPermissions() {
        return this.permissions;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateLakeStorageRequest, Builder> {
        private String DBClusterId; 
        private String description; 
        private String lakeStorageId; 
        private java.util.List<Permissions> permissions; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLakeStorageRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.description = request.description;
            this.lakeStorageId = request.lakeStorageId;
            this.permissions = request.permissions;
            this.regionId = request.regionId;
        } 

        /**
         * <p>用于指定和挂载到特定ADB主实例的湖存储</p>
         * 
         * <strong>example:</strong>
         * <p>amv-*******</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>对湖存储的描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>用于识别特定湖存储的唯一标识符</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder lakeStorageId(String lakeStorageId) {
            this.putBodyParameter("LakeStorageId", lakeStorageId);
            this.lakeStorageId = lakeStorageId;
            return this;
        }

        /**
         * <p>设置湖存储的读/写权限和账户级别权限的数组</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder permissions(java.util.List<Permissions> permissions) {
            String permissionsShrink = shrink(permissions, "Permissions", "json");
            this.putBodyParameter("Permissions", permissionsShrink);
            this.permissions = permissions;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateLakeStorageRequest build() {
            return new UpdateLakeStorageRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLakeStorageRequest} extends {@link TeaModel}
     *
     * <p>UpdateLakeStorageRequest</p>
     */
    public static class Permissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        @com.aliyun.core.annotation.Validation(required = true)
        private String account;

        @com.aliyun.core.annotation.NameInMap("Read")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean read;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Write")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean write;

        private Permissions(Builder builder) {
            this.account = builder.account;
            this.read = builder.read;
            this.type = builder.type;
            this.write = builder.write;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permissions create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return read
         */
        public Boolean getRead() {
            return this.read;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return write
         */
        public Boolean getWrite() {
            return this.write;
        }

        public static final class Builder {
            private String account; 
            private Boolean read; 
            private String type; 
            private Boolean write; 

            /**
             * <p>具有该权限的账户或RAM用户ID</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * <p>表示是否允许读取湖存储的权限</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder read(Boolean read) {
                this.read = read;
                return this;
            }

            /**
             * <p>指定权限的账户类型</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SUB</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>表示是否允许向湖存储写入数据的权限</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder write(Boolean write) {
                this.write = write;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
}
