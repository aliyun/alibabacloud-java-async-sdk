// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBusinessMetricResourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateBusinessMetricResourceRequest</p>
 */
public class UpdateBusinessMetricResourceRequest extends Request {
    @Query
    @NameInMap("BusinessMetricId")
    private Long businessMetricId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("ResourceList")
    private String resourceList;

    private UpdateBusinessMetricResourceRequest(Builder builder) {
        super(builder);
        this.businessMetricId = builder.businessMetricId;
        this.operaUid = builder.operaUid;
        this.resourceList = builder.resourceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBusinessMetricResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessMetricId
     */
    public Long getBusinessMetricId() {
        return this.businessMetricId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return resourceList
     */
    public String getResourceList() {
        return this.resourceList;
    }

    public static final class Builder extends Request.Builder<UpdateBusinessMetricResourceRequest, Builder> {
        private Long businessMetricId; 
        private String operaUid; 
        private String resourceList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBusinessMetricResourceRequest request) {
            super(request);
            this.businessMetricId = request.businessMetricId;
            this.operaUid = request.operaUid;
            this.resourceList = request.resourceList;
        } 

        /**
         * BusinessMetricId.
         */
        public Builder businessMetricId(Long businessMetricId) {
            this.putQueryParameter("BusinessMetricId", businessMetricId);
            this.businessMetricId = businessMetricId;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * ResourceList.
         */
        public Builder resourceList(String resourceList) {
            this.putQueryParameter("ResourceList", resourceList);
            this.resourceList = resourceList;
            return this;
        }

        @Override
        public UpdateBusinessMetricResourceRequest build() {
            return new UpdateBusinessMetricResourceRequest(this);
        } 

    } 

}
