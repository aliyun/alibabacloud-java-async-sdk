// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetAutoIncrementUsageStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetAutoIncrementUsageStatisticRequest</p>
 */
public class GetAutoIncrementUsageStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbNames")
    private String dbNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RatioFilter")
    @com.aliyun.core.annotation.Validation(required = true)
    private Double ratioFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean realTime;

    private GetAutoIncrementUsageStatisticRequest(Builder builder) {
        super(builder);
        this.dbNames = builder.dbNames;
        this.instanceId = builder.instanceId;
        this.ratioFilter = builder.ratioFilter;
        this.realTime = builder.realTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoIncrementUsageStatisticRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbNames
     */
    public String getDbNames() {
        return this.dbNames;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ratioFilter
     */
    public Double getRatioFilter() {
        return this.ratioFilter;
    }

    /**
     * @return realTime
     */
    public Boolean getRealTime() {
        return this.realTime;
    }

    public static final class Builder extends Request.Builder<GetAutoIncrementUsageStatisticRequest, Builder> {
        private String dbNames; 
        private String instanceId; 
        private Double ratioFilter; 
        private Boolean realTime; 

        private Builder() {
            super();
        } 

        private Builder(GetAutoIncrementUsageStatisticRequest request) {
            super(request);
            this.dbNames = request.dbNames;
            this.instanceId = request.instanceId;
            this.ratioFilter = request.ratioFilter;
            this.realTime = request.realTime;
        } 

        /**
         * <p>The database name. If you specify a database, the operation queries the usage of auto-increment table IDs in the specified database. Otherwise, the operation queries the usage of auto-increment table IDs in all databases on the instance.</p>
         * <blockquote>
         * <p> Specify the parameter value as a JSON array, such as [&quot;db1&quot;,&quot;db2&quot;]. Separate multiple database names with commas (,).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;db1&quot;,&quot;db2&quot;]</p>
         */
        public Builder dbNames(String dbNames) {
            this.putQueryParameter("DbNames", dbNames);
            this.dbNames = dbNames;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The usage threshold of auto-increment IDs. Only usage that exceeds the threshold can be returned. Valid values are decimals that range from 0 to 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        public Builder ratioFilter(Double ratioFilter) {
            this.putQueryParameter("RatioFilter", ratioFilter);
            this.ratioFilter = ratioFilter;
            return this;
        }

        /**
         * <p>Specifies whether to query real-time data. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: queries data in real time except for data generated in the last 10 minutes.****</li>
         * <li><strong>false</strong>: queries data generated in the last 2 hours. If no such data exists, queries the latest data.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder realTime(Boolean realTime) {
            this.putQueryParameter("RealTime", realTime);
            this.realTime = realTime;
            return this;
        }

        @Override
        public GetAutoIncrementUsageStatisticRequest build() {
            return new GetAutoIncrementUsageStatisticRequest(this);
        } 

    } 

}
