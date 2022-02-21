// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForUpdateProhibitionLockRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForUpdateProhibitionLockRequest</p>
 */
public class SaveBatchTaskForUpdateProhibitionLockRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private java.util.List < String > domainName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private Boolean status;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private SaveBatchTaskForUpdateProhibitionLockRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.status = builder.status;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForUpdateProhibitionLockRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public java.util.List < String > getDomainName() {
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

    public static final class Builder extends Request.Builder<SaveBatchTaskForUpdateProhibitionLockRequest, Builder> {
        private java.util.List < String > domainName; 
        private String lang; 
        private Boolean status; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchTaskForUpdateProhibitionLockRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.lang = response.lang;
            this.status = response.status;
            this.userClientIp = response.userClientIp;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(java.util.List < String > domainName) {
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
        public SaveBatchTaskForUpdateProhibitionLockRequest build() {
            return new SaveBatchTaskForUpdateProhibitionLockRequest(this);
        } 

    } 

}
