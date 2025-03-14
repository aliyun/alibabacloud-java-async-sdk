// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListVulGlobalConfigRequest} extends {@link RequestModel}
 *
 * <p>ListVulGlobalConfigRequest</p>
 */
public class ListVulGlobalConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigKey")
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
         * <p>The key of the configuration item. Valid values:</p>
         * <ul>
         * <li><strong>vul_scan_ip_list</strong>: The IP addresses that are detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vul_scan_ip_list</p>
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
