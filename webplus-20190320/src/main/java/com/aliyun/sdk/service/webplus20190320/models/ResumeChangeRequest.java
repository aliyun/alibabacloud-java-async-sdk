// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeChangeRequest} extends {@link RequestModel}
 *
 * <p>ResumeChangeRequest</p>
 */
public class ResumeChangeRequest extends Request {
    @Body
    @NameInMap("ChangeId")
    private String changeId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ResumeChangeRequest(Builder builder) {
        super(builder);
        this.changeId = builder.changeId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeChangeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeId
     */
    public String getChangeId() {
        return this.changeId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ResumeChangeRequest, Builder> {
        private String changeId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ResumeChangeRequest response) {
            super(response);
            this.changeId = response.changeId;
            this.regionId = response.regionId;
        } 

        /**
         * ChangeId.
         */
        public Builder changeId(String changeId) {
            this.putBodyParameter("ChangeId", changeId);
            this.changeId = changeId;
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

        @Override
        public ResumeChangeRequest build() {
            return new ResumeChangeRequest(this);
        } 

    } 

}
