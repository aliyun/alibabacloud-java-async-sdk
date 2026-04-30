// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarClawMCPServersRequest} extends {@link RequestModel}
 *
 * <p>DescribePolarClawMCPServersRequest</p>
 */
public class DescribePolarClawMCPServersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerList")
    private java.util.List<String> serverList;

    private DescribePolarClawMCPServersRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.serverList = builder.serverList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawMCPServersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return serverList
     */
    public java.util.List<String> getServerList() {
        return this.serverList;
    }

    public static final class Builder extends Request.Builder<DescribePolarClawMCPServersRequest, Builder> {
        private String applicationId; 
        private java.util.List<String> serverList; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolarClawMCPServersRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.serverList = request.serverList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * ServerList.
         */
        public Builder serverList(java.util.List<String> serverList) {
            this.putQueryParameter("ServerList", serverList);
            this.serverList = serverList;
            return this;
        }

        @Override
        public DescribePolarClawMCPServersRequest build() {
            return new DescribePolarClawMCPServersRequest(this);
        } 

    } 

}
