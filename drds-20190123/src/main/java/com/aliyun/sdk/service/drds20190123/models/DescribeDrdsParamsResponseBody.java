// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeDrdsParamsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsParamsResponseBody</p>
 */
public class DescribeDrdsParamsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDrdsParamsResponseBody(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsParamsResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
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

    public static final class Builder {
        private java.util.List<List> list; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Indicates information about parameters.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>Indicates the ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2F7F8080-9132-4279-85D0-B7E5C4305162</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDrdsParamsResponseBody build() {
            return new DescribeDrdsParamsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsParamsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsParamsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("NeedRestart")
        private Boolean needRestart;

        @com.aliyun.core.annotation.NameInMap("ParamDefaultValue")
        private String paramDefaultValue;

        @com.aliyun.core.annotation.NameInMap("ParamDesc")
        private String paramDesc;

        @com.aliyun.core.annotation.NameInMap("ParamEnglishName")
        private String paramEnglishName;

        @com.aliyun.core.annotation.NameInMap("ParamLevel")
        private String paramLevel;

        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        @com.aliyun.core.annotation.NameInMap("ParamRanges")
        private String paramRanges;

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private String paramType;

        @com.aliyun.core.annotation.NameInMap("ParamValue")
        private String paramValue;

        @com.aliyun.core.annotation.NameInMap("ParamVariableName")
        private String paramVariableName;

        private List(Builder builder) {
            this.dbName = builder.dbName;
            this.needRestart = builder.needRestart;
            this.paramDefaultValue = builder.paramDefaultValue;
            this.paramDesc = builder.paramDesc;
            this.paramEnglishName = builder.paramEnglishName;
            this.paramLevel = builder.paramLevel;
            this.paramName = builder.paramName;
            this.paramRanges = builder.paramRanges;
            this.paramType = builder.paramType;
            this.paramValue = builder.paramValue;
            this.paramVariableName = builder.paramVariableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return needRestart
         */
        public Boolean getNeedRestart() {
            return this.needRestart;
        }

        /**
         * @return paramDefaultValue
         */
        public String getParamDefaultValue() {
            return this.paramDefaultValue;
        }

        /**
         * @return paramDesc
         */
        public String getParamDesc() {
            return this.paramDesc;
        }

        /**
         * @return paramEnglishName
         */
        public String getParamEnglishName() {
            return this.paramEnglishName;
        }

        /**
         * @return paramLevel
         */
        public String getParamLevel() {
            return this.paramLevel;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return paramRanges
         */
        public String getParamRanges() {
            return this.paramRanges;
        }

        /**
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
        }

        /**
         * @return paramValue
         */
        public String getParamValue() {
            return this.paramValue;
        }

        /**
         * @return paramVariableName
         */
        public String getParamVariableName() {
            return this.paramVariableName;
        }

        public static final class Builder {
            private String dbName; 
            private Boolean needRestart; 
            private String paramDefaultValue; 
            private String paramDesc; 
            private String paramEnglishName; 
            private String paramLevel; 
            private String paramName; 
            private String paramRanges; 
            private String paramType; 
            private String paramValue; 
            private String paramVariableName; 

            /**
             * <p>Indicates the name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>drds_test</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>Indicates whether a restart is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needRestart(Boolean needRestart) {
                this.needRestart = needRestart;
                return this;
            }

            /**
             * <p>Indicates the default value of a parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder paramDefaultValue(String paramDefaultValue) {
                this.paramDefaultValue = paramDefaultValue;
                return this;
            }

            /**
             * <p>Indicates the description of the parameter.</p>
             */
            public Builder paramDesc(String paramDesc) {
                this.paramDesc = paramDesc;
                return this;
            }

            /**
             * <p>Indicates the name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>SLOW_SQL_TIME</p>
             */
            public Builder paramEnglishName(String paramEnglishName) {
                this.paramEnglishName = paramEnglishName;
                return this;
            }

            /**
             * <p>Indicates the parameter level.</p>
             * 
             * <strong>example:</strong>
             * <p>INSTANCE</p>
             */
            public Builder paramLevel(String paramLevel) {
                this.paramLevel = paramLevel;
                return this;
            }

            /**
             * <p>Indicates the name of the parameter.</p>
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * <p>Indicates the value range of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[1000-900000]</p>
             */
            public Builder paramRanges(String paramRanges) {
                this.paramRanges = paramRanges;
                return this;
            }

            /**
             * <p>Indicates the type of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>CONFIG</p>
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * <p>Indicates the value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder paramValue(String paramValue) {
                this.paramValue = paramValue;
                return this;
            }

            /**
             * <p>Indicates the name of the variable.</p>
             * 
             * <strong>example:</strong>
             * <p>slowSqlTime</p>
             */
            public Builder paramVariableName(String paramVariableName) {
                this.paramVariableName = paramVariableName;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
