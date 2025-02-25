// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAliyunUidRequest} extends {@link RequestModel}
 *
 * <p>QueryAliyunUidRequest</p>
 */
public class QueryAliyunUidRequest extends Request {
    @Query
    @NameInMap("TbUid")
    @Validation(required = true)
    private String tbUid;

    private QueryAliyunUidRequest(Builder builder) {
        super(builder);
        this.tbUid = builder.tbUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAliyunUidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tbUid
     */
    public String getTbUid() {
        return this.tbUid;
    }

    public static final class Builder extends Request.Builder<QueryAliyunUidRequest, Builder> {
        private String tbUid; 

        private Builder() {
            super();
        } 

        private Builder(QueryAliyunUidRequest request) {
            super(request);
            this.tbUid = request.tbUid;
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
        public QueryAliyunUidRequest build() {
            return new QueryAliyunUidRequest(this);
        } 

    } 

}
