// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantUserPermissionRequest} extends {@link RequestModel}
 *
 * <p>GrantUserPermissionRequest</p>
 */
public class GrantUserPermissionRequest extends Request {
    @Query
    @NameInMap("DbId")
    private String dbId;

    @Query
    @NameInMap("DsType")
    @Validation(required = true)
    private String dsType;

    @Query
    @NameInMap("ExpireDate")
    @Validation(required = true)
    private String expireDate;

    @Query
    @NameInMap("InstanceId")
    private Long instanceId;

    @Query
    @NameInMap("Logic")
    private Boolean logic;

    @Query
    @NameInMap("PermTypes")
    @Validation(required = true)
    private String permTypes;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TableId")
    private String tableId;

    @Query
    @NameInMap("TableName")
    private String tableName;

    @Query
    @NameInMap("Tid")
    private Long tid;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private GrantUserPermissionRequest(Builder builder) {
        super(builder);
        this.dbId = builder.dbId;
        this.dsType = builder.dsType;
        this.expireDate = builder.expireDate;
        this.instanceId = builder.instanceId;
        this.logic = builder.logic;
        this.permTypes = builder.permTypes;
        this.regionId = builder.regionId;
        this.tableId = builder.tableId;
        this.tableName = builder.tableName;
        this.tid = builder.tid;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantUserPermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbId
     */
    public String getDbId() {
        return this.dbId;
    }

    /**
     * @return dsType
     */
    public String getDsType() {
        return this.dsType;
    }

    /**
     * @return expireDate
     */
    public String getExpireDate() {
        return this.expireDate;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logic
     */
    public Boolean getLogic() {
        return this.logic;
    }

    /**
     * @return permTypes
     */
    public String getPermTypes() {
        return this.permTypes;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tableId
     */
    public String getTableId() {
        return this.tableId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GrantUserPermissionRequest, Builder> {
        private String dbId; 
        private String dsType; 
        private String expireDate; 
        private Long instanceId; 
        private Boolean logic; 
        private String permTypes; 
        private String regionId; 
        private String tableId; 
        private String tableName; 
        private Long tid; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GrantUserPermissionRequest response) {
            super(response);
            this.dbId = response.dbId;
            this.dsType = response.dsType;
            this.expireDate = response.expireDate;
            this.instanceId = response.instanceId;
            this.logic = response.logic;
            this.permTypes = response.permTypes;
            this.regionId = response.regionId;
            this.tableId = response.tableId;
            this.tableName = response.tableName;
            this.tid = response.tid;
            this.userId = response.userId;
        } 

        /**
         * DbId.
         */
        public Builder dbId(String dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * DsType.
         */
        public Builder dsType(String dsType) {
            this.putQueryParameter("DsType", dsType);
            this.dsType = dsType;
            return this;
        }

        /**
         * ExpireDate.
         */
        public Builder expireDate(String expireDate) {
            this.putQueryParameter("ExpireDate", expireDate);
            this.expireDate = expireDate;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(Long instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Logic.
         */
        public Builder logic(Boolean logic) {
            this.putQueryParameter("Logic", logic);
            this.logic = logic;
            return this;
        }

        /**
         * PermTypes.
         */
        public Builder permTypes(String permTypes) {
            this.putQueryParameter("PermTypes", permTypes);
            this.permTypes = permTypes;
            return this;
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
         * TableId.
         */
        public Builder tableId(String tableId) {
            this.putQueryParameter("TableId", tableId);
            this.tableId = tableId;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GrantUserPermissionRequest build() {
            return new GrantUserPermissionRequest(this);
        } 

    } 

}
