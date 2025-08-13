// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link UploadFileCheckResponseBody} extends {@link TeaModel}
 *
 * <p>UploadFileCheckResponseBody</p>
 */
public class UploadFileCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private UploadFileCheckResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadFileCheckResponseBody create() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(UploadFileCheckResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned object</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public UploadFileCheckResponseBody build() {
            return new UploadFileCheckResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UploadFileCheckResponseBody} extends {@link TeaModel}
     *
     * <p>UploadFileCheckResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("effectiveNumber")
        private Integer effectiveNumber;

        @com.aliyun.core.annotation.NameInMap("resultList")
        private java.util.List<String> resultList;

        @com.aliyun.core.annotation.NameInMap("totalNumber")
        private Integer totalNumber;

        private ResultObject(Builder builder) {
            this.effectiveNumber = builder.effectiveNumber;
            this.resultList = builder.resultList;
            this.totalNumber = builder.totalNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return effectiveNumber
         */
        public Integer getEffectiveNumber() {
            return this.effectiveNumber;
        }

        /**
         * @return resultList
         */
        public java.util.List<String> getResultList() {
            return this.resultList;
        }

        /**
         * @return totalNumber
         */
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

        public static final class Builder {
            private Integer effectiveNumber; 
            private java.util.List<String> resultList; 
            private Integer totalNumber; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.effectiveNumber = model.effectiveNumber;
                this.resultList = model.resultList;
                this.totalNumber = model.totalNumber;
            } 

            /**
             * <p>Number of effective rows</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder effectiveNumber(Integer effectiveNumber) {
                this.effectiveNumber = effectiveNumber;
                return this;
            }

            /**
             * <p>Valid sample data</p>
             */
            public Builder resultList(java.util.List<String> resultList) {
                this.resultList = resultList;
                return this;
            }

            /**
             * <p>Total number of rows</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalNumber(Integer totalNumber) {
                this.totalNumber = totalNumber;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
