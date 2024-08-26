// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckProcessingServerLockApplyRequest} extends {@link RequestModel}
 *
 * <p>CheckProcessingServerLockApplyRequest</p>
 */
public class CheckProcessingServerLockApplyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeePeriod")
    private Integer feePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private CheckProcessingServerLockApplyRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.feePeriod = builder.feePeriod;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckProcessingServerLockApplyRequest create() {
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
     * @return feePeriod
     */
    public Integer getFeePeriod() {
        return this.feePeriod;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<CheckProcessingServerLockApplyRequest, Builder> {
        private String domainName; 
        private Integer feePeriod; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(CheckProcessingServerLockApplyRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.feePeriod = request.feePeriod;
            this.lang = request.lang;
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
         * FeePeriod.
         */
        public Builder feePeriod(Integer feePeriod) {
            this.putQueryParameter("FeePeriod", feePeriod);
            this.feePeriod = feePeriod;
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
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public CheckProcessingServerLockApplyRequest build() {
            return new CheckProcessingServerLockApplyRequest(this);
        } 

    } 

}
