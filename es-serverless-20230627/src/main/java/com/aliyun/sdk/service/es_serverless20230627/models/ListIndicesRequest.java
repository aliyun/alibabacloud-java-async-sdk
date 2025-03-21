// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

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
 * {@link ListIndicesRequest} extends {@link RequestModel}
 *
 * <p>ListIndicesRequest</p>
 */
public class ListIndicesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    private ListIndicesRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIndicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    public static final class Builder extends Request.Builder<ListIndicesRequest, Builder> {
        private String appName; 

        private Builder() {
            super();
        } 

        private Builder(ListIndicesRequest request) {
            super(request);
            this.appName = request.appName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        @Override
        public ListIndicesRequest build() {
            return new ListIndicesRequest(this);
        } 

    } 

}
