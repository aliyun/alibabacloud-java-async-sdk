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
 * {@link BatchDeleteMaliciousFileWhitelistConfigRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteMaliciousFileWhitelistConfigRequest</p>
 */
public class BatchDeleteMaliciousFileWhitelistConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigIdList")
    private java.util.List<Long> configIdList;

    private BatchDeleteMaliciousFileWhitelistConfigRequest(Builder builder) {
        super(builder);
        this.configIdList = builder.configIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteMaliciousFileWhitelistConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configIdList
     */
    public java.util.List<Long> getConfigIdList() {
        return this.configIdList;
    }

    public static final class Builder extends Request.Builder<BatchDeleteMaliciousFileWhitelistConfigRequest, Builder> {
        private java.util.List<Long> configIdList; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteMaliciousFileWhitelistConfigRequest request) {
            super(request);
            this.configIdList = request.configIdList;
        } 

        /**
         * <p>The IDs of the whitelist rules. You can call the <a href="~~ListMaliciousFileWhitelistConfigs~~">ListMaliciousFileWhitelistConfigs</a> operation to query the IDs of whitelist rules.</p>
         */
        public Builder configIdList(java.util.List<Long> configIdList) {
            this.putQueryParameter("ConfigIdList", configIdList);
            this.configIdList = configIdList;
            return this;
        }

        @Override
        public BatchDeleteMaliciousFileWhitelistConfigRequest build() {
            return new BatchDeleteMaliciousFileWhitelistConfigRequest(this);
        } 

    } 

}
