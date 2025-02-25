// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryProcessorsRequest} extends {@link RequestModel}
 *
 * <p>ListQueryProcessorsRequest</p>
 */
public class ListQueryProcessorsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isActive")
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
         * The application name.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * The application version number.
         */
        public Builder appId(Integer appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The scope of query analysis rules to be queried. Default value: 0. Valid values:
         * <p>
         * 
         * *   0: queries all query analysis rules.
         * *   1: queries the default query analysis rules.
         * *   2: queries the query analysis rules that are not the default rules.
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
