// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppInstanceListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppInstanceListRequest</p>
 */
public class DescribeAppInstanceListRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("WithNodeInfo")
    private Boolean withNodeInfo;

    private DescribeAppInstanceListRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.withNodeInfo = builder.withNodeInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppInstanceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return withNodeInfo
     */
    public Boolean getWithNodeInfo() {
        return this.withNodeInfo;
    }

    public static final class Builder extends Request.Builder<DescribeAppInstanceListRequest, Builder> {
        private String appId; 
        private Boolean withNodeInfo; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppInstanceListRequest request) {
            super(request);
            this.appId = request.appId;
            this.withNodeInfo = request.withNodeInfo;
        } 

        /**
         * The ID of the application. You can call the ListApplication operation to query the ID of the application. For more information, see [ListApplication](~~149390~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Specifies whether to return the information about the node in which the pod resides.
         * <p>
         * 
         * *   `true`: returns the information about the node in which the pod resides
         * *   `false`: does not return the information about the node in which the pod resides
         */
        public Builder withNodeInfo(Boolean withNodeInfo) {
            this.putQueryParameter("WithNodeInfo", withNodeInfo);
            this.withNodeInfo = withNodeInfo;
            return this;
        }

        @Override
        public DescribeAppInstanceListRequest build() {
            return new DescribeAppInstanceListRequest(this);
        } 

    } 

}
