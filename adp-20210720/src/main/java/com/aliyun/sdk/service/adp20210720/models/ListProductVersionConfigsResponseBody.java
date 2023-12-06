// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductVersionConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductVersionConfigsResponseBody</p>
 */
public class ListProductVersionConfigsResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private ListProductVersionConfigsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductVersionConfigsResponseBody create() {
        return builder().build();
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public ListProductVersionConfigsResponseBody build() {
            return new ListProductVersionConfigsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("componentName")
        private String componentName;

        @NameInMap("componentReleaseName")
        private String componentReleaseName;

        @NameInMap("componentVersionUID")
        private String componentVersionUID;

        @NameInMap("description")
        private String description;

        @NameInMap("name")
        private String name;

        @NameInMap("parentComponentName")
        private String parentComponentName;

        @NameInMap("parentComponentReleaseName")
        private String parentComponentReleaseName;

        @NameInMap("parentComponentVersionUID")
        private String parentComponentVersionUID;

        @NameInMap("productVersionUID")
        private String productVersionUID;

        @NameInMap("scope")
        private String scope;

        @NameInMap("uid")
        private String uid;

        @NameInMap("value")
        private String value;

        @NameInMap("valueType")
        private String valueType;

        private List(Builder builder) {
            this.componentName = builder.componentName;
            this.componentReleaseName = builder.componentReleaseName;
            this.componentVersionUID = builder.componentVersionUID;
            this.description = builder.description;
            this.name = builder.name;
            this.parentComponentName = builder.parentComponentName;
            this.parentComponentReleaseName = builder.parentComponentReleaseName;
            this.parentComponentVersionUID = builder.parentComponentVersionUID;
            this.productVersionUID = builder.productVersionUID;
            this.scope = builder.scope;
            this.uid = builder.uid;
            this.value = builder.value;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return componentReleaseName
         */
        public String getComponentReleaseName() {
            return this.componentReleaseName;
        }

        /**
         * @return componentVersionUID
         */
        public String getComponentVersionUID() {
            return this.componentVersionUID;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentComponentName
         */
        public String getParentComponentName() {
            return this.parentComponentName;
        }

        /**
         * @return parentComponentReleaseName
         */
        public String getParentComponentReleaseName() {
            return this.parentComponentReleaseName;
        }

        /**
         * @return parentComponentVersionUID
         */
        public String getParentComponentVersionUID() {
            return this.parentComponentVersionUID;
        }

        /**
         * @return productVersionUID
         */
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String componentName; 
            private String componentReleaseName; 
            private String componentVersionUID; 
            private String description; 
            private String name; 
            private String parentComponentName; 
            private String parentComponentReleaseName; 
            private String parentComponentVersionUID; 
            private String productVersionUID; 
            private String scope; 
            private String uid; 
            private String value; 
            private String valueType; 

            /**
             * componentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * componentReleaseName.
             */
            public Builder componentReleaseName(String componentReleaseName) {
                this.componentReleaseName = componentReleaseName;
                return this;
            }

            /**
             * componentVersionUID.
             */
            public Builder componentVersionUID(String componentVersionUID) {
                this.componentVersionUID = componentVersionUID;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * parentComponentName.
             */
            public Builder parentComponentName(String parentComponentName) {
                this.parentComponentName = parentComponentName;
                return this;
            }

            /**
             * parentComponentReleaseName.
             */
            public Builder parentComponentReleaseName(String parentComponentReleaseName) {
                this.parentComponentReleaseName = parentComponentReleaseName;
                return this;
            }

            /**
             * parentComponentVersionUID.
             */
            public Builder parentComponentVersionUID(String parentComponentVersionUID) {
                this.parentComponentVersionUID = parentComponentVersionUID;
                return this;
            }

            /**
             * productVersionUID.
             */
            public Builder productVersionUID(String productVersionUID) {
                this.productVersionUID = productVersionUID;
                return this;
            }

            /**
             * scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * valueType.
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("list")
        private java.util.List < List> list;

        @NameInMap("pageNum")
        private Integer pageNum;

        @NameInMap("pageSize")
        private Integer pageSize;

        @NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * list.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * pageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
