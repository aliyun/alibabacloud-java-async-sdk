// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiversifyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiversifyResponseBody</p>
 */
public class DescribeDiversifyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeDiversifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiversifyResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeDiversifyResponseBody build() {
            return new DescribeDiversifyResponseBody(this);
        } 

    } 

    public static class Parameter extends TeaModel {
        @NameInMap("CategoryIndex")
        private Integer categoryIndex;

        @NameInMap("Window")
        private Integer window;

        private Parameter(Builder builder) {
            this.categoryIndex = builder.categoryIndex;
            this.window = builder.window;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameter create() {
            return builder().build();
        }

        /**
         * @return categoryIndex
         */
        public Integer getCategoryIndex() {
            return this.categoryIndex;
        }

        /**
         * @return window
         */
        public Integer getWindow() {
            return this.window;
        }

        public static final class Builder {
            private Integer categoryIndex; 
            private Integer window; 

            /**
             * CategoryIndex.
             */
            public Builder categoryIndex(Integer categoryIndex) {
                this.categoryIndex = categoryIndex;
                return this;
            }

            /**
             * Window.
             */
            public Builder window(Integer window) {
                this.window = window;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Name")
        private String name;

        @NameInMap("Parameter")
        private Parameter parameter;

        private Result(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.name = builder.name;
            this.parameter = builder.parameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameter
         */
        public Parameter getParameter() {
            return this.parameter;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModified; 
            private String name; 
            private Parameter parameter; 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Parameter.
             */
            public Builder parameter(Parameter parameter) {
                this.parameter = parameter;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
