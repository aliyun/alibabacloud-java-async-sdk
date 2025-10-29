// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link ShareOptions} extends {@link TeaModel}
 *
 * <p>ShareOptions</p>
 */
public class ShareOptions extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("catalogSizeLimit")
    private Integer catalogSizeLimit;

    @com.aliyun.core.annotation.NameInMap("receiverSizeLimit")
    private Integer receiverSizeLimit;

    @com.aliyun.core.annotation.NameInMap("shareResourceSizeLimit")
    private Integer shareResourceSizeLimit;

    @com.aliyun.core.annotation.NameInMap("shareSizeLimit")
    private Integer shareSizeLimit;

    private ShareOptions(Builder builder) {
        this.catalogSizeLimit = builder.catalogSizeLimit;
        this.receiverSizeLimit = builder.receiverSizeLimit;
        this.shareResourceSizeLimit = builder.shareResourceSizeLimit;
        this.shareSizeLimit = builder.shareSizeLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShareOptions create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogSizeLimit
     */
    public Integer getCatalogSizeLimit() {
        return this.catalogSizeLimit;
    }

    /**
     * @return receiverSizeLimit
     */
    public Integer getReceiverSizeLimit() {
        return this.receiverSizeLimit;
    }

    /**
     * @return shareResourceSizeLimit
     */
    public Integer getShareResourceSizeLimit() {
        return this.shareResourceSizeLimit;
    }

    /**
     * @return shareSizeLimit
     */
    public Integer getShareSizeLimit() {
        return this.shareSizeLimit;
    }

    public static final class Builder {
        private Integer catalogSizeLimit; 
        private Integer receiverSizeLimit; 
        private Integer shareResourceSizeLimit; 
        private Integer shareSizeLimit; 

        private Builder() {
        } 

        private Builder(ShareOptions model) {
            this.catalogSizeLimit = model.catalogSizeLimit;
            this.receiverSizeLimit = model.receiverSizeLimit;
            this.shareResourceSizeLimit = model.shareResourceSizeLimit;
            this.shareSizeLimit = model.shareSizeLimit;
        } 

        /**
         * catalogSizeLimit.
         */
        public Builder catalogSizeLimit(Integer catalogSizeLimit) {
            this.catalogSizeLimit = catalogSizeLimit;
            return this;
        }

        /**
         * receiverSizeLimit.
         */
        public Builder receiverSizeLimit(Integer receiverSizeLimit) {
            this.receiverSizeLimit = receiverSizeLimit;
            return this;
        }

        /**
         * shareResourceSizeLimit.
         */
        public Builder shareResourceSizeLimit(Integer shareResourceSizeLimit) {
            this.shareResourceSizeLimit = shareResourceSizeLimit;
            return this;
        }

        /**
         * shareSizeLimit.
         */
        public Builder shareSizeLimit(Integer shareSizeLimit) {
            this.shareSizeLimit = shareSizeLimit;
            return this;
        }

        public ShareOptions build() {
            return new ShareOptions(this);
        } 

    } 

}
