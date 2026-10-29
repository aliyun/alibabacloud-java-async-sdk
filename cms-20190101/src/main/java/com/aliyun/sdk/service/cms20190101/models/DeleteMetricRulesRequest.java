// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DeleteMetricRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteMetricRulesRequest</p>
 */
public class DeleteMetricRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> id;

    private DeleteMetricRulesRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMetricRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return id
     */
    public java.util.List<String> getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteMetricRulesRequest, Builder> {
        private Boolean dryRun; 
        private java.util.List<String> id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMetricRulesRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.id = request.id;
        } 

        /**
         * <p>Specifies whether to perform a dry run of the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run. No actual operation is performed. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, an error is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): sends a normal request. If the request passes the check, an HTTP 2xx status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The IDs of the alert rules to delete.</p>
         * <p>This parameter is required.</p>
         */
        public Builder id(java.util.List<String> id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteMetricRulesRequest build() {
            return new DeleteMetricRulesRequest(this);
        } 

    } 

}
