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
 * {@link ListVmcoreDiagnosisTaskRequest} extends {@link RequestModel}
 *
 * <p>ListVmcoreDiagnosisTaskRequest</p>
 */
public class ListVmcoreDiagnosisTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("days")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long days;

    private ListVmcoreDiagnosisTaskRequest(Builder builder) {
        super(builder);
        this.days = builder.days;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVmcoreDiagnosisTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return days
     */
    public Long getDays() {
        return this.days;
    }

    public static final class Builder extends Request.Builder<ListVmcoreDiagnosisTaskRequest, Builder> {
        private Long days; 

        private Builder() {
            super();
        } 

        private Builder(ListVmcoreDiagnosisTaskRequest request) {
            super(request);
            this.days = request.days;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder days(Long days) {
            this.putQueryParameter("days", days);
            this.days = days;
            return this;
        }

        @Override
        public ListVmcoreDiagnosisTaskRequest build() {
            return new ListVmcoreDiagnosisTaskRequest(this);
        } 

    } 

}
