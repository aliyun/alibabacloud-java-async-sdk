// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListDiagnosisRequest} extends {@link RequestModel}
 *
 * <p>ListDiagnosisRequest</p>
 */
public class ListDiagnosisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("current")
    private Long current;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("service_name")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("x-sysom-invoke-source")
    private String xSysomInvokeSource;

    private ListDiagnosisRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.current = builder.current;
        this.pageSize = builder.pageSize;
        this.params = builder.params;
        this.serviceName = builder.serviceName;
        this.status = builder.status;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiagnosisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xDebugId
     */
    public String getXDebugId() {
        return this.xDebugId;
    }

    /**
     * @return current
     */
    public Long getCurrent() {
        return this.current;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return xSysomInvokeSource
     */
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static final class Builder extends Request.Builder<ListDiagnosisRequest, Builder> {
        private String xDebugId; 
        private Long current; 
        private Long pageSize; 
        private String params; 
        private String serviceName; 
        private String status; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(ListDiagnosisRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.current = request.current;
            this.pageSize = request.pageSize;
            this.params = request.params;
            this.serviceName = request.serviceName;
            this.status = request.status;
            this.xSysomInvokeSource = request.xSysomInvokeSource;
        } 

        /**
         * X-Debug-Id.
         */
        public Builder xDebugId(String xDebugId) {
            this.putQueryParameter("X-Debug-Id", xDebugId);
            this.xDebugId = xDebugId;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder current(Long current) {
            this.putQueryParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The diagnostic parameters. Different diagnostic types require different diagnostic parameters. You can use this field to filter records whose parameters match the specified values.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;key\&quot;:\&quot;region\&quot;,\&quot;value\&quot;:\&quot;cn-beijing\&quot;}]</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The diagnostic type.</p>
         * 
         * <strong>example:</strong>
         * <p>memgraph</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("service_name", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The execution status of the diagnostic task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>Ready</strong>: Ready.</li>
         * <li><strong>Running</strong>: Running.</li>
         * <li><strong>Success</strong>: Succeeded.</li>
         * <li><strong>Fail</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * x-sysom-invoke-source.
         */
        public Builder xSysomInvokeSource(String xSysomInvokeSource) {
            this.putQueryParameter("x-sysom-invoke-source", xSysomInvokeSource);
            this.xSysomInvokeSource = xSysomInvokeSource;
            return this;
        }

        @Override
        public ListDiagnosisRequest build() {
            return new ListDiagnosisRequest(this);
        } 

    } 

}
