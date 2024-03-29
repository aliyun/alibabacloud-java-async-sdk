// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLayerVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListLayerVersionsRequest</p>
 */
public class ListLayerVersionsRequest extends Request {
    @Path
    @NameInMap("layerName")
    @Validation(required = true)
    private String layerName;

    @Query
    @NameInMap("limit")
    private Integer limit;

    @Query
    @NameInMap("startVersion")
    private String startVersion;

    private ListLayerVersionsRequest(Builder builder) {
        super(builder);
        this.layerName = builder.layerName;
        this.limit = builder.limit;
        this.startVersion = builder.startVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLayerVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return layerName
     */
    public String getLayerName() {
        return this.layerName;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return startVersion
     */
    public String getStartVersion() {
        return this.startVersion;
    }

    public static final class Builder extends Request.Builder<ListLayerVersionsRequest, Builder> {
        private String layerName; 
        private Integer limit; 
        private String startVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListLayerVersionsRequest request) {
            super(request);
            this.layerName = request.layerName;
            this.limit = request.limit;
            this.startVersion = request.startVersion;
        } 

        /**
         * layerName.
         */
        public Builder layerName(String layerName) {
            this.putPathParameter("layerName", layerName);
            this.layerName = layerName;
            return this;
        }

        /**
         * limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * startVersion.
         */
        public Builder startVersion(String startVersion) {
            this.putQueryParameter("startVersion", startVersion);
            this.startVersion = startVersion;
            return this;
        }

        @Override
        public ListLayerVersionsRequest build() {
            return new ListLayerVersionsRequest(this);
        } 

    } 

}
