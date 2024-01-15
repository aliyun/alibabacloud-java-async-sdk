// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListAnnotationDataSetsRequest} extends {@link RequestModel}
 *
 * <p>ListAnnotationDataSetsRequest</p>
 */
public class ListAnnotationDataSetsRequest extends Request {
    @Query
    @NameInMap("offset")
    private Integer offset;

    @Query
    @NameInMap("size")
    private Integer size;

    private ListAnnotationDataSetsRequest(Builder builder) {
        super(builder);
        this.offset = builder.offset;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnnotationDataSetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListAnnotationDataSetsRequest, Builder> {
        private Integer offset; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListAnnotationDataSetsRequest request) {
            super(request);
            this.offset = request.offset;
            this.size = request.size;
        } 

        /**
         * The line from which the query starts.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListAnnotationDataSetsRequest build() {
            return new ListAnnotationDataSetsRequest(this);
        } 

    } 

}
