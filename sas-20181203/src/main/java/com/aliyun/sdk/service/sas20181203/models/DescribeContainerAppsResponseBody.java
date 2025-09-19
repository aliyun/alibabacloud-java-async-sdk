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
 * {@link DescribeContainerAppsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerAppsResponseBody</p>
 */
public class DescribeContainerAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagValues")
    private java.util.List<String> tagValues;

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

        private Builder(DescribeContainerAppsResponseBody model) {
            this.requestId = model.requestId;
            this.tagValues = model.tagValues;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30CBF632-109F-596F-97F2-451C8B2A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tag values.</p>
         */
        public Builder tagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }

        public DescribeContainerAppsResponseBody build() {
            return new DescribeContainerAppsResponseBody(this);
        } 

    } 

}
