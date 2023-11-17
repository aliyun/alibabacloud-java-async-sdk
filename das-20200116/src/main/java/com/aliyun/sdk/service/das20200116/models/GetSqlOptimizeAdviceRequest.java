// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSqlOptimizeAdviceRequest} extends {@link RequestModel}
 *
 * <p>GetSqlOptimizeAdviceRequest</p>
 */
public class GetSqlOptimizeAdviceRequest extends Request {
    @Query
    @NameInMap("ConsoleContext")
    private String consoleContext;

    @Query
    @NameInMap("EndDt")
    private String endDt;

    @Query
    @NameInMap("Engine")
    private String engine;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("StartDt")
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
         * The reserved parameter.
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * The end date of the time range to query. Specify the date in the *yyyyMMdd* format. The time must be in UTC.
         * <p>
         * 
         * *   The default value of this parameter is one day before the current day.
         * *   The value must be earlier than the current day. The interval between the start date and the end date cannot exceed 30 days.
         */
        public Builder endDt(String endDt) {
            this.putQueryParameter("EndDt", endDt);
            this.endDt = endDt;
            return this;
        }

        /**
         * The database engine. Valid values:
         * <p>
         * 
         * *   **MySQL**: ApsaraDB RDS for MySQL.
         * *   **PolarDBMySQL**: PolarDB for MySQL.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The instance ID.
         * <p>
         * 
         * >  You must specify the instance ID only if your database instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.
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
         * This parameter takes effect only if **InstanceIds** is left empty. If you leave **InstanceIds** empty, the system obtains data from the region specified by **Region**. By default, Region is set to **cn-china**. If you specify **InstanceIds**, **Region** does not take effect, and the system obtains data from the region in which the first specified instance resides.****
         * 
         * >  If your instances reside in the regions inside the Chinese mainland, set this parameter to **cn-china**.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The start date of the time range to query. Specify the date in the *yyyyMMdd* format. The time must be in UTC.
         * <p>
         * 
         * *   The default value of this parameter is one day before the current day.
         * *   The value must be earlier than the current day.
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
