// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGasConstituteRequest} extends {@link RequestModel}
 *
 * <p>GetGasConstituteRequest</p>
 */
public class GetGasConstituteRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer moduleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("year")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer year;

    private GetGasConstituteRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.moduleCode = builder.moduleCode;
        this.moduleType = builder.moduleType;
        this.year = builder.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGasConstituteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return moduleCode
     */
    public String getModuleCode() {
        return this.moduleCode;
    }

    /**
     * @return moduleType
     */
    public Integer getModuleType() {
        return this.moduleType;
    }

    /**
     * @return year
     */
    public Integer getYear() {
        return this.year;
    }

    public static final class Builder extends Request.Builder<GetGasConstituteRequest, Builder> {
        private String code; 
        private String moduleCode; 
        private Integer moduleType; 
        private Integer year; 

        private Builder() {
            super();
        } 

        private Builder(GetGasConstituteRequest request) {
            super(request);
            this.code = request.code;
            this.moduleCode = request.moduleCode;
            this.moduleType = request.moduleType;
            this.year = request.year;
        } 

        /**
         * The enterprise code.
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * Module code.
         */
        public Builder moduleCode(String moduleCode) {
            this.putBodyParameter("moduleCode", moduleCode);
            this.moduleCode = moduleCode;
            return this;
        }

        /**
         * Module type.
         */
        public Builder moduleType(Integer moduleType) {
            this.putBodyParameter("moduleType", moduleType);
            this.moduleType = moduleType;
            return this;
        }

        /**
         * Year
         */
        public Builder year(Integer year) {
            this.putBodyParameter("year", year);
            this.year = year;
            return this;
        }

        @Override
        public GetGasConstituteRequest build() {
            return new GetGasConstituteRequest(this);
        } 

    } 

}
