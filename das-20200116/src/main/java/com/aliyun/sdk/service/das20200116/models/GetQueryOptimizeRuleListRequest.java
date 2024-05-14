// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryOptimizeRuleListRequest} extends {@link RequestModel}
 *
 * <p>GetQueryOptimizeRuleListRequest</p>
 */
public class GetQueryOptimizeRuleListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagNames")
    private String tagNames;

    private GetQueryOptimizeRuleListRequest(Builder builder) {
        super(builder);
        this.engine = builder.engine;
        this.instanceIds = builder.instanceIds;
        this.region = builder.region;
        this.tagNames = builder.tagNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryOptimizeRuleListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return tagNames
     */
    public String getTagNames() {
        return this.tagNames;
    }

    public static final class Builder extends Request.Builder<GetQueryOptimizeRuleListRequest, Builder> {
        private String engine; 
        private String instanceIds; 
        private String region; 
        private String tagNames; 

        private Builder() {
            super();
        } 

        private Builder(GetQueryOptimizeRuleListRequest request) {
            super(request);
            this.engine = request.engine;
            this.instanceIds = request.instanceIds;
            this.region = request.region;
            this.tagNames = request.tagNames;
        } 

        /**
         * The database engine. Valid values:
         * <p>
         * 
         * *   **MySQL**
         * *   **PolarDBMySQL**
         * *   **PostgreSQL**
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The instance IDs. Separate multiple IDs with commas (,).
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The region in which the instance resides. Valid values:
         * <p>
         * 
         * *   **cn-china**: Chinese mainland
         * *   **cn-hongkong**: China (Hong Kong)
         * *   **ap-southeast-1**: Singapore
         * 
         * This parameter takes effect only if **InstanceIds** is left empty. If you leave **InstanceIds** empty, the system obtains data from the region set by **Region**. By default, Region is set to **cn-china**. If you specify **InstanceIds**, **Region** does not take effect and the system obtains data from the region in which the first specified instance resides.****
         * 
         * >  If your instances reside in the regions in the Chinese mainland, set this parameter to **cn-china**.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder tagNames(String tagNames) {
            this.putQueryParameter("TagNames", tagNames);
            this.tagNames = tagNames;
            return this;
        }

        @Override
        public GetQueryOptimizeRuleListRequest build() {
            return new GetQueryOptimizeRuleListRequest(this);
        } 

    } 

}
