// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerTagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerTagsResponseBody</p>
 */
public class DescribeContainerTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagValues")
    private java.util.List < String > tagValues;

    private DescribeContainerTagsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tagValues = builder.tagValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerTagsResponseBody create() {
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
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the attributes of container assets.
         */
        public Builder tagValues(java.util.List < String > tagValues) {
            this.tagValues = tagValues;
            return this;
        }

        public DescribeContainerTagsResponseBody build() {
            return new DescribeContainerTagsResponseBody(this);
        } 

    } 

}
