// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceResponseBody</p>
 */
public class DescribeServiceResponseBody extends TeaModel {
    @NameInMap("AppId")
    private String appId;

    @NameInMap("ModelServiceId")
    private String modelServiceId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeServiceResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.modelServiceId = builder.modelServiceId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return modelServiceId
     */
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String appId; 
        private String modelServiceId; 
        private String requestId; 
        private String status; 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * ModelServiceId.
         */
        public Builder modelServiceId(String modelServiceId) {
            this.modelServiceId = modelServiceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeServiceResponseBody build() {
            return new DescribeServiceResponseBody(this);
        } 

    } 

}
