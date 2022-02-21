// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainDetailDataByLayerRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainDetailDataByLayerRequest</p>
 */
public class DescribeDomainDetailDataByLayerRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Field")
    @Validation(required = true)
    private String field;

    @Query
    @NameInMap("IspNameEn")
    private String ispNameEn;

    @Query
    @NameInMap("Layer")
    private String layer;

    @Query
    @NameInMap("LocationNameEn")
    private String locationNameEn;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeDomainDetailDataByLayerRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.field = builder.field;
        this.ispNameEn = builder.ispNameEn;
        this.layer = builder.layer;
        this.locationNameEn = builder.locationNameEn;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainDetailDataByLayerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return field
     */
    public String getField() {
        return this.field;
    }

    /**
     * @return ispNameEn
     */
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    /**
     * @return layer
     */
    public String getLayer() {
        return this.layer;
    }

    /**
     * @return locationNameEn
     */
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDomainDetailDataByLayerRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String field; 
        private String ispNameEn; 
        private String layer; 
        private String locationNameEn; 
        private Long ownerId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainDetailDataByLayerRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.endTime = response.endTime;
            this.field = response.field;
            this.ispNameEn = response.ispNameEn;
            this.layer = response.layer;
            this.locationNameEn = response.locationNameEn;
            this.ownerId = response.ownerId;
            this.startTime = response.startTime;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Field.
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * IspNameEn.
         */
        public Builder ispNameEn(String ispNameEn) {
            this.putQueryParameter("IspNameEn", ispNameEn);
            this.ispNameEn = ispNameEn;
            return this;
        }

        /**
         * Layer.
         */
        public Builder layer(String layer) {
            this.putQueryParameter("Layer", layer);
            this.layer = layer;
            return this;
        }

        /**
         * LocationNameEn.
         */
        public Builder locationNameEn(String locationNameEn) {
            this.putQueryParameter("LocationNameEn", locationNameEn);
            this.locationNameEn = locationNameEn;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDomainDetailDataByLayerRequest build() {
            return new DescribeDomainDetailDataByLayerRequest(this);
        } 

    } 

}
