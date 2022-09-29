// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryReceiverDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryReceiverDetailRequest</p>
 */
public class QueryReceiverDetailRequest extends Request {
    @Query
    @NameInMap("KeyWord")
    private String keyWord;

    @Query
    @NameInMap("NextStart")
    private String nextStart;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ReceiverId")
    @Validation(required = true)
    private String receiverId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private QueryReceiverDetailRequest(Builder builder) {
        super(builder);
        this.keyWord = builder.keyWord;
        this.nextStart = builder.nextStart;
        this.ownerId = builder.ownerId;
        this.pageSize = builder.pageSize;
        this.receiverId = builder.receiverId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryReceiverDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyWord
     */
    public String getKeyWord() {
        return this.keyWord;
    }

    /**
     * @return nextStart
     */
    public String getNextStart() {
        return this.nextStart;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return receiverId
     */
    public String getReceiverId() {
        return this.receiverId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<QueryReceiverDetailRequest, Builder> {
        private String keyWord; 
        private String nextStart; 
        private Long ownerId; 
        private Integer pageSize; 
        private String receiverId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryReceiverDetailRequest request) {
            super(request);
            this.keyWord = request.keyWord;
            this.nextStart = request.nextStart;
            this.ownerId = request.ownerId;
            this.pageSize = request.pageSize;
            this.receiverId = request.receiverId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * KeyWord.
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * NextStart.
         */
        public Builder nextStart(String nextStart) {
            this.putQueryParameter("NextStart", nextStart);
            this.nextStart = nextStart;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ReceiverId.
         */
        public Builder receiverId(String receiverId) {
            this.putQueryParameter("ReceiverId", receiverId);
            this.receiverId = receiverId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public QueryReceiverDetailRequest build() {
            return new QueryReceiverDetailRequest(this);
        } 

    } 

}
