// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link ListTotalSensitiveInfoRequest} extends {@link RequestModel}
 *
 * <p>ListTotalSensitiveInfoRequest</p>
 */
public class ListTotalSensitiveInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CountType")
    private Integer countType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCodeList")
    private String productCodeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private ListTotalSensitiveInfoRequest(Builder builder) {
        super(builder);
        this.countType = builder.countType;
        this.lang = builder.lang;
        this.productCode = builder.productCode;
        this.productCodeList = builder.productCodeList;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTotalSensitiveInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return countType
     */
    public Integer getCountType() {
        return this.countType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productCodeList
     */
    public String getProductCodeList() {
        return this.productCodeList;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ListTotalSensitiveInfoRequest, Builder> {
        private Integer countType; 
        private String lang; 
        private String productCode; 
        private String productCodeList; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(ListTotalSensitiveInfoRequest request) {
            super(request);
            this.countType = request.countType;
            this.lang = request.lang;
            this.productCode = request.productCode;
            this.productCodeList = request.productCodeList;
            this.templateId = request.templateId;
        } 

        /**
         * CountType.
         */
        public Builder countType(Integer countType) {
            this.putQueryParameter("CountType", countType);
            this.countType = countType;
            return this;
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
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductCodeList.
         */
        public Builder productCodeList(String productCodeList) {
            this.putQueryParameter("ProductCodeList", productCodeList);
            this.productCodeList = productCodeList;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public ListTotalSensitiveInfoRequest build() {
            return new ListTotalSensitiveInfoRequest(this);
        } 

    } 

}
