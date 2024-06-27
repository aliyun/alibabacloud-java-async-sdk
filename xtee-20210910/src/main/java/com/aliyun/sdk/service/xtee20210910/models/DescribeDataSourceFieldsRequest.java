// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataSourceFieldsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataSourceFieldsRequest</p>
 */
public class DescribeDataSourceFieldsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSourceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    private DescribeDataSourceFieldsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.dataSourceCode = builder.dataSourceCode;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSourceFieldsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return dataSourceCode
     */
    public String getDataSourceCode() {
        return this.dataSourceCode;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeDataSourceFieldsRequest, Builder> {
        private String lang; 
        private String dataSourceCode; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataSourceFieldsRequest request) {
            super(request);
            this.lang = request.lang;
            this.dataSourceCode = request.dataSourceCode;
            this.regId = request.regId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * dataSourceCode.
         */
        public Builder dataSourceCode(String dataSourceCode) {
            this.putQueryParameter("dataSourceCode", dataSourceCode);
            this.dataSourceCode = dataSourceCode;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeDataSourceFieldsRequest build() {
            return new DescribeDataSourceFieldsRequest(this);
        } 

    } 

}
