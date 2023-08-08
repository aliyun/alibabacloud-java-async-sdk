// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEdgeMachinesRequest} extends {@link RequestModel}
 *
 * <p>DescribeEdgeMachinesRequest</p>
 */
public class DescribeEdgeMachinesRequest extends Request {
    @Query
    @NameInMap("hostname")
    private String hostname;

    @Query
    @NameInMap("life_state")
    private String lifeState;

    @Query
    @NameInMap("model")
    private String model;

    @Query
    @NameInMap("online_state")
    private String onlineState;

    @Query
    @NameInMap("page_number")
    private Long pageNumber;

    @Query
    @NameInMap("page_size")
    private Long pageSize;

    private DescribeEdgeMachinesRequest(Builder builder) {
        super(builder);
        this.hostname = builder.hostname;
        this.lifeState = builder.lifeState;
        this.model = builder.model;
        this.onlineState = builder.onlineState;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeMachinesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return lifeState
     */
    public String getLifeState() {
        return this.lifeState;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return onlineState
     */
    public String getOnlineState() {
        return this.onlineState;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeEdgeMachinesRequest, Builder> {
        private String hostname; 
        private String lifeState; 
        private String model; 
        private String onlineState; 
        private Long pageNumber; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEdgeMachinesRequest request) {
            super(request);
            this.hostname = request.hostname;
            this.lifeState = request.lifeState;
            this.model = request.model;
            this.onlineState = request.onlineState;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * hostname.
         */
        public Builder hostname(String hostname) {
            this.putQueryParameter("hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * life_state.
         */
        public Builder lifeState(String lifeState) {
            this.putQueryParameter("life_state", lifeState);
            this.lifeState = lifeState;
            return this;
        }

        /**
         * model.
         */
        public Builder model(String model) {
            this.putQueryParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * online_state.
         */
        public Builder onlineState(String onlineState) {
            this.putQueryParameter("online_state", onlineState);
            this.onlineState = onlineState;
            return this;
        }

        /**
         * page_number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("page_number", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * page_size.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeEdgeMachinesRequest build() {
            return new DescribeEdgeMachinesRequest(this);
        } 

    } 

}
