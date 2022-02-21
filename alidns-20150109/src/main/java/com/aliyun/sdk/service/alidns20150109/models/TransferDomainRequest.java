// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferDomainRequest} extends {@link RequestModel}
 *
 * <p>TransferDomainRequest</p>
 */
public class TransferDomainRequest extends Request {
    @Query
    @NameInMap("DomainNames")
    @Validation(required = true)
    private String domainNames;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("TargetUserId")
    @Validation(required = true)
    private Long targetUserId;

    private TransferDomainRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
        this.lang = builder.lang;
        this.remark = builder.remark;
        this.targetUserId = builder.targetUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNames
     */
    public String getDomainNames() {
        return this.domainNames;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return targetUserId
     */
    public Long getTargetUserId() {
        return this.targetUserId;
    }

    public static final class Builder extends Request.Builder<TransferDomainRequest, Builder> {
        private String domainNames; 
        private String lang; 
        private String remark; 
        private Long targetUserId; 

        private Builder() {
            super();
        } 

        private Builder(TransferDomainRequest response) {
            super(response);
            this.domainNames = response.domainNames;
            this.lang = response.lang;
            this.remark = response.remark;
            this.targetUserId = response.targetUserId;
        } 

        /**
         * DomainNames.
         */
        public Builder domainNames(String domainNames) {
            this.putQueryParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
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
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * TargetUserId.
         */
        public Builder targetUserId(Long targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        @Override
        public TransferDomainRequest build() {
            return new TransferDomainRequest(this);
        } 

    } 

}
