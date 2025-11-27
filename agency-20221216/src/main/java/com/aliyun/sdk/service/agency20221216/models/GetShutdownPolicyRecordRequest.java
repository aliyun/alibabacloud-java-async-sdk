// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link GetShutdownPolicyRecordRequest} extends {@link RequestModel}
 *
 * <p>GetShutdownPolicyRecordRequest</p>
 */
public class GetShutdownPolicyRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerUID")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long customerUID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationTime")
    private String operationTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 5)
    private Integer pageSize;

    private GetShutdownPolicyRecordRequest(Builder builder) {
        super(builder);
        this.customerUID = builder.customerUID;
        this.operationTime = builder.operationTime;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShutdownPolicyRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerUID
     */
    public Long getCustomerUID() {
        return this.customerUID;
    }

    /**
     * @return operationTime
     */
    public String getOperationTime() {
        return this.operationTime;
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

    public static final class Builder extends Request.Builder<GetShutdownPolicyRecordRequest, Builder> {
        private Long customerUID; 
        private String operationTime; 
        private Integer pageNo; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetShutdownPolicyRecordRequest request) {
            super(request);
            this.customerUID = request.customerUID;
            this.operationTime = request.operationTime;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>292828565558721922</p>
         */
        public Builder customerUID(Long customerUID) {
            this.putQueryParameter("CustomerUID", customerUID);
            this.customerUID = customerUID;
            return this;
        }

        /**
         * OperationTime.
         */
        public Builder operationTime(String operationTime) {
            this.putQueryParameter("OperationTime", operationTime);
            this.operationTime = operationTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public GetShutdownPolicyRecordRequest build() {
            return new GetShutdownPolicyRecordRequest(this);
        } 

    } 

}
