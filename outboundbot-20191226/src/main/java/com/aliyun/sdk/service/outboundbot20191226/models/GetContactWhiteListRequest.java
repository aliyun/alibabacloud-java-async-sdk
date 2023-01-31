// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetContactWhiteListRequest} extends {@link RequestModel}
 *
 * <p>GetContactWhiteListRequest</p>
 */
public class GetContactWhiteListRequest extends Request {
    @Query
    @NameInMap("CountTotalRow")
    private Boolean countTotalRow;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private GetContactWhiteListRequest(Builder builder) {
        super(builder);
        this.countTotalRow = builder.countTotalRow;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContactWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return countTotalRow
     */
    public Boolean getCountTotalRow() {
        return this.countTotalRow;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<GetContactWhiteListRequest, Builder> {
        private Boolean countTotalRow; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetContactWhiteListRequest request) {
            super(request);
            this.countTotalRow = request.countTotalRow;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * CountTotalRow.
         */
        public Builder countTotalRow(Boolean countTotalRow) {
            this.putQueryParameter("CountTotalRow", countTotalRow);
            this.countTotalRow = countTotalRow;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        @Override
        public GetContactWhiteListRequest build() {
            return new GetContactWhiteListRequest(this);
        } 

    } 

}
