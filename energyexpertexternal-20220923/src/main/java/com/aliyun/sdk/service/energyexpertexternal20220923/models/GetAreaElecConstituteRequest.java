// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAreaElecConstituteRequest} extends {@link RequestModel}
 *
 * <p>GetAreaElecConstituteRequest</p>
 */
public class GetAreaElecConstituteRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("year")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer year;

    private GetAreaElecConstituteRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.year = builder.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAreaElecConstituteRequest create() {
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
     * @return year
     */
    public Integer getYear() {
        return this.year;
    }

    public static final class Builder extends Request.Builder<GetAreaElecConstituteRequest, Builder> {
        private String code; 
        private Integer year; 

        private Builder() {
            super();
        } 

        private Builder(GetAreaElecConstituteRequest request) {
            super(request);
            this.code = request.code;
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
        public GetAreaElecConstituteRequest build() {
            return new GetAreaElecConstituteRequest(this);
        } 

    } 

}
