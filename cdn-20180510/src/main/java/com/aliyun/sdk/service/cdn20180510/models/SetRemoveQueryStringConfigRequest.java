// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRemoveQueryStringConfigRequest} extends {@link RequestModel}
 *
 * <p>SetRemoveQueryStringConfigRequest</p>
 */
public class SetRemoveQueryStringConfigRequest extends Request {
    @Query
    @NameInMap("AliRemoveArgs")
    @Validation(required = true)
    private String aliRemoveArgs;

    @Query
    @NameInMap("ConfigId")
    private Long configId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("KeepOssArgs")
    private String keepOssArgs;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private SetRemoveQueryStringConfigRequest(Builder builder) {
        super(builder);
        this.aliRemoveArgs = builder.aliRemoveArgs;
        this.configId = builder.configId;
        this.domainName = builder.domainName;
        this.keepOssArgs = builder.keepOssArgs;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetRemoveQueryStringConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliRemoveArgs
     */
    public String getAliRemoveArgs() {
        return this.aliRemoveArgs;
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

    public static final class Builder extends Request.Builder<SetRemoveQueryStringConfigRequest, Builder> {
        private String aliRemoveArgs; 
        private Long configId; 
        private String domainName; 
        private String keepOssArgs; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetRemoveQueryStringConfigRequest response) {
            super(response);
            this.aliRemoveArgs = response.aliRemoveArgs;
            this.configId = response.configId;
            this.domainName = response.domainName;
            this.keepOssArgs = response.keepOssArgs;
            this.ownerId = response.ownerId;
        } 

        /**
         * AliRemoveArgs.
         */
        public Builder aliRemoveArgs(String aliRemoveArgs) {
            this.putQueryParameter("AliRemoveArgs", aliRemoveArgs);
            this.aliRemoveArgs = aliRemoveArgs;
            return this;
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
        public SetRemoveQueryStringConfigRequest build() {
            return new SetRemoveQueryStringConfigRequest(this);
        } 

    } 

}
