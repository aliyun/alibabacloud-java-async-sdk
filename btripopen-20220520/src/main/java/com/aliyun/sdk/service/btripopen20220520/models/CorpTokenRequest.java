// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CorpTokenRequest} extends {@link RequestModel}
 *
 * <p>CorpTokenRequest</p>
 */
public class CorpTokenRequest extends Request {
    @Query
    @NameInMap("corp_id")
    private String corpId;

    @Query
    @NameInMap("type")
    private Integer type;

    private CorpTokenRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CorpTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CorpTokenRequest, Builder> {
        private String corpId; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(CorpTokenRequest request) {
            super(request);
            this.corpId = request.corpId;
            this.type = request.type;
        } 

        /**
         * 企业id，值可以在开放平台中的关联企业查看。
         */
        public Builder corpId(String corpId) {
            this.putQueryParameter("corp_id", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * 类型，0-自营 1-分销
         */
        public Builder type(Integer type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CorpTokenRequest build() {
            return new CorpTokenRequest(this);
        } 

    } 

}
