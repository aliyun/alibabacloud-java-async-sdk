// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link UpdateSwimmingLaneRequest} extends {@link RequestModel}
 *
 * <p>UpdateSwimmingLaneRequest</p>
 */
public class UpdateSwimmingLaneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInfos")
    private String appInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryRules")
    private String entryRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long laneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private UpdateSwimmingLaneRequest(Builder builder) {
        super(builder);
        this.appInfos = builder.appInfos;
        this.enableRules = builder.enableRules;
        this.entryRules = builder.entryRules;
        this.laneId = builder.laneId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSwimmingLaneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInfos
     */
    public String getAppInfos() {
        return this.appInfos;
    }

    /**
     * @return enableRules
     */
    public Boolean getEnableRules() {
        return this.enableRules;
    }

    /**
     * @return entryRules
     */
    public String getEntryRules() {
        return this.entryRules;
    }

    /**
     * @return laneId
     */
    public Long getLaneId() {
        return this.laneId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateSwimmingLaneRequest, Builder> {
        private String appInfos; 
        private Boolean enableRules; 
        private String entryRules; 
        private Long laneId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSwimmingLaneRequest request) {
            super(request);
            this.appInfos = request.appInfos;
            this.enableRules = request.enableRules;
            this.entryRules = request.entryRules;
            this.laneId = request.laneId;
            this.name = request.name;
        } 

        /**
         * <p>The list of applications that are related to the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;appId&quot;:&quot;8e7689af-6ddd-4676-8ee6-5fbecdf2****&quot;},{&quot;appId&quot;:&quot;f72deaac-26ba-429a-948d-5fa47c4a****&quot;},{&quot;appId&quot;:&quot;99a2d4b5-99a5-4e25-a964-1bd03a17****&quot;}]</p>
         */
        public Builder appInfos(String appInfos) {
            this.putQueryParameter("AppInfos", appInfos);
            this.appInfos = appInfos;
            return this;
        }

        /**
         * <p>Specifies whether to enable the throttling rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableRules(Boolean enableRules) {
            this.putQueryParameter("EnableRules", enableRules);
            this.enableRules = enableRules;
            return this;
        }

        /**
         * <p>The configuration of the throttling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;priority&quot;:1,&quot;path&quot;:&quot;/traffictest&quot;,&quot;condition&quot;:&quot;AND&quot;,&quot;restItems&quot;:[{&quot;type&quot;:&quot;header&quot;,&quot;name&quot;:&quot;testheader&quot;,&quot;value&quot;:&quot;testheadervalue&quot;,&quot;cond&quot;:&quot;==&quot;,&quot;operator&quot;:&quot;rawvalue&quot;}]}]</p>
         */
        public Builder entryRules(String entryRules) {
            this.putQueryParameter("EntryRules", entryRules);
            this.entryRules = entryRules;
            return this;
        }

        /**
         * <p>The ID of the lane.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>224</p>
         */
        public Builder laneId(Long laneId) {
            this.putQueryParameter("LaneId", laneId);
            this.laneId = laneId;
            return this;
        }

        /**
         * <p>The name of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>test-swimlane</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateSwimmingLaneRequest build() {
            return new UpdateSwimmingLaneRequest(this);
        } 

    } 

}
