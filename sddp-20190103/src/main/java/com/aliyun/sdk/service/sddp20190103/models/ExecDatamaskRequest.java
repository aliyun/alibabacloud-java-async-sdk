// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecDatamaskRequest} extends {@link RequestModel}
 *
 * <p>ExecDatamaskRequest</p>
 */
public class ExecDatamaskRequest extends Request {
    @Query
    @NameInMap("Data")
    @Validation(required = true)
    private String data;

    @Query
    @NameInMap("FeatureType")
    private Integer featureType;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
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
         * The sensitive data to be de-identified. The value is a JSON string that contains the following parameters:
         * <p>
         * 
         * *   **dataHeaderList**: the names of the columns in which data needs to be de-identified. Specify the column names in accordance with the order of data that needs to be de-identified.
         * *   **dataList**: the data that needs to be de-identified.
         * *   **ruleList**: the IDs of sensitive data detection rules used to detect data that needs to be de-identified. Specify the rule IDs in accordance with the order of data that needs to be de-identified. Each ID identifies a sensitive data detection rule that is used to detect a type of sensitive data. You can call the [DescribeRules](~~DescribeRules~~) operation to query the IDs of sensitive data detection rules.
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * FeatureType.
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh_cn**. Valid values:
         * <p>
         * 
         * *   **zh_cn**: Simplified Chinese
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the de-identification template. The ID is generated after you create the de-identification template in the [Data Security Center (DSC) console](https://yundun.console.aliyun.com/?\&p=sddpnext#/sddp/dm/template). You can choose **Data desensitization** > **Desensitization Template** in the left-side navigation pane and obtain the ID of the de-identification template from the **Desensitization Template** page.
         * <p>
         * 
         * *   If you select **Field name** as the matching mode of the template, DSC matches data based on the columns specified by the **dataHeaderList** parameter in the **Data** parameter.
         * *   If you select **Sensitive type** as the matching mode of the template, DSC matches data based on the sensitive data detection rules specified by the **ruleList** parameter in the **Data** parameter.
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
