// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DoLogicalDeleteResourceRequest} extends {@link RequestModel}
 *
 * <p>DoLogicalDeleteResourceRequest</p>
 */
public class DoLogicalDeleteResourceRequest extends Request {
    @Query
    @NameInMap("Bid")
    private String bid;

    @Query
    @NameInMap("Country")
    private String country;

    @Query
    @NameInMap("GmtWakeup")
    private String gmtWakeup;

    @Query
    @NameInMap("Hid")
    private Long hid;

    @Query
    @NameInMap("Invoker")
    private String invoker;

    @Query
    @NameInMap("Pk")
    private String pk;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TaskExtraData")
    private String taskExtraData;

    @Query
    @NameInMap("TaskIdentifier")
    private String taskIdentifier;

    private DoLogicalDeleteResourceRequest(Builder builder) {
        super(builder);
        this.bid = builder.bid;
        this.country = builder.country;
        this.gmtWakeup = builder.gmtWakeup;
        this.hid = builder.hid;
        this.invoker = builder.invoker;
        this.pk = builder.pk;
        this.regionId = builder.regionId;
        this.taskExtraData = builder.taskExtraData;
        this.taskIdentifier = builder.taskIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DoLogicalDeleteResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bid
     */
    public String getBid() {
        return this.bid;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return gmtWakeup
     */
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    /**
     * @return hid
     */
    public Long getHid() {
        return this.hid;
    }

    /**
     * @return invoker
     */
    public String getInvoker() {
        return this.invoker;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskExtraData
     */
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    /**
     * @return taskIdentifier
     */
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public static final class Builder extends Request.Builder<DoLogicalDeleteResourceRequest, Builder> {
        private String bid; 
        private String country; 
        private String gmtWakeup; 
        private Long hid; 
        private String invoker; 
        private String pk; 
        private String regionId; 
        private String taskExtraData; 
        private String taskIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(DoLogicalDeleteResourceRequest response) {
            super(response);
            this.bid = response.bid;
            this.country = response.country;
            this.gmtWakeup = response.gmtWakeup;
            this.hid = response.hid;
            this.invoker = response.invoker;
            this.pk = response.pk;
            this.regionId = response.regionId;
            this.taskExtraData = response.taskExtraData;
            this.taskIdentifier = response.taskIdentifier;
        } 

        /**
         * Bid.
         */
        public Builder bid(String bid) {
            this.putQueryParameter("Bid", bid);
            this.bid = bid;
            return this;
        }

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putQueryParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * GmtWakeup.
         */
        public Builder gmtWakeup(String gmtWakeup) {
            this.putQueryParameter("GmtWakeup", gmtWakeup);
            this.gmtWakeup = gmtWakeup;
            return this;
        }

        /**
         * Hid.
         */
        public Builder hid(Long hid) {
            this.putQueryParameter("Hid", hid);
            this.hid = hid;
            return this;
        }

        /**
         * Invoker.
         */
        public Builder invoker(String invoker) {
            this.putQueryParameter("Invoker", invoker);
            this.invoker = invoker;
            return this;
        }

        /**
         * Pk.
         */
        public Builder pk(String pk) {
            this.putQueryParameter("Pk", pk);
            this.pk = pk;
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
         * TaskExtraData.
         */
        public Builder taskExtraData(String taskExtraData) {
            this.putQueryParameter("TaskExtraData", taskExtraData);
            this.taskExtraData = taskExtraData;
            return this;
        }

        /**
         * TaskIdentifier.
         */
        public Builder taskIdentifier(String taskIdentifier) {
            this.putQueryParameter("TaskIdentifier", taskIdentifier);
            this.taskIdentifier = taskIdentifier;
            return this;
        }

        @Override
        public DoLogicalDeleteResourceRequest build() {
            return new DoLogicalDeleteResourceRequest(this);
        } 

    } 

}
