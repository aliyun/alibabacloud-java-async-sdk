// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagValueListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagValueListResponseBody</p>
 */
public class DescribeTagValueListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TagValues")
    private TagValues tagValues;

    private DescribeTagValueListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tagValues = builder.tagValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagValueListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tagValues
     */
    public TagValues getTagValues() {
        return this.tagValues;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private TagValues tagValues; 

        /**
         * The ID of the request.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The tag values returned.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * This topic provides an example of how to query the tag values corresponding to `tagKey1`. The return results are `tagValue1` and `tagValue2`.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * For more information about common request parameters, see [Common parameters](~~199331~~).
         */
        public Builder tagValues(TagValues tagValues) {
            this.tagValues = tagValues;
            return this;
        }

        public DescribeTagValueListResponseBody build() {
            return new DescribeTagValueListResponseBody(this);
        } 

    } 

    public static class TagValues extends TeaModel {
        @NameInMap("TagValue")
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
