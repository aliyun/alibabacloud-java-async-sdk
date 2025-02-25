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

    private ListDiagnosisRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.pageSize = builder.pageSize;
        this.params = builder.params;
        this.serviceName = builder.serviceName;
        this.status = builder.status;
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

    public static final class Builder extends Request.Builder<ListDiagnosisRequest, Builder> {
        private Long current; 
        private Long pageSize; 
        private String params; 
        private String serviceName; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListDiagnosisRequest request) {
            super(request);
            this.current = request.current;
            this.pageSize = request.pageSize;
            this.params = request.params;
            this.serviceName = request.serviceName;
            this.status = request.status;
        } 

        /**
         * current.
         */
        public Builder current(Long current) {
            this.putQueryParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * params.
         */
        public Builder params(String params) {
            this.putQueryParameter("params", params);
            this.params = params;
            return this;
        }

        /**
         * service_name.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("service_name", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListDiagnosisRequest build() {
            return new ListDiagnosisRequest(this);
        } 

    } 

}
