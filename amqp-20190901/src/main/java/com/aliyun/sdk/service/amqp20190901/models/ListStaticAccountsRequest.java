// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link ListStaticAccountsRequest} extends {@link RequestModel}
 *
 * <p>ListStaticAccountsRequest</p>
 */
public class ListStaticAccountsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private ListStaticAccountsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consoleSessionId = builder.consoleSessionId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStaticAccountsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return consoleSessionId
     */
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ListStaticAccountsRequest, Builder> {
        private String regionId; 
        private String consoleSessionId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListStaticAccountsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.consoleSessionId = request.consoleSessionId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ConsoleSessionId.
         */
        public Builder consoleSessionId(String consoleSessionId) {
            this.putQueryParameter("ConsoleSessionId", consoleSessionId);
            this.consoleSessionId = consoleSessionId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ListStaticAccountsRequest build() {
            return new ListStaticAccountsRequest(this);
        } 

    } 

}
