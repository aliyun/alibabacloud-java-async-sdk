// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link UpgradeAICInstanceImageRequest} extends {@link RequestModel}
 *
 * <p>UpgradeAICInstanceImageRequest</p>
 */
public class UpgradeAICInstanceImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> serverIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    private UpgradeAICInstanceImageRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.serverIds = builder.serverIds;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeAICInstanceImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return serverIds
     */
    public java.util.List<String> getServerIds() {
        return this.serverIds;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<UpgradeAICInstanceImageRequest, Builder> {
        private String imageId; 
        private java.util.List<String> serverIds; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeAICInstanceImageRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.serverIds = request.serverIds;
            this.timeout = request.timeout;
        } 

        /**
         * <p>The ID of the AIC image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The IDs of the servers.</p>
         * <p>This parameter is required.</p>
         */
        public Builder serverIds(java.util.List<String> serverIds) {
            String serverIdsShrink = shrink(serverIds, "ServerIds", "json");
            this.putQueryParameter("ServerIds", serverIdsShrink);
            this.serverIds = serverIds;
            return this;
        }

        /**
         * <p>The timeout period of the update. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public UpgradeAICInstanceImageRequest build() {
            return new UpgradeAICInstanceImageRequest(this);
        } 

    } 

}
