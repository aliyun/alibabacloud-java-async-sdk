// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetItemListRequest} extends {@link RequestModel}
 *
 * <p>GetItemListRequest</p>
 */
public class GetItemListRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private Long aliUid;

    @Query
    @NameInMap("BizCode")
    @Validation(required = true)
    private String bizCode;

    private GetItemListRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.bizCode = builder.bizCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetItemListRequest create() {
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
     * @return bizCode
     */
    public String getBizCode() {
        return this.bizCode;
    }

    public static final class Builder extends Request.Builder<GetItemListRequest, Builder> {
        private Long aliUid; 
        private String bizCode; 

        private Builder() {
            super();
        } 

        private Builder(GetItemListRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.bizCode = request.bizCode;
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
         * 业务类型
         */
        public Builder bizCode(String bizCode) {
            this.putQueryParameter("BizCode", bizCode);
            this.bizCode = bizCode;
            return this;
        }

        @Override
        public GetItemListRequest build() {
            return new GetItemListRequest(this);
        } 

    } 

}
