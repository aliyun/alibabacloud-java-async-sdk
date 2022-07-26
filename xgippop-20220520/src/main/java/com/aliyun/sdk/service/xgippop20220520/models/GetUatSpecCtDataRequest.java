// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUatSpecCtDataRequest} extends {@link RequestModel}
 *
 * <p>GetUatSpecCtDataRequest</p>
 */
public class GetUatSpecCtDataRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private Long aliUid;

    @Query
    @NameInMap("DsMonth")
    @Validation(required = true)
    private Long dsMonth;

    @Query
    @NameInMap("ItemId")
    @Validation(required = true)
    private String itemId;

    private GetUatSpecCtDataRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.dsMonth = builder.dsMonth;
        this.itemId = builder.itemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUatSpecCtDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return dsMonth
     */
    public Long getDsMonth() {
        return this.dsMonth;
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    public static final class Builder extends Request.Builder<GetUatSpecCtDataRequest, Builder> {
        private Long aliUid; 
        private Long dsMonth; 
        private String itemId; 

        private Builder() {
            super();
        } 

        private Builder(GetUatSpecCtDataRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.dsMonth = request.dsMonth;
            this.itemId = request.itemId;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * 查询月份
         */
        public Builder dsMonth(Long dsMonth) {
            this.putQueryParameter("DsMonth", dsMonth);
            this.dsMonth = dsMonth;
            return this;
        }

        /**
         * 商品code
         */
        public Builder itemId(String itemId) {
            this.putQueryParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        @Override
        public GetUatSpecCtDataRequest build() {
            return new GetUatSpecCtDataRequest(this);
        } 

    } 

}
