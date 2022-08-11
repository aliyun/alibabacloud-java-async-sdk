// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDagsRequest} extends {@link RequestModel}
 *
 * <p>ListDagsRequest</p>
 */
public class ListDagsRequest extends Request {
    @Body
    @NameInMap("OpSeq")
    @Validation(required = true, minimum = 2)
    private Long opSeq;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListDagsRequest(Builder builder) {
        super(builder);
        this.opSeq = builder.opSeq;
        this.projectEnv = builder.projectEnv;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return opSeq
     */
    public Long getOpSeq() {
        return this.opSeq;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListDagsRequest, Builder> {
        private Long opSeq; 
        private String projectEnv; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListDagsRequest request) {
            super(request);
            this.opSeq = request.opSeq;
            this.projectEnv = request.projectEnv;
            this.regionId = request.regionId;
        } 

        /**
         * OpSeq.
         */
        public Builder opSeq(Long opSeq) {
            this.putBodyParameter("OpSeq", opSeq);
            this.opSeq = opSeq;
            return this;
        }

        /**
         * ProjectEnv.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListDagsRequest build() {
            return new ListDagsRequest(this);
        } 

    } 

}
