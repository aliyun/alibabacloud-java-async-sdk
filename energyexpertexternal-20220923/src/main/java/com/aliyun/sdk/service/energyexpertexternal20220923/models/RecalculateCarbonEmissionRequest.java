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
 * {@link RecalculateCarbonEmissionRequest} extends {@link RequestModel}
 *
 * <p>RecalculateCarbonEmissionRequest</p>
 */
public class RecalculateCarbonEmissionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("year")
    @com.aliyun.core.annotation.Validation(required = true)
    private String year;

    private RecalculateCarbonEmissionRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.year = builder.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecalculateCarbonEmissionRequest create() {
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
    public String getYear() {
        return this.year;
    }

    public static final class Builder extends Request.Builder<RecalculateCarbonEmissionRequest, Builder> {
        private String code; 
        private String year; 

        private Builder() {
            super();
        } 

        private Builder(RecalculateCarbonEmissionRequest request) {
            super(request);
            this.code = request.code;
            this.year = request.year;
        } 

        /**
         * <p>The enterprise code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>C-20240202-01</p>
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>Year of inventory.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024</p>
         */
        public Builder year(String year) {
            this.putBodyParameter("year", year);
            this.year = year;
            return this;
        }

        @Override
        public RecalculateCarbonEmissionRequest build() {
            return new RecalculateCarbonEmissionRequest(this);
        } 

    } 

}
