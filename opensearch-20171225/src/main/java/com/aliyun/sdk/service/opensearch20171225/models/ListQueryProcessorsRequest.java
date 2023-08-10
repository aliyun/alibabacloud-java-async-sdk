// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryProcessorsRequest} extends {@link RequestModel}
 *
 * <p>ListQueryProcessorsRequest</p>
 */
public class ListQueryProcessorsRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("appId")
    @Validation(required = true)
    private Integer appId;

    @Query
    @NameInMap("isActive")
    private Integer isActive;

    private ListQueryProcessorsRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appId = builder.appId;
        this.isActive = builder.isActive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueryProcessorsRequest create() {
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
     * @return appId
     */
    public Integer getAppId() {
        return this.appId;
    }

    /**
     * @return isActive
     */
    public Integer getIsActive() {
        return this.isActive;
    }

    public static final class Builder extends Request.Builder<ListQueryProcessorsRequest, Builder> {
        private String appGroupIdentity; 
        private Integer appId; 
        private Integer isActive; 

        private Builder() {
            super();
        } 

        private Builder(ListQueryProcessorsRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.appId = request.appId;
            this.isActive = request.isActive;
        } 

        /**
         * my_app_group_name
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * 110157886
         */
        public Builder appId(Integer appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 0
         */
        public Builder isActive(Integer isActive) {
            this.putQueryParameter("isActive", isActive);
            this.isActive = isActive;
            return this;
        }

        @Override
        public ListQueryProcessorsRequest build() {
            return new ListQueryProcessorsRequest(this);
        } 

    } 

}
