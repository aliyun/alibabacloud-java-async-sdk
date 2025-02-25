// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest</p>
 */
public class QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QosRequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qosRequestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.qosRequestId = builder.qosRequestId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return qosRequestId
     */
    public String getQosRequestId() {
        return this.qosRequestId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest, Builder> {
        private String clientToken; 
        private String qosRequestId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.qosRequestId = request.qosRequestId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the request of SetDedicatedBlockStorageClusterDiskThroughput api.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>A37597B5-BB99-19B3-85EA-4C2B91F0****</p>
         */
        public Builder qosRequestId(String qosRequestId) {
            this.putBodyParameter("QosRequestId", qosRequestId);
            this.qosRequestId = qosRequestId;
            return this;
        }

        /**
         * <p>The region ID of the dedicated block storage cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest build() {
            return new QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest(this);
        } 

    } 

}
