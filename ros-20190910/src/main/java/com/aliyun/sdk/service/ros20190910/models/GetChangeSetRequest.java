// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChangeSetRequest} extends {@link RequestModel}
 *
 * <p>GetChangeSetRequest</p>
 */
public class GetChangeSetRequest extends Request {
    @Query
    @NameInMap("ChangeSetId")
    @Validation(required = true)
    private String changeSetId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ShowTemplate")
    private Boolean showTemplate;

    private GetChangeSetRequest(Builder builder) {
        super(builder);
        this.changeSetId = builder.changeSetId;
        this.regionId = builder.regionId;
        this.showTemplate = builder.showTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChangeSetRequest create() {
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

    /**
     * @return showTemplate
     */
    public Boolean getShowTemplate() {
        return this.showTemplate;
    }

    public static final class Builder extends Request.Builder<GetChangeSetRequest, Builder> {
        private String changeSetId; 
        private String regionId; 
        private Boolean showTemplate; 

        private Builder() {
            super();
        } 

        private Builder(GetChangeSetRequest response) {
            super(response);
            this.changeSetId = response.changeSetId;
            this.regionId = response.regionId;
            this.showTemplate = response.showTemplate;
        } 

        /**
         * ChangeSetId.
         */
        public Builder changeSetId(String changeSetId) {
            this.putQueryParameter("ChangeSetId", changeSetId);
            this.changeSetId = changeSetId;
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
         * ShowTemplate.
         */
        public Builder showTemplate(Boolean showTemplate) {
            this.putQueryParameter("ShowTemplate", showTemplate);
            this.showTemplate = showTemplate;
            return this;
        }

        @Override
        public GetChangeSetRequest build() {
            return new GetChangeSetRequest(this);
        } 

    } 

}
