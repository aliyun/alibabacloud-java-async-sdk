// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribePrivateDnsDomainNameListRequest} extends {@link RequestModel}
 *
 * <p>DescribePrivateDnsDomainNameListRequest</p>
 */
public class DescribePrivateDnsDomainNameListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionNo;

    private DescribePrivateDnsDomainNameListRequest(Builder builder) {
        super(builder);
        this.accessInstanceId = builder.accessInstanceId;
        this.domainName = builder.domainName;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.regionNo = builder.regionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrivateDnsDomainNameListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessInstanceId
     */
    public String getAccessInstanceId() {
        return this.accessInstanceId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    public static final class Builder extends Request.Builder<DescribePrivateDnsDomainNameListRequest, Builder> {
        private String accessInstanceId; 
        private String domainName; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String regionNo; 

        private Builder() {
            super();
        } 

        private Builder(DescribePrivateDnsDomainNameListRequest request) {
            super(request);
            this.accessInstanceId = request.accessInstanceId;
            this.domainName = request.domainName;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.regionNo = request.regionNo;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pd-12345</p>
         */
        public Builder accessInstanceId(String accessInstanceId) {
            this.putQueryParameter("AccessInstanceId", accessInstanceId);
            this.accessInstanceId = accessInstanceId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        @Override
        public DescribePrivateDnsDomainNameListRequest build() {
            return new DescribePrivateDnsDomainNameListRequest(this);
        } 

    } 

}
