// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceTypesRequest} extends {@link RequestModel}
 *
 * <p>ListResourceTypesRequest</p>
 */
public class ListResourceTypesRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("Query")
    private java.util.List < String > query;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    private ListResourceTypesRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.query = builder.query;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return query
     */
    public java.util.List < String > getQuery() {
        return this.query;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<ListResourceTypesRequest, Builder> {
        private String acceptLanguage; 
        private java.util.List < String > query; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceTypesRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.query = request.query;
            this.resourceType = request.resourceType;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh-CN: Chinese
         * *   en-US: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The query conditions.
         */
        public Builder query(java.util.List < String > query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * The resource type.
         * <p>
         * 
         * For more information about the resource types that are supported by Resource Center, see [Services that work with Resource Center](~~477798~~).
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ListResourceTypesRequest build() {
            return new ListResourceTypesRequest(this);
        } 

    } 

}
