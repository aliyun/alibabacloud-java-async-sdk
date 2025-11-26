// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetPrometheusUserSettingResponseBody} extends {@link TeaModel}
 *
 * <p>GetPrometheusUserSettingResponseBody</p>
 */
public class GetPrometheusUserSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("prometheusUserSetting")
    private java.util.Map<String, String> prometheusUserSetting;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetPrometheusUserSettingResponseBody(Builder builder) {
        this.prometheusUserSetting = builder.prometheusUserSetting;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrometheusUserSettingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return prometheusUserSetting
     */
    public java.util.Map<String, String> getPrometheusUserSetting() {
        return this.prometheusUserSetting;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, String> prometheusUserSetting; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPrometheusUserSettingResponseBody model) {
            this.prometheusUserSetting = model.prometheusUserSetting;
            this.requestId = model.requestId;
        } 

        /**
         * prometheusUserSetting.
         */
        public Builder prometheusUserSetting(java.util.Map<String, String> prometheusUserSetting) {
            this.prometheusUserSetting = prometheusUserSetting;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>058550FA-DDBE-519E-9C6D-93521B9A5E90</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPrometheusUserSettingResponseBody build() {
            return new GetPrometheusUserSettingResponseBody(this);
        } 

    } 

}
