// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link SetLiveDomainMultiStreamOptimalModeRequest} extends {@link RequestModel}
 *
 * <p>SetLiveDomainMultiStreamOptimalModeRequest</p>
 */
public class SetLiveDomainMultiStreamOptimalModeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OptimalMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String optimalMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamName;

    private SetLiveDomainMultiStreamOptimalModeRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domain = builder.domain;
        this.optimalMode = builder.optimalMode;
        this.ownerId = builder.ownerId;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveDomainMultiStreamOptimalModeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return optimalMode
     */
    public String getOptimalMode() {
        return this.optimalMode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<SetLiveDomainMultiStreamOptimalModeRequest, Builder> {
        private String appName; 
        private String domain; 
        private String optimalMode; 
        private Long ownerId; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(SetLiveDomainMultiStreamOptimalModeRequest request) {
            super(request);
            this.appName = request.appName;
            this.domain = request.domain;
            this.optimalMode = request.optimalMode;
            this.ownerId = request.ownerId;
            this.streamName = request.streamName;
        } 

        /**
         * <p>The application name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testapp</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>Specifies whether to enable the auto mode of dual-stream disaster recovery. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enables the auto mode.</li>
         * <li><strong>off</strong>: disables the auto mode.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder optimalMode(String optimalMode) {
            this.putQueryParameter("OptimalMode", optimalMode);
            this.optimalMode = optimalMode;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The name of the live stream.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>teststream</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public SetLiveDomainMultiStreamOptimalModeRequest build() {
            return new SetLiveDomainMultiStreamOptimalModeRequest(this);
        } 

    } 

}
