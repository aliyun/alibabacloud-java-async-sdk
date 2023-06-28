// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceListRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceListRequest</p>
 */
public class DescribeInstanceListRequest extends Request {
    @Query
    @NameInMap("InstanceIdList")
    private String instanceIdList;

    @Query
    @NameInMap("PackIdList")
    private String packIdList;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeInstanceListRequest(Builder builder) {
        super(builder);
        this.instanceIdList = builder.instanceIdList;
        this.packIdList = builder.packIdList;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIdList
     */
    public String getInstanceIdList() {
        return this.instanceIdList;
    }

    /**
     * @return packIdList
     */
    public String getPackIdList() {
        return this.packIdList;
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceListRequest, Builder> {
        private String instanceIdList; 
        private String packIdList; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceListRequest request) {
            super(request);
            this.instanceIdList = request.instanceIdList;
            this.packIdList = request.packIdList;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * InstanceIdList.
         */
        public Builder instanceIdList(String instanceIdList) {
            this.putQueryParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        /**
         * PackIdList.
         */
        public Builder packIdList(String packIdList) {
            this.putQueryParameter("PackIdList", packIdList);
            this.packIdList = packIdList;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeInstanceListRequest build() {
            return new DescribeInstanceListRequest(this);
        } 

    } 

}
