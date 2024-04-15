// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesRequest</p>
 */
public class ListInstancesRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Query
    @NameInMap("qualifier")
    private String qualifier;

    @Query
    @NameInMap("withAllActive")
    private Boolean withAllActive;

    private ListInstancesRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.qualifier = builder.qualifier;
        this.withAllActive = builder.withAllActive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return withAllActive
     */
    public Boolean getWithAllActive() {
        return this.withAllActive;
    }

    public static final class Builder extends Request.Builder<ListInstancesRequest, Builder> {
        private String functionName; 
        private String qualifier; 
        private Boolean withAllActive; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.qualifier = request.qualifier;
            this.withAllActive = request.withAllActive;
        } 

        /**
         * The function name.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The function version or alias.
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        /**
         * Specifies whether to list all instances. Valid values: true and false.
         */
        public Builder withAllActive(Boolean withAllActive) {
            this.putQueryParameter("withAllActive", withAllActive);
            this.withAllActive = withAllActive;
            return this;
        }

        @Override
        public ListInstancesRequest build() {
            return new ListInstancesRequest(this);
        } 

    } 

}
