// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryOptimizeDataTrendRequest} extends {@link RequestModel}
 *
 * <p>GetQueryOptimizeDataTrendRequest</p>
 */
public class GetQueryOptimizeDataTrendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("End")
    @com.aliyun.core.annotation.Validation(required = true)
    private String end;

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
    @com.aliyun.core.annotation.NameInMap("Start")
    @com.aliyun.core.annotation.Validation(required = true)
    private String start;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagNames")
    private String tagNames;

    private GetQueryOptimizeDataTrendRequest(Builder builder) {
        super(builder);
        this.end = builder.end;
        this.engine = builder.engine;
        this.instanceIds = builder.instanceIds;
        this.region = builder.region;
        this.start = builder.start;
        this.tagNames = builder.tagNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryOptimizeDataTrendRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return end
     */
    public String getEnd() {
        return this.end;
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
     * @return start
     */
    public String getStart() {
        return this.start;
    }

    /**
     * @return tagNames
     */
    public String getTagNames() {
        return this.tagNames;
    }

    public static final class Builder extends Request.Builder<GetQueryOptimizeDataTrendRequest, Builder> {
        private String end; 
        private String engine; 
        private String instanceIds; 
        private String region; 
        private String start; 
        private String tagNames; 

        private Builder() {
            super();
        } 

        private Builder(GetQueryOptimizeDataTrendRequest request) {
            super(request);
            this.end = request.end;
            this.engine = request.engine;
            this.instanceIds = request.instanceIds;
            this.region = request.region;
            this.start = request.start;
            this.tagNames = request.tagNames;
        } 

        /**
         * The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  The end time must be later than the start time, but not later than 00:00:00 (UTC+8) on the current day.
         */
        public Builder end(String end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
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
         * *   **cn-china**: Chinese mainland.
         * *   **cn-hongkong**: China (Hong Kong).
         * *   **ap-southeast-1**: Singapore.
         * 
         * This parameter takes effect only if **InstanceIds** is left empty. If you leave **InstanceIds** empty, the system obtains data from the region specified by **Region**. By default, Region is set to **cn-china**. If you specify **InstanceIds**, **Region** does not take effect and the system obtains data from the region in which the first specified instance resides.****
         * 
         * >  If your instances reside in the regions inside the Chinese mainland, set this parameter to **cn-china**.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  You can specify a start time up to two months earlier than the current time.
         */
        public Builder start(String start) {
            this.putQueryParameter("Start", start);
            this.start = start;
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

        @Override
        public GetQueryOptimizeDataTrendRequest build() {
            return new GetQueryOptimizeDataTrendRequest(this);
        } 

    } 

}
