// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701.models;

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
 * {@link GetTransitMetaRequest} extends {@link RequestModel}
 *
 * <p>GetTransitMetaRequest</p>
 */
public class GetTransitMetaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireMs")
    private Long expireMs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Network")
    private String network;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitId")
    private String transitId;

    private GetTransitMetaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.expireMs = builder.expireMs;
        this.filePath = builder.filePath;
        this.network = builder.network;
        this.transitId = builder.transitId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTransitMetaRequest create() {
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
     * @return expireMs
     */
    public Long getExpireMs() {
        return this.expireMs;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return network
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * @return transitId
     */
    public String getTransitId() {
        return this.transitId;
    }

    public static final class Builder extends Request.Builder<GetTransitMetaRequest, Builder> {
        private String regionId; 
        private Long expireMs; 
        private String filePath; 
        private String network; 
        private String transitId; 

        private Builder() {
            super();
        } 

        private Builder(GetTransitMetaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.expireMs = request.expireMs;
            this.filePath = request.filePath;
            this.network = request.network;
            this.transitId = request.transitId;
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
         * <p>The validity period of the temporary download URL, in milliseconds. The value must be an integer greater than or equal to 1000 and is rounded down to the nearest whole second. If <code>ExpireMs</code> is not specified, the default validity period is <code>900000</code> milliseconds (15 minutes). A download URL is generated only when <code>Network</code> is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>900000</p>
         */
        public Builder expireMs(Long expireMs) {
            this.putQueryParameter("ExpireMs", expireMs);
            this.expireMs = expireMs;
            return this;
        }

        /**
         * <p>The opaque object path returned by <code>CreateTransitUploadPolicy</code>. Specify at least one of this parameter and <code>TransitId</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-bundle/tenant-demo/user-demo/20260904120000_code-review.zip</p>
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>The network type for the download URL. Valid values: <code>public</code> and <code>internal</code>. If this parameter is not specified, no download URL is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder network(String network) {
            this.putQueryParameter("Network", network);
            this.network = network;
            return this;
        }

        /**
         * <p>The Transit ID. Specify at least one of this parameter and <code>FilePath</code>. If both are specified, this parameter takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>transit_0123456789abcdef0123456789abcdef</p>
         */
        public Builder transitId(String transitId) {
            this.putQueryParameter("TransitId", transitId);
            this.transitId = transitId;
            return this;
        }

        @Override
        public GetTransitMetaRequest build() {
            return new GetTransitMetaRequest(this);
        } 

    } 

}
