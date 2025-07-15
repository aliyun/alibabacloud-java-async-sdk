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
 * {@link InitializeAutoShowListTaskRequest} extends {@link RequestModel}
 *
 * <p>InitializeAutoShowListTaskRequest</p>
 */
public class InitializeAutoShowListTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallBackUrl")
    private String callBackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private String resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private InitializeAutoShowListTaskRequest(Builder builder) {
        super(builder);
        this.callBackUrl = builder.callBackUrl;
        this.casterConfig = builder.casterConfig;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceIds = builder.resourceIds;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeAutoShowListTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callBackUrl
     */
    public String getCallBackUrl() {
        return this.callBackUrl;
    }

    /**
     * @return casterConfig
     */
    public String getCasterConfig() {
        return this.casterConfig;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceIds
     */
    public String getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<InitializeAutoShowListTaskRequest, Builder> {
        private String callBackUrl; 
        private String casterConfig; 
        private String domainName; 
        private Long endTime; 
        private Long ownerId; 
        private String regionId; 
        private String resourceIds; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(InitializeAutoShowListTaskRequest request) {
            super(request);
            this.callBackUrl = request.callBackUrl;
            this.casterConfig = request.casterConfig;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceIds = request.resourceIds;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p>http://***.com/callback</p>
         */
        public Builder callBackUrl(String callBackUrl) {
            this.putQueryParameter("CallBackUrl", callBackUrl);
            this.callBackUrl = callBackUrl;
            return this;
        }

        /**
         * <p>The configurations of the production studio. The following configurations are involved:</p>
         * <ul>
         * <li>CasterTemplate: required. The output resolution.</li>
         * <li>LiveTemplate: optional. The templates to be used for transcoding.</li>
         * </ul>
         * <blockquote>
         * <p> Set the value to a JSON string. Use upper camel case for fields of the string.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CasterTemplate&quot;: &quot;lp_ld&quot;,&quot;LiveTemplates&quot;:[&quot;lhd&quot;, &quot;lsd&quot;,&quot;lud&quot;]}</p>
         */
        public Builder casterConfig(String casterConfig) {
            this.putQueryParameter("CasterConfig", casterConfig);
            this.casterConfig = casterConfig;
            return this;
        }

        /**
         * <p>The output streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end timestamp. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1645688994000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The IDs of on-demand media asset files in the playlist. Only on-demand video files are supported. You can specify up to three video files in the playlist. The video files in the playlist are automatically played in sequence. The playback stops at the point in time specified by the EndTime parameter.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>You can obtain the ID of a video file in the ApsaraVideo Live console or by calling an API operation. For more information, see <a href="https://help.aliyun.com/document_detail/86057.html">Media asset management</a> or <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a>. - If the video files are all played before the time specified by EndTime, the final frame of the final video file is played until the time specified by EndTime arrives.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;89e02xxxxfb349axxxxa0c350d****  &quot;,&quot;6ae0xxxxxb349axxxxa0c350a****&quot;]</p>
         */
        public Builder resourceIds(String resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The start timestamp. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1645688994000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public InitializeAutoShowListTaskRequest build() {
            return new InitializeAutoShowListTaskRequest(this);
        } 

    } 

}
