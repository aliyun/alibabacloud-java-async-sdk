// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecordRequest} extends {@link RequestModel}
 *
 * <p>QueryRecordRequest</p>
 */
public class QueryRecordRequest extends Request {
    @Query
    @NameInMap("BeginTime")
    @Validation(required = true)
    private Integer beginTime;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Integer endTime;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("NeedSnapshot")
    private Boolean needSnapshot;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("RecordType")
    private Integer recordType;

    @Query
    @NameInMap("StreamType")
    private Integer streamType;

    private QueryRecordRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.currentPage = builder.currentPage;
        this.deviceName = builder.deviceName;
        this.endTime = builder.endTime;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.needSnapshot = builder.needSnapshot;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
        this.recordType = builder.recordType;
        this.streamType = builder.streamType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Integer getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return needSnapshot
     */
    public Boolean getNeedSnapshot() {
        return this.needSnapshot;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return recordType
     */
    public Integer getRecordType() {
        return this.recordType;
    }

    /**
     * @return streamType
     */
    public Integer getStreamType() {
        return this.streamType;
    }

    public static final class Builder extends Request.Builder<QueryRecordRequest, Builder> {
        private Integer beginTime; 
        private Integer currentPage; 
        private String deviceName; 
        private Integer endTime; 
        private String iotId; 
        private String iotInstanceId; 
        private Boolean needSnapshot; 
        private Integer pageSize; 
        private String productKey; 
        private Integer recordType; 
        private Integer streamType; 

        private Builder() {
            super();
        } 

        private Builder(QueryRecordRequest response) {
            super(response);
            this.beginTime = response.beginTime;
            this.currentPage = response.currentPage;
            this.deviceName = response.deviceName;
            this.endTime = response.endTime;
            this.iotId = response.iotId;
            this.iotInstanceId = response.iotInstanceId;
            this.needSnapshot = response.needSnapshot;
            this.pageSize = response.pageSize;
            this.productKey = response.productKey;
            this.recordType = response.recordType;
            this.streamType = response.streamType;
        } 

        /**
         * BeginTime.
         */
        public Builder beginTime(Integer beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * NeedSnapshot.
         */
        public Builder needSnapshot(Boolean needSnapshot) {
            this.putQueryParameter("NeedSnapshot", needSnapshot);
            this.needSnapshot = needSnapshot;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * RecordType.
         */
        public Builder recordType(Integer recordType) {
            this.putQueryParameter("RecordType", recordType);
            this.recordType = recordType;
            return this;
        }

        /**
         * StreamType.
         */
        public Builder streamType(Integer streamType) {
            this.putQueryParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        @Override
        public QueryRecordRequest build() {
            return new QueryRecordRequest(this);
        } 

    } 

}
