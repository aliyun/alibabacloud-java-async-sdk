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
 * {@link UpdateDomainRequest} extends {@link RequestModel}
 *
 * <p>UpdateDomainRequest</p>
 */
public class UpdateDomainRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("domain_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("domain_name")
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("init_drive_enable")
    private Boolean initDriveEnable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("init_drive_size")
    private Long initDriveSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("published_app_access_strategy")
    private AppAccessStrategy publishedAppAccessStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("size_quota")
    private Long sizeQuota;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_count_quota")
    private Long userCountQuota;

    private UpdateDomainRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.domainId = builder.domainId;
        this.domainName = builder.domainName;
        this.initDriveEnable = builder.initDriveEnable;
        this.initDriveSize = builder.initDriveSize;
        this.publishedAppAccessStrategy = builder.publishedAppAccessStrategy;
        this.sizeQuota = builder.sizeQuota;
        this.userCountQuota = builder.userCountQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainRequest create() {
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
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
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
     * @return publishedAppAccessStrategy
     */
    public AppAccessStrategy getPublishedAppAccessStrategy() {
        return this.publishedAppAccessStrategy;
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

    public static final class Builder extends Request.Builder<UpdateDomainRequest, Builder> {
        private String description; 
        private String domainId; 
        private String domainName; 
        private Boolean initDriveEnable; 
        private Long initDriveSize; 
        private AppAccessStrategy publishedAppAccessStrategy; 
        private Long sizeQuota; 
        private Long userCountQuota; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDomainRequest request) {
            super(request);
            this.description = request.description;
            this.domainId = request.domainId;
            this.domainName = request.domainName;
            this.initDriveEnable = request.initDriveEnable;
            this.initDriveSize = request.initDriveSize;
            this.publishedAppAccessStrategy = request.publishedAppAccessStrategy;
            this.sizeQuota = request.sizeQuota;
            this.userCountQuota = request.userCountQuota;
        } 

        /**
         * <p>The description of the domain.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The domain ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bj1</p>
         */
        public Builder domainId(String domainId) {
            this.putBodyParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The name of the domain.</p>
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
         * <p>The size of the default drive. Unit: bytes. You must specify init_drive_size if you set init_drive_enable to true. Default value: 0. A value of 0 specifies that the size of the default drive is 0 bytes and you cannot upload files to the drive. To initialize the default drive, set init_drive_size to 0. A value of -1 specifies that the size is unlimited.</p>
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
         * <p>The access policy of the application.</p>
         */
        public Builder publishedAppAccessStrategy(AppAccessStrategy publishedAppAccessStrategy) {
            this.putBodyParameter("published_app_access_strategy", publishedAppAccessStrategy);
            this.publishedAppAccessStrategy = publishedAppAccessStrategy;
            return this;
        }

        /**
         * <p>The total storage quota for all drives in the domain. A value of 0 specifies that the quota is unlimited.</p>
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
         * <p>The maximum number of users that can be created in the domain.</p>
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
        public UpdateDomainRequest build() {
            return new UpdateDomainRequest(this);
        } 

    } 

}
