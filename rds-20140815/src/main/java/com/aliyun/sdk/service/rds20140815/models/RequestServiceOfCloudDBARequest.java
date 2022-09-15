// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestServiceOfCloudDBARequest} extends {@link RequestModel}
 *
 * <p>RequestServiceOfCloudDBARequest</p>
 */
public class RequestServiceOfCloudDBARequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("ServiceRequestParam")
    @Validation(required = true)
    private String serviceRequestParam;

    @Query
    @NameInMap("ServiceRequestType")
    @Validation(required = true)
    private String serviceRequestType;

    private RequestServiceOfCloudDBARequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.serviceRequestParam = builder.serviceRequestParam;
        this.serviceRequestType = builder.serviceRequestType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestServiceOfCloudDBARequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return serviceRequestParam
     */
    public String getServiceRequestParam() {
        return this.serviceRequestParam;
    }

    /**
     * @return serviceRequestType
     */
    public String getServiceRequestType() {
        return this.serviceRequestType;
    }

    public static final class Builder extends Request.Builder<RequestServiceOfCloudDBARequest, Builder> {
        private String DBInstanceId; 
        private String serviceRequestParam; 
        private String serviceRequestType; 

        private Builder() {
            super();
        } 

        private Builder(RequestServiceOfCloudDBARequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.serviceRequestParam = request.serviceRequestParam;
            this.serviceRequestType = request.serviceRequestType;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * ServiceRequestParam.
         */
        public Builder serviceRequestParam(String serviceRequestParam) {
            this.putQueryParameter("ServiceRequestParam", serviceRequestParam);
            this.serviceRequestParam = serviceRequestParam;
            return this;
        }

        /**
         * ServiceRequestType.
         */
        public Builder serviceRequestType(String serviceRequestType) {
            this.putQueryParameter("ServiceRequestType", serviceRequestType);
            this.serviceRequestType = serviceRequestType;
            return this;
        }

        @Override
        public RequestServiceOfCloudDBARequest build() {
            return new RequestServiceOfCloudDBARequest(this);
        } 

    } 

}
