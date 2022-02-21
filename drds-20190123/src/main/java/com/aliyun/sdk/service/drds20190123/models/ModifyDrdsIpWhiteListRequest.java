// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDrdsIpWhiteListRequest} extends {@link RequestModel}
 *
 * <p>ModifyDrdsIpWhiteListRequest</p>
 */
public class ModifyDrdsIpWhiteListRequest extends Request {
    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("GroupAttribute")
    private String groupAttribute;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("IpWhiteList")
    @Validation(required = true)
    private String ipWhiteList;

    @Query
    @NameInMap("Mode")
    private Boolean mode;

    private ModifyDrdsIpWhiteListRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.groupAttribute = builder.groupAttribute;
        this.groupName = builder.groupName;
        this.ipWhiteList = builder.ipWhiteList;
        this.mode = builder.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDrdsIpWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return groupAttribute
     */
    public String getGroupAttribute() {
        return this.groupAttribute;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return ipWhiteList
     */
    public String getIpWhiteList() {
        return this.ipWhiteList;
    }

    /**
     * @return mode
     */
    public Boolean getMode() {
        return this.mode;
    }

    public static final class Builder extends Request.Builder<ModifyDrdsIpWhiteListRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private String groupAttribute; 
        private String groupName; 
        private String ipWhiteList; 
        private Boolean mode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDrdsIpWhiteListRequest response) {
            super(response);
            this.dbName = response.dbName;
            this.drdsInstanceId = response.drdsInstanceId;
            this.groupAttribute = response.groupAttribute;
            this.groupName = response.groupName;
            this.ipWhiteList = response.ipWhiteList;
            this.mode = response.mode;
        } 

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * GroupAttribute.
         */
        public Builder groupAttribute(String groupAttribute) {
            this.putQueryParameter("GroupAttribute", groupAttribute);
            this.groupAttribute = groupAttribute;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * IpWhiteList.
         */
        public Builder ipWhiteList(String ipWhiteList) {
            this.putQueryParameter("IpWhiteList", ipWhiteList);
            this.ipWhiteList = ipWhiteList;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(Boolean mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        @Override
        public ModifyDrdsIpWhiteListRequest build() {
            return new ModifyDrdsIpWhiteListRequest(this);
        } 

    } 

}
