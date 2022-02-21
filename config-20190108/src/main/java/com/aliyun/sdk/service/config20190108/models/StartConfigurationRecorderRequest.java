// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartConfigurationRecorderRequest} extends {@link RequestModel}
 *
 * <p>StartConfigurationRecorderRequest</p>
 */
public class StartConfigurationRecorderRequest extends Request {
    @Body
    @NameInMap("EnterpriseEdition")
    private Boolean enterpriseEdition;

    private StartConfigurationRecorderRequest(Builder builder) {
        super(builder);
        this.enterpriseEdition = builder.enterpriseEdition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartConfigurationRecorderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enterpriseEdition
     */
    public Boolean getEnterpriseEdition() {
        return this.enterpriseEdition;
    }

    public static final class Builder extends Request.Builder<StartConfigurationRecorderRequest, Builder> {
        private Boolean enterpriseEdition; 

        private Builder() {
            super();
        } 

        private Builder(StartConfigurationRecorderRequest response) {
            super(response);
            this.enterpriseEdition = response.enterpriseEdition;
        } 

        /**
         * EnterpriseEdition.
         */
        public Builder enterpriseEdition(Boolean enterpriseEdition) {
            this.putBodyParameter("EnterpriseEdition", enterpriseEdition);
            this.enterpriseEdition = enterpriseEdition;
            return this;
        }

        @Override
        public StartConfigurationRecorderRequest build() {
            return new StartConfigurationRecorderRequest(this);
        } 

    } 

}
