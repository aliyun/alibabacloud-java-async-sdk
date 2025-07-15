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
 * {@link DescribeUpBpsPeakOfLineRequest} extends {@link RequestModel}
 *
 * <p>DescribeUpBpsPeakOfLineRequest</p>
 */
public class DescribeUpBpsPeakOfLineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainSwitch")
    private String domainSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Line")
    @com.aliyun.core.annotation.Validation(required = true)
    private String line;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeUpBpsPeakOfLineRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.domainSwitch = builder.domainSwitch;
        this.endTime = builder.endTime;
        this.line = builder.line;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUpBpsPeakOfLineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainSwitch
     */
    public String getDomainSwitch() {
        return this.domainSwitch;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return line
     */
    public String getLine() {
        return this.line;
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

    public static final class Builder extends Request.Builder<DescribeUpBpsPeakOfLineRequest, Builder> {
        private String domainName; 
        private String domainSwitch; 
        private String endTime; 
        private String line; 
        private Long ownerId; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUpBpsPeakOfLineRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.domainSwitch = request.domainSwitch;
            this.endTime = request.endTime;
            this.line = request.line;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The accelerated domain name.</p>
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
         * <p>Specifies whether to collect statistics at the domain name level. Valid values:</p>
         * <ul>
         * <li>on: collects statistics at the domain name level.</li>
         * <li>off (default): collects statistics at the user level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder domainSwitch(String domainSwitch) {
            this.putQueryParameter("DomainSwitch", domainSwitch);
            this.domainSwitch = domainSwitch;
            return this;
        }

        /**
         * <p>The end time of stream pulling. The time must be in UTC. The end time must be later than the start time. The maximum time range that can be specified by StartTime and EndTime is 30 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-10-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The leased line. Valid values: integers from 0 to 9.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder line(String line) {
            this.putQueryParameter("Line", line);
            this.line = line;
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
         * <p>The start time of stream pulling. The time must be in UTC. The maximum time range that can be specified by StartTime and EndTime is 30 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-10-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeUpBpsPeakOfLineRequest build() {
            return new DescribeUpBpsPeakOfLineRequest(this);
        } 

    } 

}
