// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link GetLogColumnTranslateResultRequest} extends {@link RequestModel}
 *
 * <p>GetLogColumnTranslateResultRequest</p>
 */
public class GetLogColumnTranslateResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnValue")
    private String columnValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranslateConfig")
    private String translateConfig;

    private GetLogColumnTranslateResultRequest(Builder builder) {
        super(builder);
        this.columnValue = builder.columnValue;
        this.translateConfig = builder.translateConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogColumnTranslateResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columnValue
     */
    public String getColumnValue() {
        return this.columnValue;
    }

    /**
     * @return translateConfig
     */
    public String getTranslateConfig() {
        return this.translateConfig;
    }

    public static final class Builder extends Request.Builder<GetLogColumnTranslateResultRequest, Builder> {
        private String columnValue; 
        private String translateConfig; 

        private Builder() {
            super();
        } 

        private Builder(GetLogColumnTranslateResultRequest request) {
            super(request);
            this.columnValue = request.columnValue;
            this.translateConfig = request.translateConfig;
        } 

        /**
         * ColumnValue.
         */
        public Builder columnValue(String columnValue) {
            this.putQueryParameter("ColumnValue", columnValue);
            this.columnValue = columnValue;
            return this;
        }

        /**
         * TranslateConfig.
         */
        public Builder translateConfig(String translateConfig) {
            this.putQueryParameter("TranslateConfig", translateConfig);
            this.translateConfig = translateConfig;
            return this;
        }

        @Override
        public GetLogColumnTranslateResultRequest build() {
            return new GetLogColumnTranslateResultRequest(this);
        } 

    } 

}
