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
 * {@link GetDingtalkMeetingListResponseBody} extends {@link TeaModel}
 *
 * <p>GetDingtalkMeetingListResponseBody</p>
 */
public class GetDingtalkMeetingListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetDingtalkMeetingListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDingtalkMeetingListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
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
        private Integer currentPage; 
        private java.util.List<Data> data; 
        private String requestId; 
        private Integer totalCount; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(GetDingtalkMeetingListResponseBody model) {
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
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

        public GetDingtalkMeetingListResponseBody build() {
            return new GetDingtalkMeetingListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDingtalkMeetingListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDingtalkMeetingListResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
            this.clusterName = builder.clusterName;
            this.conferenceId = builder.conferenceId;
            this.creatorId = builder.creatorId;
            this.creatorNick = builder.creatorNick;
            this.creatorWorkNo = builder.creatorWorkNo;
            this.deptName = builder.deptName;
            this.enableQualityMonitor = builder.enableQualityMonitor;
            this.endTime = builder.endTime;
            this.freeType = builder.freeType;
            this.scene = builder.scene;
            this.startTime = builder.startTime;
            this.timeLength = builder.timeLength;
            this.title = builder.title;
            this.userCount = builder.userCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
            private String scene; 
            private Long startTime; 
            private Long timeLength; 
            private String title; 
            private Integer userCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clusterName = model.clusterName;
                this.conferenceId = model.conferenceId;
                this.creatorId = model.creatorId;
                this.creatorNick = model.creatorNick;
                this.creatorWorkNo = model.creatorWorkNo;
                this.deptName = model.deptName;
                this.enableQualityMonitor = model.enableQualityMonitor;
                this.endTime = model.endTime;
                this.freeType = model.freeType;
                this.scene = model.scene;
                this.startTime = model.startTime;
                this.timeLength = model.timeLength;
                this.title = model.title;
                this.userCount = model.userCount;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
