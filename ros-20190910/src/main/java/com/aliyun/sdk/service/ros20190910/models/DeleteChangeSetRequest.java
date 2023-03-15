// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteChangeSetRequest} extends {@link RequestModel}
 *
 * <p>DeleteChangeSetRequest</p>
 */
public class DeleteChangeSetRequest extends Request {
    @Query
    @NameInMap("ChangeSetId")
    @Validation(required = true)
    private String changeSetId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteChangeSetRequest(Builder builder) {
        super(builder);
        this.changeSetId = builder.changeSetId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteChangeSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeSetId
     */
    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteChangeSetRequest, Builder> {
        private String changeSetId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteChangeSetRequest request) {
            super(request);
            this.changeSetId = request.changeSetId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the change set.
         */
        public Builder changeSetId(String changeSetId) {
            this.putQueryParameter("ChangeSetId", changeSetId);
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * The region ID of the change set. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteChangeSetRequest build() {
            return new DeleteChangeSetRequest(this);
        } 

    } 

}
