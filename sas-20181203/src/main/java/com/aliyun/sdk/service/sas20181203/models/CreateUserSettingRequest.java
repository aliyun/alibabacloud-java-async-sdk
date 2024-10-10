// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateUserSettingRequest} extends {@link RequestModel}
 *
 * <p>CreateUserSettingRequest</p>
 */
public class CreateUserSettingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertLevels")
    private String alertLevels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvalidWarningKeepDays")
    private Integer invalidWarningKeepDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private CreateUserSettingRequest(Builder builder) {
        super(builder);
        this.alertLevels = builder.alertLevels;
        this.invalidWarningKeepDays = builder.invalidWarningKeepDays;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertLevels
     */
    public String getAlertLevels() {
        return this.alertLevels;
    }

    /**
     * @return invalidWarningKeepDays
     */
    public Integer getInvalidWarningKeepDays() {
        return this.invalidWarningKeepDays;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<CreateUserSettingRequest, Builder> {
        private String alertLevels; 
        private Integer invalidWarningKeepDays; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserSettingRequest request) {
            super(request);
            this.alertLevels = request.alertLevels;
            this.invalidWarningKeepDays = request.invalidWarningKeepDays;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The severities of alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>high,low</p>
         */
        public Builder alertLevels(String alertLevels) {
            this.putQueryParameter("AlertLevels", alertLevels);
            this.alertLevels = alertLevels;
            return this;
        }

        /**
         * <p>The number of days during which you want to retain invalid alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder invalidWarningKeepDays(Integer invalidWarningKeepDays) {
            this.putQueryParameter("InvalidWarningKeepDays", invalidWarningKeepDays);
            this.invalidWarningKeepDays = invalidWarningKeepDays;
            return this;
        }

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>112.48.16.***</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public CreateUserSettingRequest build() {
            return new CreateUserSettingRequest(this);
        } 

    } 

}
