// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchRegistAnonymousTbAccountRequest} extends {@link RequestModel}
 *
 * <p>BatchRegistAnonymousTbAccountRequest</p>
 */
public class BatchRegistAnonymousTbAccountRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("IdJsonList")
    @Validation(required = true)
    private String idJsonList;

    private BatchRegistAnonymousTbAccountRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.idJsonList = builder.idJsonList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRegistAnonymousTbAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return idJsonList
     */
    public String getIdJsonList() {
        return this.idJsonList;
    }

    public static final class Builder extends Request.Builder<BatchRegistAnonymousTbAccountRequest, Builder> {
        private String bizId; 
        private String idJsonList; 

        private Builder() {
            super();
        } 

        private Builder(BatchRegistAnonymousTbAccountRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.idJsonList = request.idJsonList;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * IdJsonList.
         */
        public Builder idJsonList(String idJsonList) {
            this.putQueryParameter("IdJsonList", idJsonList);
            this.idJsonList = idJsonList;
            return this;
        }

        @Override
        public BatchRegistAnonymousTbAccountRequest build() {
            return new BatchRegistAnonymousTbAccountRequest(this);
        } 

    } 

}
