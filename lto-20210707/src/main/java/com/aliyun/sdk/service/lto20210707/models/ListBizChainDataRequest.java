// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link ListBizChainDataRequest} extends {@link RequestModel}
 *
 * <p>ListBizChainDataRequest</p>
 */
public class ListBizChainDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizChainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IoTDataDID")
    private String ioTDataDID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberId")
    private String memberId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Num")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer num;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private ListBizChainDataRequest(Builder builder) {
        super(builder);
        this.bizChainId = builder.bizChainId;
        this.endTime = builder.endTime;
        this.ioTDataDID = builder.ioTDataDID;
        this.memberId = builder.memberId;
        this.num = builder.num;
        this.regionId = builder.regionId;
        this.size = builder.size;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBizChainDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizChainId
     */
    public String getBizChainId() {
        return this.bizChainId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return ioTDataDID
     */
    public String getIoTDataDID() {
        return this.ioTDataDID;
    }

    /**
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return num
     */
    public Integer getNum() {
        return this.num;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListBizChainDataRequest, Builder> {
        private String bizChainId; 
        private Long endTime; 
        private String ioTDataDID; 
        private String memberId; 
        private Integer num; 
        private String regionId; 
        private Integer size; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListBizChainDataRequest request) {
            super(request);
            this.bizChainId = request.bizChainId;
            this.endTime = request.endTime;
            this.ioTDataDID = request.ioTDataDID;
            this.memberId = request.memberId;
            this.num = request.num;
            this.regionId = request.regionId;
            this.size = request.size;
            this.startTime = request.startTime;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bizChainId(String bizChainId) {
            this.putQueryParameter("BizChainId", bizChainId);
            this.bizChainId = bizChainId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IoTDataDID.
         */
        public Builder ioTDataDID(String ioTDataDID) {
            this.putQueryParameter("IoTDataDID", ioTDataDID);
            this.ioTDataDID = ioTDataDID;
            return this;
        }

        /**
         * MemberId.
         */
        public Builder memberId(String memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder num(Integer num) {
            this.putQueryParameter("Num", num);
            this.num = num;
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
         * <p>This parameter is required.</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListBizChainDataRequest build() {
            return new ListBizChainDataRequest(this);
        } 

    } 

}
