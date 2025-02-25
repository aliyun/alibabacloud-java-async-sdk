// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppRequest</p>
 */
public class DescribeAppRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer appId;

    private DescribeAppRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAppRequest, Builder> {
        private String appGroupIdentity; 
        private Integer appId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.appId = request.appId;
        } 

        /**
         * The name of the application.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * The ID of the version.
         */
        public Builder appId(Integer appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public DescribeAppRequest build() {
            return new DescribeAppRequest(this);
        } 

    } 

}
