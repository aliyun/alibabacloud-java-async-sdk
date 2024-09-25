// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInitializeVariableResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInitializeVariableResponseBody</p>
 */
public class DescribeDBInitializeVariableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Variables")
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
         * The database type. Valid values:
         * <p>
         * 
         * *   Oracle
         * *   PostgreSQL
         * *   MySQL
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * The version of the database engine.
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The attributes that are returned.
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
        @com.aliyun.core.annotation.NameInMap("Charset")
        private String charset;

        @com.aliyun.core.annotation.NameInMap("Collate")
        private String collate;

        @com.aliyun.core.annotation.NameInMap("Ctype")
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
             * The character set that is supported.
             */
            public Builder charset(String charset) {
                this.charset = charset;
                return this;
            }

            /**
             * The language that indicates the collation of the databases that are created.
             * <p>
             * 
             * >- The language must be compatible with the character set that is specified by **CharacterSetName**.
             * >- This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.
             * >- This parameter is optional for PolarDB for MySQL clusters.
             * 
             * To view the valid values for this parameter, perform the following steps: Log on to the PolarDB console and click the ID of a cluster. In the left-side navigation pane, choose **Settings and Management** > **Databases**. Then, click **Create Database**.
             */
            public Builder collate(String collate) {
                this.collate = collate;
                return this;
            }

            /**
             * The language that indicates the character type of the database.
             * <p>
             * 
             * > 
             * 
             * *   The language must be compatible with the character set that is specified by **CharacterSetName**.
             * 
             * *   The specified parameter value must be the same as the value of **Collate**.
             * 
             * *   If the PolarDB cluster runs PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL, this parameter is required. If the cluster runs PolarDB for MySQL, this parameter is not supported.
             * 
             * To view the valid values of this parameter, perform the following steps: First, log on to the PolarDB console and click the ID of a cluster. Then, in the left-side navigation pane, choose **Settings and Management** > **Databases**. Finally, click **Create Database**.
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
        @com.aliyun.core.annotation.NameInMap("Variable")
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
