// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>ConfirmAuthorizationRequest</p>
 */
public class ConfirmAuthorizationRequest extends Request {
    @Query
    @NameInMap("PermissionType")
    private Integer permissionType;

    @Query
    @NameInMap("SwitchFrontOperaUid")
    private String switchFrontOperaUid;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("Uid")
    private Long uid;

    private ConfirmAuthorizationRequest(Builder builder) {
        super(builder);
        this.permissionType = builder.permissionType;
        this.switchFrontOperaUid = builder.switchFrontOperaUid;
        this.type = builder.type;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmAuthorizationRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<ConfirmAuthorizationRequest, Builder> {
        private Integer permissionType; 
        private String switchFrontOperaUid; 
        private String type; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmAuthorizationRequest request) {
            super(request);
            this.permissionType = request.permissionType;
            this.switchFrontOperaUid = request.switchFrontOperaUid;
            this.type = request.type;
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
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
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
        public ConfirmAuthorizationRequest build() {
            return new ConfirmAuthorizationRequest(this);
        } 

    } 

}
