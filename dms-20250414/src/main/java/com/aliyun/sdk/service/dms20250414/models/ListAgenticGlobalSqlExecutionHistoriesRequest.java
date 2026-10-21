// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListAgenticGlobalSqlExecutionHistoriesRequest} extends {@link RequestModel}
 *
 * <p>ListAgenticGlobalSqlExecutionHistoriesRequest</p>
 */
public class ListAgenticGlobalSqlExecutionHistoriesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActorId")
    private String actorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActorName")
    private String actorName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActorType")
    private String actorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogUuid")
    private String catalogUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseUuid")
    private String databaseUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scenario")
    private String scenario;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlKeyword")
    private String sqlKeyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlType")
    private String sqlType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private ListAgenticGlobalSqlExecutionHistoriesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.actorId = builder.actorId;
        this.actorName = builder.actorName;
        this.actorType = builder.actorType;
        this.catalogUuid = builder.catalogUuid;
        this.databaseUuid = builder.databaseUuid;
        this.endTime = builder.endTime;
        this.page = builder.page;
        this.scenario = builder.scenario;
        this.size = builder.size;
        this.sqlKeyword = builder.sqlKeyword;
        this.sqlType = builder.sqlType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgenticGlobalSqlExecutionHistoriesRequest create() {
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
     * @return actorId
     */
    public String getActorId() {
        return this.actorId;
    }

    /**
     * @return actorName
     */
    public String getActorName() {
        return this.actorName;
    }

    /**
     * @return actorType
     */
    public String getActorType() {
        return this.actorType;
    }

    /**
     * @return catalogUuid
     */
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    /**
     * @return databaseUuid
     */
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return scenario
     */
    public String getScenario() {
        return this.scenario;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return sqlKeyword
     */
    public String getSqlKeyword() {
        return this.sqlKeyword;
    }

    /**
     * @return sqlType
     */
    public String getSqlType() {
        return this.sqlType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListAgenticGlobalSqlExecutionHistoriesRequest, Builder> {
        private String regionId; 
        private String actorId; 
        private String actorName; 
        private String actorType; 
        private String catalogUuid; 
        private String databaseUuid; 
        private String endTime; 
        private Integer page; 
        private String scenario; 
        private Integer size; 
        private String sqlKeyword; 
        private String sqlType; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAgenticGlobalSqlExecutionHistoriesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.actorId = request.actorId;
            this.actorName = request.actorName;
            this.actorType = request.actorType;
            this.catalogUuid = request.catalogUuid;
            this.databaseUuid = request.databaseUuid;
            this.endTime = request.endTime;
            this.page = request.page;
            this.scenario = request.scenario;
            this.size = request.size;
            this.sqlKeyword = request.sqlKeyword;
            this.sqlType = request.sqlType;
            this.startTime = request.startTime;
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
         * <p>The ID of the actor. A user ID starts with usr_, and an agent ID starts with agt_. If you do not specify this parameter, all records within the current tenant are queried. If you specify a user ID, the records of the user and the agents under the user are included. If you specify an agent ID, only the records of the agent are matched. The actor must belong to the current tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>usr_10001</p>
         */
        public Builder actorId(String actorId) {
            this.putQueryParameter("ActorId", actorId);
            this.actorId = actorId;
            return this;
        }

        /**
         * <p>The name of the actor for exact match.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-user</p>
         */
        public Builder actorName(String actorName) {
            this.putQueryParameter("ActorName", actorName);
            this.actorName = actorName;
            return this;
        }

        /**
         * <p>The type of the actor for exact match. Valid values: HUMAN and AGENT.</p>
         * 
         * <strong>example:</strong>
         * <p>HUMAN</p>
         */
        public Builder actorType(String actorType) {
            this.putQueryParameter("ActorType", actorType);
            this.actorType = actorType;
            return this;
        }

        /**
         * <p>The catalog UUID for exact match. You can obtain this value by calling ListAgenticCatalog or SearchAgenticCatalog.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-HZ-OfjcNc2z***</p>
         */
        public Builder catalogUuid(String catalogUuid) {
            this.putQueryParameter("CatalogUuid", catalogUuid);
            this.catalogUuid = catalogUuid;
            return this;
        }

        /**
         * <p>The database UUID for exact match. You can obtain this value by calling ListAgenticDatabase or SearchAgenticDatabase.</p>
         * 
         * <strong>example:</strong>
         * <p>md-HZ-fp9K7r***</p>
         */
        public Builder databaseUuid(String databaseUuid) {
            this.putQueryParameter("DatabaseUuid", databaseUuid);
            this.databaseUuid = databaseUuid;
            return this;
        }

        /**
         * <p>The end time of the query. Specify the time in the yyyy-MM-dd HH:mm:ss format. If you do not specify this parameter, the default end time is the current time. If the format cannot be parsed or the end time is earlier than the start time, the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-01 00:00:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The execution scenario for exact match. Valid values:</p>
         * <ul>
         * <li>AGENT_QUERY: The agent directly executes the SQL statement.</li>
         * <li>WORKFLOW_QUERY: The SQL statement is asynchronously executed through a workflow.
         * If you do not specify this parameter, both scenarios are queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AGENT_QUERY</p>
         */
        public Builder scenario(String scenario) {
            this.putQueryParameter("Scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The keyword for fuzzy match based on the original SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        public Builder sqlKeyword(String sqlKeyword) {
            this.putQueryParameter("SqlKeyword", sqlKeyword);
            this.sqlKeyword = sqlKeyword;
            return this;
        }

        /**
         * <p>The SQL type for exact match.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        public Builder sqlType(String sqlType) {
            this.putQueryParameter("SqlType", sqlType);
            this.sqlType = sqlType;
            return this;
        }

        /**
         * <p>The start time of the query. Specify the time in the yyyy-MM-dd HH:mm:ss format. If you do not specify this parameter, the default time range is the last 7 days. If the specified time is earlier than 730 days ago or the format cannot be parsed, the query starts from 730 days ago.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 00:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListAgenticGlobalSqlExecutionHistoriesRequest build() {
            return new ListAgenticGlobalSqlExecutionHistoriesRequest(this);
        } 

    } 

}
