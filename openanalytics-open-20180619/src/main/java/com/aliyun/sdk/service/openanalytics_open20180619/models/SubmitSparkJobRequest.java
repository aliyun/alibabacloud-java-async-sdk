// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSparkJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitSparkJobRequest</p>
 */
public class SubmitSparkJobRequest extends Request {
    @Body
    @NameInMap("ConfigJson")
    @Validation(required = true)
    private String configJson;

    @Body
    @NameInMap("VcName")
    @Validation(required = true)
    private String vcName;

    private SubmitSparkJobRequest(Builder builder) {
        super(builder);
        this.configJson = builder.configJson;
        this.vcName = builder.vcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSparkJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configJson
     */
    public String getConfigJson() {
        return this.configJson;
    }

    /**
     * @return vcName
     */
    public String getVcName() {
        return this.vcName;
    }

    public static final class Builder extends Request.Builder<SubmitSparkJobRequest, Builder> {
        private String configJson; 
        private String vcName; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSparkJobRequest response) {
            super(response);
            this.configJson = response.configJson;
            this.vcName = response.vcName;
        } 

        /**
         * ConfigJson.
         */
        public Builder configJson(String configJson) {
            this.putBodyParameter("ConfigJson", configJson);
            this.configJson = configJson;
            return this;
        }

        /**
         * VcName.
         */
        public Builder vcName(String vcName) {
            this.putBodyParameter("VcName", vcName);
            this.vcName = vcName;
            return this;
        }

        @Override
        public SubmitSparkJobRequest build() {
            return new SubmitSparkJobRequest(this);
        } 

    } 

}
