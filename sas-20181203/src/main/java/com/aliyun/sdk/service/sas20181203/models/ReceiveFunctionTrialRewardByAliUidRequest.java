// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReceiveFunctionTrialRewardByAliUidRequest} extends {@link RequestModel}
 *
 * <p>ReceiveFunctionTrialRewardByAliUidRequest</p>
 */
public class ReceiveFunctionTrialRewardByAliUidRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionName")
    private String functionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private ReceiveFunctionTrialRewardByAliUidRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReceiveFunctionTrialRewardByAliUidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<ReceiveFunctionTrialRewardByAliUidRequest, Builder> {
        private String functionName; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ReceiveFunctionTrialRewardByAliUidRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.lang = request.lang;
        } 

        /**
         * The name of the feature for which you want to apply for a free trial. Valid values:
         * <p>
         * 
         * *   **trail_honeypot_reward**: cloud honeypot
         * *   **trail_file_detect_api_reward**: SDK for malicious file detection
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("FunctionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public ReceiveFunctionTrialRewardByAliUidRequest build() {
            return new ReceiveFunctionTrialRewardByAliUidRequest(this);
        } 

    } 

}
