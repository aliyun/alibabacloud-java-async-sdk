// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JWTAuthConfig} extends {@link TeaModel}
 *
 * <p>JWTAuthConfig</p>
 */
public class JWTAuthConfig extends TeaModel {
    @NameInMap("blackList")
    private String blackList;

    @NameInMap("claimPassBy")
    private java.util.List < String > claimPassBy;

    @NameInMap("jwks")
    private String jwks;

    @NameInMap("tokenLookup")
    private java.util.List < String > tokenLookup;

    @NameInMap("whiteList")
    private java.util.List < String > whiteList;

    private JWTAuthConfig(Builder builder) {
        this.blackList = builder.blackList;
        this.claimPassBy = builder.claimPassBy;
        this.jwks = builder.jwks;
        this.tokenLookup = builder.tokenLookup;
        this.whiteList = builder.whiteList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JWTAuthConfig create() {
        return builder().build();
    }

    /**
     * @return blackList
     */
    public String getBlackList() {
        return this.blackList;
    }

    /**
     * @return claimPassBy
     */
    public java.util.List < String > getClaimPassBy() {
        return this.claimPassBy;
    }

    /**
     * @return jwks
     */
    public String getJwks() {
        return this.jwks;
    }

    /**
     * @return tokenLookup
     */
    public java.util.List < String > getTokenLookup() {
        return this.tokenLookup;
    }

    /**
     * @return whiteList
     */
    public java.util.List < String > getWhiteList() {
        return this.whiteList;
    }

    public static final class Builder {
        private String blackList; 
        private java.util.List < String > claimPassBy; 
        private String jwks; 
        private java.util.List < String > tokenLookup; 
        private java.util.List < String > whiteList; 

        /**
         * blackList.
         */
        public Builder blackList(String blackList) {
            this.blackList = blackList;
            return this;
        }

        /**
         * claimPassBy.
         */
        public Builder claimPassBy(java.util.List < String > claimPassBy) {
            this.claimPassBy = claimPassBy;
            return this;
        }

        /**
         * jwks.
         */
        public Builder jwks(String jwks) {
            this.jwks = jwks;
            return this;
        }

        /**
         * tokenLookup.
         */
        public Builder tokenLookup(java.util.List < String > tokenLookup) {
            this.tokenLookup = tokenLookup;
            return this;
        }

        /**
         * whiteList.
         */
        public Builder whiteList(java.util.List < String > whiteList) {
            this.whiteList = whiteList;
            return this;
        }

        public JWTAuthConfig build() {
            return new JWTAuthConfig(this);
        } 

    } 

}
