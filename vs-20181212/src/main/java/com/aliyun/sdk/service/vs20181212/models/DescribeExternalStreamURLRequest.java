// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExternalStreamURLRequest} extends {@link RequestModel}
 *
 * <p>DescribeExternalStreamURLRequest</p>
 */
public class DescribeExternalStreamURLRequest extends Request {
    @Query
    @NameInMap("Kind")
    @Validation(required = true)
    private String kind;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Profile")
    private String profile;

    @Query
    @NameInMap("TxId")
    private String txId;

    @Query
    @NameInMap("Url")
    @Validation(required = true)
    private String url;

    private DescribeExternalStreamURLRequest(Builder builder) {
        super(builder);
        this.kind = builder.kind;
        this.ownerId = builder.ownerId;
        this.profile = builder.profile;
        this.txId = builder.txId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExternalStreamURLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
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

    public static final class Builder extends Request.Builder<DescribeExternalStreamURLRequest, Builder> {
        private String kind; 
        private Long ownerId; 
        private String profile; 
        private String txId; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExternalStreamURLRequest response) {
            super(response);
            this.kind = response.kind;
            this.ownerId = response.ownerId;
            this.profile = response.profile;
            this.txId = response.txId;
            this.url = response.url;
        } 

        /**
         * Kind.
         */
        public Builder kind(String kind) {
            this.putQueryParameter("Kind", kind);
            this.kind = kind;
            return this;
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
         * Profile.
         */
        public Builder profile(String profile) {
            this.putQueryParameter("Profile", profile);
            this.profile = profile;
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
        public DescribeExternalStreamURLRequest build() {
            return new DescribeExternalStreamURLRequest(this);
        } 

    } 

}
