// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForTransferProhibitionLockRequest} extends {@link RequestModel}
 *
 * <p>SaveSingleTaskForTransferProhibitionLockRequest</p>
 */
public class SaveSingleTaskForTransferProhibitionLockRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SaveSingleTaskForTransferProhibitionLockRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.status = builder.status;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSingleTaskForTransferProhibitionLockRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveSingleTaskForTransferProhibitionLockRequest, Builder> {
        private String domainName; 
        private String lang; 
        private Boolean status; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveSingleTaskForTransferProhibitionLockRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.status = request.status;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Boolean status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveSingleTaskForTransferProhibitionLockRequest build() {
            return new SaveSingleTaskForTransferProhibitionLockRequest(this);
        } 

    } 

}
