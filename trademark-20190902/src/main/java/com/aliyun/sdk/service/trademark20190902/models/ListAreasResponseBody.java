// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAreasResponseBody} extends {@link TeaModel}
 *
 * <p>ListAreasResponseBody</p>
 */
public class ListAreasResponseBody extends TeaModel {
    @NameInMap("Datas")
    private java.util.List < Datas> datas;

    @NameInMap("RequestId")
    private String requestId;

    private ListAreasResponseBody(Builder builder) {
        this.datas = builder.datas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAreasResponseBody create() {
        return builder().build();
    }

    /**
     * @return datas
     */
    public java.util.List < Datas> getDatas() {
        return this.datas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Datas> datas; 
        private String requestId; 

        /**
         * Datas.
         */
        public Builder datas(java.util.List < Datas> datas) {
            this.datas = datas;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAreasResponseBody build() {
            return new ListAreasResponseBody(this);
        } 

    } 

    public static class SubArea extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParentCode")
        private String parentCode;

        @NameInMap("SortNum")
        private Integer sortNum;

        private SubArea(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.parentCode = builder.parentCode;
            this.sortNum = builder.sortNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubArea create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentCode
         */
        public String getParentCode() {
            return this.parentCode;
        }

        /**
         * @return sortNum
         */
        public Integer getSortNum() {
            return this.sortNum;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private String parentCode; 
            private Integer sortNum; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * ParentCode.
             */
            public Builder parentCode(String parentCode) {
                this.parentCode = parentCode;
                return this;
            }

            /**
             * SortNum.
             */
            public Builder sortNum(Integer sortNum) {
                this.sortNum = sortNum;
                return this;
            }

            public SubArea build() {
                return new SubArea(this);
            } 

        } 

    }
    public static class Datas extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParentCode")
        private String parentCode;

        @NameInMap("SortNum")
        private Integer sortNum;

        @NameInMap("SubArea")
        private java.util.List < SubArea> subArea;

        private Datas(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.parentCode = builder.parentCode;
            this.sortNum = builder.sortNum;
            this.subArea = builder.subArea;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datas create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentCode
         */
        public String getParentCode() {
            return this.parentCode;
        }

        /**
         * @return sortNum
         */
        public Integer getSortNum() {
            return this.sortNum;
        }

        /**
         * @return subArea
         */
        public java.util.List < SubArea> getSubArea() {
            return this.subArea;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private String parentCode; 
            private Integer sortNum; 
            private java.util.List < SubArea> subArea; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * ParentCode.
             */
            public Builder parentCode(String parentCode) {
                this.parentCode = parentCode;
                return this;
            }

            /**
             * SortNum.
             */
            public Builder sortNum(Integer sortNum) {
                this.sortNum = sortNum;
                return this;
            }

            /**
             * SubArea.
             */
            public Builder subArea(java.util.List < SubArea> subArea) {
                this.subArea = subArea;
                return this;
            }

            public Datas build() {
                return new Datas(this);
            } 

        } 

    }
}
