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
         * <p>A reserved parameter.</p>
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
         * <p>The end date of the query. Format: <i>yyyyMMdd</i> (UTC).</p>
         * <ul>
         * <li>If this parameter is left empty, the default value is the day before the current date.</li>
         * <li>You can only query data from the day before the current date or earlier. The interval between the start date and the end date cannot exceed 30 days.</li>
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
         * <li><strong>MySQL</strong>: RDS MySQL.</li>
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
         * <p>Only RDS MySQL and PolarDB for MySQL instances are supported.</p>
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
         * <p>The region to which the instance belongs. Valid values:</p>
         * <ul>
         * <li><strong>cn-china</strong>: the Chinese mainland.</li>
         * <li><strong>cn-hongkong</strong>: Hong Kong (China).</li>
         * <li><strong>ap-southeast-1</strong>: Singapore.</li>
         * </ul>
         * <p>This parameter takes effect only when the <strong>InstanceIds</strong> request parameter is left empty. If <strong>InstanceIds</strong> is left empty, data is retrieved based on the region specified by the <strong>Region</strong> parameter. The default region is <strong>cn-china</strong>. If <strong>InstanceIds</strong> is not empty, data is retrieved based on the region of the first instance specified by <strong>InstanceIds</strong>, even if the <strong>Region</strong> parameter is set.</p>
         * <blockquote>
         * <p>For instances created in regions within the Chinese mainland, set this parameter to <strong>cn-china</strong>.</p>
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
         * <p>The start date of the query. Format: <i>yyyyMMdd</i> (UTC).</p>
         * <ul>
         * <li>If this parameter is left empty, the default value is the day before the current date.</li>
         * <li>You can only query data from the day before the current date or earlier.</li>
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
