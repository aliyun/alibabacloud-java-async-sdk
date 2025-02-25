// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsParamsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsParamsResponseBody</p>
 */
public class DescribeDrdsParamsResponseBody extends TeaModel {
    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
    public java.util.List < List> getList() {
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
        private java.util.List < List> list; 
        private String requestId; 
        private Boolean success; 

        /**
         * Indicates information about parameters.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * Indicates the ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDrdsParamsResponseBody build() {
            return new DescribeDrdsParamsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("DbName")
        private String dbName;

        @NameInMap("NeedRestart")
        private Boolean needRestart;

        @NameInMap("ParamDefaultValue")
        private String paramDefaultValue;

        @NameInMap("ParamDesc")
        private String paramDesc;

        @NameInMap("ParamEnglishName")
        private String paramEnglishName;

        @NameInMap("ParamLevel")
        private String paramLevel;

        @NameInMap("ParamName")
        private String paramName;

        @NameInMap("ParamRanges")
        private String paramRanges;

        @NameInMap("ParamType")
        private String paramType;

        @NameInMap("ParamValue")
        private String paramValue;

        @NameInMap("ParamVariableName")
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
             * Indicates the name of the database.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * Indicates whether a restart is required.
             */
            public Builder needRestart(Boolean needRestart) {
                this.needRestart = needRestart;
                return this;
            }

            /**
             * Indicates the default value of a parameter.
             */
            public Builder paramDefaultValue(String paramDefaultValue) {
                this.paramDefaultValue = paramDefaultValue;
                return this;
            }

            /**
             * Indicates the description of the parameter.
             */
            public Builder paramDesc(String paramDesc) {
                this.paramDesc = paramDesc;
                return this;
            }

            /**
             * Indicates the name of the parameter.
             */
            public Builder paramEnglishName(String paramEnglishName) {
                this.paramEnglishName = paramEnglishName;
                return this;
            }

            /**
             * Indicates the parameter level.
             */
            public Builder paramLevel(String paramLevel) {
                this.paramLevel = paramLevel;
                return this;
            }

            /**
             * Indicates the name of the parameter.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * Indicates the value range of the parameter.
             */
            public Builder paramRanges(String paramRanges) {
                this.paramRanges = paramRanges;
                return this;
            }

            /**
             * Indicates the type of the parameter.
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * Indicates the value of the parameter.
             */
            public Builder paramValue(String paramValue) {
                this.paramValue = paramValue;
                return this;
            }

            /**
             * Indicates the name of the variable.
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
