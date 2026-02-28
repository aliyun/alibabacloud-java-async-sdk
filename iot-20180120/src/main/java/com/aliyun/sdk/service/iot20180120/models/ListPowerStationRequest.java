// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link ListPowerStationRequest} extends {@link RequestModel}
 *
 * <p>ListPowerStationRequest</p>
 */
public class ListPowerStationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlgorithmInstanceUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithmInstanceUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 999999999999D, minimum = 1)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PowerStationName")
    private String powerStationName;

    private ListPowerStationRequest(Builder builder) {
        super(builder);
        this.algorithmInstanceUid = builder.algorithmInstanceUid;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.powerStationName = builder.powerStationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPowerStationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmInstanceUid
     */
    public String getAlgorithmInstanceUid() {
        return this.algorithmInstanceUid;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return powerStationName
     */
    public String getPowerStationName() {
        return this.powerStationName;
    }

    public static final class Builder extends Request.Builder<ListPowerStationRequest, Builder> {
        private String algorithmInstanceUid; 
        private String iotInstanceId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String powerStationName; 

        private Builder() {
            super();
        } 

        private Builder(ListPowerStationRequest request) {
            super(request);
            this.algorithmInstanceUid = request.algorithmInstanceUid;
            this.iotInstanceId = request.iotInstanceId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.powerStationName = request.powerStationName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder algorithmInstanceUid(String algorithmInstanceUid) {
            this.putQueryParameter("AlgorithmInstanceUid", algorithmInstanceUid);
            this.algorithmInstanceUid = algorithmInstanceUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PowerStationName.
         */
        public Builder powerStationName(String powerStationName) {
            this.putQueryParameter("PowerStationName", powerStationName);
            this.powerStationName = powerStationName;
            return this;
        }

        @Override
        public ListPowerStationRequest build() {
            return new ListPowerStationRequest(this);
        } 

    } 

}
