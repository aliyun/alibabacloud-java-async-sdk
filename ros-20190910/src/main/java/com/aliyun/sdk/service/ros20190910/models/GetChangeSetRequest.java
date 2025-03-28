// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the change set.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4c11658d-bd47-4dd0-ba64-727edc62****</p>
         */
        public Builder changeSetId(String changeSetId) {
            this.putQueryParameter("ChangeSetId", changeSetId);
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * <p>The region ID of the change set. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to obtain the template. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
