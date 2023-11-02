// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostEventDisposeAndWhiteruleListRequest} extends {@link RequestModel}
 *
 * <p>PostEventDisposeAndWhiteruleListRequest</p>
 */
public class PostEventDisposeAndWhiteruleListRequest extends Request {
    @Body
    @NameInMap("EventDispose")
    private String eventDispose;

    @Body
    @NameInMap("IncidentUuid")
    private String incidentUuid;

    @Body
    @NameInMap("ReceiverInfo")
    private String receiverInfo;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Remark")
    private String remark;

    @Body
    @NameInMap("Status")
    private Integer status;

    private PostEventDisposeAndWhiteruleListRequest(Builder builder) {
        super(builder);
        this.eventDispose = builder.eventDispose;
        this.incidentUuid = builder.incidentUuid;
        this.receiverInfo = builder.receiverInfo;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostEventDisposeAndWhiteruleListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventDispose
     */
    public String getEventDispose() {
        return this.eventDispose;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    /**
     * @return receiverInfo
     */
    public String getReceiverInfo() {
        return this.receiverInfo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<PostEventDisposeAndWhiteruleListRequest, Builder> {
        private String eventDispose; 
        private String incidentUuid; 
        private String receiverInfo; 
        private String regionId; 
        private String remark; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(PostEventDisposeAndWhiteruleListRequest request) {
            super(request);
            this.eventDispose = request.eventDispose;
            this.incidentUuid = request.incidentUuid;
            this.receiverInfo = request.receiverInfo;
            this.regionId = request.regionId;
            this.remark = request.remark;
            this.status = request.status;
        } 

        /**
         * EventDispose.
         */
        public Builder eventDispose(String eventDispose) {
            this.putBodyParameter("EventDispose", eventDispose);
            this.eventDispose = eventDispose;
            return this;
        }

        /**
         * IncidentUuid.
         */
        public Builder incidentUuid(String incidentUuid) {
            this.putBodyParameter("IncidentUuid", incidentUuid);
            this.incidentUuid = incidentUuid;
            return this;
        }

        /**
         * ReceiverInfo.
         */
        public Builder receiverInfo(String receiverInfo) {
            this.putBodyParameter("ReceiverInfo", receiverInfo);
            this.receiverInfo = receiverInfo;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public PostEventDisposeAndWhiteruleListRequest build() {
            return new PostEventDisposeAndWhiteruleListRequest(this);
        } 

    } 

}
