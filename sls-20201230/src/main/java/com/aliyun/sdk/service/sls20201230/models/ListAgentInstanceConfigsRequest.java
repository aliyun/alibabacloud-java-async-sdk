// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ListAgentInstanceConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListAgentInstanceConfigsRequest</p>
 */
public class ListAgentInstanceConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("offset")
    private Long offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    private ListAgentInstanceConfigsRequest(Builder builder) {
        super(builder);
        this.offset = builder.offset;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentInstanceConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListAgentInstanceConfigsRequest, Builder> {
        private Long offset; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentInstanceConfigsRequest request) {
            super(request);
            this.offset = request.offset;
            this.size = request.size;
        } 

        /**
         * offset.
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListAgentInstanceConfigsRequest build() {
            return new ListAgentInstanceConfigsRequest(this);
        } 

    } 

}
