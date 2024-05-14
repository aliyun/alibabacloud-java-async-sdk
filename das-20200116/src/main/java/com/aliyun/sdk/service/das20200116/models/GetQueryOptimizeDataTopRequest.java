// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryOptimizeDataTopRequest} extends {@link RequestModel}
 *
 * <p>GetQueryOptimizeDataTopRequest</p>
 */
public class GetQueryOptimizeDataTopRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Time")
    @com.aliyun.core.annotation.Validation(required = true)
    private String time;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private GetQueryOptimizeDataTopRequest(Builder builder) {
        super(builder);
        this.engine = builder.engine;
        this.instanceIds = builder.instanceIds;
        this.region = builder.region;
        this.tagNames = builder.tagNames;
        this.time = builder.time;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryOptimizeDataTopRequest create() {
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

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetQueryOptimizeDataTopRequest, Builder> {
        private String engine; 
        private String instanceIds; 
        private String region; 
        private String tagNames; 
        private String time; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetQueryOptimizeDataTopRequest request) {
            super(request);
            this.engine = request.engine;
            this.instanceIds = request.instanceIds;
            this.region = request.region;
            this.tagNames = request.tagNames;
            this.time = request.time;
            this.type = request.type;
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
         * >  Set this parameter to **cn-china** for all your instances that reside in the regions in the Chinese mainland.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The reserved parameter.
         */
        public Builder tagNames(String tagNames) {
            this.putQueryParameter("TagNames", tagNames);
            this.tagNames = tagNames;
            return this;
        }

        /**
         * The time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder time(String time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        /**
         * The type of instances that you want to query. Valid values:
         * <p>
         * 
         * *   **RED**: the best-performing instances
         * *   **BLACK**: the worst-performing instances
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetQueryOptimizeDataTopRequest build() {
            return new GetQueryOptimizeDataTopRequest(this);
        } 

    } 

}
