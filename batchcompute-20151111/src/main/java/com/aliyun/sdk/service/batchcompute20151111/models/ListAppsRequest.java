// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppsRequest} extends {@link RequestModel}
 *
 * <p>ListAppsRequest</p>
 */
public class ListAppsRequest extends Request {
    @Query
    @NameInMap("Marker")
    private String marker;

    @Query
    @NameInMap("MaxItemCount")
    private Integer maxItemCount;

    @Query
    @NameInMap("Scope")
    private String scope;

    private ListAppsRequest(Builder builder) {
        super(builder);
        this.marker = builder.marker;
        this.maxItemCount = builder.maxItemCount;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return maxItemCount
     */
    public Integer getMaxItemCount() {
        return this.maxItemCount;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<ListAppsRequest, Builder> {
        private String marker; 
        private Integer maxItemCount; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(ListAppsRequest response) {
            super(response);
            this.marker = response.marker;
            this.maxItemCount = response.maxItemCount;
            this.scope = response.scope;
        } 

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * MaxItemCount.
         */
        public Builder maxItemCount(Integer maxItemCount) {
            this.putQueryParameter("MaxItemCount", maxItemCount);
            this.maxItemCount = maxItemCount;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public ListAppsRequest build() {
            return new ListAppsRequest(this);
        } 

    } 

}
