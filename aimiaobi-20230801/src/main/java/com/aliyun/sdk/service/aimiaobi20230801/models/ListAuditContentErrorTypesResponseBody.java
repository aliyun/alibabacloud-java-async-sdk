// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link ListAuditContentErrorTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuditContentErrorTypesResponseBody</p>
 */
public class ListAuditContentErrorTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAuditContentErrorTypesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuditContentErrorTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAuditContentErrorTypesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAuditContentErrorTypesResponseBody build() {
            return new ListAuditContentErrorTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuditContentErrorTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuditContentErrorTypesResponseBody</p>
     */
    public static class SubClasses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("ClassName")
        private String className;

        private SubClasses(Builder builder) {
            this.classCode = builder.classCode;
            this.className = builder.className;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubClasses create() {
            return builder().build();
        }

        /**
         * @return classCode
         */
        public String getClassCode() {
            return this.classCode;
        }

        /**
         * @return className
         */
        public String getClassName() {
            return this.className;
        }

        public static final class Builder {
            private String classCode; 
            private String className; 

            private Builder() {
            } 

            private Builder(SubClasses model) {
                this.classCode = model.classCode;
                this.className = model.className;
            } 

            /**
             * ClassCode.
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * ClassName.
             */
            public Builder className(String className) {
                this.className = className;
                return this;
            }

            public SubClasses build() {
                return new SubClasses(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAuditContentErrorTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuditContentErrorTypesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MajorClassCode")
        private String majorClassCode;

        @com.aliyun.core.annotation.NameInMap("MajorClassName")
        private String majorClassName;

        @com.aliyun.core.annotation.NameInMap("SubClasses")
        private java.util.List<SubClasses> subClasses;

        private Data(Builder builder) {
            this.majorClassCode = builder.majorClassCode;
            this.majorClassName = builder.majorClassName;
            this.subClasses = builder.subClasses;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return majorClassCode
         */
        public String getMajorClassCode() {
            return this.majorClassCode;
        }

        /**
         * @return majorClassName
         */
        public String getMajorClassName() {
            return this.majorClassName;
        }

        /**
         * @return subClasses
         */
        public java.util.List<SubClasses> getSubClasses() {
            return this.subClasses;
        }

        public static final class Builder {
            private String majorClassCode; 
            private String majorClassName; 
            private java.util.List<SubClasses> subClasses; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.majorClassCode = model.majorClassCode;
                this.majorClassName = model.majorClassName;
                this.subClasses = model.subClasses;
            } 

            /**
             * MajorClassCode.
             */
            public Builder majorClassCode(String majorClassCode) {
                this.majorClassCode = majorClassCode;
                return this;
            }

            /**
             * MajorClassName.
             */
            public Builder majorClassName(String majorClassName) {
                this.majorClassName = majorClassName;
                return this;
            }

            /**
             * SubClasses.
             */
            public Builder subClasses(java.util.List<SubClasses> subClasses) {
                this.subClasses = subClasses;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
