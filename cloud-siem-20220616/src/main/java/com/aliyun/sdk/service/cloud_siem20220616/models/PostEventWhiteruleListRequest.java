// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostEventWhiteruleListRequest} extends {@link RequestModel}
 *
 * <p>PostEventWhiteruleListRequest</p>
 */
public class PostEventWhiteruleListRequest extends Request {
    @Body
    @NameInMap("IncidentUuid")
    private String incidentUuid;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("WhiteruleList")
    @Validation(required = true)
    private String whiteruleList;

    private PostEventWhiteruleListRequest(Builder builder) {
        super(builder);
        this.incidentUuid = builder.incidentUuid;
        this.regionId = builder.regionId;
        this.whiteruleList = builder.whiteruleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostEventWhiteruleListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return whiteruleList
     */
    public String getWhiteruleList() {
        return this.whiteruleList;
    }

    public static final class Builder extends Request.Builder<PostEventWhiteruleListRequest, Builder> {
        private String incidentUuid; 
        private String regionId; 
        private String whiteruleList; 

        private Builder() {
            super();
        } 

        private Builder(PostEventWhiteruleListRequest request) {
            super(request);
            this.incidentUuid = request.incidentUuid;
            this.regionId = request.regionId;
            this.whiteruleList = request.whiteruleList;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * WhiteruleList.
         */
        public Builder whiteruleList(String whiteruleList) {
            this.putBodyParameter("WhiteruleList", whiteruleList);
            this.whiteruleList = whiteruleList;
            return this;
        }

        @Override
        public PostEventWhiteruleListRequest build() {
            return new PostEventWhiteruleListRequest(this);
        } 

    } 

}
