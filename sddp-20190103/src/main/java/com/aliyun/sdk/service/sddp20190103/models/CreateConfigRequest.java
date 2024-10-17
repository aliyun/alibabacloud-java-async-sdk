// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The code of the common configuration item. Valid values:</p>
         * <ul>
         * <li><strong>access_failed_cnt</strong>: the maximum number of access attempts allowed when Data Security Center (DSC) fails to access an unauthorized resource.</li>
         * <li><strong>access_permission_exprie_max_days</strong>: the maximum idle period allowed for access permissions before an alert is triggered.</li>
         * <li><strong>log_datasize_avg_days</strong>: the minimum percentage of the volume of logs of a specific type generated on the current day to the average volume of logs generated in the previous 10 days before an alert is triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>access_failed_cnt</p>
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>The description of the common configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>Maximum number of access attempts allowed when DSC fails to access an unauthorized resource: 10</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * <li><strong>zh_cn</strong>: Chinese</li>
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
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>39.170.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The value of the common configuration item. The meaning of this parameter varies with the value of the Code parameter.</p>
         * <ul>
         * <li>If you set the Code parameter to <strong>access_failed_cnt</strong>, the Value parameter specifies the maximum number of access attempts allowed when DSC fails to access an unauthorized resource.</li>
         * <li>If you set the Code parameter to <strong>access_permission_exprie_max_days</strong>, the Value parameter specifies the maximum idle period allowed for access permissions before an alert is triggered.</li>
         * <li>If you set the Code parameter to <strong>log_datasize_avg_days</strong>, the Value parameter specifies the minimum percentage of the volume of logs of a specific type generated on the current day to the average amount of logs generated in the previous 10 days before an alert is triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
