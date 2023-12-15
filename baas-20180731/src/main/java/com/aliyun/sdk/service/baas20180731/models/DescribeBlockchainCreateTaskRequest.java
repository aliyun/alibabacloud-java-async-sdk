// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlockchainCreateTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeBlockchainCreateTaskRequest</p>
 */
public class DescribeBlockchainCreateTaskRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Current")
    private Integer current;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    private DescribeBlockchainCreateTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.current = builder.current;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBlockchainCreateTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<DescribeBlockchainCreateTaskRequest, Builder> {
        private String regionId; 
        private Integer current; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBlockchainCreateTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.current = request.current;
            this.pageSize = request.pageSize;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
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
        public DescribeBlockchainCreateTaskRequest build() {
            return new DescribeBlockchainCreateTaskRequest(this);
        } 

    } 

}
