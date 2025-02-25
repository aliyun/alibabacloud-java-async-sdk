// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InnerLimitRateCardsRequest} extends {@link RequestModel}
 *
 * <p>InnerLimitRateCardsRequest</p>
 */
public class InnerLimitRateCardsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Iccids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > iccids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InnerApi")
    private Boolean innerApi;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Task")
    private Boolean task;

    private InnerLimitRateCardsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.iccids = builder.iccids;
        this.innerApi = builder.innerApi;
        this.regionId = builder.regionId;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InnerLimitRateCardsRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return iccids
     */
    public java.util.List < String > getIccids() {
        return this.iccids;
    }

    /**
     * @return innerApi
     */
    public Boolean getInnerApi() {
        return this.innerApi;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return task
     */
    public Boolean getTask() {
        return this.task;
    }

    public static final class Builder extends Request.Builder<InnerLimitRateCardsRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < String > iccids; 
        private Boolean innerApi; 
        private String regionId; 
        private Boolean task; 

        private Builder() {
            super();
        } 

        private Builder(InnerLimitRateCardsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.iccids = request.iccids;
            this.innerApi = request.innerApi;
            this.regionId = request.regionId;
            this.task = request.task;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Iccids.
         */
        public Builder iccids(java.util.List < String > iccids) {
            this.putQueryParameter("Iccids", iccids);
            this.iccids = iccids;
            return this;
        }

        /**
         * InnerApi.
         */
        public Builder innerApi(Boolean innerApi) {
            this.putQueryParameter("InnerApi", innerApi);
            this.innerApi = innerApi;
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
         * Task.
         */
        public Builder task(Boolean task) {
            this.putQueryParameter("Task", task);
            this.task = task;
            return this;
        }

        @Override
        public InnerLimitRateCardsRequest build() {
            return new InnerLimitRateCardsRequest(this);
        } 

    } 

}
