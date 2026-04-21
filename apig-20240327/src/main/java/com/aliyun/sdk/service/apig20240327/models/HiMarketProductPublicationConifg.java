// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HiMarketProductPublicationConifg} extends {@link TeaModel}
 *
 * <p>HiMarketProductPublicationConifg</p>
 */
public class HiMarketProductPublicationConifg extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("publicationId")
    private String publicationId;

    private HiMarketProductPublicationConifg(Builder builder) {
        this.publicationId = builder.publicationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketProductPublicationConifg create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return publicationId
     */
    public String getPublicationId() {
        return this.publicationId;
    }

    public static final class Builder {
        private String publicationId; 

        private Builder() {
        } 

        private Builder(HiMarketProductPublicationConifg model) {
            this.publicationId = model.publicationId;
        } 

        /**
         * publicationId.
         */
        public Builder publicationId(String publicationId) {
            this.publicationId = publicationId;
            return this;
        }

        public HiMarketProductPublicationConifg build() {
            return new HiMarketProductPublicationConifg(this);
        } 

    } 

}
