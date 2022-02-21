// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecordResponseBody</p>
 */
public class DescribeRecordResponseBody extends TeaModel {
    @NameInMap("AppId")
    private String appId;

    @NameInMap("BoardId")
    private Integer boardId;

    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("OssBucket")
    private String ossBucket;

    @NameInMap("OssEndpoint")
    private String ossEndpoint;

    @NameInMap("OssPath")
    private String ossPath;

    @NameInMap("RecordId")
    private String recordId;

    @NameInMap("RecordStartTime")
    private Long recordStartTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("State")
    private Integer state;

    private DescribeRecordResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.boardId = builder.boardId;
        this.endTime = builder.endTime;
        this.ossBucket = builder.ossBucket;
        this.ossEndpoint = builder.ossEndpoint;
        this.ossPath = builder.ossPath;
        this.recordId = builder.recordId;
        this.recordStartTime = builder.recordStartTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return boardId
     */
    public Integer getBoardId() {
        return this.boardId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return ossBucket
     */
    public String getOssBucket() {
        return this.ossBucket;
    }

    /**
     * @return ossEndpoint
     */
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    /**
     * @return ossPath
     */
    public String getOssPath() {
        return this.ossPath;
    }

    /**
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    /**
     * @return recordStartTime
     */
    public Long getRecordStartTime() {
        return this.recordStartTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return this.state;
    }

    public static final class Builder {
        private String appId; 
        private Integer boardId; 
        private Long endTime; 
        private String ossBucket; 
        private String ossEndpoint; 
        private String ossPath; 
        private String recordId; 
        private Long recordStartTime; 
        private String requestId; 
        private Long startTime; 
        private Integer state; 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * BoardId.
         */
        public Builder boardId(Integer boardId) {
            this.boardId = boardId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * OssBucket.
         */
        public Builder ossBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * OssEndpoint.
         */
        public Builder ossEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }

        /**
         * OssPath.
         */
        public Builder ossPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }

        /**
         * RecordId.
         */
        public Builder recordId(String recordId) {
            this.recordId = recordId;
            return this;
        }

        /**
         * RecordStartTime.
         */
        public Builder recordStartTime(Long recordStartTime) {
            this.recordStartTime = recordStartTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * State.
         */
        public Builder state(Integer state) {
            this.state = state;
            return this;
        }

        public DescribeRecordResponseBody build() {
            return new DescribeRecordResponseBody(this);
        } 

    } 

}
