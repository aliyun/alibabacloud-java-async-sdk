// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodStreamURLRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodStreamURLRequest</p>
 */
public class DescribeVodStreamURLRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("TxId")
    private String txId;

    @Query
    @NameInMap("Url")
    @Validation(required = true)
    private String url;

    private DescribeVodStreamURLRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.txId = builder.txId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodStreamURLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return txId
     */
    public String getTxId() {
        return this.txId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<DescribeVodStreamURLRequest, Builder> {
        private Long ownerId; 
        private String txId; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodStreamURLRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.txId = response.txId;
            this.url = response.url;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * TxId.
         */
        public Builder txId(String txId) {
            this.putQueryParameter("TxId", txId);
            this.txId = txId;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public DescribeVodStreamURLRequest build() {
            return new DescribeVodStreamURLRequest(this);
        } 

    } 

}
