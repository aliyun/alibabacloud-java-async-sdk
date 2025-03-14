// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeContainerTagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerTagsResponseBody</p>
 */
public class DescribeContainerTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagValues")
    private java.util.List<String> tagValues;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getTagValues() {
        return this.tagValues;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> tagValues; 

        private Builder() {
        } 

        private Builder(DescribeContainerTagsResponseBody model) {
            this.requestId = model.requestId;
            this.tagValues = model.tagValues;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>028CF634-5268-5660-9575-48C9ED6BF880</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the attributes of container assets.</p>
         */
        public Builder tagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }

        public DescribeContainerTagsResponseBody build() {
            return new DescribeContainerTagsResponseBody(this);
        } 

    } 

}
