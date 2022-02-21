// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreviewModelRequest} extends {@link RequestModel}
 *
 * <p>PreviewModelRequest</p>
 */
public class PreviewModelRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("modelName")
    @Validation(required = true)
    private String modelName;

    @Query
    @NameInMap("query")
    private String query;

    private PreviewModelRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.modelName = builder.modelName;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<PreviewModelRequest, Builder> {
        private String appGroupIdentity; 
        private String modelName; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(PreviewModelRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.modelName = response.modelName;
            this.query = response.query;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * modelName.
         */
        public Builder modelName(String modelName) {
            this.putPathParameter("modelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        @Override
        public PreviewModelRequest build() {
            return new PreviewModelRequest(this);
        } 

    } 

}
