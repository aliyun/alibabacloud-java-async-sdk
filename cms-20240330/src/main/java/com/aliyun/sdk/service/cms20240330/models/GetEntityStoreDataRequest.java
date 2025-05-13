// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetEntityStoreDataRequest} extends {@link RequestModel}
 *
 * <p>GetEntityStoreDataRequest</p>
 */
public class GetEntityStoreDataRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("acceptEncoding")
    private String acceptEncoding;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("from")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer from;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("to")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer to;

    private GetEntityStoreDataRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.regionId = builder.regionId;
        this.acceptEncoding = builder.acceptEncoding;
        this.from = builder.from;
        this.query = builder.query;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEntityStoreDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return acceptEncoding
     */
    public String getAcceptEncoding() {
        return this.acceptEncoding;
    }

    /**
     * @return from
     */
    public Integer getFrom() {
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
    public Integer getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<GetEntityStoreDataRequest, Builder> {
        private String workspace; 
        private String regionId; 
        private String acceptEncoding; 
        private Integer from; 
        private String query; 
        private Integer to; 

        private Builder() {
            super();
        } 

        private Builder(GetEntityStoreDataRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.regionId = request.regionId;
            this.acceptEncoding = request.acceptEncoding;
            this.from = request.from;
            this.query = request.query;
            this.to = request.to;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test-001</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * acceptEncoding.
         */
        public Builder acceptEncoding(String acceptEncoding) {
            this.putHeaderParameter("acceptEncoding", acceptEncoding);
            this.acceptEncoding = acceptEncoding;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1721767203</p>
         */
        public Builder from(Integer from) {
            this.putBodyParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>.entity with(domain=&quot;acs&quot;, type=&quot;acs.k8s.node&quot;) | limit 0, 10</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1721767283</p>
         */
        public Builder to(Integer to) {
            this.putBodyParameter("to", to);
            this.to = to;
            return this;
        }

        @Override
        public GetEntityStoreDataRequest build() {
            return new GetEntityStoreDataRequest(this);
        } 

    } 

}
