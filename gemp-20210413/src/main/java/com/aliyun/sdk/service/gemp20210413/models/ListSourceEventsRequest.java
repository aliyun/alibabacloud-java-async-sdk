// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSourceEventsRequest} extends {@link RequestModel}
 *
 * <p>ListSourceEventsRequest</p>
 */
public class ListSourceEventsRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("endTime")
    private String endTime;

    @Body
    @NameInMap("instanceId")
    @Validation(required = true)
    private Long instanceId;

    @Body
    @NameInMap("instanceType")
    @Validation(required = true)
    private String instanceType;

    @Body
    @NameInMap("pageNumber")
    private Long pageNumber;

    @Body
    @NameInMap("pageSize")
    private Long pageSize;

    @Body
    @NameInMap("startRowKey")
    private String startRowKey;

    @Body
    @NameInMap("startTime")
    private String startTime;

    @Body
    @NameInMap("stopRowKey")
    private String stopRowKey;

    private ListSourceEventsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startRowKey = builder.startRowKey;
        this.startTime = builder.startTime;
        this.stopRowKey = builder.stopRowKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSourceEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startRowKey
     */
    public String getStartRowKey() {
        return this.startRowKey;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return stopRowKey
     */
    public String getStopRowKey() {
        return this.stopRowKey;
    }

    public static final class Builder extends Request.Builder<ListSourceEventsRequest, Builder> {
        private String clientToken; 
        private String endTime; 
        private Long instanceId; 
        private String instanceType; 
        private Long pageNumber; 
        private Long pageSize; 
        private String startRowKey; 
        private String startTime; 
        private String stopRowKey; 

        private Builder() {
            super();
        } 

        private Builder(ListSourceEventsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startRowKey = request.startRowKey;
            this.startTime = request.startTime;
            this.stopRowKey = request.stopRowKey;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 2020-09-18 13:00:00
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(Long instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * instanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("instanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * startRowKey.
         */
        public Builder startRowKey(String startRowKey) {
            this.putBodyParameter("startRowKey", startRowKey);
            this.startRowKey = startRowKey;
            return this;
        }

        /**
         * 2020-09-10 13:00:00
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * stopRowKey.
         */
        public Builder stopRowKey(String stopRowKey) {
            this.putBodyParameter("stopRowKey", stopRowKey);
            this.stopRowKey = stopRowKey;
            return this;
        }

        @Override
        public ListSourceEventsRequest build() {
            return new ListSourceEventsRequest(this);
        } 

    } 

}
