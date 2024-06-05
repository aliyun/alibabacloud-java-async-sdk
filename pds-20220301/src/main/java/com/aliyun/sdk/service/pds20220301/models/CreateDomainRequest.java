// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateDomainRequest</p>
 */
public class CreateDomainRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("domain_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("init_drive_enable")
    private Boolean initDriveEnable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("init_drive_size")
    private Long initDriveSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parent_domain_id")
    private String parentDomainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("size_quota")
    private Long sizeQuota;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_count_quota")
    private Long userCountQuota;

    private CreateDomainRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.domainName = builder.domainName;
        this.initDriveEnable = builder.initDriveEnable;
        this.initDriveSize = builder.initDriveSize;
        this.parentDomainId = builder.parentDomainId;
        this.sizeQuota = builder.sizeQuota;
        this.userCountQuota = builder.userCountQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return initDriveEnable
     */
    public Boolean getInitDriveEnable() {
        return this.initDriveEnable;
    }

    /**
     * @return initDriveSize
     */
    public Long getInitDriveSize() {
        return this.initDriveSize;
    }

    /**
     * @return parentDomainId
     */
    public String getParentDomainId() {
        return this.parentDomainId;
    }

    /**
     * @return sizeQuota
     */
    public Long getSizeQuota() {
        return this.sizeQuota;
    }

    /**
     * @return userCountQuota
     */
    public Long getUserCountQuota() {
        return this.userCountQuota;
    }

    public static final class Builder extends Request.Builder<CreateDomainRequest, Builder> {
        private String description; 
        private String domainName; 
        private Boolean initDriveEnable; 
        private Long initDriveSize; 
        private String parentDomainId; 
        private Long sizeQuota; 
        private Long userCountQuota; 

        private Builder() {
            super();
        } 

        private Builder(CreateDomainRequest request) {
            super(request);
            this.description = request.description;
            this.domainName = request.domainName;
            this.initDriveEnable = request.initDriveEnable;
            this.initDriveSize = request.initDriveSize;
            this.parentDomainId = request.parentDomainId;
            this.sizeQuota = request.sizeQuota;
            this.userCountQuota = request.userCountQuota;
        } 

        /**
         * The description of the domain.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the domain.
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("domain_name", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Specifies whether to enable the default drive feature. A value of true specifies that all users are assigned a drive by default on the first logon. Default value: false.
         */
        public Builder initDriveEnable(Boolean initDriveEnable) {
            this.putBodyParameter("init_drive_enable", initDriveEnable);
            this.initDriveEnable = initDriveEnable;
            return this;
        }

        /**
         * The size of the default drive. Unit: bytes. You must specify init_drive_size if you set init_drive_enable to true. Default value: 0. A value of 0 specifies that the size of the default drive is 0 bytes and you cannot upload files to the drive. To initialize the default drive, set init_drive_size to 0. A value of -1 specifies that the size is unlimited.
         */
        public Builder initDriveSize(Long initDriveSize) {
            this.putBodyParameter("init_drive_size", initDriveSize);
            this.initDriveSize = initDriveSize;
            return this;
        }

        /**
         * The ID of the parent domain. If you want to create a child domain, specify parent_domain_id. In most cases, you do not need to create a child domain. If you want to perform secondary operations based on Drive and Photo Service, contact the customer service.
         */
        public Builder parentDomainId(String parentDomainId) {
            this.putBodyParameter("parent_domain_id", parentDomainId);
            this.parentDomainId = parentDomainId;
            return this;
        }

        /**
         * The total storage quota for all drives in the domain. A value of 0 specifies that the quota is unlimited.
         */
        public Builder sizeQuota(Long sizeQuota) {
            this.putBodyParameter("size_quota", sizeQuota);
            this.sizeQuota = sizeQuota;
            return this;
        }

        /**
         * The largest number of users that can be created in the domain. A value of 0 specifies that the number is unlimited.
         */
        public Builder userCountQuota(Long userCountQuota) {
            this.putBodyParameter("user_count_quota", userCountQuota);
            this.userCountQuota = userCountQuota;
            return this;
        }

        @Override
        public CreateDomainRequest build() {
            return new CreateDomainRequest(this);
        } 

    } 

}
