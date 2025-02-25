// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link ListExperimentPlanTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListExperimentPlanTemplatesRequest</p>
 */
public class ListExperimentPlanTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivacyLevel")
    private String privacyLevel;

    private ListExperimentPlanTemplatesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.privacyLevel = builder.privacyLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentPlanTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return privacyLevel
     */
    public String getPrivacyLevel() {
        return this.privacyLevel;
    }

    public static final class Builder extends Request.Builder<ListExperimentPlanTemplatesRequest, Builder> {
        private String regionId; 
        private String privacyLevel; 

        private Builder() {
            super();
        } 

        private Builder(ListExperimentPlanTemplatesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.privacyLevel = request.privacyLevel;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The sharing level of the template, default is private, options are public and private.</p>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        public Builder privacyLevel(String privacyLevel) {
            this.putQueryParameter("PrivacyLevel", privacyLevel);
            this.privacyLevel = privacyLevel;
            return this;
        }

        @Override
        public ListExperimentPlanTemplatesRequest build() {
            return new ListExperimentPlanTemplatesRequest(this);
        } 

    } 

}
