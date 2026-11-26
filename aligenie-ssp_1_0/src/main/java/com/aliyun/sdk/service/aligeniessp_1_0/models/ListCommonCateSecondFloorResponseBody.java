// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link ListCommonCateSecondFloorResponseBody} extends {@link TeaModel}
 *
 * <p>ListCommonCateSecondFloorResponseBody</p>
 */
public class ListCommonCateSecondFloorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private ListCommonCateSecondFloorResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommonCateSecondFloorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListCommonCateSecondFloorResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Code encoding</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Message information</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>F12B6147-5925-19E5-A3AD-E1EE1360F34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return Result</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListCommonCateSecondFloorResponseBody build() {
            return new ListCommonCateSecondFloorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCommonCateSecondFloorResponseBody} extends {@link TeaModel}
     *
     * <p>ListCommonCateSecondFloorResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CateId")
        private Long cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

        @com.aliyun.core.annotation.NameInMap("ParentCateId")
        private Long parentCateId;

        private Result(Builder builder) {
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.parentCateId = builder.parentCateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return parentCateId
         */
        public Long getParentCateId() {
            return this.parentCateId;
        }

        public static final class Builder {
            private Long cateId; 
            private String cateName; 
            private Long parentCateId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.cateId = model.cateId;
                this.cateName = model.cateName;
                this.parentCateId = model.parentCateId;
            } 

            /**
             * <p>Category ID</p>
             * 
             * <strong>example:</strong>
             * <p>80018009</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>Category Name</p>
             * 
             * <strong>example:</strong>
             * <p>儿童笑话</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>Parent category ID</p>
             * 
             * <strong>example:</strong>
             * <p>80018</p>
             */
            public Builder parentCateId(Long parentCateId) {
                this.parentCateId = parentCateId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
