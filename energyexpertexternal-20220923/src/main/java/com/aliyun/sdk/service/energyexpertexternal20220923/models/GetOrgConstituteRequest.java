// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link GetOrgConstituteRequest} extends {@link RequestModel}
 *
 * <p>GetOrgConstituteRequest</p>
 */
public class GetOrgConstituteRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleCode")
    private String moduleCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer moduleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("year")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer year;

    private GetOrgConstituteRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.moduleCode = builder.moduleCode;
        this.moduleType = builder.moduleType;
        this.year = builder.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrgConstituteRequest create() {
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

    public static final class Builder extends Request.Builder<GetOrgConstituteRequest, Builder> {
        private String code; 
        private String moduleCode; 
        private Integer moduleType; 
        private Integer year; 

        private Builder() {
            super();
        } 

        private Builder(GetOrgConstituteRequest request) {
            super(request);
            this.code = request.code;
            this.moduleCode = request.moduleCode;
            this.moduleType = request.moduleType;
            this.year = request.year;
        } 

        /**
         * <p>The enterprise code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Z-20240115-2</p>
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>Module code.</p>
         * 
         * <strong>example:</strong>
         * <p>carbonInventory.check.scope_1_direct_ghg_emissions</p>
         */
        public Builder moduleCode(String moduleCode) {
            this.putBodyParameter("moduleCode", moduleCode);
            this.moduleCode = moduleCode;
            return this;
        }

        /**
         * <p>Module type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder moduleType(Integer moduleType) {
            this.putBodyParameter("moduleType", moduleType);
            this.moduleType = moduleType;
            return this;
        }

        /**
         * <p>Year.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024</p>
         */
        public Builder year(Integer year) {
            this.putBodyParameter("year", year);
            this.year = year;
            return this;
        }

        @Override
        public GetOrgConstituteRequest build() {
            return new GetOrgConstituteRequest(this);
        } 

    } 

}
