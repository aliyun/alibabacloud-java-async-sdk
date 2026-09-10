// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ExecMetaDataComponentNameRequest} extends {@link RequestModel}
 *
 * <p>ExecMetaDataComponentNameRequest</p>
 */
public class ExecMetaDataComponentNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dsName")
    private String dsName;

    private ExecMetaDataComponentNameRequest(Builder builder) {
        super(builder);
        this.dsName = builder.dsName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecMetaDataComponentNameRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dsName
     */
    public String getDsName() {
        return this.dsName;
    }

    public static final class Builder extends Request.Builder<ExecMetaDataComponentNameRequest, Builder> {
        private String dsName; 

        private Builder() {
            super();
        } 

        private Builder(ExecMetaDataComponentNameRequest request) {
            super(request);
            this.dsName = request.dsName;
        } 

        /**
         * <p>The datasource name to check. The system performs an exact match against non-deleted datasources under the current tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>test_ds318_hangzhou_0428</p>
         */
        public Builder dsName(String dsName) {
            this.putQueryParameter("dsName", dsName);
            this.dsName = dsName;
            return this;
        }

        @Override
        public ExecMetaDataComponentNameRequest build() {
            return new ExecMetaDataComponentNameRequest(this);
        } 

    } 

}
