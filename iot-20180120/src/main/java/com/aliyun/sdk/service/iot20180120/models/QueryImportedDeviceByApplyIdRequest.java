// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryImportedDeviceByApplyIdRequest} extends {@link RequestModel}
 *
 * <p>QueryImportedDeviceByApplyIdRequest</p>
 */
public class QueryImportedDeviceByApplyIdRequest extends Request {
    @Query
    @NameInMap("ApplyId")
    @Validation(required = true, minimum = 1)
    private Long applyId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true, maximum = 100000, minimum = 1)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageSize;

    private QueryImportedDeviceByApplyIdRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryImportedDeviceByApplyIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyId
     */
    public Long getApplyId() {
        return this.applyId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
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

    public static final class Builder extends Request.Builder<QueryImportedDeviceByApplyIdRequest, Builder> {
        private Long applyId; 
        private String iotInstanceId; 
        private Integer pageNo; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryImportedDeviceByApplyIdRequest request) {
            super(request);
            this.applyId = request.applyId;
            this.iotInstanceId = request.iotInstanceId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
        } 

        /**
         * ApplyId.
         */
        public Builder applyId(Long applyId) {
            this.putQueryParameter("ApplyId", applyId);
            this.applyId = applyId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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

        @Override
        public QueryImportedDeviceByApplyIdRequest build() {
            return new QueryImportedDeviceByApplyIdRequest(this);
        } 

    } 

}
