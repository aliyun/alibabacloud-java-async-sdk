// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFaceDbsRequest} extends {@link RequestModel}
 *
 * <p>ListFaceDbsRequest</p>
 */
public class ListFaceDbsRequest extends Request {
    @Body
    @NameInMap("Limit")
    private Long limit;

    @Body
    @NameInMap("Offset")
    private Long offset;

    private ListFaceDbsRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.offset = builder.offset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFaceDbsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    public static final class Builder extends Request.Builder<ListFaceDbsRequest, Builder> {
        private Long limit; 
        private Long offset; 

        private Builder() {
            super();
        } 

        private Builder(ListFaceDbsRequest request) {
            super(request);
            this.limit = request.limit;
            this.offset = request.offset;
        } 

        /**
         * Limit.
         */
        public Builder limit(Long limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Long offset) {
            this.putBodyParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        @Override
        public ListFaceDbsRequest build() {
            return new ListFaceDbsRequest(this);
        } 

    } 

}
