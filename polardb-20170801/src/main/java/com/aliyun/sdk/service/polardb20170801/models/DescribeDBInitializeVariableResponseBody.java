// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
         * <p>The database type. Valid values:</p>
         * <ul>
         * <li>Oracle</li>
         * <li>PostgreSQL</li>
         * <li>MySQL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostgreSQL</p>
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The version of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>475F58B7-F394-4394-AA6E-4F1CBA******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The attributes that are returned.</p>
         */
        public Builder variables(Variables variables) {
            this.variables = variables;
            return this;
        }

        public DescribeDBInitializeVariableResponseBody build() {
            return new DescribeDBInitializeVariableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInitializeVariableResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInitializeVariableResponseBody</p>
     */
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
             * <p>The character set that is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>EUC_CN</p>
             */
            public Builder charset(String charset) {
                this.charset = charset;
                return this;
            }

            /**
             * <p>The language that indicates the collation of the databases that are created.</p>
             * <blockquote>
             * <ul>
             * <li>The language must be compatible with the character set that is specified by <strong>CharacterSetName</strong>.</li>
             * <li>This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.</li>
             * <li>This parameter is optional for PolarDB for MySQL clusters.</li>
             * </ul>
             * </blockquote>
             * <p>To view the valid values for this parameter, perform the following steps: Log on to the PolarDB console and click the ID of a cluster. In the left-side navigation pane, choose <strong>Settings and Management</strong> &gt; <strong>Databases</strong>. Then, click <strong>Create Database</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>C</p>
             */
            public Builder collate(String collate) {
                this.collate = collate;
                return this;
            }

            /**
             * <p>The language that indicates the character type of the database.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>The language must be compatible with the character set that is specified by <strong>CharacterSetName</strong>.</p>
             * </li>
             * <li><p>The specified parameter value must be the same as the value of <strong>Collate</strong>.</p>
             * </li>
             * <li><p>If the PolarDB cluster runs PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL, this parameter is required. If the cluster runs PolarDB for MySQL, this parameter is not supported.</p>
             * </li>
             * </ul>
             * <p>To view the valid values of this parameter, perform the following steps: First, log on to the PolarDB console and click the ID of a cluster. Then, in the left-side navigation pane, choose <strong>Settings and Management</strong> &gt; <strong>Databases</strong>. Finally, click <strong>Create Database</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>C</p>
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
    /**
     * 
     * {@link DescribeDBInitializeVariableResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInitializeVariableResponseBody</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Variable")
        private java.util.List<Variable> variable;

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
        public java.util.List<Variable> getVariable() {
            return this.variable;
        }

        public static final class Builder {
            private java.util.List<Variable> variable; 

            /**
             * Variable.
             */
            public Builder variable(java.util.List<Variable> variable) {
                this.variable = variable;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
}
