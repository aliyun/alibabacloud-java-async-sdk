// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChangeSetRequest} extends {@link RequestModel}
 *
 * <p>GetChangeSetRequest</p>
 */
public class GetChangeSetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String changeSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowTemplate")
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

        private Builder(GetChangeSetRequest request) {
            super(request);
            this.changeSetId = request.changeSetId;
            this.regionId = request.regionId;
            this.showTemplate = request.showTemplate;
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

        /**
         * Specifies whether to obtain the template. Valid values:
         * <p>
         * 
         * *   true
         * *   false (default)
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
