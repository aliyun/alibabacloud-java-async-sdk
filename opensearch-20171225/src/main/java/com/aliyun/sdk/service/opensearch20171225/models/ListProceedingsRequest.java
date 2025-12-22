// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link ListProceedingsRequest} extends {@link RequestModel}
 *
 * <p>ListProceedingsRequest</p>
 */
public class ListProceedingsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filterFinished")
    private Boolean filterFinished;

    private ListProceedingsRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.filterFinished = builder.filterFinished;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProceedingsRequest create() {
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
     * @return filterFinished
     */
    public Boolean getFilterFinished() {
        return this.filterFinished;
    }

    public static final class Builder extends Request.Builder<ListProceedingsRequest, Builder> {
        private String appGroupIdentity; 
        private Boolean filterFinished; 

        private Builder() {
            super();
        } 

        private Builder(ListProceedingsRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.filterFinished = request.filterFinished;
        } 

        /**
         * <p>The ID of the application instance group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>120677456</p>
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * <p>Specifies whether the filtering is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder filterFinished(Boolean filterFinished) {
            this.putQueryParameter("filterFinished", filterFinished);
            this.filterFinished = filterFinished;
            return this;
        }

        @Override
        public ListProceedingsRequest build() {
            return new ListProceedingsRequest(this);
        } 

    } 

}
