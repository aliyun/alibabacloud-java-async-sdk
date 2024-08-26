// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckMaxYearOfServerLockRequest} extends {@link RequestModel}
 *
 * <p>CheckMaxYearOfServerLockRequest</p>
 */
public class CheckMaxYearOfServerLockRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private CheckMaxYearOfServerLockRequest(Builder builder) {
        super(builder);
        this.checkAction = builder.checkAction;
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckMaxYearOfServerLockRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkAction
     */
    public String getCheckAction() {
        return this.checkAction;
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
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<CheckMaxYearOfServerLockRequest, Builder> {
        private String checkAction; 
        private String domainName; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(CheckMaxYearOfServerLockRequest request) {
            super(request);
            this.checkAction = request.checkAction;
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * CheckAction.
         */
        public Builder checkAction(String checkAction) {
            this.putQueryParameter("CheckAction", checkAction);
            this.checkAction = checkAction;
            return this;
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
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public CheckMaxYearOfServerLockRequest build() {
            return new CheckMaxYearOfServerLockRequest(this);
        } 

    } 

}
