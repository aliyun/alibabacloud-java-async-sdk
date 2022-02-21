// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceRecordsRequest</p>
 */
public class ListDeviceRecordsRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNum")
    private Long pageNum;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("SearchCriteria")
    @Validation(required = true)
    private String searchCriteria;

    @Query
    @NameInMap("StreamId")
    private String streamId;

    private ListDeviceRecordsRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.searchCriteria = builder.searchCriteria;
        this.streamId = builder.streamId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchCriteria
     */
    public String getSearchCriteria() {
        return this.searchCriteria;
    }

    /**
     * @return streamId
     */
    public String getStreamId() {
        return this.streamId;
    }

    public static final class Builder extends Request.Builder<ListDeviceRecordsRequest, Builder> {
        private String deviceId; 
        private Long ownerId; 
        private Long pageNum; 
        private Long pageSize; 
        private String searchCriteria; 
        private String streamId; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceRecordsRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.ownerId = response.ownerId;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.searchCriteria = response.searchCriteria;
            this.streamId = response.streamId;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SearchCriteria.
         */
        public Builder searchCriteria(String searchCriteria) {
            this.putQueryParameter("SearchCriteria", searchCriteria);
            this.searchCriteria = searchCriteria;
            return this;
        }

        /**
         * StreamId.
         */
        public Builder streamId(String streamId) {
            this.putQueryParameter("StreamId", streamId);
            this.streamId = streamId;
            return this;
        }

        @Override
        public ListDeviceRecordsRequest build() {
            return new ListDeviceRecordsRequest(this);
        } 

    } 

}
