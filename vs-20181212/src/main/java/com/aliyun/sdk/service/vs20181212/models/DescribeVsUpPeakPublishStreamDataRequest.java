// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsUpPeakPublishStreamDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeVsUpPeakPublishStreamDataRequest</p>
 */
public class DescribeVsUpPeakPublishStreamDataRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeVsUpPeakPublishStreamDataRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.domainSwitch = builder.domainSwitch;
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsUpPeakPublishStreamDataRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeVsUpPeakPublishStreamDataRequest, Builder> {
        private String domainName; 
        private String domainSwitch; 
        private String endTime; 
        private Long ownerId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVsUpPeakPublishStreamDataRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.domainSwitch = request.domainSwitch;
            this.endTime = request.endTime;
            this.ownerId = request.ownerId;
            this.startTime = request.startTime;
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
         * DomainSwitch.
         */
        public Builder domainSwitch(String domainSwitch) {
            this.putQueryParameter("DomainSwitch", domainSwitch);
            this.domainSwitch = domainSwitch;
            return this;
        }

        /**
         * EndTime.
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeVsUpPeakPublishStreamDataRequest build() {
            return new DescribeVsUpPeakPublishStreamDataRequest(this);
        } 

    } 

}
