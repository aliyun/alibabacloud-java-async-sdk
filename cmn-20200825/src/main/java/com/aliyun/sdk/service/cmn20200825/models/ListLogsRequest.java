// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogsRequest} extends {@link RequestModel}
 *
 * <p>ListLogsRequest</p>
 */
public class ListLogsRequest extends Request {
    @Query
    @NameInMap("AlarmStatus")
    private String alarmStatus;

    @Query
    @NameInMap("Content")
    private String content;

    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("End")
    @Validation(required = true, maximum = 2208960000D, minimum = 1604160000)
    private Long end;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("LogType")
    @Validation(required = true)
    private String logType;

    @Query
    @NameInMap("MaxResults")
    @Validation(required = true, maximum = 200, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Sort")
    private String sort;

    @Query
    @NameInMap("Start")
    @Validation(required = true, maximum = 2208960000D, minimum = 1604160000)
    private Long start;

    private ListLogsRequest(Builder builder) {
        super(builder);
        this.alarmStatus = builder.alarmStatus;
        this.content = builder.content;
        this.deviceId = builder.deviceId;
        this.end = builder.end;
        this.instanceId = builder.instanceId;
        this.logType = builder.logType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.sort = builder.sort;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmStatus
     */
    public String getAlarmStatus() {
        return this.alarmStatus;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<ListLogsRequest, Builder> {
        private String alarmStatus; 
        private String content; 
        private String deviceId; 
        private Long end; 
        private String instanceId; 
        private String logType; 
        private Integer maxResults; 
        private String nextToken; 
        private String sort; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(ListLogsRequest request) {
            super(request);
            this.alarmStatus = request.alarmStatus;
            this.content = request.content;
            this.deviceId = request.deviceId;
            this.end = request.end;
            this.instanceId = request.instanceId;
            this.logType = request.logType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.sort = request.sort;
            this.start = request.start;
        } 

        /**
         * AlarmStatus.
         */
        public Builder alarmStatus(String alarmStatus) {
            this.putQueryParameter("AlarmStatus", alarmStatus);
            this.alarmStatus = alarmStatus;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * End.
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LogType.
         */
        public Builder logType(String logType) {
            this.putQueryParameter("LogType", logType);
            this.logType = logType;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * Start.
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public ListLogsRequest build() {
            return new ListLogsRequest(this);
        } 

    } 

}
