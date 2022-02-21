// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListComponentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListComponentsResponseBody</p>
 */
public class ListComponentsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListComponentsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComponentsResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private Result result; 

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 返回结果体
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListComponentsResponseBody build() {
            return new ListComponentsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("ComponentName")
        private String componentName;

        @NameInMap("ComponentType")
        private String componentType;

        @NameInMap("InUse")
        private String inUse;

        private List(Builder builder) {
            this.componentName = builder.componentName;
            this.componentType = builder.componentType;
            this.inUse = builder.inUse;
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
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return inUse
         */
        public String getInUse() {
            return this.inUse;
        }

        public static final class Builder {
            private String componentName; 
            private String componentType; 
            private String inUse; 

            /**
             * 组件名称
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * 组件类型
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * 是否使用
             */
            public Builder inUse(String inUse) {
                this.inUse = inUse;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class ComponentCategory extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("Type")
        private String type;

        private ComponentCategory(Builder builder) {
            this.list = builder.list;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentCategory create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private String type; 

            /**
             * 类别下的组件列表
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * 组件类别
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ComponentCategory build() {
                return new ComponentCategory(this);
            } 

        } 

    }
    public static class ConfigGroup extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private ConfigGroup(Builder builder) {
            this.category = builder.category;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigGroup create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String category; 
            private String key; 
            private String value; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConfigGroup build() {
                return new ConfigGroup(this);
            } 

        } 

    }
    public static class ComponentCategoryList extends TeaModel {
        @NameInMap("ComponentName")
        private String componentName;

        @NameInMap("ComponentType")
        private String componentType;

        @NameInMap("InUse")
        private String inUse;

        private ComponentCategoryList(Builder builder) {
            this.componentName = builder.componentName;
            this.componentType = builder.componentType;
            this.inUse = builder.inUse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentCategoryList create() {
            return builder().build();
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return inUse
         */
        public String getInUse() {
            return this.inUse;
        }

        public static final class Builder {
            private String componentName; 
            private String componentType; 
            private String inUse; 

            /**
             * 组件名称
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * 组件类型
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * 是否使用
             */
            public Builder inUse(String inUse) {
                this.inUse = inUse;
                return this;
            }

            public ComponentCategoryList build() {
                return new ComponentCategoryList(this);
            } 

        } 

    }
    public static class SceneListComponentCategory extends TeaModel {
        @NameInMap("List")
        private java.util.List < ComponentCategoryList> list;

        @NameInMap("Type")
        private String type;

        private SceneListComponentCategory(Builder builder) {
            this.list = builder.list;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneListComponentCategory create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < ComponentCategoryList> getList() {
            return this.list;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < ComponentCategoryList> list; 
            private String type; 

            /**
             * 类别下的组件列表
             */
            public Builder list(java.util.List < ComponentCategoryList> list) {
                this.list = list;
                return this;
            }

            /**
             * 组件类别
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SceneListComponentCategory build() {
                return new SceneListComponentCategory(this);
            } 

        } 

    }
    public static class SceneList extends TeaModel {
        @NameInMap("ComponentCategory")
        private java.util.List < SceneListComponentCategory> componentCategory;

        @NameInMap("Scene")
        private String scene;

        private SceneList(Builder builder) {
            this.componentCategory = builder.componentCategory;
            this.scene = builder.scene;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneList create() {
            return builder().build();
        }

        /**
         * @return componentCategory
         */
        public java.util.List < SceneListComponentCategory> getComponentCategory() {
            return this.componentCategory;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        public static final class Builder {
            private java.util.List < SceneListComponentCategory> componentCategory; 
            private String scene; 

            /**
             * 组件信息
             */
            public Builder componentCategory(java.util.List < SceneListComponentCategory> componentCategory) {
                this.componentCategory = componentCategory;
                return this;
            }

            /**
             * 场景类别
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            public SceneList build() {
                return new SceneList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("ComponentCategory")
        private java.util.List < ComponentCategory> componentCategory;

        @NameInMap("ConfigGroup")
        private java.util.List < ConfigGroup> configGroup;

        @NameInMap("SceneList")
        private java.util.List < SceneList> sceneList;

        private Result(Builder builder) {
            this.componentCategory = builder.componentCategory;
            this.configGroup = builder.configGroup;
            this.sceneList = builder.sceneList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return componentCategory
         */
        public java.util.List < ComponentCategory> getComponentCategory() {
            return this.componentCategory;
        }

        /**
         * @return configGroup
         */
        public java.util.List < ConfigGroup> getConfigGroup() {
            return this.configGroup;
        }

        /**
         * @return sceneList
         */
        public java.util.List < SceneList> getSceneList() {
            return this.sceneList;
        }

        public static final class Builder {
            private java.util.List < ComponentCategory> componentCategory; 
            private java.util.List < ConfigGroup> configGroup; 
            private java.util.List < SceneList> sceneList; 

            /**
             * 组件信息
             */
            public Builder componentCategory(java.util.List < ComponentCategory> componentCategory) {
                this.componentCategory = componentCategory;
                return this;
            }

            /**
             * 配置信息
             */
            public Builder configGroup(java.util.List < ConfigGroup> configGroup) {
                this.configGroup = configGroup;
                return this;
            }

            /**
             * 场景列表
             */
            public Builder sceneList(java.util.List < SceneList> sceneList) {
                this.sceneList = sceneList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
