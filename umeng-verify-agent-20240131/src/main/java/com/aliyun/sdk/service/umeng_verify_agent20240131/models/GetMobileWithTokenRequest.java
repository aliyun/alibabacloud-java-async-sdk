// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_verify_agent20240131.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMobileWithTokenRequest} extends {@link RequestModel}
 *
 * <p>GetMobileWithTokenRequest</p>
 */
public class GetMobileWithTokenRequest extends Request {
    @Body
    @NameInMap("apiCode")
    private Integer apiCode;

    @Body
    @NameInMap("operatorId")
    private Integer operatorId;

    @Body
    @NameInMap("osType")
    private String osType;

    @Body
    @NameInMap("schemeCode")
    private String schemeCode;

    @Body
    @NameInMap("token")
    private String token;

    private GetMobileWithTokenRequest(Builder builder) {
        super(builder);
        this.apiCode = builder.apiCode;
        this.operatorId = builder.operatorId;
        this.osType = builder.osType;
        this.schemeCode = builder.schemeCode;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMobileWithTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiCode
     */
    public Integer getApiCode() {
        return this.apiCode;
    }

    /**
     * @return operatorId
     */
    public Integer getOperatorId() {
        return this.operatorId;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return schemeCode
     */
    public String getSchemeCode() {
        return this.schemeCode;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<GetMobileWithTokenRequest, Builder> {
        private Integer apiCode; 
        private Integer operatorId; 
        private String osType; 
        private String schemeCode; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(GetMobileWithTokenRequest request) {
            super(request);
            this.apiCode = request.apiCode;
            this.operatorId = request.operatorId;
            this.osType = request.osType;
            this.schemeCode = request.schemeCode;
            this.token = request.token;
        } 

        /**
         * apiCode.
         */
        public Builder apiCode(Integer apiCode) {
            this.putBodyParameter("apiCode", apiCode);
            this.apiCode = apiCode;
            return this;
        }

        /**
         * operatorId.
         */
        public Builder operatorId(Integer operatorId) {
            this.putBodyParameter("operatorId", operatorId);
            this.operatorId = operatorId;
            return this;
        }

        /**
         * osType.
         */
        public Builder osType(String osType) {
            this.putBodyParameter("osType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * schemeCode.
         */
        public Builder schemeCode(String schemeCode) {
            this.putBodyParameter("schemeCode", schemeCode);
            this.schemeCode = schemeCode;
            return this;
        }

        /**
         * token.
         */
        public Builder token(String token) {
            this.putBodyParameter("token", token);
            this.token = token;
            return this;
        }

        @Override
        public GetMobileWithTokenRequest build() {
            return new GetMobileWithTokenRequest(this);
        } 

    } 

}
