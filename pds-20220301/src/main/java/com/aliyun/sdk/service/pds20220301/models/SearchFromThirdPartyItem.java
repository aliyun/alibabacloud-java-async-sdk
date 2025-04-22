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
 * {@link SearchFromThirdPartyItem} extends {@link TeaModel}
 *
 * <p>SearchFromThirdPartyItem</p>
 */
public class SearchFromThirdPartyItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authentication_type")
    private String authenticationType;

    @com.aliyun.core.annotation.NameInMap("extra")
    private String extra;

    @com.aliyun.core.annotation.NameInMap("identity")
    private String identity;

    @com.aliyun.core.annotation.NameInMap("others")
    private java.util.Map<String, ?> others;

    private SearchFromThirdPartyItem(Builder builder) {
        this.authenticationType = builder.authenticationType;
        this.extra = builder.extra;
        this.identity = builder.identity;
        this.others = builder.others;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchFromThirdPartyItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authenticationType
     */
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
    }

    /**
     * @return identity
     */
    public String getIdentity() {
        return this.identity;
    }

    /**
     * @return others
     */
    public java.util.Map<String, ?> getOthers() {
        return this.others;
    }

    public static final class Builder {
        private String authenticationType; 
        private String extra; 
        private String identity; 
        private java.util.Map<String, ?> others; 

        private Builder() {
        } 

        private Builder(SearchFromThirdPartyItem model) {
            this.authenticationType = model.authenticationType;
            this.extra = model.extra;
            this.identity = model.identity;
            this.others = model.others;
        } 

        /**
         * authentication_type.
         */
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * extra.
         */
        public Builder extra(String extra) {
            this.extra = extra;
            return this;
        }

        /**
         * identity.
         */
        public Builder identity(String identity) {
            this.identity = identity;
            return this;
        }

        /**
         * others.
         */
        public Builder others(java.util.Map<String, ?> others) {
            this.others = others;
            return this;
        }

        public SearchFromThirdPartyItem build() {
            return new SearchFromThirdPartyItem(this);
        } 

    } 

}
