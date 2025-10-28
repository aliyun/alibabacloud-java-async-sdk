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
 * {@link InsertSwimmingLaneRequest} extends {@link RequestModel}
 *
 * <p>InsertSwimmingLaneRequest</p>
 */
public class InsertSwimmingLaneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInfos")
    private String appInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableRules")
    private Boolean enableRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entryRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logicalRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tag;

    private InsertSwimmingLaneRequest(Builder builder) {
        super(builder);
        this.appInfos = builder.appInfos;
        this.enableRules = builder.enableRules;
        this.entryRules = builder.entryRules;
        this.groupId = builder.groupId;
        this.logicalRegionId = builder.logicalRegionId;
        this.name = builder.name;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertSwimmingLaneRequest create() {
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
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return logicalRegionId
     */
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<InsertSwimmingLaneRequest, Builder> {
        private String appInfos; 
        private Boolean enableRules; 
        private String entryRules; 
        private Long groupId; 
        private String logicalRegionId; 
        private String name; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(InsertSwimmingLaneRequest request) {
            super(request);
            this.appInfos = request.appInfos;
            this.enableRules = request.enableRules;
            this.entryRules = request.entryRules;
            this.groupId = request.groupId;
            this.logicalRegionId = request.logicalRegionId;
            this.name = request.name;
            this.tag = request.tag;
        } 

        /**
         * <p>The information about applications related to the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;appId&quot;:&quot;f72deaac-26ba-429a-948d-5fa47c4a****&quot;},{&quot;appId&quot;:&quot;5049d2c8-f997-4fc9-92a2-153506a6****&quot;}]</p>
         */
        public Builder appInfos(String appInfos) {
            this.putQueryParameter("AppInfos", appInfos);
            this.appInfos = appInfos;
            return this;
        }

        /**
         * <p>Specifies whether to enable the throttling rule.</p>
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
         * <p>The throttling conditions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;priority&quot;:1,&quot;path&quot;:&quot;/traffic&quot;,&quot;condition&quot;:&quot;AND&quot;,&quot;restItems&quot;:[{&quot;type&quot;:&quot;header&quot;,&quot;name&quot;:&quot;testheader&quot;,&quot;value&quot;:&quot;testvalue&quot;,&quot;cond&quot;:&quot;==&quot;,&quot;operator&quot;:&quot;rawvalue&quot;}]}]</p>
         */
        public Builder entryRules(String entryRules) {
            this.putQueryParameter("EntryRules", entryRules);
            this.entryRules = entryRules;
            return this;
        }

        /**
         * <p>The ID of the lane group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the custom namespace. The ID is in the <code>physical region ID:custom namespace identifier</code> format. Example: <code>cn-hangzhou:test</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        /**
         * <p>The name of the lane.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The tag.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tag</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public InsertSwimmingLaneRequest build() {
            return new InsertSwimmingLaneRequest(this);
        } 

    } 

}
