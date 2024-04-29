// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerAppsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerAppsResponseBody</p>
 */
public class DescribeContainerAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagValues")
    private java.util.List < String > tagValues;

    private DescribeContainerAppsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tagValues = builder.tagValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tagValues
     */
    public java.util.List < String > getTagValues() {
        return this.tagValues;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > tagValues; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The tag values.
         */
        public Builder tagValues(java.util.List < String > tagValues) {
            this.tagValues = tagValues;
            return this;
        }

        public DescribeContainerAppsResponseBody build() {
            return new DescribeContainerAppsResponseBody(this);
        } 

    } 

}
