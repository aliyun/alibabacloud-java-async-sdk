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
 * {@link HiMarketProductPublicationDetail} extends {@link TeaModel}
 *
 * <p>HiMarketProductPublicationDetail</p>
 */
public class HiMarketProductPublicationDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("portalId")
    private String portalId;

    @com.aliyun.core.annotation.NameInMap("portalName")
    private String portalName;

    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.NameInMap("productName")
    private String productName;

    @com.aliyun.core.annotation.NameInMap("productType")
    private String productType;

    @com.aliyun.core.annotation.NameInMap("publicationId")
    private String publicationId;

    private HiMarketProductPublicationDetail(Builder builder) {
        this.portalId = builder.portalId;
        this.portalName = builder.portalName;
        this.productId = builder.productId;
        this.productName = builder.productName;
        this.productType = builder.productType;
        this.publicationId = builder.publicationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketProductPublicationDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return portalId
     */
    public String getPortalId() {
        return this.portalId;
    }

    /**
     * @return portalName
     */
    public String getPortalName() {
        return this.portalName;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return publicationId
     */
    public String getPublicationId() {
        return this.publicationId;
    }

    public static final class Builder {
        private String portalId; 
        private String portalName; 
        private String productId; 
        private String productName; 
        private String productType; 
        private String publicationId; 

        private Builder() {
        } 

        private Builder(HiMarketProductPublicationDetail model) {
            this.portalId = model.portalId;
            this.portalName = model.portalName;
            this.productId = model.productId;
            this.productName = model.productName;
            this.productType = model.productType;
            this.publicationId = model.publicationId;
        } 

        /**
         * portalId.
         */
        public Builder portalId(String portalId) {
            this.portalId = portalId;
            return this;
        }

        /**
         * portalName.
         */
        public Builder portalName(String portalName) {
            this.portalName = portalName;
            return this;
        }

        /**
         * productId.
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * productName.
         */
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
         * productType.
         */
        public Builder productType(String productType) {
            this.productType = productType;
            return this;
        }

        /**
         * publicationId.
         */
        public Builder publicationId(String publicationId) {
            this.publicationId = publicationId;
            return this;
        }

        public HiMarketProductPublicationDetail build() {
            return new HiMarketProductPublicationDetail(this);
        } 

    } 

}
