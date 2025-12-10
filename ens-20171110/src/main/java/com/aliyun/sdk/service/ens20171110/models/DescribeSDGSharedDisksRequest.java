// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSDGSharedDisksRequest} extends {@link RequestModel}
 *
 * <p>DescribeSDGSharedDisksRequest</p>
 */
public class DescribeSDGSharedDisksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sdgId;

    private DescribeSDGSharedDisksRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.sdgId = builder.sdgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSDGSharedDisksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sdgId
     */
    public String getSdgId() {
        return this.sdgId;
    }

    public static final class Builder extends Request.Builder<DescribeSDGSharedDisksRequest, Builder> {
        private String namespace; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String sdgId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSDGSharedDisksRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.sdgId = request.sdgId;
        } 

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The page number, which is used for paged query</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-xx</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>sdg ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg-xxxx</p>
         */
        public Builder sdgId(String sdgId) {
            this.putQueryParameter("SdgId", sdgId);
            this.sdgId = sdgId;
            return this;
        }

        @Override
        public DescribeSDGSharedDisksRequest build() {
            return new DescribeSDGSharedDisksRequest(this);
        } 

    } 

}
