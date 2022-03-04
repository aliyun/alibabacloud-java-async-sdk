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
    @NameInMap("model")
    private String model;

    @Query
    @NameInMap("page_number")
    private Long pageNumber;

    @Query
    @NameInMap("hostname")
    private String hostname;

    @Query
    @NameInMap("online_state")
    private String onlineState;

    @Query
    @NameInMap("life_state")
    private String lifeState;

    @Query
    @NameInMap("page_size")
    private Long pageSize;

    private DescribeEdgeMachinesRequest(Builder builder) {
        super(builder);
        this.model = builder.model;
        this.pageNumber = builder.pageNumber;
        this.hostname = builder.hostname;
        this.onlineState = builder.onlineState;
        this.lifeState = builder.lifeState;
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
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return onlineState
     */
    public String getOnlineState() {
        return this.onlineState;
    }

    /**
     * @return lifeState
     */
    public String getLifeState() {
        return this.lifeState;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeEdgeMachinesRequest, Builder> {
        private String model; 
        private Long pageNumber; 
        private String hostname; 
        private String onlineState; 
        private String lifeState; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEdgeMachinesRequest request) {
            super(request);
            this.model = request.model;
            this.pageNumber = request.pageNumber;
            this.hostname = request.hostname;
            this.onlineState = request.onlineState;
            this.lifeState = request.lifeState;
            this.pageSize = request.pageSize;
        } 

        /**
         * Cloud-native all-in-one machine type
         */
        public Builder model(String model) {
            this.putQueryParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * Current page number
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("page_number", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Cloud-native all-in-one machine "hostname"
         */
        public Builder hostname(String hostname) {
            this.putQueryParameter("hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * The online status of the cloud-native all-in-one machine. Valid values:
         * <p>
         * 
         * -"offline": Offline
         * 
         * -"online": online
         */
        public Builder onlineState(String onlineState) {
            this.putQueryParameter("online_state", onlineState);
            this.onlineState = onlineState;
            return this;
        }

        /**
         * Lifecycle status
         */
        public Builder lifeState(String lifeState) {
            this.putQueryParameter("life_state", lifeState);
            this.lifeState = lifeState;
            return this;
        }

        /**
         * Number of records displayed per page
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
