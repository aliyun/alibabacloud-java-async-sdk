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
    @com.aliyun.core.annotation.NameInMap("store_redundancy_type")
    private String storeRedundancyType;

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
        this.storeRedundancyType = builder.storeRedundancyType;
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
     * @return storeRedundancyType
     */
    public String getStoreRedundancyType() {
        return this.storeRedundancyType;
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
        private String storeRedundancyType; 
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
            this.storeRedundancyType = request.storeRedundancyType;
            this.userCountQuota = request.userCountQuota;
        } 

        /**
         * <p>The description of the domain.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud drive dev</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud drive</p>
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("domain_name", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the default drive feature. A value of true specifies that all users are assigned a drive by default on the first logon. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder initDriveEnable(Boolean initDriveEnable) {
            this.putBodyParameter("init_drive_enable", initDriveEnable);
            this.initDriveEnable = initDriveEnable;
            return this;
        }

        /**
         * <p>This parameter is required when the init_drive_enable is set to true. The size of the default drive. Unit: bytes. The default is 0, meaning the created drive size is 0, and files cannot be uploaded. If you need to initialize the drive, set this value. A value of -1 indicates that the size is unlimited.</p>
         * 
         * <strong>example:</strong>
         * <p>1073741824</p>
         */
        public Builder initDriveSize(Long initDriveSize) {
            this.putBodyParameter("init_drive_size", initDriveSize);
            this.initDriveSize = initDriveSize;
            return this;
        }

        /**
         * <p>The ID of the parent domain. If you want to create a child domain, specify parent_domain_id. In most cases, you do not need to create a child domain. If you want to perform secondary operations based on Drive and Photo Service, contact the customer service.</p>
         * 
         * <strong>example:</strong>
         * <p>bj1</p>
         */
        public Builder parentDomainId(String parentDomainId) {
            this.putBodyParameter("parent_domain_id", parentDomainId);
            this.parentDomainId = parentDomainId;
            return this;
        }

        /**
         * <p>The total storage quota for all drives in the domain. A value of 0 indicates that the quota is unlimited.</p>
         * 
         * <strong>example:</strong>
         * <p>1099511627776</p>
         */
        public Builder sizeQuota(Long sizeQuota) {
            this.putBodyParameter("size_quota", sizeQuota);
            this.sizeQuota = sizeQuota;
            return this;
        }

        /**
         * <p>Specifies the storage redundancy type. Valid values:</p>
         * <ul>
         * <li>LRS: locally redundant storage</li>
         * <li>ZRS: zone-redundant storage</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LRS</p>
         */
        public Builder storeRedundancyType(String storeRedundancyType) {
            this.putBodyParameter("store_redundancy_type", storeRedundancyType);
            this.storeRedundancyType = storeRedundancyType;
            return this;
        }

        /**
         * <p>The largest number of users that can be created in the domain. A value of 0 specifies that the number is unlimited.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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
