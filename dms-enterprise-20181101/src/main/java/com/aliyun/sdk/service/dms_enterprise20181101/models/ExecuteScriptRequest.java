// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ExecuteScriptRequest} extends {@link RequestModel}
 *
 * <p>ExecuteScriptRequest</p>
 */
public class ExecuteScriptRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Logic")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean logic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Script")
    @com.aliyun.core.annotation.Validation(required = true)
    private String script;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private ExecuteScriptRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbId = builder.dbId;
        this.logic = builder.logic;
        this.script = builder.script;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteScriptRequest create() {
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
     * @return dbId
     */
    public Integer getDbId() {
        return this.dbId;
    }

    /**
     * @return logic
     */
    public Boolean getLogic() {
        return this.logic;
    }

    /**
     * @return script
     */
    public String getScript() {
        return this.script;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ExecuteScriptRequest, Builder> {
        private String regionId; 
        private Integer dbId; 
        private Boolean logic; 
        private String script; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteScriptRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbId = request.dbId;
            this.logic = request.logic;
            this.script = request.script;
            this.tid = request.tid;
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
         * <p>The ID of the database.</p>
         * <blockquote>
         * <p> This parameter is equivalent to the DatabaseId parameter in the SearchDatabase, ListDatabases, and GetDatabase operations. You can call one of these operations to obtain the required database ID. For more information, see <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a>, <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a>, and <a href="https://help.aliyun.com/document_detail/141869.html">GetDatabase</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder dbId(Integer dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * <p>Specifies whether the database is a logical database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder logic(Boolean logic) {
            this.putQueryParameter("Logic", logic);
            this.logic = logic;
            return this;
        }

        /**
         * <p>The SQL statements to be executed. Data query language (DQL) statements, data definition language (DDL) statements, and data manipulation language (DML) statements are supported. The control mode of the instance that you want to query determines whether you can execute DDL and DML statements.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>select dt from report_daily</p>
         */
        public Builder script(String script) {
            this.putQueryParameter("Script", script);
            this.script = script;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p> To obtain the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Tenant information</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ExecuteScriptRequest build() {
            return new ExecuteScriptRequest(this);
        } 

    } 

}
