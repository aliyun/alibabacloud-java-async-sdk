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
         * <p>The application name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_app_group_name</p>
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * <p>The application version number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>110157886</p>
         */
        public Builder appId(Integer appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The scope of query analysis rules to be queried. Default value: 0. Valid values:</p>
         * <ul>
         * <li>0: queries all query analysis rules.</li>
         * <li>1: queries the default query analysis rules.</li>
         * <li>2: queries the query analysis rules that are not the default rules.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
