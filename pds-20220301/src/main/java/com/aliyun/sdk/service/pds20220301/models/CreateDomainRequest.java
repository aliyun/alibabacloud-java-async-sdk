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
         * <p>domain 描述</p>
         * 
         * <strong>example:</strong>
         * <p>你好企业网盘开发环境</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>If you want to perform secondary operations based on Drive and Photo Service and perform fine-grained control on your tenants, you can use the parent-child domain feature of Drive and Photo Service. For more information, join the DingTalk group whose ID is 23146118.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>你好企业网盘</p>
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("domain_name", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>https</p>
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
         * <p>http</p>
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
         * <p>Create domain.</p>
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
         * <p>The ID of the parent domain. If you want to create a child domain, specify parent_domain_id. In most cases, you do not need to create a child domain. If you want to perform secondary operations based on Drive and Photo Service, contact the customer service.</p>
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
         * <p>The information about the domain.</p>
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
