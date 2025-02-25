// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSortScriptsRequest} extends {@link RequestModel}
 *
 * <p>ListSortScriptsRequest</p>
 */
public class ListSortScriptsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appVersionId;

    private ListSortScriptsRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appVersionId = builder.appVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSortScriptsRequest create() {
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
     * @return appVersionId
     */
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public static final class Builder extends Request.Builder<ListSortScriptsRequest, Builder> {
        private String appGroupIdentity; 
        private String appVersionId; 

        private Builder() {
            super();
        } 

        private Builder(ListSortScriptsRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.appVersionId = request.appVersionId;
        } 

        /**
         * The name or ID of the application.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * The version ID of the application.
         */
        public Builder appVersionId(String appVersionId) {
            this.putPathParameter("appVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        @Override
        public ListSortScriptsRequest build() {
            return new ListSortScriptsRequest(this);
        } 

    } 

}
