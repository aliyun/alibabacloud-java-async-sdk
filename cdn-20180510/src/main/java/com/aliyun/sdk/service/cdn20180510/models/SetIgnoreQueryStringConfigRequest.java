// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetIgnoreQueryStringConfigRequest} extends {@link RequestModel}
 *
 * <p>SetIgnoreQueryStringConfigRequest</p>
 */
public class SetIgnoreQueryStringConfigRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    private Long configId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Enable")
    @Validation(required = true)
    private String enable;

    @Query
    @NameInMap("HashKeyArgs")
    private String hashKeyArgs;

    @Query
    @NameInMap("KeepOssArgs")
    private String keepOssArgs;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private SetIgnoreQueryStringConfigRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.domainName = builder.domainName;
        this.enable = builder.enable;
        this.hashKeyArgs = builder.hashKeyArgs;
        this.keepOssArgs = builder.keepOssArgs;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetIgnoreQueryStringConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return hashKeyArgs
     */
    public String getHashKeyArgs() {
        return this.hashKeyArgs;
    }

    /**
     * @return keepOssArgs
     */
    public String getKeepOssArgs() {
        return this.keepOssArgs;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<SetIgnoreQueryStringConfigRequest, Builder> {
        private Long configId; 
        private String domainName; 
        private String enable; 
        private String hashKeyArgs; 
        private String keepOssArgs; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetIgnoreQueryStringConfigRequest response) {
            super(response);
            this.configId = response.configId;
            this.domainName = response.domainName;
            this.enable = response.enable;
            this.hashKeyArgs = response.hashKeyArgs;
            this.keepOssArgs = response.keepOssArgs;
            this.ownerId = response.ownerId;
        } 

        /**
         * ConfigId.
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * HashKeyArgs.
         */
        public Builder hashKeyArgs(String hashKeyArgs) {
            this.putQueryParameter("HashKeyArgs", hashKeyArgs);
            this.hashKeyArgs = hashKeyArgs;
            return this;
        }

        /**
         * KeepOssArgs.
         */
        public Builder keepOssArgs(String keepOssArgs) {
            this.putQueryParameter("KeepOssArgs", keepOssArgs);
            this.keepOssArgs = keepOssArgs;
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

        @Override
        public SetIgnoreQueryStringConfigRequest build() {
            return new SetIgnoreQueryStringConfigRequest(this);
        } 

    } 

}
