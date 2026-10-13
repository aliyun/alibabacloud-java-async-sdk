// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListScriptsRequest} extends {@link RequestModel}
 *
 * <p>ListScriptsRequest</p>
 */
public class ListScriptsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NluEngine")
    private String nluEngine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptName")
    private String scriptName;

    private ListScriptsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nluEngine = builder.nluEngine;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.scriptName = builder.scriptName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScriptsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nluEngine
     */
    public String getNluEngine() {
        return this.nluEngine;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scriptName
     */
    public String getScriptName() {
        return this.scriptName;
    }

    public static final class Builder extends Request.Builder<ListScriptsRequest, Builder> {
        private String instanceId; 
        private String nluEngine; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String scriptName; 

        private Builder() {
            super();
        } 

        private Builder(ListScriptsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nluEngine = request.nluEngine;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.scriptName = request.scriptName;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bdd49242-114c-4045-b1d1-25ccc1756c75</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The NLU robot engine.</p>
         * <ul>
         * <li><p>If you do not specify this parameter, scripts in small model scenarios are queried.</p>
         * </li>
         * <li><p>If you set this parameter to Prompts, scripts in the text completion mode for large models are queried.</p>
         * </li>
         * <li><p>If you set this parameter to SSE_FUNCTION, scripts in the Function Compute mode for large models are queried.</p>
         * </li>
         * <li><p>If you set this parameter to BeeBot, scripts in the workflow configuration mode for large models are queried.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prompts</p>
         */
        public Builder nluEngine(String nluEngine) {
            this.putQueryParameter("NluEngine", nluEngine);
            this.nluEngine = nluEngine;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The script name.</p>
         * 
         * <strong>example:</strong>
         * <p>Course satisfaction follow-up</p>
         */
        public Builder scriptName(String scriptName) {
            this.putQueryParameter("ScriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        @Override
        public ListScriptsRequest build() {
            return new ListScriptsRequest(this);
        } 

    } 

}
