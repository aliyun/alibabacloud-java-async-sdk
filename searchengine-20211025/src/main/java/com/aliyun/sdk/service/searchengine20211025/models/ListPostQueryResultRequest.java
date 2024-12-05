// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPostQueryResultRequest} extends {@link RequestModel}
 *
 * <p>ListPostQueryResultRequest</p>
 */
public class ListPostQueryResultRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map < String, ? > body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListPostQueryResultRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.address = builder.address;
        this.body = builder.body;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPostQueryResultRequest create() {
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
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return body
     */
    public java.util.Map < String, ? > getBody() {
        return this.body;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListPostQueryResultRequest, Builder> {
        private String instanceId; 
        private String address; 
        private java.util.Map < String, ? > body; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListPostQueryResultRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.address = request.address;
            this.body = request.body;
            this.type = request.type;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-2r42ppr7901</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder address(String address) {
            this.putQueryParameter("address", address);
            this.address = address;
            return this;
        }

        /**
         * <p>The request body.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder body(java.util.Map < String, ? > body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The query type. Valid values: sql: SQL query. ha3: Havenask query.</p>
         * 
         * <strong>example:</strong>
         * <p>ha3</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListPostQueryResultRequest build() {
            return new ListPostQueryResultRequest(this);
        } 

    } 

}
