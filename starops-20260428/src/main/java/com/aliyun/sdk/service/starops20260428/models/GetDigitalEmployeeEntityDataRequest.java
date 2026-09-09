// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link GetDigitalEmployeeEntityDataRequest} extends {@link RequestModel}
 *
 * <p>GetDigitalEmployeeEntityDataRequest</p>
 */
public class GetDigitalEmployeeEntityDataRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("from")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long from;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("to")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long to;

    private GetDigitalEmployeeEntityDataRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.from = builder.from;
        this.query = builder.query;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDigitalEmployeeEntityDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return from
     */
    public Long getFrom() {
        return this.from;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return to
     */
    public Long getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<GetDigitalEmployeeEntityDataRequest, Builder> {
        private String name; 
        private Long from; 
        private String query; 
        private Long to; 

        private Builder() {
            super();
        } 

        private Builder(GetDigitalEmployeeEntityDataRequest request) {
            super(request);
            this.name = request.name;
            this.from = request.from;
            this.query = request.query;
            this.to = request.to;
        } 

        /**
         * <p>The name of the digital employee whose entity data you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sample-agent</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1770000000</p>
         */
        public Builder from(Long from) {
            this.putBodyParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * <p>Only the .entity or .topo semantic sources of the current digital employee can be queried. Explicit access to internal storage or external data sources is prohibited.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>.entity with(type=\&quot;deployment\&quot;, domain=\&quot;k8s\&quot;) | limit 100</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The UNIX timestamp. Unit: seconds. The value must be greater than the value of from.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1770003600</p>
         */
        public Builder to(Long to) {
            this.putBodyParameter("to", to);
            this.to = to;
            return this;
        }

        @Override
        public GetDigitalEmployeeEntityDataRequest build() {
            return new GetDigitalEmployeeEntityDataRequest(this);
        } 

    } 

}
