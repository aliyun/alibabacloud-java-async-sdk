// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFaceAllDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>QueryFaceAllDeviceGroupRequest</p>
 */
public class QueryFaceAllDeviceGroupRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
    private String isolationId;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    private QueryFaceAllDeviceGroupRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.isolationId = builder.isolationId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceAllDeviceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return isolationId
     */
    public String getIsolationId() {
        return this.isolationId;
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

    public static final class Builder extends Request.Builder<QueryFaceAllDeviceGroupRequest, Builder> {
        private String iotInstanceId; 
        private String isolationId; 
        private Integer pageNo; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryFaceAllDeviceGroupRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.isolationId = request.isolationId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
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
         * IsolationId.
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
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
        public QueryFaceAllDeviceGroupRequest build() {
            return new QueryFaceAllDeviceGroupRequest(this);
        } 

    } 

}
