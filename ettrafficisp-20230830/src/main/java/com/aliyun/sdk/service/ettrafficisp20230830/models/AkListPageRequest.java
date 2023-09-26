// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ettrafficisp20230830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AkListPageRequest} extends {@link RequestModel}
 *
 * <p>AkListPageRequest</p>
 */
public class AkListPageRequest extends Request {
    @Query
    @NameInMap("page")
    private Integer page;

    @Query
    @NameInMap("size")
    private Integer size;

    @Query
    @NameInMap("start")
    private Integer start;

    private AkListPageRequest(Builder builder) {
        super(builder);
        this.page = builder.page;
        this.size = builder.size;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AkListPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return start
     */
    public Integer getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<AkListPageRequest, Builder> {
        private Integer page; 
        private Integer size; 
        private Integer start; 

        private Builder() {
            super();
        } 

        private Builder(AkListPageRequest request) {
            super(request);
            this.page = request.page;
            this.size = request.size;
            this.start = request.start;
        } 

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * start.
         */
        public Builder start(Integer start) {
            this.putQueryParameter("start", start);
            this.start = start;
            return this;
        }

        @Override
        public AkListPageRequest build() {
            return new AkListPageRequest(this);
        } 

    } 

}
