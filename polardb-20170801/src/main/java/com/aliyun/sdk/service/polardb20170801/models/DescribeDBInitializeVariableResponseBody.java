// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInitializeVariableResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInitializeVariableResponseBody</p>
 */
public class DescribeDBInitializeVariableResponseBody extends TeaModel {
    @NameInMap("DBType")
    private String DBType;

    @NameInMap("DBVersion")
    private String DBVersion;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Variables")
    private Variables variables;

    private DescribeDBInitializeVariableResponseBody(Builder builder) {
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.requestId = builder.requestId;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInitializeVariableResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return variables
     */
    public Variables getVariables() {
        return this.variables;
    }

    public static final class Builder {
        private String DBType; 
        private String DBVersion; 
        private String requestId; 
        private Variables variables; 

        /**
         * DBType.
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * DBVersion.
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
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
         * Variables.
         */
        public Builder variables(Variables variables) {
            this.variables = variables;
            return this;
        }

        public DescribeDBInitializeVariableResponseBody build() {
            return new DescribeDBInitializeVariableResponseBody(this);
        } 

    } 

    public static class Variable extends TeaModel {
        @NameInMap("Charset")
        private String charset;

        @NameInMap("Collate")
        private String collate;

        @NameInMap("Ctype")
        private String ctype;

        private Variable(Builder builder) {
            this.charset = builder.charset;
            this.collate = builder.collate;
            this.ctype = builder.ctype;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variable create() {
            return builder().build();
        }

        /**
         * @return charset
         */
        public String getCharset() {
            return this.charset;
        }

        /**
         * @return collate
         */
        public String getCollate() {
            return this.collate;
        }

        /**
         * @return ctype
         */
        public String getCtype() {
            return this.ctype;
        }

        public static final class Builder {
            private String charset; 
            private String collate; 
            private String ctype; 

            /**
             * Charset.
             */
            public Builder charset(String charset) {
                this.charset = charset;
                return this;
            }

            /**
             * Collate.
             */
            public Builder collate(String collate) {
                this.collate = collate;
                return this;
            }

            /**
             * Ctype.
             */
            public Builder ctype(String ctype) {
                this.ctype = ctype;
                return this;
            }

            public Variable build() {
                return new Variable(this);
            } 

        } 

    }
    public static class Variables extends TeaModel {
        @NameInMap("Variable")
        private java.util.List < Variable> variable;

        private Variables(Builder builder) {
            this.variable = builder.variable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return variable
         */
        public java.util.List < Variable> getVariable() {
            return this.variable;
        }

        public static final class Builder {
            private java.util.List < Variable> variable; 

            /**
             * Variable.
             */
            public Builder variable(java.util.List < Variable> variable) {
                this.variable = variable;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
}
