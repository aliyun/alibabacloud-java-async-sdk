// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link ExecDatamaskRequest} extends {@link RequestModel}
 *
 * <p>ExecDatamaskRequest</p>
 */
public class ExecDatamaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private Integer featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    private ExecDatamaskRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.featureType = builder.featureType;
        this.lang = builder.lang;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecDatamaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return featureType
     */
    public Integer getFeatureType() {
        return this.featureType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ExecDatamaskRequest, Builder> {
        private String data; 
        private Integer featureType; 
        private String lang; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(ExecDatamaskRequest request) {
            super(request);
            this.data = request.data;
            this.featureType = request.featureType;
            this.lang = request.lang;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The sensitive data to be de-identified. The value is a JSON string that contains the following parameters:</p>
         * <ul>
         * <li><strong>dataHeaderList</strong>: the names of the columns in which data needs to be de-identified. Specify the column names in accordance with the order of data that needs to be de-identified.</li>
         * <li><strong>dataList</strong>: the data that needs to be de-identified.</li>
         * <li><strong>ruleList</strong>: the IDs of sensitive data detection rules used to detect data that needs to be de-identified. Specify the rule IDs in accordance with the order of data that needs to be de-identified. Each ID identifies a sensitive data detection rule that is used to detect a type of sensitive data. You can call the <a href="~~DescribeRules~~">DescribeRules</a> operation to query the IDs of sensitive data detection rules.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dataHeaderList&quot;:[&quot;name&quot;,&quot;age&quot;],&quot;dataList&quot;:[[&quot;lily&quot;,18],[&quot;lucy&quot;,17]],&quot;ruleList&quot;:[1002,null]}</p>
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Simplified Chinese</li>
         * <li><strong>en_us</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_cn</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the de-identification template. The ID is generated after you create the de-identification template in the <a href="https://yundun.console.aliyun.com/?&p=sddpnext#/sddp/dm/template">Data Security Center (DSC) console</a>. You can choose <strong>Data desensitization</strong> &gt; <strong>Desensitization Template</strong> in the left-side navigation pane and obtain the ID of the de-identification template from the <strong>Desensitization Template</strong> page.</p>
         * <ul>
         * <li>If you select <strong>Field name</strong> as the matching mode of the template, DSC matches data based on the columns specified by the <strong>dataHeaderList</strong> parameter in the <strong>Data</strong> parameter.</li>
         * <li>If you select <strong>Sensitive type</strong> as the matching mode of the template, DSC matches data based on the sensitive data detection rules specified by the <strong>ruleList</strong> parameter in the <strong>Data</strong> parameter.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
        public ExecDatamaskRequest build() {
            return new ExecDatamaskRequest(this);
        } 

    } 

}
