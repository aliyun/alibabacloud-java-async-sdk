// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeApplicationParametersRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationParametersRequest</p>
 */
public class DescribeApplicationParametersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentIdList")
    private java.util.List<String> componentIdList;

    private DescribeApplicationParametersRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.componentIdList = builder.componentIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationParametersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return componentIdList
     */
    public java.util.List<String> getComponentIdList() {
        return this.componentIdList;
    }

    public static final class Builder extends Request.Builder<DescribeApplicationParametersRequest, Builder> {
        private String applicationId; 
        private java.util.List<String> componentIdList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationParametersRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.componentIdList = request.componentIdList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * ComponentIdList.
         */
        public Builder componentIdList(java.util.List<String> componentIdList) {
            String componentIdListShrink = shrink(componentIdList, "ComponentIdList", "json");
            this.putQueryParameter("ComponentIdList", componentIdListShrink);
            this.componentIdList = componentIdList;
            return this;
        }

        @Override
        public DescribeApplicationParametersRequest build() {
            return new DescribeApplicationParametersRequest(this);
        } 

    } 

}
