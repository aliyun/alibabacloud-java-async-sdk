// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOperationPermissionRequest} extends {@link RequestModel}
 *
 * <p>UpdateOperationPermissionRequest</p>
 */
public class UpdateOperationPermissionRequest extends Request {
    @Query
    @NameInMap("PermissionType")
    private Integer permissionType;

    @Query
    @NameInMap("SwitchFrontOperaUid")
    private String switchFrontOperaUid;

    @Query
    @NameInMap("Uid")
    private Long uid;

    private UpdateOperationPermissionRequest(Builder builder) {
        super(builder);
        this.permissionType = builder.permissionType;
        this.switchFrontOperaUid = builder.switchFrontOperaUid;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOperationPermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return permissionType
     */
    public Integer getPermissionType() {
        return this.permissionType;
    }

    /**
     * @return switchFrontOperaUid
     */
    public String getSwitchFrontOperaUid() {
        return this.switchFrontOperaUid;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<UpdateOperationPermissionRequest, Builder> {
        private Integer permissionType; 
        private String switchFrontOperaUid; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOperationPermissionRequest request) {
            super(request);
            this.permissionType = request.permissionType;
            this.switchFrontOperaUid = request.switchFrontOperaUid;
            this.uid = request.uid;
        } 

        /**
         * PermissionType.
         */
        public Builder permissionType(Integer permissionType) {
            this.putQueryParameter("PermissionType", permissionType);
            this.permissionType = permissionType;
            return this;
        }

        /**
         * SwitchFrontOperaUid.
         */
        public Builder switchFrontOperaUid(String switchFrontOperaUid) {
            this.putQueryParameter("SwitchFrontOperaUid", switchFrontOperaUid);
            this.switchFrontOperaUid = switchFrontOperaUid;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public UpdateOperationPermissionRequest build() {
            return new UpdateOperationPermissionRequest(this);
        } 

    } 

}
