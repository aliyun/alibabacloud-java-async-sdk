// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVulGlobalConfigRequest} extends {@link RequestModel}
 *
 * <p>ListVulGlobalConfigRequest</p>
 */
public class ListVulGlobalConfigRequest extends Request {
    @Query
    @NameInMap("ConfigKey")
    private String configKey;

    private ListVulGlobalConfigRequest(Builder builder) {
        super(builder);
        this.configKey = builder.configKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVulGlobalConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configKey
     */
    public String getConfigKey() {
        return this.configKey;
    }

    public static final class Builder extends Request.Builder<ListVulGlobalConfigRequest, Builder> {
        private String configKey; 

        private Builder() {
            super();
        } 

        private Builder(ListVulGlobalConfigRequest request) {
            super(request);
            this.configKey = request.configKey;
        } 

        /**
         * The key of the configuration item. Valid values:
         * <p>
         * 
         * *   **vul_scan_ip_list**: The IP addresses that are detected.
         */
        public Builder configKey(String configKey) {
            this.putQueryParameter("ConfigKey", configKey);
            this.configKey = configKey;
            return this;
        }

        @Override
        public ListVulGlobalConfigRequest build() {
            return new ListVulGlobalConfigRequest(this);
        } 

    } 

}
