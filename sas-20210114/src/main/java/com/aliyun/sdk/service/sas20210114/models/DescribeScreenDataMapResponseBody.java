// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link DescribeScreenDataMapResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScreenDataMapResponseBody</p>
 */
public class DescribeScreenDataMapResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SasScreenTypeList")
    private java.util.List<SasScreenTypeList> sasScreenTypeList;

    private DescribeScreenDataMapResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sasScreenTypeList = builder.sasScreenTypeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenDataMapResponseBody create() {
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
     * @return sasScreenTypeList
     */
    public java.util.List<SasScreenTypeList> getSasScreenTypeList() {
        return this.sasScreenTypeList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SasScreenTypeList> sasScreenTypeList; 

        private Builder() {
        } 

        private Builder(DescribeScreenDataMapResponseBody model) {
            this.requestId = model.requestId;
            this.sasScreenTypeList = model.sasScreenTypeList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SasScreenTypeList.
         */
        public Builder sasScreenTypeList(java.util.List<SasScreenTypeList> sasScreenTypeList) {
            this.sasScreenTypeList = sasScreenTypeList;
            return this;
        }

        public DescribeScreenDataMapResponseBody build() {
            return new DescribeScreenDataMapResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScreenDataMapResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScreenDataMapResponseBody</p>
     */
    public static class Date extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Date(Builder builder) {
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Date create() {
            return builder().build();
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String unit; 
            private String value; 

            private Builder() {
            } 

            private Builder(Date model) {
                this.unit = model.unit;
                this.value = model.value;
            } 

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Date build() {
                return new Date(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScreenDataMapResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScreenDataMapResponseBody</p>
     */
    public static class TypeData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Date")
        private java.util.List<Date> date;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private TypeData(Builder builder) {
            this.code = builder.code;
            this.date = builder.date;
            this.id = builder.id;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TypeData create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return date
         */
        public java.util.List<Date> getDate() {
            return this.date;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String code; 
            private java.util.List<Date> date; 
            private String id; 
            private String title; 

            private Builder() {
            } 

            private Builder(TypeData model) {
                this.code = model.code;
                this.date = model.date;
                this.id = model.id;
                this.title = model.title;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Date.
             */
            public Builder date(java.util.List<Date> date) {
                this.date = date;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public TypeData build() {
                return new TypeData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScreenDataMapResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScreenDataMapResponseBody</p>
     */
    public static class SasScreenTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("TypeCode")
        private String typeCode;

        @com.aliyun.core.annotation.NameInMap("TypeData")
        private java.util.List<TypeData> typeData;

        private SasScreenTypeList(Builder builder) {
            this.type = builder.type;
            this.typeCode = builder.typeCode;
            this.typeData = builder.typeData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SasScreenTypeList create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return typeCode
         */
        public String getTypeCode() {
            return this.typeCode;
        }

        /**
         * @return typeData
         */
        public java.util.List<TypeData> getTypeData() {
            return this.typeData;
        }

        public static final class Builder {
            private String type; 
            private String typeCode; 
            private java.util.List<TypeData> typeData; 

            private Builder() {
            } 

            private Builder(SasScreenTypeList model) {
                this.type = model.type;
                this.typeCode = model.typeCode;
                this.typeData = model.typeData;
            } 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * TypeCode.
             */
            public Builder typeCode(String typeCode) {
                this.typeCode = typeCode;
                return this;
            }

            /**
             * TypeData.
             */
            public Builder typeData(java.util.List<TypeData> typeData) {
                this.typeData = typeData;
                return this;
            }

            public SasScreenTypeList build() {
                return new SasScreenTypeList(this);
            } 

        } 

    }
}
