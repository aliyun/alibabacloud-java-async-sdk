// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetDingtalkMeetingInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDingtalkMeetingInfoResponseBody</p>
 */
public class GetDingtalkMeetingInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("conferenceId")
    private String conferenceId;

    @com.aliyun.core.annotation.NameInMap("creatorId")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("creatorNick")
    private String creatorNick;

    @com.aliyun.core.annotation.NameInMap("creatorWorkNo")
    private String creatorWorkNo;

    @com.aliyun.core.annotation.NameInMap("deptName")
    private String deptName;

    @com.aliyun.core.annotation.NameInMap("enableQualityMonitor")
    private Boolean enableQualityMonitor;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("freeType")
    private String freeType;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scene")
    private String scene;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("timeLength")
    private Long timeLength;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("userCount")
    private Integer userCount;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetDingtalkMeetingInfoResponseBody(Builder builder) {
        this.clusterName = builder.clusterName;
        this.conferenceId = builder.conferenceId;
        this.creatorId = builder.creatorId;
        this.creatorNick = builder.creatorNick;
        this.creatorWorkNo = builder.creatorWorkNo;
        this.deptName = builder.deptName;
        this.enableQualityMonitor = builder.enableQualityMonitor;
        this.endTime = builder.endTime;
        this.freeType = builder.freeType;
        this.requestId = builder.requestId;
        this.scene = builder.scene;
        this.startTime = builder.startTime;
        this.timeLength = builder.timeLength;
        this.title = builder.title;
        this.userCount = builder.userCount;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDingtalkMeetingInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return conferenceId
     */
    public String getConferenceId() {
        return this.conferenceId;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return creatorNick
     */
    public String getCreatorNick() {
        return this.creatorNick;
    }

    /**
     * @return creatorWorkNo
     */
    public String getCreatorWorkNo() {
        return this.creatorWorkNo;
    }

    /**
     * @return deptName
     */
    public String getDeptName() {
        return this.deptName;
    }

    /**
     * @return enableQualityMonitor
     */
    public Boolean getEnableQualityMonitor() {
        return this.enableQualityMonitor;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return freeType
     */
    public String getFreeType() {
        return this.freeType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeLength
     */
    public Long getTimeLength() {
        return this.timeLength;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userCount
     */
    public Integer getUserCount() {
        return this.userCount;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String clusterName; 
        private String conferenceId; 
        private String creatorId; 
        private String creatorNick; 
        private String creatorWorkNo; 
        private String deptName; 
        private Boolean enableQualityMonitor; 
        private Long endTime; 
        private String freeType; 
        private String requestId; 
        private String scene; 
        private Long startTime; 
        private Long timeLength; 
        private String title; 
        private Integer userCount; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(GetDingtalkMeetingInfoResponseBody model) {
            this.clusterName = model.clusterName;
            this.conferenceId = model.conferenceId;
            this.creatorId = model.creatorId;
            this.creatorNick = model.creatorNick;
            this.creatorWorkNo = model.creatorWorkNo;
            this.deptName = model.deptName;
            this.enableQualityMonitor = model.enableQualityMonitor;
            this.endTime = model.endTime;
            this.freeType = model.freeType;
            this.requestId = model.requestId;
            this.scene = model.scene;
            this.startTime = model.startTime;
            this.timeLength = model.timeLength;
            this.title = model.title;
            this.userCount = model.userCount;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * clusterName.
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * conferenceId.
         */
        public Builder conferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }

        /**
         * creatorId.
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * creatorNick.
         */
        public Builder creatorNick(String creatorNick) {
            this.creatorNick = creatorNick;
            return this;
        }

        /**
         * creatorWorkNo.
         */
        public Builder creatorWorkNo(String creatorWorkNo) {
            this.creatorWorkNo = creatorWorkNo;
            return this;
        }

        /**
         * deptName.
         */
        public Builder deptName(String deptName) {
            this.deptName = deptName;
            return this;
        }

        /**
         * enableQualityMonitor.
         */
        public Builder enableQualityMonitor(Boolean enableQualityMonitor) {
            this.enableQualityMonitor = enableQualityMonitor;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * freeType.
         */
        public Builder freeType(String freeType) {
            this.freeType = freeType;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * scene.
         */
        public Builder scene(String scene) {
            this.scene = scene;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * timeLength.
         */
        public Builder timeLength(Long timeLength) {
            this.timeLength = timeLength;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * userCount.
         */
        public Builder userCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetDingtalkMeetingInfoResponseBody build() {
            return new GetDingtalkMeetingInfoResponseBody(this);
        } 

    } 

}
