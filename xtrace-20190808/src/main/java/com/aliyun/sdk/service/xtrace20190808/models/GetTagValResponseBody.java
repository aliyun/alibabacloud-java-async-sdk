// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTagValResponseBody} extends {@link TeaModel}
 *
 * <p>GetTagValResponseBody</p>
 */
public class GetTagValResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagValues")
    private TagValues tagValues;

    private GetTagValResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tagValues = builder.tagValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTagValResponseBody create() {
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
    public TagValues getTagValues() {
        return this.tagValues;
    }

    public static final class Builder {
        private String requestId; 
        private TagValues tagValues; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The tag values.
         */
        public Builder tagValues(TagValues tagValues) {
            this.tagValues = tagValues;
            return this;
        }

        public GetTagValResponseBody build() {
            return new GetTagValResponseBody(this);
        } 

    } 

    public static class TagValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagValue")
        private java.util.List < String > tagValue;

        private TagValues(Builder builder) {
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagValues create() {
            return builder().build();
        }

        /**
         * @return tagValue
         */
        public java.util.List < String > getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private java.util.List < String > tagValue; 

            /**
             * TagValue.
             */
            public Builder tagValue(java.util.List < String > tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagValues build() {
                return new TagValues(this);
            } 

        } 

    }
}
