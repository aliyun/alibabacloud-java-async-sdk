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
 * {@link DescribeEventVariableTemplateBindResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventVariableTemplateBindResponseBody</p>
 */
public class DescribeEventVariableTemplateBindResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeEventVariableTemplateBindResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventVariableTemplateBindResponseBody create() {
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

        private Builder(DescribeEventVariableTemplateBindResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return object</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeEventVariableTemplateBindResponseBody build() {
            return new DescribeEventVariableTemplateBindResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventVariableTemplateBindResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventVariableTemplateBindResponseBody</p>
     */
    public static class ChargeVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ChargeVariables(Builder builder) {
            this.code = builder.code;
            this.description = builder.description;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.name = builder.name;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChargeVariables create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private String description; 
            private String fieldType; 
            private Long id; 
            private String name; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(ChargeVariables model) {
                this.code = model.code;
                this.description = model.description;
                this.fieldType = model.fieldType;
                this.id = model.id;
                this.name = model.name;
                this.title = model.title;
                this.type = model.type;
            } 

            /**
             * <p>Variable code</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Description of the variable.</p>
             * 
             * <strong>example:</strong>
             * <p>描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Field type.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * <p>Primary key ID</p>
             * 
             * <strong>example:</strong>
             * <p>456</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Variable name</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Title.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>Variable type.</p>
             * 
             * <strong>example:</strong>
             * <p>NATIVE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ChargeVariables build() {
                return new ChargeVariables(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventVariableTemplateBindResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventVariableTemplateBindResponseBody</p>
     */
    public static class FreeVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private FreeVariables(Builder builder) {
            this.code = builder.code;
            this.description = builder.description;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.name = builder.name;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FreeVariables create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private String description; 
            private String fieldType; 
            private Long id; 
            private String name; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(FreeVariables model) {
                this.code = model.code;
                this.description = model.description;
                this.fieldType = model.fieldType;
                this.id = model.id;
                this.name = model.name;
                this.title = model.title;
                this.type = model.type;
            } 

            /**
             * <p>Variable code</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Variable description.</p>
             * 
             * <strong>example:</strong>
             * <p>描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Field type.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * <p>Primary key ID</p>
             * 
             * <strong>example:</strong>
             * <p>234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Variable name</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Title.</p>
             * 
             * <strong>example:</strong>
             * <p>年龄</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>Variable type.</p>
             * 
             * <strong>example:</strong>
             * <p>NATIVE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public FreeVariables build() {
                return new FreeVariables(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventVariableTemplateBindResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventVariableTemplateBindResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chargeVariables")
        private java.util.List<ChargeVariables> chargeVariables;

        @com.aliyun.core.annotation.NameInMap("freeVariables")
        private java.util.List<FreeVariables> freeVariables;

        @com.aliyun.core.annotation.NameInMap("templateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private String totalCount;

        private ResultObject(Builder builder) {
            this.chargeVariables = builder.chargeVariables;
            this.freeVariables = builder.freeVariables;
            this.templateCode = builder.templateCode;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return chargeVariables
         */
        public java.util.List<ChargeVariables> getChargeVariables() {
            return this.chargeVariables;
        }

        /**
         * @return freeVariables
         */
        public java.util.List<FreeVariables> getFreeVariables() {
            return this.freeVariables;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<ChargeVariables> chargeVariables; 
            private java.util.List<FreeVariables> freeVariables; 
            private String templateCode; 
            private String totalCount; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.chargeVariables = model.chargeVariables;
                this.freeVariables = model.freeVariables;
                this.templateCode = model.templateCode;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>List of chargeable variables</p>
             */
            public Builder chargeVariables(java.util.List<ChargeVariables> chargeVariables) {
                this.chargeVariables = chargeVariables;
                return this;
            }

            /**
             * <p>List of free variables</p>
             */
            public Builder freeVariables(java.util.List<FreeVariables> freeVariables) {
                this.freeVariables = freeVariables;
                return this;
            }

            /**
             * <p>Template code</p>
             * 
             * <strong>example:</strong>
             * <p>register</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * <p>Total count</p>
             * 
             * <strong>example:</strong>
             * <p>38</p>
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
