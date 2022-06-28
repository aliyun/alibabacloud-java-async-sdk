// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidControllerAuthorRequest} extends {@link RequestModel}
 *
 * <p>ValidControllerAuthorRequest</p>
 */
public class ValidControllerAuthorRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private Long aliUid;

    @Query
    @NameInMap("ItemCode")
    @Validation(required = true)
    private String itemCode;

    private ValidControllerAuthorRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.itemCode = builder.itemCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidControllerAuthorRequest create() {
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
     * @return itemCode
     */
    public String getItemCode() {
        return this.itemCode;
    }

    public static final class Builder extends Request.Builder<ValidControllerAuthorRequest, Builder> {
        private Long aliUid; 
        private String itemCode; 

        private Builder() {
            super();
        } 

        private Builder(ValidControllerAuthorRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.itemCode = request.itemCode;
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
         * 商品code
         */
        public Builder itemCode(String itemCode) {
            this.putQueryParameter("ItemCode", itemCode);
            this.itemCode = itemCode;
            return this;
        }

        @Override
        public ValidControllerAuthorRequest build() {
            return new ValidControllerAuthorRequest(this);
        } 

    } 

}
