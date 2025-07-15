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
 * {@link UpdateLiveCenterTransferRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveCenterTransferRequest</p>
 */
public class UpdateLiveCenterTransferRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dstUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransferArgs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transferArgs;

    private UpdateLiveCenterTransferRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.dstUrl = builder.dstUrl;
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.streamName = builder.streamName;
        this.transferArgs = builder.transferArgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveCenterTransferRequest create() {
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return dstUrl
     */
    public String getDstUrl() {
        return this.dstUrl;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return transferArgs
     */
    public String getTransferArgs() {
        return this.transferArgs;
    }

    public static final class Builder extends Request.Builder<UpdateLiveCenterTransferRequest, Builder> {
        private String appName; 
        private String domainName; 
        private String dstUrl; 
        private String endTime; 
        private Long ownerId; 
        private String regionId; 
        private String startTime; 
        private String streamName; 
        private String transferArgs; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveCenterTransferRequest request) {
            super(request);
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.dstUrl = request.dstUrl;
            this.endTime = request.endTime;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
            this.streamName = request.streamName;
            this.transferArgs = request.transferArgs;
        } 

        /**
         * <p>The name of the application to which the live stream belongs. The value of this parameter must be the same as the application name for the live stream that you want to relay. Otherwise, the configuration does not take effect. You can view the application name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
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
         * <p>The streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The third-party URL to which the live stream is relayed. You can add only one URL.</p>
         * <blockquote>
         * <p> The protocol that the URL uses must be the same as the protocol of the live stream. Only URLs over RTMP and SRT are supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://push.example2.aliyunlive.com/testapp1/teststream2</p>
         */
        public Builder dstUrl(String dstUrl) {
            this.putQueryParameter("DstUrl", dstUrl);
            this.dstUrl = dstUrl;
            return this;
        }

        /**
         * <p>The end time of stream relay. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p> The end time must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2017-12-22T08:00:00Z</p>
         */
        public Builder endTime(String endTime) {
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
         * <p>The start time of stream relay. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-21T10:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The name of the live stream. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
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

        /**
         * <p>The validity period of stream relay. Valid values:</p>
         * <ul>
         * <li><strong>always</strong>: The stream can always be relayed.</li>
         * <li><strong>time</strong>: The stream can be relayed in a specified time period.</li>
         * </ul>
         * <blockquote>
         * <p> If the value is <strong>time</strong>, <strong>StartTime</strong> and <strong>EndTime</strong> are required.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>always</p>
         */
        public Builder transferArgs(String transferArgs) {
            this.putQueryParameter("TransferArgs", transferArgs);
            this.transferArgs = transferArgs;
            return this;
        }

        @Override
        public UpdateLiveCenterTransferRequest build() {
            return new UpdateLiveCenterTransferRequest(this);
        } 

    } 

}
