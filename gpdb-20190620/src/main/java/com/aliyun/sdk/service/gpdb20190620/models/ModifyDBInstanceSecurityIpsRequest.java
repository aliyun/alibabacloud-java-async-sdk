// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20190620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceSecurityIpsRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceSecurityIpsRequest</p>
 */
public class ModifyDBInstanceSecurityIpsRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private Long aliUid;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("WhileList")
    @Validation(required = true)
    private String whileList;

    private ModifyDBInstanceSecurityIpsRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.whileList = builder.whileList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceSecurityIpsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return whileList
     */
    public String getWhileList() {
        return this.whileList;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceSecurityIpsRequest, Builder> {
        private Long aliUid; 
        private String groupName; 
        private String instanceId; 
        private Long ownerId; 
        private String whileList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceSecurityIpsRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.groupName = request.groupName;
            this.instanceId = request.instanceId;
            this.ownerId = request.ownerId;
            this.whileList = request.whileList;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * WhileList.
         */
        public Builder whileList(String whileList) {
            this.putQueryParameter("WhileList", whileList);
            this.whileList = whileList;
            return this;
        }

        @Override
        public ModifyDBInstanceSecurityIpsRequest build() {
            return new ModifyDBInstanceSecurityIpsRequest(this);
        } 

    } 

}
