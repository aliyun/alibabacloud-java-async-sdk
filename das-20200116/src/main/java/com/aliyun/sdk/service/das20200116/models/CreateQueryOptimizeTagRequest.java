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
 * {@link CreateQueryOptimizeTagRequest} extends {@link RequestModel}
 *
 * <p>CreateQueryOptimizeTagRequest</p>
 */
public class CreateQueryOptimizeTagRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comments")
    private String comments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sqlIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tags;

    private CreateQueryOptimizeTagRequest(Builder builder) {
        super(builder);
        this.comments = builder.comments;
        this.engine = builder.engine;
        this.instanceId = builder.instanceId;
        this.sqlIds = builder.sqlIds;
        this.status = builder.status;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQueryOptimizeTagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comments
     */
    public String getComments() {
        return this.comments;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sqlIds
     */
    public String getSqlIds() {
        return this.sqlIds;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateQueryOptimizeTagRequest, Builder> {
        private String comments; 
        private String engine; 
        private String instanceId; 
        private String sqlIds; 
        private Integer status; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateQueryOptimizeTagRequest request) {
            super(request);
            this.comments = request.comments;
            this.engine = request.engine;
            this.instanceId = request.instanceId;
            this.sqlIds = request.sqlIds;
            this.status = request.status;
            this.tags = request.tags;
        } 

        /**
         * <p>The remarks.</p>
         * <p>The remarks can be 1 to 300 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Slow SQL queries of offline synchronization. No optimization is required.</p>
         */
        public Builder comments(String comments) {
            this.putQueryParameter("Comments", comments);
            this.comments = comments;
            return this;
        }

        /**
         * <p>The database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong>: ApsaraDB RDS for MySQL</li>
         * <li><strong>PolarDBMySQL</strong>: PolarDB for MySQL</li>
         * <li><strong>PostgreSQL</strong>: ApsaraDB RDS for PostgreSQL</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The SQL template IDs. You can call the <a href="https://help.aliyun.com/document_detail/405261.html">GetQueryOptimizeExecErrorStats</a> operation to obtain the SQL template ID. Separate multiple SQL template IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6068ce044e3dc9b903979672fb0b69df,d12515c015fc9f41a0778a9e1de0e941</p>
         */
        public Builder sqlIds(String sqlIds) {
            this.putQueryParameter("SqlIds", sqlIds);
            this.sqlIds = sqlIds;
            return this;
        }

        /**
         * <p>The status of <strong>Tags</strong>. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: removes all tags added to the SQL templates that are specified by <strong>SqlIds</strong> and leaves <strong>Tags</strong> empty.</li>
         * <li><strong>1</strong>: adds the tags specified by <strong>Tags</strong> to the SQL templates that are specified by <strong>SqlIds</strong>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The SQL tags. Separate multiple SQL tags with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>DAS_IMPORTANT</strong>: The SQL template is important.</li>
         * <li><strong>DAS_NOT_IMPORTANT</strong>: The SQL template is unimportant.</li>
         * <li><strong>USER_IGNORE</strong>: The scheduling of the SQL template does not need to be optimized.</li>
         * <li><strong>DAS_IN_PLAN</strong>: The scheduling of the SQL template needs to be optimized.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAS_IN_PLAN,DAS_NOT_IMPORTANT</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateQueryOptimizeTagRequest build() {
            return new CreateQueryOptimizeTagRequest(this);
        } 

    } 

}
