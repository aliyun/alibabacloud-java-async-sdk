// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBlockchainCreateTaskRequest} extends {@link RequestModel}
 *
 * <p>GetBlockchainCreateTaskRequest</p>
 */
public class GetBlockchainCreateTaskRequest extends Request {
    @Body
    @NameInMap("Current")
    private Integer current;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    private GetBlockchainCreateTaskRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBlockchainCreateTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<GetBlockchainCreateTaskRequest, Builder> {
        private Integer current; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetBlockchainCreateTaskRequest request) {
            super(request);
            this.current = request.current;
            this.pageSize = request.pageSize;
        } 

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.putBodyParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public GetBlockchainCreateTaskRequest build() {
            return new GetBlockchainCreateTaskRequest(this);
        } 

    } 

}
