// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link PublishGrayDomainConfigRequest} extends {@link RequestModel}
 *
 * <p>PublishGrayDomainConfigRequest</p>
 */
public class PublishGrayDomainConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomCountryId")
    private Integer customCountryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomPercent")
    private Integer customPercent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomProvinceId")
    private Integer customProvinceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PublishMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publishMode;

    private PublishGrayDomainConfigRequest(Builder builder) {
        super(builder);
        this.customCountryId = builder.customCountryId;
        this.customPercent = builder.customPercent;
        this.customProvinceId = builder.customProvinceId;
        this.domainName = builder.domainName;
        this.publishMode = builder.publishMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishGrayDomainConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customCountryId
     */
    public Integer getCustomCountryId() {
        return this.customCountryId;
    }

    /**
     * @return customPercent
     */
    public Integer getCustomPercent() {
        return this.customPercent;
    }

    /**
     * @return customProvinceId
     */
    public Integer getCustomProvinceId() {
        return this.customProvinceId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return publishMode
     */
    public String getPublishMode() {
        return this.publishMode;
    }

    public static final class Builder extends Request.Builder<PublishGrayDomainConfigRequest, Builder> {
        private Integer customCountryId; 
        private Integer customPercent; 
        private Integer customProvinceId; 
        private String domainName; 
        private String publishMode; 

        private Builder() {
            super();
        } 

        private Builder(PublishGrayDomainConfigRequest request) {
            super(request);
            this.customCountryId = request.customCountryId;
            this.customPercent = request.customPercent;
            this.customProvinceId = request.customProvinceId;
            this.domainName = request.domainName;
            this.publishMode = request.publishMode;
        } 

        /**
         * CustomCountryId.
         */
        public Builder customCountryId(Integer customCountryId) {
            this.putBodyParameter("CustomCountryId", customCountryId);
            this.customCountryId = customCountryId;
            return this;
        }

        /**
         * CustomPercent.
         */
        public Builder customPercent(Integer customPercent) {
            this.putBodyParameter("CustomPercent", customPercent);
            this.customPercent = customPercent;
            return this;
        }

        /**
         * CustomProvinceId.
         */
        public Builder customProvinceId(Integer customProvinceId) {
            this.putBodyParameter("CustomProvinceId", customProvinceId);
            this.customProvinceId = customProvinceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>publishByCustom</p>
         */
        public Builder publishMode(String publishMode) {
            this.putBodyParameter("PublishMode", publishMode);
            this.publishMode = publishMode;
            return this;
        }

        @Override
        public PublishGrayDomainConfigRequest build() {
            return new PublishGrayDomainConfigRequest(this);
        } 

    } 

}
