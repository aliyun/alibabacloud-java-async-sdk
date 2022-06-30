// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrendImageListRequest} extends {@link RequestModel}
 *
 * <p>GetTrendImageListRequest</p>
 */
public class GetTrendImageListRequest extends Request {
    @Body
    @NameInMap("CateIds")
    @Validation(required = true)
    private String cateIds;

    @Body
    @NameInMap("Query")
    private String query;

    private GetTrendImageListRequest(Builder builder) {
        super(builder);
        this.cateIds = builder.cateIds;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrendImageListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cateIds
     */
    public String getCateIds() {
        return this.cateIds;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<GetTrendImageListRequest, Builder> {
        private String cateIds; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(GetTrendImageListRequest request) {
            super(request);
            this.cateIds = request.cateIds;
            this.query = request.query;
        } 

        /**
         * CateIds.
         */
        public Builder cateIds(String cateIds) {
            this.putBodyParameter("CateIds", cateIds);
            this.cateIds = cateIds;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        @Override
        public GetTrendImageListRequest build() {
            return new GetTrendImageListRequest(this);
        } 

    } 

}
