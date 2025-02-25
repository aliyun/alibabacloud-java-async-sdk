// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStsByTaobaoUidRequest} extends {@link RequestModel}
 *
 * <p>GetStsByTaobaoUidRequest</p>
 */
public class GetStsByTaobaoUidRequest extends Request {
    @Query
    @NameInMap("AliyunUid")
    private String aliyunUid;

    @Query
    @NameInMap("TbUid")
    @Validation(required = true)
    private String tbUid;

    private GetStsByTaobaoUidRequest(Builder builder) {
        super(builder);
        this.aliyunUid = builder.aliyunUid;
        this.tbUid = builder.tbUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStsByTaobaoUidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunUid
     */
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    /**
     * @return tbUid
     */
    public String getTbUid() {
        return this.tbUid;
    }

    public static final class Builder extends Request.Builder<GetStsByTaobaoUidRequest, Builder> {
        private String aliyunUid; 
        private String tbUid; 

        private Builder() {
            super();
        } 

        private Builder(GetStsByTaobaoUidRequest request) {
            super(request);
            this.aliyunUid = request.aliyunUid;
            this.tbUid = request.tbUid;
        } 

        /**
         * AliyunUid.
         */
        public Builder aliyunUid(String aliyunUid) {
            this.putQueryParameter("AliyunUid", aliyunUid);
            this.aliyunUid = aliyunUid;
            return this;
        }

        /**
         * TbUid.
         */
        public Builder tbUid(String tbUid) {
            this.putQueryParameter("TbUid", tbUid);
            this.tbUid = tbUid;
            return this;
        }

        @Override
        public GetStsByTaobaoUidRequest build() {
            return new GetStsByTaobaoUidRequest(this);
        } 

    } 

}
