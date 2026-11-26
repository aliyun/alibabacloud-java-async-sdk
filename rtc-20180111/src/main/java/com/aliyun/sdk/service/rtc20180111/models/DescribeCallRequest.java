// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
         * <p>The app ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testappid</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The channel ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testid</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The time when the channel was created. You can query data of the last 30 days. The time is a UNIX timestamp in seconds.</p>
         * <blockquote>
         * <p>The channel creation time must be exactly the same as the actual creation time (accurate to the second). You can call the <a href="https://help.aliyun.com/document_detail/2655884.html">DescribeCallList</a> operation to view the channel creation time (the CreatedTS parameter in the response).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
        public Builder createdTs(Long createdTs) {
            this.putQueryParameter("CreatedTs", createdTs);
            this.createdTs = createdTs;
            return this;
        }

        /**
         * <p>The time when the channel was released. The time is a UNIX timestamp in seconds. If this parameter is left empty, the current time is used.</p>
         * <blockquote>
         * <p>If the specified channel release time is later than the actual release time, the data from the creation time to the actual release time is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
        public Builder destroyedTs(Long destroyedTs) {
            this.putQueryParameter("DestroyedTs", destroyedTs);
            this.destroyedTs = destroyedTs;
            return this;
        }

        /**
         * <p>The extended data type to query. Valid values:</p>
         * <ul>
         * <li>USER_DURATION_STAT: user duration statistics.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER_DURATION_STAT</p>
         */
        public Builder extDataType(String extDataType) {
            this.putQueryParameter("ExtDataType", extDataType);
            this.extDataType = extDataType;
            return this;
        }

        /**
         * <p>Specifies whether to query the communication experience information. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
