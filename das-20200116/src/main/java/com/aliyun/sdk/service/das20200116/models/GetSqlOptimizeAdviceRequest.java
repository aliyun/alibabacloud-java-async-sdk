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
 * {@link GetSqlOptimizeAdviceRequest} extends {@link RequestModel}
 *
 * <p>GetSqlOptimizeAdviceRequest</p>
 */
public class GetSqlOptimizeAdviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleContext")
    private String consoleContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDt")
    private String endDt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDt")
    private String startDt;

    private GetSqlOptimizeAdviceRequest(Builder builder) {
        super(builder);
        this.consoleContext = builder.consoleContext;
        this.endDt = builder.endDt;
        this.engine = builder.engine;
        this.instanceIds = builder.instanceIds;
        this.region = builder.region;
        this.startDt = builder.startDt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSqlOptimizeAdviceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consoleContext
     */
    public String getConsoleContext() {
        return this.consoleContext;
    }

    /**
     * @return endDt
     */
    public String getEndDt() {
        return this.endDt;
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
     * @return startDt
     */
    public String getStartDt() {
        return this.startDt;
    }

    public static final class Builder extends Request.Builder<GetSqlOptimizeAdviceRequest, Builder> {
        private String consoleContext; 
        private String endDt; 
        private String engine; 
        private String instanceIds; 
        private String region; 
        private String startDt; 

        private Builder() {
            super();
        } 

        private Builder(GetSqlOptimizeAdviceRequest request) {
            super(request);
            this.consoleContext = request.consoleContext;
            this.endDt = request.endDt;
            this.engine = request.engine;
            this.instanceIds = request.instanceIds;
            this.region = request.region;
            this.startDt = request.startDt;
        } 

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * <p>The end date of the time range to query. Specify the date in the <em>yyyyMMdd</em> format. The time must be in UTC.</p>
         * <ul>
         * <li>The default value of this parameter is one day before the current day.</li>
         * <li>The value must be earlier than the current day. The interval between the start date and the end date cannot exceed 30 days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20210917</p>
         */
        public Builder endDt(String endDt) {
            this.putQueryParameter("EndDt", endDt);
            this.endDt = endDt;
            return this;
        }

        /**
         * <p>The database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong>: ApsaraDB RDS for MySQL.</li>
         * <li><strong>PolarDBMySQL</strong>: PolarDB for MySQL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p> You must specify the instance ID only if your database instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The region in which the instance resides. Valid values:</p>
         * <ul>
         * <li><strong>cn-china</strong>: Chinese mainland.</li>
         * <li><strong>cn-hongkong</strong>: China (Hong Kong).</li>
         * <li><strong>ap-southeast-1</strong>: Singapore.</li>
         * </ul>
         * <p>This parameter takes effect only if <strong>InstanceIds</strong> is left empty. If you leave <strong>InstanceIds</strong> empty, the system obtains data from the region specified by <strong>Region</strong>. By default, Region is set to <strong>cn-china</strong>. If you specify <strong>InstanceIds</strong>, <strong>Region</strong> does not take effect, and the system obtains data from the region in which the first specified instance resides.****</p>
         * <blockquote>
         * <p> If your instances reside in the regions inside the Chinese mainland, set this parameter to <strong>cn-china</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-china</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The start date of the time range to query. Specify the date in the <em>yyyyMMdd</em> format. The time must be in UTC.</p>
         * <ul>
         * <li>The default value of this parameter is one day before the current day.</li>
         * <li>The value must be earlier than the current day.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20210916</p>
         */
        public Builder startDt(String startDt) {
            this.putQueryParameter("StartDt", startDt);
            this.startDt = startDt;
            return this;
        }

        @Override
        public GetSqlOptimizeAdviceRequest build() {
            return new GetSqlOptimizeAdviceRequest(this);
        } 

    } 

}
