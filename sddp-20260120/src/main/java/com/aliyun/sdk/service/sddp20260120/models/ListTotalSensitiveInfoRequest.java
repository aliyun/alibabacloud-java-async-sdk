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
         * <p>The statistics scenario. Valid values:</p>
         * <ul>
         * <li>41: Overview.</li>
         * <li>42: Query data catalog statistics by product.</li>
         * <li>43: Query region and template summaries by product.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        public Builder countType(Integer countType) {
            this.putQueryParameter("CountType", countType);
            this.countType = countType;
            return this;
        }

        /**
         * <p>The language of the response description. Valid values:</p>
         * <ul>
         * <li>zh: Chinese.</li>
         * <li>en: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The code of the cloud service. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also specified, the two parameters must match.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The codes of multiple cloud services, separated by commas (,). This parameter is used when CountType is set to 43 and ProductCode is not specified. The results are aggregated by region and template.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS,POLARDB,PolarDBX2</p>
         */
        public Builder productCodeList(String productCodeList) {
            this.putQueryParameter("ProductCodeList", productCodeList);
            this.productCodeList = productCodeList;
            return this;
        }

        /**
         * <p>The ID of the data classification template. You can obtain the ID from the Items[].Id parameter in the response of the ListTemplates operation. The template must be consistent with the selected sensitivity level and detection model.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
