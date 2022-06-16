// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterRequest} extends {@link RequestModel}
 *
 * <p>ListClusterRequest</p>
 */
public class ListClusterRequest extends Request {
    @Query
    @NameInMap("BusinessCode")
    private String businessCode;

    @Query
    @NameInMap("EnvType")
    private String envType;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private ListClusterRequest(Builder builder) {
        super(builder);
        this.businessCode = builder.businessCode;
        this.envType = builder.envType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessCode
     */
    public String getBusinessCode() {
        return this.businessCode;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListClusterRequest, Builder> {
        private String businessCode; 
        private String envType; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterRequest request) {
            super(request);
            this.businessCode = request.businessCode;
            this.envType = request.envType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * BusinessCode.
         */
        public Builder businessCode(String businessCode) {
            this.putQueryParameter("BusinessCode", businessCode);
            this.businessCode = businessCode;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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

        @Override
        public ListClusterRequest build() {
            return new ListClusterRequest(this);
        } 

    } 

}
