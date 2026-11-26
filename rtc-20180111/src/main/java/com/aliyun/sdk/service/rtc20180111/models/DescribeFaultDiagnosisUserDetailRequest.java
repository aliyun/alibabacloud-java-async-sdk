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
 * {@link DescribeFaultDiagnosisUserDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeFaultDiagnosisUserDetailRequest</p>
 */
public class DescribeFaultDiagnosisUserDetailRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("FaultType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String faultType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryCallUserInfo")
    private Boolean queryCallUserInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private DescribeFaultDiagnosisUserDetailRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.createdTs = builder.createdTs;
        this.faultType = builder.faultType;
        this.queryCallUserInfo = builder.queryCallUserInfo;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFaultDiagnosisUserDetailRequest create() {
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
     * @return faultType
     */
    public String getFaultType() {
        return this.faultType;
    }

    /**
     * @return queryCallUserInfo
     */
    public Boolean getQueryCallUserInfo() {
        return this.queryCallUserInfo;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DescribeFaultDiagnosisUserDetailRequest, Builder> {
        private String appId; 
        private String channelId; 
        private Long createdTs; 
        private String faultType; 
        private Boolean queryCallUserInfo; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFaultDiagnosisUserDetailRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.createdTs = request.createdTs;
            this.faultType = request.faultType;
            this.queryCallUserInfo = request.queryCallUserInfo;
            this.userId = request.userId;
        } 

        /**
         * <p>APP ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0rbd****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>频道ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>311</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>频道创建时间，使用UNIX时间戳表示，单位：秒。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1615892596</p>
         */
        public Builder createdTs(Long createdTs) {
            this.putQueryParameter("CreatedTs", createdTs);
            this.createdTs = createdTs;
            return this;
        }

        /**
         * <p>异常类型。取值：</p>
         * <ul>
         * <li><strong>JOIN_SLOW</strong>：进频道慢 。</li>
         * <li><strong>AUDIO_STUCK</strong>：音频卡顿。</li>
         * <li><strong>VIDEO_STUCK</strong>：视频卡顿。</li>
         * <li><strong>VIDEO_VAGUE</strong>：视频模糊。</li>
         * <li><strong>HIGH_DELAY</strong>：通话延迟高 。</li>
         * <li><strong>FIRST_FRAME_SLOW</strong>：接收首屏慢。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>JOIN_SLOW</p>
         */
        public Builder faultType(String faultType) {
            this.putQueryParameter("FaultType", faultType);
            this.faultType = faultType;
            return this;
        }

        /**
         * <p>是否查询通话用户信息，为空默认是false。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder queryCallUserInfo(Boolean queryCallUserInfo) {
            this.putQueryParameter("QueryCallUserInfo", queryCallUserInfo);
            this.queryCallUserInfo = queryCallUserInfo;
            return this;
        }

        /**
         * <p>用户ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c906531af5f9****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DescribeFaultDiagnosisUserDetailRequest build() {
            return new DescribeFaultDiagnosisUserDetailRequest(this);
        } 

    } 

}
