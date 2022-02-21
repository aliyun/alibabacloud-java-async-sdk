// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PauseChangeRequest} extends {@link RequestModel}
 *
 * <p>PauseChangeRequest</p>
 */
public class PauseChangeRequest extends Request {
    @Body
    @NameInMap("ChangeId")
    private String changeId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private PauseChangeRequest(Builder builder) {
        super(builder);
        this.changeId = builder.changeId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PauseChangeRequest create() {
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

    public static final class Builder extends Request.Builder<PauseChangeRequest, Builder> {
        private String changeId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(PauseChangeRequest response) {
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
        public PauseChangeRequest build() {
            return new PauseChangeRequest(this);
        } 

    } 

}
