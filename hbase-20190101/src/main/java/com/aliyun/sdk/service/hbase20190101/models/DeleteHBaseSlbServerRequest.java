// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DeleteHBaseSlbServerRequest} extends {@link RequestModel}
 *
 * <p>DeleteHBaseSlbServerRequest</p>
 */
public class DeleteHBaseSlbServerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlbServer")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slbServer;

    private DeleteHBaseSlbServerRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.slbServer = builder.slbServer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHBaseSlbServerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return slbServer
     */
    public String getSlbServer() {
        return this.slbServer;
    }

    public static final class Builder extends Request.Builder<DeleteHBaseSlbServerRequest, Builder> {
        private String clusterId; 
        private String slbServer; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHBaseSlbServerRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.slbServer = request.slbServer;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hb-t4naqsay5gn****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>thrift</p>
         */
        public Builder slbServer(String slbServer) {
            this.putQueryParameter("SlbServer", slbServer);
            this.slbServer = slbServer;
            return this;
        }

        @Override
        public DeleteHBaseSlbServerRequest build() {
            return new DeleteHBaseSlbServerRequest(this);
        } 

    } 

}
