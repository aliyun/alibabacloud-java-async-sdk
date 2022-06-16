// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPodsRequest} extends {@link RequestModel}
 *
 * <p>ListPodsRequest</p>
 */
public class ListPodsRequest extends Request {
    @Query
    @NameInMap("DeployOrderId")
    @Validation(required = true)
    private Long deployOrderId;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Body
    @NameInMap("ResultList")
    private java.util.List < Integer > resultList;

    @Body
    @NameInMap("StatusList")
    private java.util.List < Integer > statusList;

    private ListPodsRequest(Builder builder) {
        super(builder);
        this.deployOrderId = builder.deployOrderId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resultList = builder.resultList;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPodsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deployOrderId
     */
    public Long getDeployOrderId() {
        return this.deployOrderId;
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
     * @return resultList
     */
    public java.util.List < Integer > getResultList() {
        return this.resultList;
    }

    /**
     * @return statusList
     */
    public java.util.List < Integer > getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<ListPodsRequest, Builder> {
        private Long deployOrderId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < Integer > resultList; 
        private java.util.List < Integer > statusList; 

        private Builder() {
            super();
        } 

        private Builder(ListPodsRequest request) {
            super(request);
            this.deployOrderId = request.deployOrderId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resultList = request.resultList;
            this.statusList = request.statusList;
        } 

        /**
         * DeployOrderId.
         */
        public Builder deployOrderId(Long deployOrderId) {
            this.putQueryParameter("DeployOrderId", deployOrderId);
            this.deployOrderId = deployOrderId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * ResultList.
         */
        public Builder resultList(java.util.List < Integer > resultList) {
            this.putBodyParameter("ResultList", resultList);
            this.resultList = resultList;
            return this;
        }

        /**
         * StatusList.
         */
        public Builder statusList(java.util.List < Integer > statusList) {
            this.putBodyParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        @Override
        public ListPodsRequest build() {
            return new ListPodsRequest(this);
        } 

    } 

}
