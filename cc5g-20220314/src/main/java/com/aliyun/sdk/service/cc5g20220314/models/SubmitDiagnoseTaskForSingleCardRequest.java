// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitDiagnoseTaskForSingleCardRequest} extends {@link RequestModel}
 *
 * <p>SubmitDiagnoseTaskForSingleCardRequest</p>
 */
public class SubmitDiagnoseTaskForSingleCardRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Destination")
    private String destination;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceUid")
    private Long resourceUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    @com.aliyun.core.annotation.Validation(required = true)
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wirelessCloudConnectorId;

    private SubmitDiagnoseTaskForSingleCardRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.destination = builder.destination;
        this.endTime = builder.endTime;
        this.regionNo = builder.regionNo;
        this.resourceUid = builder.resourceUid;
        this.source = builder.source;
        this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitDiagnoseTaskForSingleCardRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return destination
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return resourceUid
     */
    public Long getResourceUid() {
        return this.resourceUid;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return wirelessCloudConnectorId
     */
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static final class Builder extends Request.Builder<SubmitDiagnoseTaskForSingleCardRequest, Builder> {
        private Long beginTime; 
        private String destination; 
        private Long endTime; 
        private String regionNo; 
        private Long resourceUid; 
        private String source; 
        private String wirelessCloudConnectorId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitDiagnoseTaskForSingleCardRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.destination = request.destination;
            this.endTime = request.endTime;
            this.regionNo = request.regionNo;
            this.resourceUid = request.resourceUid;
            this.source = request.source;
            this.wirelessCloudConnectorId = request.wirelessCloudConnectorId;
        } 

        /**
         * BeginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * Destination.
         */
        public Builder destination(String destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * ResourceUid.
         */
        public Builder resourceUid(Long resourceUid) {
            this.putQueryParameter("ResourceUid", resourceUid);
            this.resourceUid = resourceUid;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * WirelessCloudConnectorId.
         */
        public Builder wirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }

        @Override
        public SubmitDiagnoseTaskForSingleCardRequest build() {
            return new SubmitDiagnoseTaskForSingleCardRequest(this);
        } 

    } 

}
