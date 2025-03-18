// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link PushDocumentsRequest} extends {@link RequestModel}
 *
 * <p>PushDocumentsRequest</p>
 */
public class PushDocumentsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("dataSourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<?> body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pkField")
    private String pkField;

    private PushDocumentsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dataSourceName = builder.dataSourceName;
        this.body = builder.body;
        this.pkField = builder.pkField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushDocumentsRequest create() {
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
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return body
     */
    public java.util.List<?> getBody() {
        return this.body;
    }

    /**
     * @return pkField
     */
    public String getPkField() {
        return this.pkField;
    }

    public static final class Builder extends Request.Builder<PushDocumentsRequest, Builder> {
        private String instanceId; 
        private String dataSourceName; 
        private java.util.List<?> body; 
        private String pkField; 

        private Builder() {
            super();
        } 

        private Builder(PushDocumentsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dataSourceName = request.dataSourceName;
            this.body = request.body;
            this.pkField = request.pkField;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-7mz2iv7sq01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the data source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-2r42ostoc01_ecom_table_test</p>
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putPathParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * <p>The request body.</p>
         */
        public Builder body(java.util.List<?> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The primary key field.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        public Builder pkField(String pkField) {
            this.putQueryParameter("pkField", pkField);
            this.pkField = pkField;
            return this;
        }

        @Override
        public PushDocumentsRequest build() {
            return new PushDocumentsRequest(this);
        } 

    } 

}
