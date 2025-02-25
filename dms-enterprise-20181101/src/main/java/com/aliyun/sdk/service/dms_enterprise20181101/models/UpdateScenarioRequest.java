// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link UpdateScenarioRequest} extends {@link RequestModel}
 *
 * <p>UpdateScenarioRequest</p>
 */
public class UpdateScenarioRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScenarioId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scenarioId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScenarioName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scenarioName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private UpdateScenarioRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.scenarioId = builder.scenarioId;
        this.scenarioName = builder.scenarioName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateScenarioRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return scenarioId
     */
    public String getScenarioId() {
        return this.scenarioId;
    }

    /**
     * @return scenarioName
     */
    public String getScenarioName() {
        return this.scenarioName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<UpdateScenarioRequest, Builder> {
        private String regionId; 
        private String description; 
        private String scenarioId; 
        private String scenarioName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateScenarioRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.scenarioId = request.scenarioId;
            this.scenarioName = request.scenarioName;
            this.tid = request.tid;
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
         * <p>The description of the business scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the business scenario.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12***</p>
         */
        public Builder scenarioId(String scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * <p>The name of the business scenario.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Business scenario - test</p>
         */
        public Builder scenarioName(String scenarioName) {
            this.putQueryParameter("ScenarioName", scenarioName);
            this.scenarioName = scenarioName;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>: To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public UpdateScenarioRequest build() {
            return new UpdateScenarioRequest(this);
        } 

    } 

}
