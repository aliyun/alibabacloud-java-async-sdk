// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEpnInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeEpnInstancesRequest</p>
 */
public class DescribeEpnInstancesRequest extends Request {
    @Query
    @NameInMap("EPNInstanceId")
    private String EPNInstanceId;

    @Query
    @NameInMap("EPNInstanceName")
    private String EPNInstanceName;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private DescribeEpnInstancesRequest(Builder builder) {
        super(builder);
        this.EPNInstanceId = builder.EPNInstanceId;
        this.EPNInstanceName = builder.EPNInstanceName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEpnInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return EPNInstanceId
     */
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    /**
     * @return EPNInstanceName
     */
    public String getEPNInstanceName() {
        return this.EPNInstanceName;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeEpnInstancesRequest, Builder> {
        private String EPNInstanceId; 
        private String EPNInstanceName; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEpnInstancesRequest request) {
            super(request);
            this.EPNInstanceId = request.EPNInstanceId;
            this.EPNInstanceName = request.EPNInstanceName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The version number.
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.putQueryParameter("EPNInstanceId", EPNInstanceId);
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        /**
         * The name of the EPN instance.
         */
        public Builder EPNInstanceName(String EPNInstanceName) {
            this.putQueryParameter("EPNInstanceName", EPNInstanceName);
            this.EPNInstanceName = EPNInstanceName;
            return this;
        }

        /**
         * The page number. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values: **1 to 50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeEpnInstancesRequest build() {
            return new DescribeEpnInstancesRequest(this);
        } 

    } 

}
