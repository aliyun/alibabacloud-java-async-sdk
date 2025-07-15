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
 * {@link AddTrancodeSEIRequest} extends {@link RequestModel}
 *
 * <p>AddTrancodeSEIRequest</p>
 */
public class AddTrancodeSEIRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Delay")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer delay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pattern")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Repeat")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer repeat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    private AddTrancodeSEIRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.delay = builder.delay;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.pattern = builder.pattern;
        this.regionId = builder.regionId;
        this.repeat = builder.repeat;
        this.streamName = builder.streamName;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTrancodeSEIRequest create() {
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
     * @return delay
     */
    public Integer getDelay() {
        return this.delay;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pattern
     */
    public String getPattern() {
        return this.pattern;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repeat
     */
    public Integer getRepeat() {
        return this.repeat;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<AddTrancodeSEIRequest, Builder> {
        private String appName; 
        private Integer delay; 
        private String domainName; 
        private Long ownerId; 
        private String pattern; 
        private String regionId; 
        private Integer repeat; 
        private String streamName; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(AddTrancodeSEIRequest request) {
            super(request);
            this.appName = request.appName;
            this.delay = request.delay;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.pattern = request.pattern;
            this.regionId = request.regionId;
            this.repeat = request.repeat;
            this.streamName = request.streamName;
            this.text = request.text;
        } 

        /**
         * <p>The name of the application to which the live stream belongs. You can view the application name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The time period after which the SEI is inserted after the request is received. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder delay(Integer delay) {
            this.putQueryParameter("Delay", delay);
            this.delay = delay;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Specifies whether to append the SEI to each keyframe or frame. Valid values:</p>
         * <ul>
         * <li><strong>keyframe</strong></li>
         * <li><strong>frame</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>keyframe</p>
         */
        public Builder pattern(String pattern) {
            this.putQueryParameter("Pattern", pattern);
            this.pattern = pattern;
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
         * <p>The number of times that the SEI is repeatedly inserted. A value of -1 specifies infinite times.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder repeat(Integer repeat) {
            this.putQueryParameter("Repeat", repeat);
            this.repeat = repeat;
            return this;
        }

        /**
         * <p>The name of the live stream.</p>
         * <blockquote>
         * <p> The value of this parameter must be the name of the source stream. This way, the SEI is inserted to all the transcoded streams.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        /**
         * <p>The SEI text. It can be up to 4,000 bytes in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveSei****</p>
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public AddTrancodeSEIRequest build() {
            return new AddTrancodeSEIRequest(this);
        } 

    } 

}
