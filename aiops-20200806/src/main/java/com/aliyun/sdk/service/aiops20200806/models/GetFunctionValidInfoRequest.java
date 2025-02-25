// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionValidInfoRequest} extends {@link RequestModel}
 *
 * <p>GetFunctionValidInfoRequest</p>
 */
public class GetFunctionValidInfoRequest extends Request {
    @Body
    @NameInMap("FunctionName")
    private String functionName;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("RegionCode")
    private String regionCode;

    @Body
    @NameInMap("ServiceName")
    private String serviceName;

    private GetFunctionValidInfoRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.operaUid = builder.operaUid;
        this.regionCode = builder.regionCode;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionValidInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return regionCode
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<GetFunctionValidInfoRequest, Builder> {
        private String functionName; 
        private String operaUid; 
        private String regionCode; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(GetFunctionValidInfoRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.operaUid = request.operaUid;
            this.regionCode = request.regionCode;
            this.serviceName = request.serviceName;
        } 

        /**
         * FunctionName.
         */
        public Builder functionName(String functionName) {
            this.putBodyParameter("FunctionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * RegionCode.
         */
        public Builder regionCode(String regionCode) {
            this.putBodyParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public GetFunctionValidInfoRequest build() {
            return new GetFunctionValidInfoRequest(this);
        } 

    } 

}
