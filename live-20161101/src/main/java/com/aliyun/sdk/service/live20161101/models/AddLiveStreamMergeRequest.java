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
 * {@link AddLiveStreamMergeRequest} extends {@link RequestModel}
 *
 * <p>AddLiveStreamMergeRequest</p>
 */
public class AddLiveStreamMergeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InAppName1")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inAppName1;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InAppName2")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inAppName2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InStreamName1")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inStreamName1;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InStreamName2")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inStreamName2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamName;

    private AddLiveStreamMergeRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.inAppName1 = builder.inAppName1;
        this.inAppName2 = builder.inAppName2;
        this.inStreamName1 = builder.inStreamName1;
        this.inStreamName2 = builder.inStreamName2;
        this.ownerId = builder.ownerId;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveStreamMergeRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return inAppName1
     */
    public String getInAppName1() {
        return this.inAppName1;
    }

    /**
     * @return inAppName2
     */
    public String getInAppName2() {
        return this.inAppName2;
    }

    /**
     * @return inStreamName1
     */
    public String getInStreamName1() {
        return this.inStreamName1;
    }

    /**
     * @return inStreamName2
     */
    public String getInStreamName2() {
        return this.inStreamName2;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
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

    public static final class Builder extends Request.Builder<AddLiveStreamMergeRequest, Builder> {
        private String appName; 
        private String domainName; 
        private String endTime; 
        private String inAppName1; 
        private String inAppName2; 
        private String inStreamName1; 
        private String inStreamName2; 
        private Long ownerId; 
        private String protocol; 
        private String regionId; 
        private String startTime; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveStreamMergeRequest request) {
            super(request);
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.inAppName1 = request.inAppName1;
            this.inAppName2 = request.inAppName2;
            this.inStreamName1 = request.inStreamName1;
            this.inStreamName2 = request.inStreamName2;
            this.ownerId = request.ownerId;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
            this.streamName = request.streamName;
        } 

        /**
         * <p>The name of the application that generates the output stream. The value must be the same as the application name in the ingest URL of the output stream. Otherwise, the configuration does not take effect. You cannot set the value to an asterisk (*).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
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
         * <p>The end time of the stream mixing.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p> The interval between the start time and the end time must be within 7 days.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-29T01:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The name of the application that generates the input primary stream. The value must be the same as the application name that is specified in the ingest URL of the primary stream. Otherwise, the configuration does not take effect.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app1</p>
         */
        public Builder inAppName1(String inAppName1) {
            this.putQueryParameter("InAppName1", inAppName1);
            this.inAppName1 = inAppName1;
            return this;
        }

        /**
         * <p>The name of the application that generates the input secondary stream. The value must be the same as the application name that is specified in the ingest URL of the secondary stream. Otherwise, the configuration does not take effect.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app2</p>
         */
        public Builder inAppName2(String inAppName2) {
            this.putQueryParameter("InAppName2", inAppName2);
            this.inAppName2 = inAppName2;
            return this;
        }

        /**
         * <p>The name of the input primary stream. The value must be the same as the stream name that is specified in the ingest URL of the primary stream. Otherwise, the configuration does not take effect.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>InStream1</p>
         */
        public Builder inStreamName1(String inStreamName1) {
            this.putQueryParameter("InStreamName1", inStreamName1);
            this.inStreamName1 = inStreamName1;
            return this;
        }

        /**
         * <p>The name of the input secondary stream. The value must be the same as the stream name that is specified in the ingest URL of the secondary stream. Otherwise, the configuration does not take effect.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>stream2</p>
         */
        public Builder inStreamName2(String inStreamName2) {
            this.putQueryParameter("InStreamName2", inStreamName2);
            this.inStreamName2 = inStreamName2;
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
         * <p>The streaming protocol. Valid values:</p>
         * <ul>
         * <li><strong>rtmp</strong>: This is the default value.</li>
         * <li><strong>rtc</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rtmp</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
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
         * <p>The start time of the stream mixing.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-29T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The name of the output stream. The value must be the same as the stream name in the ingest URL of the output stream. Otherwise, the configuration does not take effect. You cannot set the value to an asterisk (*).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>StreamName</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public AddLiveStreamMergeRequest build() {
            return new AddLiveStreamMergeRequest(this);
        } 

    } 

}
