// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link UpgradeClientRequest} extends {@link RequestModel}
 *
 * <p>UpgradeClientRequest</p>
 */
public class UpgradeClientRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private UpgradeClientRequest(Builder builder) {
        super(builder);
        this.clientVersion = builder.clientVersion;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeClientRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<UpgradeClientRequest, Builder> {
        private String clientVersion; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeClientRequest request) {
            super(request);
            this.clientVersion = request.clientVersion;
            this.clusterId = request.clusterId;
        } 

        /**
         * <p>The version to which you want to update ehpcutil. By default, ehpcutil is updated to the latest version. You can call the <a href="https://help.aliyun.com/document_detail/87223.html">ListCurrentClientVersion</a> to query the latest ehpcutil version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public UpgradeClientRequest build() {
            return new UpgradeClientRequest(this);
        } 

    } 

}
