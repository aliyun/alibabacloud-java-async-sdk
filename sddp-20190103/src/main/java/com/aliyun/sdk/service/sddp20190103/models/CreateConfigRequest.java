// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateConfigRequest</p>
 */
public class CreateConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private Integer featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private CreateConfigRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.description = builder.description;
        this.featureType = builder.featureType;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<CreateConfigRequest, Builder> {
        private String code; 
        private String description; 
        private Integer featureType; 
        private String lang; 
        private String sourceIp; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(CreateConfigRequest request) {
            super(request);
            this.code = request.code;
            this.description = request.description;
            this.featureType = request.featureType;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.value = request.value;
        } 

        /**
         * The code of the common configuration item. Valid values:
         * <p>
         * 
         * *   **access_failed_cnt**: the maximum number of access attempts allowed when Data Security Center (DSC) fails to access an unauthorized resource.
         * *   **access_permission_exprie_max_days**: the maximum idle period allowed for access permissions before an alert is triggered.
         * *   **log_datasize_avg_days**: the minimum percentage of the volume of logs of a specific type generated on the current day to the average volume of logs generated in the previous 10 days before an alert is triggered.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * The description of the common configuration item.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * This parameter is deprecated.
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
         * *   **zh_cn**: Chinese
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The value of the common configuration item. The meaning of this parameter varies with the value of the Code parameter.
         * <p>
         * 
         * *   If you set the Code parameter to **access_failed_cnt**, the Value parameter specifies the maximum number of access attempts allowed when DSC fails to access an unauthorized resource.
         * *   If you set the Code parameter to **access_permission_exprie_max_days**, the Value parameter specifies the maximum idle period allowed for access permissions before an alert is triggered.
         * *   If you set the Code parameter to **log_datasize_avg_days**, the Value parameter specifies the minimum percentage of the volume of logs of a specific type generated on the current day to the average amount of logs generated in the previous 10 days before an alert is triggered.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public CreateConfigRequest build() {
            return new CreateConfigRequest(this);
        } 

    } 

}
