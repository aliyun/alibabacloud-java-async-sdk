// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteHybridProxyRequest} extends {@link RequestModel}
 *
 * <p>DeleteHybridProxyRequest</p>
 */
public class DeleteHybridProxyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private DeleteHybridProxyRequest(Builder builder) {
        super(builder);
        this.clusterName = builder.clusterName;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHybridProxyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DeleteHybridProxyRequest, Builder> {
        private String clusterName; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHybridProxyRequest request) {
            super(request);
            this.clusterName = request.clusterName;
            this.uuid = request.uuid;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>inet-proxy-d2d94e8b-bb25-4744-8004-1e08a53c****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DeleteHybridProxyRequest build() {
            return new DeleteHybridProxyRequest(this);
        } 

    } 

}
