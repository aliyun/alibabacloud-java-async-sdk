// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDrdsIpWhiteListRequest} extends {@link RequestModel}
 *
 * <p>ModifyDrdsIpWhiteListRequest</p>
 */
public class ModifyDrdsIpWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupAttribute")
    private String groupAttribute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpWhiteList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipWhiteList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
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

        private Builder(ModifyDrdsIpWhiteListRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.groupAttribute = request.groupAttribute;
            this.groupName = request.groupName;
            this.ipWhiteList = request.ipWhiteList;
            this.mode = request.mode;
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
