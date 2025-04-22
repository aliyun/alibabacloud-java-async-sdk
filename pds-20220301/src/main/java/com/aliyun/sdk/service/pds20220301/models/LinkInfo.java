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
 * {@link LinkInfo} extends {@link TeaModel}
 *
 * <p>LinkInfo</p>
 */
public class LinkInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("extra")
    private String extra;

    @com.aliyun.core.annotation.NameInMap("identity")
    private String identity;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private LinkInfo(Builder builder) {
        this.extra = builder.extra;
        this.identity = builder.identity;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LinkInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String extra; 
        private String identity; 
        private String type; 

        private Builder() {
        } 

        private Builder(LinkInfo model) {
            this.extra = model.extra;
            this.identity = model.identity;
            this.type = model.type;
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
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public LinkInfo build() {
            return new LinkInfo(this);
        } 

    } 

}
