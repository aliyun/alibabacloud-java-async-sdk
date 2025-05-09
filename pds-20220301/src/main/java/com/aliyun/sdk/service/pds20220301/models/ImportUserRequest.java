// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link ImportUserRequest} extends {@link RequestModel}
 *
 * <p>ImportUserRequest</p>
 */
public class ImportUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authentication_display_name")
    private String authenticationDisplayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authentication_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authenticationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auto_create_drive")
    private Boolean autoCreateDrive;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_total_size")
    private Long driveTotalSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extra")
    private String extra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("identity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nick_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parent_group_id")
    private String parentGroupId;

    private ImportUserRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.authenticationDisplayName = builder.authenticationDisplayName;
        this.authenticationType = builder.authenticationType;
        this.autoCreateDrive = builder.autoCreateDrive;
        this.driveTotalSize = builder.driveTotalSize;
        this.extra = builder.extra;
        this.identity = builder.identity;
        this.nickName = builder.nickName;
        this.parentGroupId = builder.parentGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return authenticationDisplayName
     */
    public String getAuthenticationDisplayName() {
        return this.authenticationDisplayName;
    }

    /**
     * @return authenticationType
     */
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * @return autoCreateDrive
     */
    public Boolean getAutoCreateDrive() {
        return this.autoCreateDrive;
    }

    /**
     * @return driveTotalSize
     */
    public Long getDriveTotalSize() {
        return this.driveTotalSize;
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
    }

    /**
     * @return identity
     */
    public String getIdentity() {
        return this.identity;
    }

    /**
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * @return parentGroupId
     */
    public String getParentGroupId() {
        return this.parentGroupId;
    }

    public static final class Builder extends Request.Builder<ImportUserRequest, Builder> {
        private String domainId; 
        private String authenticationDisplayName; 
        private String authenticationType; 
        private Boolean autoCreateDrive; 
        private Long driveTotalSize; 
        private String extra; 
        private String identity; 
        private String nickName; 
        private String parentGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ImportUserRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.authenticationDisplayName = request.authenticationDisplayName;
            this.authenticationType = request.authenticationType;
            this.autoCreateDrive = request.autoCreateDrive;
            this.driveTotalSize = request.driveTotalSize;
            this.extra = request.extra;
            this.identity = request.identity;
            this.nickName = request.nickName;
            this.parentGroupId = request.parentGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The display name of the authentication type.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder authenticationDisplayName(String authenticationDisplayName) {
            this.putBodyParameter("authentication_display_name", authenticationDisplayName);
            this.authenticationDisplayName = authenticationDisplayName;
            return this;
        }

        /**
         * <p>The authentication type. Valid values:</p>
         * <ul>
         * <li>mobile: mobile number.</li>
         * <li>email: email address.</li>
         * <li>ding: DingTalk account.</li>
         * <li>ram: Alibaba Cloud Resource Access Management (RAM) user.</li>
         * <li>wechat: WeCom account.</li>
         * <li>ldap: Lightweight Directory Access Protocol (LDAP) account.</li>
         * <li>custom: custom account.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mobile</p>
         */
        public Builder authenticationType(String authenticationType) {
            this.putBodyParameter("authentication_type", authenticationType);
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * <p>Specifies whether to automatically create a drive.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoCreateDrive(Boolean autoCreateDrive) {
            this.putBodyParameter("auto_create_drive", autoCreateDrive);
            this.autoCreateDrive = autoCreateDrive;
            return this;
        }

        /**
         * <p>The size of the drive. The value cannot be smaller than -1. A value of -1 specifies that the size is unlimited.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder driveTotalSize(Long driveTotalSize) {
            this.putBodyParameter("drive_total_size", driveTotalSize);
            this.driveTotalSize = driveTotalSize;
            return this;
        }

        /**
         * <p>The additional information.</p>
         * <p>If authentication_type is set to mobile, set this parameter to a country code. If you do not specify this parameter, 86 is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder extra(String extra) {
            this.putBodyParameter("extra", extra);
            this.extra = extra;
            return this;
        }

        /**
         * <p>The unique identifier.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>130****</p>
         */
        public Builder identity(String identity) {
            this.putBodyParameter("identity", identity);
            this.identity = identity;
            return this;
        }

        /**
         * <p>The nickname of the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pdsuer</p>
         */
        public Builder nickName(String nickName) {
            this.putBodyParameter("nick_name", nickName);
            this.nickName = nickName;
            return this;
        }

        /**
         * <p>The ID of the group to which the user is added.</p>
         * 
         * <strong>example:</strong>
         * <p>g12</p>
         */
        public Builder parentGroupId(String parentGroupId) {
            this.putBodyParameter("parent_group_id", parentGroupId);
            this.parentGroupId = parentGroupId;
            return this;
        }

        @Override
        public ImportUserRequest build() {
            return new ImportUserRequest(this);
        } 

    } 

}
