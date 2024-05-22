// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCallRequest} extends {@link RequestModel}
 *
 * <p>DescribeCallRequest</p>
 */
public class DescribeCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatedTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long createdTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestroyedTs")
    private Long destroyedTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtDataType")
    private String extDataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryExpInfo")
    private Boolean queryExpInfo;

    private DescribeCallRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.createdTs = builder.createdTs;
        this.destroyedTs = builder.destroyedTs;
        this.extDataType = builder.extDataType;
        this.queryExpInfo = builder.queryExpInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return createdTs
     */
    public Long getCreatedTs() {
        return this.createdTs;
    }

    /**
     * @return destroyedTs
     */
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

    /**
     * @return extDataType
     */
    public String getExtDataType() {
        return this.extDataType;
    }

    /**
     * @return queryExpInfo
     */
    public Boolean getQueryExpInfo() {
        return this.queryExpInfo;
    }

    public static final class Builder extends Request.Builder<DescribeCallRequest, Builder> {
        private String appId; 
        private String channelId; 
        private Long createdTs; 
        private Long destroyedTs; 
        private String extDataType; 
        private Boolean queryExpInfo; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCallRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.createdTs = request.createdTs;
            this.destroyedTs = request.destroyedTs;
            this.extDataType = request.extDataType;
            this.queryExpInfo = request.queryExpInfo;
        } 

        /**
         * APP ID。
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * CreatedTs.
         */
        public Builder createdTs(Long createdTs) {
            this.putQueryParameter("CreatedTs", createdTs);
            this.createdTs = createdTs;
            return this;
        }

        /**
         * DestroyedTs.
         */
        public Builder destroyedTs(Long destroyedTs) {
            this.putQueryParameter("DestroyedTs", destroyedTs);
            this.destroyedTs = destroyedTs;
            return this;
        }

        /**
         * ExtDataType.
         */
        public Builder extDataType(String extDataType) {
            this.putQueryParameter("ExtDataType", extDataType);
            this.extDataType = extDataType;
            return this;
        }

        /**
         * QueryExpInfo.
         */
        public Builder queryExpInfo(Boolean queryExpInfo) {
            this.putQueryParameter("QueryExpInfo", queryExpInfo);
            this.queryExpInfo = queryExpInfo;
            return this;
        }

        @Override
        public DescribeCallRequest build() {
            return new DescribeCallRequest(this);
        } 

    } 

}
