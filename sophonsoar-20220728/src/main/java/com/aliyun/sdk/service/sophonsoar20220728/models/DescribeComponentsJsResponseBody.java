// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComponentsJsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComponentsJsResponseBody</p>
 */
public class DescribeComponentsJsResponseBody extends TeaModel {
    @NameInMap("ComponentsJs")
    private String componentsJs;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeComponentsJsResponseBody(Builder builder) {
        this.componentsJs = builder.componentsJs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComponentsJsResponseBody create() {
        return builder().build();
    }

    /**
     * @return componentsJs
     */
    public String getComponentsJs() {
        return this.componentsJs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String componentsJs; 
        private String requestId; 

        /**
         * The configuration of the JavaScript file for the component.
         */
        public Builder componentsJs(String componentsJs) {
            this.componentsJs = componentsJs;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeComponentsJsResponseBody build() {
            return new DescribeComponentsJsResponseBody(this);
        } 

    } 

}
